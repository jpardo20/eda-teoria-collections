package exercicis;

import classes.Criatura;
import java.util.*;

public class Exercici_01_apartat_A {

public static void main (String [] args) {
        
        Criatura [] poblacio = {
            new Criatura("NIL",0,Criatura.NEN),
            new Criatura("EVA",1, Criatura.NENA),
            new Criatura("CARLES",0, Criatura.NEN),
            new Criatura("ONA",1, Criatura.NENA),
            new Criatura("D�DAC",0, Criatura.NEN),
            new Criatura("NIL",1, Criatura.NEN),
            new Criatura("EVA",3, Criatura.NENA),
            new Criatura("JORDI",2, Criatura.NEN),
            new Criatura("ENIA",3, Criatura.NENA)
        };
        
        
        Collection lesNenes;
        lesNenes = new LinkedList();
        int quantesNenes = 0;
        
         /* APARTAT A: afegir a lesNenes totes les nenes que hi ha
          	a la taula poblacio. Després "dir" quantes nenes hi ha.
          */
        
        /* ... posseu la vostra solució a partir d'aquí */
        


        // mostrar el resultat
        System.out.println("A \"lesNenes\" hi ha " +
                quantesNenes + " nenes en total");
        System.out.println();
        
    }
    
}
