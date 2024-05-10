/* Aquest programa de prova té molt poc valor per a determinar la
 * presència d'errors en la implementació de la interfície Mainaderia.
 * Més que com una prova es pot entendre com un exemple d'ús de les
 * classes que puguin implementar la interfície. */

package exercicis;

import classes.Criatura;
import classes.Mainaderia;
import classes.MainaderiaList;

public class Exercici_02_ProvaMainaderia {
	
    public static void main (String [] args) {
        Criatura [] poblacio = {
            new Criatura("NIL",0,Criatura.NEN),
            new Criatura("PERE",1, Criatura.NEN),
            new Criatura("NEUS",0, Criatura.NENA),
            new Criatura("ONA",1, Criatura.NENA),
            new Criatura("DÍDAC",0, Criatura.NEN),
            new Criatura("MARIONA",1, Criatura.NENA),
            new Criatura("EVA",3, Criatura.NENA),
            new Criatura("FIONA",2, Criatura.NENA),
            new Criatura("ENIA",3, Criatura.NENA)
        };
        Criatura eliminada, trobada;
        String nom;
        
        Mainaderia aparcaNens;
        
        aparcaNens = new MainaderiaList();
        
        //matriculem tota la població infantil
        for (int i=0; i<poblacio.length; i++) {
            aparcaNens.matricular(poblacio[i]);
        }
        
        //ens interessem per quants matriculats hi ha
        System.out.println();
        System.out.print("En aquest moment tenim " +
                aparcaNens.quantitatDeCriatures());
        System.out.print(" criatures, de les quals " +
                aparcaNens.quantitatPerSexe(Criatura.NEN));
        System.out.print(" són nens i " +
                aparcaNens.quantitatPerSexe(Criatura.NENA));
        System.out.println(" són nenes");
        
        // Fem unes quantes desmatriculacions
        nom = "Pere";
        eliminada = aparcaNens.donarDeBaixa(nom);
        System.out.println();
        if (eliminada!=null) {
            System.out.println("S'ha desmatriculat a: ");
            System.out.println(eliminada);
        }
        else {
            System.out.format("No hi ha cap criatura de nom %s per desmatricular-\n", nom);
        }
        
        nom = "Mariona";
        eliminada = aparcaNens.donarDeBaixa(nom);
        System.out.println();
        if (eliminada!=null) {
            System.out.println("S'ha desmatriculat a: ");
            System.out.println(eliminada);
        }
        else {
            System.out.println("no hi ha cap criatura de nom "+nom+" per desmatricular");
        }
        
        nom = "Laia";
        eliminada = aparcaNens.donarDeBaixa(nom);
        System.out.println();
        if (eliminada!=null) {
            System.out.println("S'ha desmatriculat a: ");
            System.out.println(eliminada);
        }
        else {
            System.out.println("no hi ha cap criatura de nom "+nom+" per desmatricular");
        }
        
        // tornem a preguntar quants nens i nenes hi ha
        System.out.println();
        System.out.print("En aquest moment tenim "+aparcaNens.quantitatDeCriatures());
        System.out.print(" criatures, de les quals "+aparcaNens.quantitatPerSexe(Criatura.NEN));
        System.out.print(" son nens i "+aparcaNens.quantitatPerSexe(Criatura.NENA));
        System.out.println(" son nenes");
       
        // busquem unes criatures en conctret
        System.out.println();
        nom = "fiona";
        trobada = aparcaNens.buscar(nom);
        if (trobada!=null)  {
            System.out.println("s'ha trobat una criatura de nom "+nom+":");
            System.out.println(trobada);
        }
        else {
            System.out.println("No s'ha trobat cap criatura de nom "+nom);
        }
       
        System.out.println();
        nom = "Mariona";
        trobada = aparcaNens.buscar(nom);
        if (trobada!=null)  {
            System.out.println("s'ha trobat una criatura de nom "+nom+":");
            System.out.println(trobada);
        }
        else {
            System.out.println("No s'ha trobat cap criatura de nom "+nom);
        }
        
        // i finalment fem un recorregut per tota la mainaderia
        System.out.println();
        for (int i = 0; i<aparcaNens.quantitatDeCriatures(); i++) {
            System.out.println(aparcaNens.get(i));
        }
                
        
    }

}

