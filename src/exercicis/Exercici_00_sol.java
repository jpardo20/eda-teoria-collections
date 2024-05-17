package exercicis;

import classes.Element;

import java.util.LinkedList;
import java.util.List;

public class Exercici_00_sol {
    public static void mostraElements(List array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
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
                new Element("Ro", 23) };

        System.out.print("Es mostra unsElements\n");
        for (int i = 0; i < unsElements.length; i++) {
            System.out.println(unsElements[i]);
        }
        // Crear una primera col·lecció que contingui tots
        // els elements de les posicions parelles de la taula unsElements.
        /* COMPLETE */
        System.out.print("1a Part\n");
        List elementsPosParell = new LinkedList();
        for (int i = 0; i < unsElements.length; i++) {
            if(i%2==0){
                elementsPosParell.add(unsElements[i]);
            }
        }
        System.out.print("Es mostra elementsPosParell\n");
        mostraElements(elementsPosParell);

        // Crear una segona col·lecció que contingui tots els elements
        // de la taula unsElements que s'anomenen "Alpha" o "Omega"
        /* COMPLETE */
        System.out.print("2a Part\n");
        List elementsAlphaOmega = new LinkedList();
        Element elementActual;
        for (int i = 0; i < unsElements.length; i++) {
            if ( (unsElements[i].getName()=="Alpha") ||
                 (unsElements[i].getName()=="Omega")
            ){ // nova condició!!
                elementsAlphaOmega.add(unsElements[i]);
            }
        }
        System.out.print("Es mostra elementsAlphaOmega\n");
        mostraElements(elementsAlphaOmega);

        // A la segona col·lecció afegir-hi l'element de
        // la posició (índex) 3 de la taula
        /* COMPLETE */
        System.out.print("3a Part\n");
        elementsAlphaOmega.add(unsElements[3]);
        System.out.print("Es mostra elementsAlphaOmega\n");
        mostraElements(elementsAlphaOmega);

        // De la primera col·lecció eliminar els elements
        // que són com els de la segona
        /* COMPLETE */
        System.out.print("4a Part\n");


        // Obtenir una taula amb tots els elements de la primera col·lecció.
        //  Mostrar-ne el contingut.
        /* COMPLETE */
    }
}