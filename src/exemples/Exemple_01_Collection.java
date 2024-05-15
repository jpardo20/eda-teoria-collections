package exemples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

import classes.Element;
import static eines.EinesJoan.*;

public class Exemple_01_Collection {
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
        pintaIniciPrograma("Exemple_01_Collection");
        pintaComTitol("\t1a PART: Provant els mètodes Contains i containsAll");
        mostraObject(LinkedListPrimerConjunt,"LinkedListPrimerConjunt");

        // Els mètodes Contains i containsAll
        // es basen en el mètode equals.
        for (int i = 0; i < 3; i++) {
            System.out.format("algunsElement[%d]        = [%s]\n" , i , algunsElement[i].tornaComCadena());
            System.out.format("El resultat de l'execució de" +
                    " la comanda `LinkedListPrimerConjunt.contains" +
                    "(algunsElement[%d])' és ...\n", i);
            pitjaTeclaPerContinuar();
            System.out.format("\t\t%s\n",LinkedListPrimerConjunt.contains(algunsElement[i]));
            System.out.println("\t" + "-".repeat(20));
        }
        pintaPartAcabada(1);

        pintaComTitol("\t2a PART: Provant els mètodes Remove i removeAll");
        mostraObject(LinkedListPrimerConjunt,"LinkedListPrimerConjunt");
        System.out.format("\tContingut de algunsElement[1] = %s\n",algunsElement[1].tornaComCadena());
        pintaExecucioComanda("\tLinkedListPrimerConjunt.remove(algunsElement[1])");
        // Els mètodes Remove i removeAll també
        // es basen en el mètode equals.
        LinkedListPrimerConjunt.remove(algunsElement[1]);

        mostraObject(LinkedListPrimerConjunt,"LinkedListPrimerConjunt");
        pitjaTeclaPerContinuar();
        mostraObject(ArrayListTotal, "ArrayListTotal");
        mostraObject(VectorSegonConjunt,"VectorSegonConjunt");

        pintaExecucioComanda("\tArrayListTotal.removeAll(VectorSegonConjunt)");
        ArrayListTotal.removeAll(VectorSegonConjunt);
        mostraObject(ArrayListTotal, "ArrayListTotal");

        pintaPartAcabada(2);

        pintaComTitol("\t3a PART: Provant el mètode setValue amb un i dos paràmetres");
        mostraObject(ArrayListTotal,"ArrayListTotal");
        pintaComSubTitol("\tMètode setValue amb un paràmetre.");
        pitjaTeclaPerContinuar();
        System.out.format("\tContingut de algunsElement[1] = %s\n",algunsElement[1].tornaComCadena());
        pintaExecucioComanda("\talgunsElement[1].setValue(12)");
        algunsElement[1].setValue(12);
        System.out.format("algunsElement[%d]        = [%s]\n" , 1 , algunsElement[1].tornaComCadena());
        System.out.println("\t---------------");
        pintaComSubTitol("\tMètode setValue amb dos paràmetres.");
        pitjaTeclaPerContinuar();
        System.out.format("\tContingut de algunsElement[0] = %s\n",algunsElement[0].tornaComCadena());
        System.out.format("\tContingut de algunsElement[2] = %s\n",algunsElement[2].tornaComCadena());

        pintaExecucioComanda("\talgunsElement[2].setValue(algunsElement[0].getValue() + 3)");
        algunsElement[2].setValue(algunsElement[0].getValue() + 3);
        System.out.format("\tContingut de algunsElement[0] = %s\n",algunsElement[0].tornaComCadena());
        System.out.format("\tContingut de algunsElement[2] = %s\n",algunsElement[2].tornaComCadena());

        pintaPartAcabada(3);
        pintaComTitol("\t4a PART: Codi per sumar TOTS els valors de VectorSegonConjunt.");
        mostraObject(ArrayListTotal,"ArrayListTotal");

        int sumaDElements = 0;
        // El mètode toArray torna una cadena amb el contingut del Vector en format String
        Object[] elementsDArrayListTotal = ArrayListTotal.toArray();

        for (int i=0; i<ArrayListTotal.size(); i++) {
            System.out.format("%s\n", elementsDArrayListTotal[i]);
            sumaDElements += ((Element) elementsDArrayListTotal[i]).getValue();;
        }
        System.out.println("La suma d'Elements és: " + sumaDElements);
        pintaPartAcabada(4);
        pintaFinalPrograma("Exemple_01_Collection");
    }
}