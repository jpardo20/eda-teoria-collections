/* Aquest programa de prova té molt poc valor per a determinar la
 * presència d'errors en la implementació de la interfície Mainaderia.
 * Més que com una prova es pot entendre com un exemple d'ús de les
 * classes que puguin implementar la interfície. */

package exercicis.solucions;

import classes.Criatura;
import classes.Mainaderia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Exercici: a la versió mostrada a classe de la implementació
   d'aquest mètode, la iteració sobre el contingut no es feia
   utilitzant l'iterador de la col·lecció.
   Torneu a escriure el codi d'aquest mètode, però ara fent és
   de l'iterador proporcionat pel mètode iterator.
   Després, podeu executar ProvaMainaderia per veure si el resultat
   que obteniu és el mateix que s'obtenia abans */

public class Exercici_02_ProvaMainaderia_sol implements Mainaderia {
        // Atributs
        // Referència a objecte de la classe List on "guardarem" les criatures...
        private List contingut;

        // Constructor
        public Exercici_02_ProvaMainaderia_sol() {
            // Crear la llista. Inicialment serà buida, és clar...
            this.contingut = new ArrayList();
        }

        // Mètodes
        // Mètode matricular. Afegeix una criatura.
        // Excepció si ja hi ha una criatura igual
        public void matricular(Criatura criaturaADonarDAlta)
                throws IllegalArgumentException {
            if (this.contingut.contains(criaturaADonarDAlta))
                throw new IllegalArgumentException("ERROR! Criatura repetida");
            contingut.add(criaturaADonarDAlta);
        }

        // Mètode donarDeBaixa. Dona de baixa la criatura segons el nom donat.
        // Retorna la criatura que és donada de baixa.
        // Si no n'hi ha cap amb aquell nom retorna null.
        public Criatura donarDeBaixa(String nomCriaturaAEsborrar) {
            Criatura criaturaAEsborrar = new
                    Criatura(nomCriaturaAEsborrar,
                    Criatura.MIN_EDAT,
                    Criatura.NEN);
            int index = contingut.indexOf(criaturaAEsborrar);
            if (index == -1)
                return null;
            else
                return (Criatura) contingut.remove(index);
        }

        // Mètode buscar. Retorna la criatura que té el nom especificat.
        // Retorna null si no n'hi ha cap criatura amb el nom especificat.
        public Criatura buscar(String nomCriaturaABuscar) {
            Criatura criaturaABuscar = new
                    Criatura(nomCriaturaABuscar,
                    Criatura.MIN_EDAT,
                    Criatura.NEN);
            int indexCriaturaABuscar = contingut.indexOf(criaturaABuscar);
            if (indexCriaturaABuscar == -1)
                return null;
            else
                return (Criatura) contingut.get(indexCriaturaABuscar);
        }

        // Mètode quantitatDeCriatures.
        // Retorna la quantitat de criatures matriculades.
        public int quantitatDeCriatures() {
            return contingut.size();
        }

        // Mètode quantitatPerSexe.
        // Retorna la quantitat de criatures del sexe rebut com a paràmetre
        public int quantitatPerSexe(int sexe) {
//            Criatura criaturaActual;
//            int quantitatCriatures = 0;
//            //Iterem sobre el contingut, però sense fer ús de l'iterador
//            // (MALA solució. Sempre CAL FER SERVIR un iterador)
//            for (int i = 0; i < contingut.size(); i++) {
//                criaturaActual = (Criatura) contingut.get(i);
//                if (criaturaActual.getSexe() == sexe) quantitatCriatures++;
//            }
            int quantitatCriatures = 0;
            Iterator it = this.contingut.iterator();
            Criatura criaturaActual = null;
            while (it.hasNext()) {
                criaturaActual = (Criatura) it.next();
                if (criaturaActual.getSexe() == sexe)
                    quantitatCriatures++;
            }
            return quantitatCriatures;
        }

        // Mètode get. Retorna la criatura que es troba a la
        // posició rebuda com a paràmetre. I llença una excepció
        // IndexOutOfBoundsException si el paràmetre està fora dels límits actuals
        public Criatura get(int i) throws IndexOutOfBoundsException {
            return (Criatura) contingut.get(i);
            // NOTA: get ja llença IndexOutOfBoundsException si el paràmetre està fora de limits
        }

    public static void main(String[] args) {
        // Definició de variables
        Exercici_02_ProvaMainaderia_sol aparcaNens = new Exercici_02_ProvaMainaderia_sol();
        // Inicialització de variables
        Criatura[] poblacioInfantil = {
                new Criatura("NIL",0, Criatura.NEN),
                new Criatura("PERE",1, Criatura.NEN),
                new Criatura("NEUS",0, Criatura.NENA),
                new Criatura("ONA",1, Criatura.NENA),
                new Criatura("DÍDAC",0, Criatura.NEN),
                new Criatura("MARIONA",1, Criatura.NENA),
                new Criatura("EVA",3, Criatura.NENA),
                new Criatura("FIONA",2, Criatura.NENA),
                new Criatura("ENIA",3, Criatura.NENA)
        };

        for (int i = 0; i < poblacioInfantil.length; i++) {
            aparcaNens.matricular(poblacioInfantil[i]);
        }

        System.out.format("\nEn aquest moment tenim %d criatures," +
                        " de les quals %d son nens i %d son nenes.\n",
                aparcaNens.quantitatDeCriatures(),
                aparcaNens.quantitatPerSexe(Criatura.NEN),
                aparcaNens.quantitatPerSexe(Criatura.NENA)
        );
    }
}
