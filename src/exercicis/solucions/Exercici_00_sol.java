package exercicis;

import classes.Element;
import java.util.LinkedList;
import static eines.EinesJoan.mostraLinkedListCriatures;

public class Exercici_00_sol {

    public static void mostraElements(Element[] colElements, String nomColeccio){
        System.out.println("\n\t" + nomColeccio);
        for (int i = 0; i < colElements.length; i++) {
            System.out.println(colElements[i].toString());
        }
    }

    public static void main(String[] args) {
        Element[] unsElements = {
                new Element("Alpha", 40),
                new Element("Omega", 20),
                new Element("Theta", 15),
                new Element("Delta", 12),
                new Element("Ro", 40),
                new Element("Delta", 12),
                new Element("Tau", 11),
                new Element("Omega", 33),
                new Element("Ro", 25),
                new Element("Beta", 15),
                new Element("Alpha", 40),
                new Element("Epsilon", 33),
                new Element("Gamma", 10),
                new Element("Tau", 18),
                new Element("Alpha", 40),
                new Element("Ro", 23)};


        mostraElements(unsElements, "unsElements");

        // Crear una primera col·lecció que contingui tots
        // els elements de les posicions parelles de la taula unsElements.
        LinkedList colleccioParells = new LinkedList();
        for (int i = 0; i < unsElements.length; i++) {
            if(i % 2 == 0){
                colleccioParells.add(unsElements[i]);
            }
        }

        mostraLinkedListCriatures(colleccioParells, "colleccioParells");
        // Crear una segona col·lecció que contingui tots els elements
        // de la taula unsElements que s'anomenen "Alpha" o "Omega"
        LinkedList colleccioAplhaIOmega = new LinkedList();
        for (int i = 0; i < unsElements.length; i++) {
            if(unsElements[i].getName().equals("Alpha") ||
                    unsElements[i].getName().equals("Omega")) {
                colleccioAplhaIOmega.add(unsElements[i]);
            }
        }

        mostraLinkedListCriatures(colleccioAplhaIOmega,"colleccioAplhaIOmega");

        // A la segona col·lecció afegir-hi l'element de
        // la posició (índex) 3 de la taula
        colleccioAplhaIOmega.add(unsElements[3]);

        mostraLinkedListCriatures(colleccioAplhaIOmega,"colleccioAplhaIOmega");
        // De la primera col·lecció eliminar els elements que són com els de la segona
        /* colleccioParells remove colleccioAplhaIOmega */

        colleccioParells.removeAll(colleccioAplhaIOmega);

        // Obtenir una taula amb tots els elements de la primera col·lecció.
        //  Mostrar-ne el contingut.
        mostraLinkedListCriatures(colleccioParells,"colleccioParells");
    }
}