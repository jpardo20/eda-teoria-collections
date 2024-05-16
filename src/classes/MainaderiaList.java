package classes;

import java.util.*;

public class MainaderiaList implements Mainaderia {
    // Atributs
    // Referència a objecte de la classe List on "guardarem" les criatures...
    private List contingut;
    // Constructor
    public MainaderiaList() {
        // Crear la llista. Inicialment serà buida, és clar...
        this.contingut = new ArrayList();
    }
    // Mètodes
    // Mètode matricular. Afegeix una criatura.
    // Excepció si ja hi ha una criatura igual
    public void matricular (Criatura criaturaADonarDAlta)
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
        Criatura criaturaActual;
        int quantitatCriatures = 0;
        //Iterem sobre el contingut, però sense fer ús de l'iterador
        // (MALA solució. Sempre CAL FER SERVIR un iterador)
        for (int i = 0; i < contingut.size(); i++) {
            criaturaActual = (Criatura) contingut.get(i);
            if (criaturaActual.getSexe() == sexe) quantitatCriatures++;
        }
        return quantitatCriatures;
    }
    // Mètode get. Retorna la criatura que es troba a la
    // posició rebuda com a paràmetre. I llença una excepció
    // IndexOutOfBoundsException si el paràmetre està fora dels límits actuals
    public Criatura get(int i) throws IndexOutOfBoundsException {
        return (Criatura)contingut.get(i);
        // NOTA: get ja llença IndexOutOfBoundsException si el paràmetre està fora de limits
    }
}