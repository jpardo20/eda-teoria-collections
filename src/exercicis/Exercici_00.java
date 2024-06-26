package exercicis;

import classes.Criatura;
import classes.Element;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exercici_00 {
    public static void mostraArrayElements(Element[] elements){
        for (int i = 0; i < elements.length - 1  ; i+=2) {
            System.out.println(elements[i] + " - " + elements[i+1] );
        }
        System.out.println("");
    }
    public static void mostraListElements(List<Element> elements) {
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i));
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Element[] unsElements = {
                new Element("Alpha", 41), new Element("Omega", 20),
                new Element("Theta", 15), new Element("Delta", 12),
                new Element("Ro", 40), new Element("Delta", 12),
                new Element("Tau", 11), new Element("Omega", 33),
                new Element("Ro", 25), new Element("Beta", 15),
                new Element("Alpha", 42), new Element("Epsilon", 33 ),
                new Element("Gamma", 10),new Element("Tau", 18),
                new Element("Alpha", 43), new Element("Ro", 23) };
        // Crear una primera col·lecció que contingui tots
        // els elements de les posicions parelles de la taula unsElements.
        /* COMPLETE */
        List primeraColleccio = new LinkedList<Element>();
        for (int i = 0; i < unsElements.length; i++) {
            if(i % 2 == 0){
                primeraColleccio.add(unsElements[i]);
            }
        }
        System.out.println("Primera part - primeraColleccio");
        mostraListElements(primeraColleccio); System.out.println("");

        // Crear una segona col·lecció que contingui tots els elements
        // de la taula unsElements que s'anomenen "Alpha" o "Omega"
        /* COMPLETE */
        List segonaColleccio = new LinkedList<Element>();
        for (Element elementActual : unsElements) {
            if((elementActual.getName().equals("Alpha"))
            || (elementActual.getName().equals("Omega")) ) {
                segonaColleccio.add(elementActual);
            }
        }
        System.out.println("Segona part - segonaColleccio");
        mostraListElements(segonaColleccio);

        // A la segona col·lecció afegir-hi l'element de
        // la posició (índex) 3 de la taula
        /* COMPLETE */
        segonaColleccio.add(segonaColleccio.get(3));
        System.out.println("Tercera part - segonaColleccio");
        mostraListElements(segonaColleccio);

        // De la primera col·lecció eliminar els elements
        // que són com els de la segona
        /* COMPLETE */
        Iterator it = primeraColleccio.iterator();
        Element elementActual = null;
        while (it.hasNext()) {
            elementActual = (Element) it.next();
            if (segonaColleccio.contains(elementActual)) {
                it.remove(); // CORRECTE!!! Elimina el darrer element proporcionat per next
            }
        }

        // Obtenir una taula amb tots els elements de la primera col·lecció.
        //  Mostrar-ne el contingut.
        /* COMPLETE */
        System.out.println("Quarta part - primeraColleccio");
        mostraListElements(primeraColleccio);
    }
}