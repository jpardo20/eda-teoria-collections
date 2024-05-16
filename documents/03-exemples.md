### Llistat d'exemples

1. [**`Exemple_01_Collection`**](#primer-exemple-exemple_01_collection)

2. [**`Exemple_02_GuardarCriatures`**](#segon-exemple-exemple_02_guardarcriatures)

3. [**`Exemple_03_MainaderiaList`**](#tercer-exemple-exemple_03_mainaderialist)

4. [**`Exemple_04_Iteracio`**](#quart-exemple-exemple_04_iteracio)

<hr>

## Primer exemple **`Exemple_01_Collection`**

A continuació veiem l'exemple **`Exemple_01_Collection`** que fa servir la **classe** [**`Element`**](../src/classes/Element.java)

```java
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
        // (...)
        // Els mètodes Contains i containsAll
        // es basen en el mètode equals.
        for (int i = 0; i < 3; i++) {
            // (...)
            System.out.println("\t" + "-".repeat(20));
        }
        // (...)
        // Els mètodes Remove i removeAll també
        // es basen en el mètode equals.
        LinkedListPrimerConjunt.remove(algunsElement[1]);
        // (...)
        ArrayListTotal.removeAll(VectorSegonConjunt);
        // (...)
        algunsElement[1].setValue(12);
        // (...)
        algunsElement[2].setValue(algunsElement[0].getValue() + 3);
        // (...)
        int sumaDElements = 0;
        // El mètode toArray torna una cadena amb el conitgut del Vector
        Object[] elementsDArrayListTotal = ArrayListTotal.toArray();
        for (int i=0; i<ArrayListTotal.size(); i++) {
            System.out.format("%s\n", elementsDArrayListTotal[i]);
            sumaDElements += ((Element) elementsDArrayListTotal[i]).getValue();;
        }
        System.out.println("La suma d'Elements és: " + sumaDElements);
        // (...)
    }
}
```

> Podeu trobar el codi a [Exemple_01_Collection.java](../src/exemples/p01_exempleCollection/Exemple_01_Collection.java)

<details><summary>Pitja per veure un exemple de l'execució del programa Exemple_01_Collection</summary>

#### Execució del programa d'**`Exemple_01_Collection.java`**
```
		Execució del programa 'Exemple_01_Collection'!
			1a PART: Provant els mètodes Contains i containsAll
		Contingut de LinkedListPrimerConjunt
[Alpha,4] [Beta,3] [Gamma,8] [Delta,3] [Alpha,5] 
	algunsElement[0]        = [Espsilon,6]
El resultat de l'execució de la comanda `LinkedListPrimerConjunt.contains(algunsElement[0])' és ...
		false
	--------------------
algunsElement[1]        = [Delta,20]
El resultat de l'execució de la comanda `LinkedListPrimerConjunt.contains(algunsElement[1])' és ...
		true
	--------------------
algunsElement[2]        = [Alpha,12]
El resultat de l'execució de la comanda `LinkedListPrimerConjunt.contains(algunsElement[2])' és ...
		true
	--------------------
		2a PART: Provant els mètodes Remove i removeAll
		Contingut de LinkedListPrimerConjunt
[Alpha,4] [Beta,3] [Gamma,8] [Delta,3] [Alpha,5] 
		Contingut de algunsElement[1] = Delta,20
	  --->  Execució de la comanda `LinkedListPrimerConjunt.remove(algunsElement[1])`
	---------------------------------------------------------------------------------
	Contingut de LinkedListPrimerConjunt
[Alpha,4] [Beta,3] [Gamma,8] [Alpha,5] 
	
	Contingut de ArrayListTotal
[Alpha,4] [Beta,3] [Gamma,8] [Delta,3] [Alpha,5] [Espsilon,6] [Delta,20] [Alpha,12] 
		Contingut de VectorSegonConjunt
[Espsilon,6] [Delta,20] [Alpha,12] 
		  --->  Execució de la comanda `ArrayListTotal.removeAll(VectorSegonConjunt)`
	-----------------------------------------------------------------------------
	Contingut de ArrayListTotal
[Beta,3] [Gamma,8] 
		3a PART: Provant el mètode setValue amb un i dos paràmetres
		Contingut de ArrayListTotal
[Beta,3] [Gamma,8] 
			Mètode setValue amb un paràmetre.
	----------------------------------
	Contingut de algunsElement[1] = Delta,20
	  --->  Execució de la comanda `algunsElement[1].setValue(12)`
	--------------------------------------------------------------
algunsElement[1]        = [Delta,12]
	---------------
		Mètode setValue amb dos paràmetres.
	------------------------------------
	Contingut de algunsElement[0] = Espsilon,6
	Contingut de algunsElement[2] = Alpha,12
	  --->  Execució de la comanda `algunsElement[2].setValue(algunsElement[0].getValue() + 3)`
	-------------------------------------------------------------------------------------------
	Contingut de algunsElement[0] = Espsilon,6
	Contingut de algunsElement[2] = Alpha,9
		4a PART: Codi per sumar TOTS els valors de VectorSegonConjunt.
		Contingut de ArrayListTotal
[Beta,3] [Gamma,8] 
	Element[Beta 3]
Element[Gamma 8]
La suma d'Elements és: 11
	 --- 4a Part acabada! --- 
		El programa 'Exemple_01_Collection' s'ha acabat!
		Fins la propera !!!!!
```
</details>

## Segon exemple **`Exemple_02_GuardarCriatures`**

A continuació veiem l'exemple d'utilització de **`List`** amb el nom **`Exemple_02_GuardarCriatures`** que fa servir la **Classe** [**`Criatura`**](../src/classes/Criatura.java)

```java
public class Exemple_02_GuardarCriatures {
	public static void main(String[] args) {
		// Es crea un magatzem del tipus Criatura
		Criatura[] poblacioDeCriatures = { new Criatura("NIL", 0, Criatura.NEN),
				new Criatura("PERE", 1, Criatura.NEN),
				new Criatura("NEUS", 0, Criatura.NENA),
				new Criatura("ONA", 1, Criatura.NENA),
				new Criatura("DÍDAC", 0, Criatura.NEN),
				new Criatura("NIL", 1, Criatura.NEN),
				new Criatura("EVA", 3, Criatura.NENA),
				new Criatura("FIONA", 2, Criatura.NENA),
				new Criatura("ENIA", 3, Criatura.NENA)
		};

		// Es creen el magatzem llarInfants, es crea del tipus List i
		// es crea una instància de tipus LinkedList
		List llarInfants;
		llarInfants = new LinkedList();
		// List té tots els mètodes de Collection
		// per exemple el mètode add(Object o)
		// Es fa servir el mètode add per afegir
		// els elements de la variable 'poblacio'
		// d'un amb un fent servir un for.
		for (int i = 0; i < poblacioDeCriatures.length; i++) {
			llarInfants.add(poblacioDeCriatures[i]);
		}
        // (...)
		// El mètode add(Object obj) afegeix l'objecte rebut
		// al final de la llista.
		llarInfants.add(
				new Criatura("OLGA", 2, Criatura.NENA));
        // (...)
		// El mètode add(Object o, int i) afegeix a la posició i
		// l'element rebut desplaçant la resta d'elements cap
		// als índexs superiors si cal.
		llarInfants.add(3,
				new Criatura("JOAN", 1, Criatura.NEN));
        // (...)
        // Les llistes són accessibles per posició,
		// com si fossin vectors (Arrays) però fent
		// servir el mètode get.
		for (int i = 0; i < llarInfants.size(); i++) {
			System.out.println(llarInfants.get(i));
		}
        // (...)
		// Les llistes permeten de canviar el contingut d'una posició
		llarInfants.set(8,
				new Criatura("ELISA", 3, Criatura.NENA));
        // (...)
        llarInfants.set(2,
				llarInfants.get(7));
        // (...)
        // Les llistes permeten de fer cerques basades en EQUALS
		int primerNil, darrerNil;
		Criatura objetiuDeLaCerca = new Criatura("nil", 3, Criatura.NEN);
        // (...)
        System.out.format("primerNil = %s.\n", primerNil);
		darrerNil = llarInfants.lastIndexOf(objetiuDeLaCerca);
        // (...)
        System.out.format("darrerNil = %s.\n", darrerNil);
        // (...)
    }
}
```

> Podeu trobar el codi a [Exemple_02_GuardarCriatures.java](../src/exemples/p02_exemplesList_01/Exemple_02_GuardarCriatures.java)

<details><summary>Pitja per veure un exemple de l'execució del programa Exemple_02_GuardarCriatures</summary>

#### Execució del programa d'*`Exemple_02_GuardarCriatures`*
```
-----------------------------------------
	1a PART: Provant el mètode add amb un bucle for
	Contingut de poblacioDeCriatures
	----------------------------------------
(NIL,0,nen), (PERE,1,nen), (NEUS,0,nena), (ONA,1,nena),
(DÍDAC,0,nen), (NIL,1,nen), (EVA,3,nena), (FIONA,2,nena),
(ENIA,3,nena)
----------------------------------------
	2a PART: Provant el mètode add per posició
	Contingut de llarInfants
	----------------------------------------
(NIL,0,nen), (PERE,1,nen), (NEUS,0,nena), (ONA,1,nena),
(DÍDAC,0,nen), (NIL,1,nen), (EVA,3,nena), (FIONA,2,nena),
(ENIA,3,nena)
----------------------------------------
===>  Execució de la comanda:
llarInfants.add(
new Criatura("OLGA", 2, Criatura.NENA));
----------------------------------------
Contingut de llarInfants
----------------------------------------
(NIL,0,nen), (PERE,1,nen), (NEUS,0,nena), (ONA,1,nena),
(DÍDAC,0,nen), (NIL,1,nen), (EVA,3,nena), (FIONA,2,nena),
(ENIA,3,nena), (OLGA,2,nena)
----------------------------------------
===>  Execució de la comanda:
llarInfants.add(3,
new Criatura("JOAN", 1, Criatura.NEN))
----------------------------------------
Contingut de llarInfants
----------------------------------------
(NIL,0,nen), (PERE,1,nen), (NEUS,0,nena), (JOAN,1,nen),
(ONA,1,nena), (DÍDAC,0,nen), (NIL,1,nen), (EVA,3,nena),
(FIONA,2,nena), (ENIA,3,nena), (OLGA,2,nena)
----------------------------------------
	3a PART: Accedint a la Llista amb el mètode 'get(posicio)'

===>  Execució de la comanda:
for (int i = 0; i < llarInfants.size(); i++) {
System.out.println(llarInfants.get(i));
}
----------------------------------------
Criatura de nom: NIL té 0 anys. Sexe: nen.
Criatura de nom: PERE té 1 anys. Sexe: nen.
Criatura de nom: NEUS té 0 anys. Sexe: nena.
Criatura de nom: JOAN té 1 anys. Sexe: nen.
Criatura de nom: ONA té 1 anys. Sexe: nena.
Criatura de nom: DÍDAC té 0 anys. Sexe: nen.
Criatura de nom: NIL té 1 anys. Sexe: nen.
Criatura de nom: EVA té 3 anys. Sexe: nena.
Criatura de nom: FIONA té 2 anys. Sexe: nena.
Criatura de nom: ENIA té 3 anys. Sexe: nena.
Criatura de nom: OLGA té 2 anys. Sexe: nena.
	4a PART: Accedint a la Llista amb el mètode 'get(posicio)'
-------------------------------------------------------------
===>  Execució de la comanda:
llarInfants.set(8,
new Criatura("ELISA", 3, Criatura.NENA));
----------------------------------------
Contingut de llarInfants
----------------------------------------
(NIL,0,nen), (PERE,1,nen), (NEUS,0,nena), (JOAN,1,nen),
(ONA,1,nena), (DÍDAC,0,nen), (NIL,1,nen), (EVA,3,nena),
(ELISA,3,nena), (ENIA,3,nena), (OLGA,2,nena)
----------------------------------------
===>  Execució de la comanda:
llarInfants.set(2,
llarInfants.get(7));
----------------------------------------
Contingut de llarInfants
----------------------------------------
(NIL,0,nen), (PERE,1,nen), (EVA,3,nena), (JOAN,1,nen),
(ONA,1,nena), (DÍDAC,0,nen), (NIL,1,nen), (EVA,3,nena),
(ELISA,3,nena), (ENIA,3,nena), (OLGA,2,nena)
----------------------------------------
===>  Execució de la comanda:
Criatura objetiuDeLaCerca =
new Criatura("nil", 3, Criatura.NEN);
----------------------------------------
===>  Execució de la comanda:
primerNil = llarInfants.indexOf(objetiuDeLaCerca);
----------------------------------------
primerNil = 0.
===>  Execució de la comanda:
darrerNil = llarInfants.lastIndexOf(objetiuDeLaCerca);
----------------------------------------
darrerNil = 6.
===>  Execució de la comanda:
El programa 'GuardarCriatures' s'ha acabat!
----------------------------------------
Fins la propera !!!!!
```
</details>

## Tercer exemple **`Exemple_03_MainaderiaList`**

A continuació veiem l'exemple **`Exemple_03_MainaderiaList`**, que és un exemple d'utilització de la **classe** [**`MainaderiaList`**](../src/classes/MainaderiaList.java) fent servir un objecte que implementa una variable de tipus [**`MainaderiaList`**](../src/classes/MainaderiaList.java).

Aquest programa és només de prova, ja té molt poc valor per determinar la presència d'errors en la implementació de la **interfície** [**`Mainaderia`**](../src/classes/Mainaderia.java).
Més que com una prova s'ha d'entendre com un exemple d'ús d'una **classe** que implementa la **interfície** [**`Mainaderia`**](../src/classes/Mainaderia.java).

```java
public class Exemple_03_MainaderiaList {
    public static void main (String [] args) {
        // Definició de variables
        Criatura criaturaEsborrada, criaturaTrobada;
        String nomCriatura;
        MainaderiaList aparcaNens;
        // Inicialització de variables
        Criatura[] poblacioInfantil = {
                new Criatura("NIL",0, Criatura.NEN),
                new Criatura("PERE",1, Criatura.NEN),
                new Criatura("NEUS",0, Criatura.NENA),
                new Criatura("ONA",1, Criatura.NENA),
                new Criatura("DÍDAC",0, Criatura.NEN),
                new Criatura("MARIONA",1, Criatura.NENA),
                new Criatura("EVA",3, Criatura.NENA),
                new Criatura("FIONA",2, Criatura.NENA),
                new Criatura("ENIA",3, Criatura.NENA)
        };
        String[] nomsADonarDeBaixa = {"Pere", "Mariona", "Laia"};
        String[] nomsABuscar = {"fiona", "Mariona"};
        // (...)
        aparcaNens = new MainaderiaList();
        // Matriculem tota la població infantil.
        for (int i=0; i<poblacioInfantil.length; i++) {
            aparcaNens.matricular(poblacioInfantil[i]);
        }
        mostraMainaderiaList(aparcaNens,"aparcaNens");
        // Ens interessem per quants matriculats hi ha.
        System.out.format("\nEn aquest moment tenim %d criatures," +
                        " de les quals %d son nens i %d son nenes.\n",
                aparcaNens.quantitatDeCriatures(),
                aparcaNens.quantitatPerSexe(Criatura.NEN),
                aparcaNens.quantitatPerSexe(Criatura.NENA)
        );
        // (...)
        // Donem de baixa unes quantes criatures.
        for (int i = 0; i < nomsADonarDeBaixa.length; i++) {
            nomCriatura = nomsADonarDeBaixa[i];
            pintaComSubTitolSenseSubratllar("\n\tVolem donar de baixa" +
                    " a una criatura amb el nom " + nomCriatura);
            criaturaEsborrada = aparcaNens.donarDeBaixa(nomCriatura);
            System.out.println();
            if (criaturaEsborrada != null) {
                System.out.format("S'ha donat de baixa " +
                        "a la següent criatura: \n");
                System.out.println(criaturaEsborrada);
            }
            else {
                System.out.format("No hi ha cap criatura de nom "
                        + nomCriatura + " per donar de baixa.\n");
            }
            if(i<nomsADonarDeBaixa.length-1) {
                pitjaTeclaPerContinuar();
            }
        }
        // (...)
        //  Tornem a preguntar quants nens i nenes hi ha matriculats.
        System.out.format("\nEn aquest moment tenim %d criatures," +
                        " de les quals %d son nens i %d son nenes.\n",
                aparcaNens.quantitatDeCriatures(),
                aparcaNens.quantitatPerSexe(Criatura.NEN),
                aparcaNens.quantitatPerSexe(Criatura.NENA)
        );
        // (...)
        // Busquem unes criatures en concret
        for (int i = 0; i < nomsABuscar.length; i++) {
            nomCriatura = nomsABuscar[i];
            pintaComSubTitolSenseSubratllar("\tBusquem una" +
                    " criatura amb el nom " + nomCriatura);
            criaturaTrobada = aparcaNens.buscar(nomCriatura);
            if (criaturaTrobada!=null)  {
                System.out.println("S'ha trobat una " +
                        "criatura de nom " + nomCriatura + ":");
                System.out.println(criaturaTrobada);
            }
            else
                System.out.println("No s'ha trobat cap" +
                        "criatura de nom " + nomCriatura);
        }
        // (...)
        // i finalment fem un recorregut per tota la mainaderia.
        for (int i = 0; i<aparcaNens.quantitatDeCriatures(); i++) {
            System.out.println(aparcaNens.get(i));
        }
        // (...)
    }
}
```

<details><summary>Pitja per veure un exemple de l'execució del programa Exemple_03_MainaderiaList</summary>

#### Execució del programa d'**`Exemple_03_MainaderiaList.java`**
```
	Execució del programa ExempleMainaderia!
	1a PART: Provant el mètode add amb un bucle for.
"Matriculem" a "aparcaNens" tota la "població" infantil.
	Contingut de poblacioInfantil
Nom: NIL		Edat: 0	Sexe: 10.
Nom: PERE		Edat: 1	Sexe: 10.
Nom: NEUS		Edat: 0	Sexe: 20.
Nom: ONA		Edat: 1	Sexe: 20.
Nom: DÍDAC		Edat: 0	Sexe: 10.
Nom: MARIONA	Edat: 1	Sexe: 20.
Nom: EVA		Edat: 3	Sexe: 20.
Nom: FIONA		Edat: 2	Sexe: 20.
Nom: ENIA		Edat: 3	Sexe: 20.
	----------------------------------------
	Contingut de aparcaNens
Nom: NIL		Edat: 0	Sexe: 10.
Nom: PERE		Edat: 1	Sexe: 10.
Nom: NEUS		Edat: 0	Sexe: 20.
Nom: ONA		Edat: 1	Sexe: 20.
Nom: DÍDAC		Edat: 0	Sexe: 10.
Nom: MARIONA	Edat: 1	Sexe: 20.
Nom: EVA		Edat: 3	Sexe: 20.
Nom: FIONA		Edat: 2	Sexe: 20.
Nom: ENIA		Edat: 3	Sexe: 20.
	----------------------------------------
En aquest moment tenim 9 criatures, de les quals 3 son nens i 6 son nenes.
	2a PART: Provant el mètode donarDeBaixa amb un bucle for.
Donem de baixa unes quantes criatures fent un for sobre el vector 'nomsADonarDeBaixa'.
	Contingut de nomsADonarDeBaixa
Pere, Mariona, Laia
	----------------------------------------
	Volem donar de baixa a una criatura amb el nom Pere
S'ha donat de baixa a la següent criatura: 
Criatura de nom: PERE té 1 anys. Sexe: nen.

	Volem donar de baixa a una criatura amb el nom Mariona
S'ha donat de baixa a la següent criatura: 
Criatura de nom: MARIONA té 1 anys. Sexe: nena.

	Volem donar de baixa a una criatura amb el nom Laia
No hi ha cap criatura de nom Laia per donar de baixa.

Ens tornem a interessar per quantes criatures matriculades hi ha.

En aquest moment tenim 7 criatures, de les quals 2 son nens i 5 son nenes.

    3a Part: Busquem criatures.
Busquem unes quantes criatures fent un for sobre el vector 'nomsABuscar'.
	Contingut de nomsABuscar
fiona, Mariona
	----------------------------------------
	Busquem una criatura amb el nom fiona
S'ha trobat una criatura de nom fiona:
Criatura de nom: FIONA té 2 anys. Sexe: nena.
	Busquem una criatura amb el nom Mariona
No s'ha trobat capcriatura de nom Mariona

Finalment fem un recorregut amb un for, per tota la mainaderia.
Criatura de nom: NIL té 0 anys. Sexe: nen.
Criatura de nom: NEUS té 0 anys. Sexe: nena.
Criatura de nom: ONA té 1 anys. Sexe: nena.
Criatura de nom: DÍDAC té 0 anys. Sexe: nen.
Criatura de nom: EVA té 3 anys. Sexe: nena.
Criatura de nom: FIONA té 2 anys. Sexe: nena.
Criatura de nom: ENIA té 3 anys. Sexe: nena.
```
</details>

## Quart exemple **`Exemple_04_Iteracio`**

A continuació veiem l'exemple **`Exemple_04_Iteracio`** que fa servir un **`LinkedList`** per guardar elements de la **classe** [**`Criatura`**](../src/classes/Criatura.java)

```java
public class Exemple_04_Iteracio {
    public static void main (String [] args ) {

        List nens = new LinkedList();
        List nenes = new LinkedList();
        List llarInfants = new LinkedList();
        Iterator it;
        Object membre;
        Criatura criaturaProfe = null;

        nens.add(new Criatura("NIL",0, Criatura.NEN));
        nens.add(new Criatura("PERE",1, Criatura.NEN));
        nens.add(new Criatura("DÍDAC",0, Criatura.NEN));
        nens.add(new Criatura("NIL",1, Criatura.NEN));
        nens.add(new Criatura("VICTOR", 2, Criatura.NEN));
        nens.add(new Criatura("PAU", 3, Criatura.NEN));

        nenes.add(new Criatura("NEUS",0, Criatura.NENA));
        nenes.add(new Criatura("ONA",1, Criatura.NENA));
        nenes.add(new Criatura("EVA",3, Criatura.NENA));
        nenes.add(new Criatura("FIONA",2, Criatura.NENA));
        nenes.add(new Criatura("ENIA",3, Criatura.NENA));
        // (...)
        mostraListCriatures(nens, "nens");
        mostraListCriatures(nenes, "nenes");
        // (...)
        llarInfants.addAll(nens);
        // (...)
        llarInfants.addAll(nenes);
        // (...)
        // Fer servir un iterador per mostrar el contingut.
        // (...)
        it = llarInfants.iterator();
        while (it.hasNext()) {
            membre = it.next();
            System.out.println(membre);
        }
        // (...)
        // Fer servir un iterador per calcular edat mitjana
        double sumaEdats = 0;
        double edatMitja;
        it = llarInfants.iterator();
        while (it.hasNext()) {
            membre = it.next(); // membre ha estat declarat Object
            criaturaProfe = (Criatura)membre;
            sumaEdats = sumaEdats+ criaturaProfe.getEdat();
        }
        edatMitja = sumaEdats/llarInfants.size();
        System.out.format("L'edat mitja és de %,.2f anys.\n", edatMitja);
        // Fer servir un iterador per buscar una nena de tres anys
        // (...)
        boolean trobada = false;
        it = llarInfants.iterator();
        while (it.hasNext() && !trobada) {
            criaturaProfe = (Criatura)it.next();
            if (criaturaProfe.getSexe()== Criatura.NENA && criaturaProfe.getEdat()==3)
                trobada = true;
        }
        if (trobada) {
            System.out.println("La nena de tres anys trobada és: ");
            System.out.println(criaturaProfe);
        }
        else
            System.out.println("La cerca no ha tingut èxit!");
        // (...)
        // Eliminar criatures de 0 o de 3 anys
        it = llarInfants.iterator();
        while (it.hasNext()) {
            criaturaProfe = (Criatura)it.next();
            if (criaturaProfe.getEdat()==0 || criaturaProfe.getEdat()==3) {
                // llarInfants.remove(criatura) // incorrecte!!!
                it.remove(); // CORRECTE!!! Elimina el darrer element proporcionat per next
            }
        }
        // (...)
    }
}
```

    
<details><summary>Pitja per veure un exemple de l'execució del programa Exemple_04_Iteracio</summary>

#### Execució del programa d'**`Exemple_04_Iteracio.java`**
```
    1a PART: Provant el mètode addAll
	Contingut de nens
	----------------------------------------
(NIL,0,nen), (PERE,1,nen), (DÍDAC,0,nen), (NIL,1,nen), 
(VICTOR,2,nen), (PAU,3,nen)
	----------------------------------------
	Contingut de nenes
	----------------------------------------
(NEUS,0,nena), (ONA,1,nena), (EVA,3,nena), (FIONA,2,nena), 
(ENIA,3,nena)
	----------------------------------------
	llarInfants.addAll(nens)
	----------------------------------------
	Contingut de llarInfants
	----------------------------------------
(NIL,0,nen), (PERE,1,nen), (DÍDAC,0,nen), (NIL,1,nen), 
(VICTOR,2,nen), (PAU,3,nen)
	----------------------------------------
	llarInfants.addAll(nenes)
	----------------------------------------
	Contingut de llarInfants
	----------------------------------------
(NIL,0,nen), (PERE,1,nen), (DÍDAC,0,nen), (NIL,1,nen), 
(VICTOR,2,nen), (PAU,3,nen), (NEUS,0,nena), (ONA,1,nena), 
(EVA,3,nena), (FIONA,2,nena), (ENIA,3,nena)
	----------------------------------------
	2a PART: Provant un iterador amb un bucle for per mostrar el contingut.

Criatura de nom: NIL té 0 anys. Sexe: nen.
Criatura de nom: PERE té 1 anys. Sexe: nen.
Criatura de nom: DÍDAC té 0 anys. Sexe: nen.
Criatura de nom: NIL té 1 anys. Sexe: nen.
Criatura de nom: VICTOR té 2 anys. Sexe: nen.
Criatura de nom: PAU té 3 anys. Sexe: nen.
Criatura de nom: NEUS té 0 anys. Sexe: nena.
Criatura de nom: ONA té 1 anys. Sexe: nena.
Criatura de nom: EVA té 3 anys. Sexe: nena.
Criatura de nom: FIONA té 2 anys. Sexe: nena.
Criatura de nom: ENIA té 3 anys. Sexe: nena.
	3a PART: Fent servir un iteradoramb un bucle for per calcular edat mitjana de totes les Criatures de llarInfants.
L'edat mitja és de 1.45 anys.
	4a PART: Fent servir un iteradoramb un bucle for per buscar una  nena de tres anys.
	Contingut de llarInfants
	----------------------------------------
(NIL,0,nen), (PERE,1,nen), (DÍDAC,0,nen), (NIL,1,nen), 
(VICTOR,2,nen), (PAU,3,nen), (NEUS,0,nena), (ONA,1,nena), 
(EVA,3,nena), (FIONA,2,nena), (ENIA,3,nena)
	----------------------------------------
La nena de tres anys trobada és: 
Criatura de nom: EVA té 3 anys. Sexe: nena.
	5a PART: Fent servir un iterador" +
amb un bucle for per eliminar les criatures de 0 o de 3 anys.
	Contingut de llarInfants
	----------------------------------------
(NIL,0,nen), (PERE,1,nen), (DÍDAC,0,nen), (NIL,1,nen), 
(VICTOR,2,nen), (PAU,3,nen), (NEUS,0,nena), (ONA,1,nena), 
(EVA,3,nena), (FIONA,2,nena), (ENIA,3,nena)
	----------------------------------------
	Contingut de llarInfants
	----------------------------------------
(PERE,1,nen), (NIL,1,nen), (VICTOR,2,nen), (ONA,1,nena), 
(FIONA,2,nena)
```
</details>



### [Anterior <- *README.md*](../README.md)&nbsp;&nbsp;-&nbsp;&nbsp;**Portada**&nbsp;&nbsp;-&nbsp;&nbsp; [Següent -> **_Classes_**](./02-classes.md)