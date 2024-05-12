package exemples.p01_exempleCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

import classes.Element;

import static eines.EinesJoan.*;
import static eines.EinesJoan.pintaComSubTitol;
//import static eines.EinesJoan.mostraElement;

public class ExempleCollection {
    public static void main(String[] args) {
        // Es creen tres magatzems del tipus Collection
        Collection ArrayListTotal;
        Collection LinkedListPrimerConjunt;
        Collection VectorSegonConjunt;

        // Es crea i s'omple el magatzem del vector d'Element
        // amb el nom algunsElement, amb alguns Elements.
        Element[] algunsElement = {
                new Element("Espsilon", 6),
                new Element("Delta", 20),
                new Element("Alpha", 12)
        };

        // Els tres magatzems creats de tipus Collection,
        // s'instancien amb diferents tipus de magatzem
        // ArrayListTotal de tipus          ArrayList
        // LinkedListPrimerConjunt de tipus LinkedList
        // VectorSegonConjunt de tipus      Vector
        // tots tres tipus són implementacions de Collection.
        ArrayListTotal = new ArrayList();
        LinkedListPrimerConjunt = new LinkedList();
        VectorSegonConjunt = new Vector();
        // Es fa servir el mètode add per afegir 5 elements d'un amb un.
        LinkedListPrimerConjunt.add(new Element("Alpha", 4));
        LinkedListPrimerConjunt.add(new Element("Beta", 3));
        LinkedListPrimerConjunt.add(new Element("Gamma", 8));
        LinkedListPrimerConjunt.add(new Element("Delta", 3));
        LinkedListPrimerConjunt.add(new Element("Alpha", 5));

        // Es torna a fer servir el mètode add
        // per afegir els elements de la variable
        // algunsElement d'un amb un fent servir un for.
        for (int i = 0; i < algunsElement.length; i++) {
            VectorSegonConjunt.add(algunsElement[i]);
        }

        // Es fa servir el mètode addAll per afegir
        // a ArrayListTotal TOTS els elements de
        // LinkedListPrimerConjunt, en aquest
        // cas TOTS s'afegeixen TOT de cop.
        ArrayListTotal.addAll(LinkedListPrimerConjunt);

        // I també, es fa servir el mètode addAll
        // per afegir a ArrayListTotal TOTS els
        // elements de VectorSegonConjunt, en aquest
        // cas TOTS s'afegeixen de cop.
        ArrayListTotal.addAll(VectorSegonConjunt);

        pintaComTitol("\tExecució del programa 'ExempleCollection'!");

        // Els mètodes Contains i containsAll
        // es basen en el mètode equals.
        pintaComTitol("\t1a PART: Provant els mètodes Contains i containsAll");
        mostraCollection(LinkedListPrimerConjunt,"LinkedListPrimerConjunt");

        for (int i = 0; i < 3; i++) {
            System.out.format("algunsElement[%d]        = [%s]\n" , i , algunsElement[i].tornaComCadena());
            System.out.format("El resultat de l'execució de" +
                    " la comanda `LinkedListPrimerConjunt.contains" +
                    "(algunsElement[%d])' és ...\n", i);
            pitjaTeclaPerContinuar();
            System.out.format("\t\t%s\n",LinkedListPrimerConjunt.contains(algunsElement[i]));
            System.out.println("\t" + "-".repeat(20));
        }
        System.out.println("\t --- 1a Part acabada! --- ");
        saltaLinies(10);

        // Els mètodes Remove i removeAll també
        // es basen en el mètode equals.
        pintaComTitol("\t2a PART: Provant els mètodes Remove i removeAll");
        mostraCollection(LinkedListPrimerConjunt,"LinkedListPrimerConjunt");
        System.out.format("\tContingut de algunsElement[1] = %s\n",algunsElement[1].tornaComCadena());

        pintaComSubTitol("  --->  Execució de la comanda `LinkedListPrimerConjunt.remove(algunsElement[1])`");
        LinkedListPrimerConjunt.remove(algunsElement[1]);

        mostraCollection(LinkedListPrimerConjunt,"LinkedListPrimerConjunt");
        pitjaTeclaPerContinuar();
        mostraCollection(ArrayListTotal, "ArrayListTotal");
        mostraCollection(VectorSegonConjunt,"VectorSegonConjunt");

        pintaComSubTitol("  --->  Execució de la comanda `ArrayListTotal.removeAll(VectorSegonConjunt)`");
        ArrayListTotal.removeAll(VectorSegonConjunt);
        mostraCollection(ArrayListTotal, "ArrayListTotal");

        System.out.println("\t --- 2a Part acabada! --- ");
        saltaLinies(10);

        pintaComTitol("\t3a PART: Provant el mètode setValue amb un i dos paràmetres");
        mostraCollection(ArrayListTotal,"ArrayListTotal");
        pintaComSubTitol("\tMètode setValue amb un paràmetre.");
        pitjaTeclaPerContinuar();
        System.out.format("\tContingut de algunsElement[1] = %s\n",algunsElement[1].tornaComCadena());
        pintaComSubTitol("  --->  Execució de la comanda `algunsElement[1].setValue(12)`");
        algunsElement[1].setValue(12);
        System.out.format("algunsElement[%d]        = [%s]\n" , 1 , algunsElement[1].tornaComCadena());
        System.out.println("\t---------------");
        pintaComSubTitol("\tMètode setValue amb dos paràmetres.");
        pitjaTeclaPerContinuar();
        System.out.format("\tContingut de algunsElement[0] = %s\n",algunsElement[0].tornaComCadena());
        System.out.format("\tContingut de algunsElement[2] = %s\n",algunsElement[2].tornaComCadena());

        pintaComSubTitol("  --->  Execució de la comanda `algunsElement[2].setValue(algunsElement[0].getValue() + 3)`");
        algunsElement[2].setValue(algunsElement[0].getValue() + 3);
        System.out.format("\tContingut de algunsElement[0] = %s\n",algunsElement[0].tornaComCadena());
        System.out.format("\tContingut de algunsElement[2] = %s\n",algunsElement[2].tornaComCadena());

        System.out.println("\t --- 3a Part acabada! --- ");
        saltaLinies(10);

        pintaComTitol("\t4a PART: Codi per sumar TOTS els valors de VectorSegonConjunt.");
        mostraCollection(ArrayListTotal,"ArrayListTotal");

        int sumaDElements = 0;
        //        ArrayListTotal.stream().forEach(System.out::println);

        // toArray provides the contents in an array
        Object[] elementsDArrayListTotal = ArrayListTotal.toArray();

        for (int i=0; i<ArrayListTotal.size(); i++) {
            System.out.format("%s\n", elementsDArrayListTotal[i]);
            sumaDElements += ((Element) elementsDArrayListTotal[i]).getValue();;
        }
        System.out.println("La suma d'Elements és: " + sumaDElements);
        System.out.println("\t --- 4a Part acabada! --- ");
        pintaComTitol("\tEl programa 'ExempleCollection' s'ha acabat!");
        System.out.println("\tFins la propera !!!!!");
    }
}