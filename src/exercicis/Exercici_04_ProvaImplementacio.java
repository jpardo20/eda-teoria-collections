package exercicis;

import classes.Criatura;

public class Exercici_04_ProvaImplementacio {
    public static void main (String [] args) {
        Criatura [] poblacio = {
            new Criatura("NIL",0,Criatura.NEN),
            new Criatura("PERE",1, Criatura.NEN),
            new Criatura("NEUS",0, Criatura.NENA),
            new Criatura("ONA",1, Criatura.NENA),
            new Criatura("D�DAC",0, Criatura.NEN),
            new Criatura("MARIONA",1, Criatura.NENA),
            new Criatura("EVA",3, Criatura.NENA),
            new Criatura("FIONA",2, Criatura.NENA),
            new Criatura("ENIA",3, Criatura.NENA)
        }; // dades per la prova. Evidentment se'n poden afegir m�s
        
        MainaderiaTresSet mainaderia; // la mainaderia que es vol provar
        boolean matriculat;
        /* SI CALEN M�S VARIABLES ES PODEN DECLARAR AQU� */
        
        mainaderia = new MainaderiaTresSet(); // creacio
        
        //c�rrega
        for (Criatura c : poblacio) {
            matriculat = mainaderia.matricular(c.getNom(),
                                               c.getEdat(),
                                               c.getSexe()
                                              );
            if (!matriculat) {
                System.out.println("\nSembla que no hem pogut matricular a");
                System.out.println(c);
            }
        }
        
       // mostrar tot el contingut de la mainaderia

        System.out.println("\nContingut de la mainaderia");
        for (Criatura c: mainaderia) {
            System.out.println(" "+c);
        }

        /* CONTINUAR A PARTIR D'AQUEST PUNT */

       
               
    }

}
