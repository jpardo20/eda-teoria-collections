package exercicis;

import classes.Criatura;
import classes.Element;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exercici_00 {
    public static void mostraArrayElements(Element[] elements){
        for (int i = 0; i < elements.length ; i+=2) {
            System.out.println(elements[i] + " - " + elements[i+1] );
        }
    }
    public static void mostraListElements(List<Element> elements) {
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i));
        }
    }
    public static void main(String[] args) {
        Element[] unsElements = {
                new Element("Alpha", 40), new Element("Omega", 20),
                new Element("Theta", 15), new Element("Delta", 12),
                new Element("Ro", 40), new Element("Delta", 12),
                new Element("Tau", 11), new Element("Omega", 33),
                new Element("Ro", 25), new Element("Beta", 15),
                new Element("Alpha", 40), new Element("Epsilon", 33 ),
                new Element("Gamma", 10),new Element("Tau", 18),
                new Element("Alpha", 40), new Element("Ro", 23) };
        // Crear una primera col·lecció que contingui tots
        // els elements de les posicions parelles de la taula unsElements.
        /* COMPLETE */

        System.out.println("Contingut de unsElements");
        mostraArrayElements(unsElements);

        List colleccioParells = new LinkedList();
        for (int i = 0; i < unsElements.length; i++) {
            if(i%2 == 0) {
                colleccioParells.add(unsElements[i]);
            }
        }

        System.out.println("Contingut de colleccioParells");
        mostraListElements(colleccioParells);

        // Crear una segona col·lecció que contingui tots els elements
        // de la taula unsElements que s'anomenen "Alpha" o "Omega"
        /* COMPLETE */
        List colleccioAlphaOmega = new LinkedList();
        for (int i = 0; i < unsElements.length; i++) {
            if( (unsElements[i].getName().equals("Alpha")) ||
                (unsElements[i].getName().equals("Omega"))
            ) {
//            if( (unsElements[i].getName() == "Alpha") ||
//                    (unsElements[i].getName() == "Omega")
//            ) {
                    colleccioAlphaOmega.add(unsElements[i]);
            }
        }
//        System.out.println("Contingut de colleccioAlphaOmega");
//        mostraListElements(colleccioAlphaOmega);

        // A la segona col·lecció afegir-hi l'element de
        // la posició (índex) 3 de la taula
        /* COMPLETE */
        colleccioAlphaOmega.add(colleccioAlphaOmega.get(3));
        System.out.println("Contingut de colleccioAlphaOmega 2");
        mostraListElements(colleccioAlphaOmega);
        // De la primera col·lecció eliminar els elements
        // que són com els de la segona
        /* COMPLETE */
        Iterator it = colleccioParells.iterator();
        Element elementActual = null;
        while (it.hasNext()) {
            elementActual = (Element)it.next();
            if (colleccioAlphaOmega.contains(elementActual)) {
                // llarInfants.remove(criatura) // incorrecte!!!
                it.remove(); // CORRECTE!!! Elimina el darrer element proporcionat per next
            }
        }
        // Obtenir una taula amb tots els elements de la primera col·lecció.
        //  Mostrar-ne el contingut.
        /* COMPLETE */
        System.out.println("Contingut de colleccioParells");
        mostraListElements(colleccioParells);
    }
}