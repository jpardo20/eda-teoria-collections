
# Estructures de  Dades i Algorismes

# Exercicis sobre  “col·leccions” 

![alt text](./img/logo-tc.png)

# EXERCICIS PER  REALITZAR

Ens basarem en aquestes classes per fer els següents exercicis:

```java
public class Element {
    private String name;
    private int value;
    // Constructor
    public Element (String name, int value) {
        this.name = name;
        this.value = value;
    }
    // setters & getter
    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int newVal) {
        this.value=newVal;
    }

    // equality (overriding of superclass equals)
    public boolean equals (Object o) {
        Element other;
        try {
            other = (Element)o;
            return this.name.equals(other.name);
        }
        catch(Exception e) {
            return false;
        }
    }
    // toString (overriding of superclass toString)
    public String toString () {
        return "Element["+name+" "+value+"]";
    }
}
```

Podeu trobar el codi al fitxer [**`Element.java`**](./src/p0_material/Element.java).

## Familiaritzar-se amb **`Collection`**

Trobareu aquest exercici en el **paquet `ex00`**. S’utilitza la **classe `Element`**, el codi de la qual teniu en el fitxer [**`Element.java`**](./files/Element.java).

### Heu de completar els punts que s’indica per tal de realitzar les accions que s’especifiquen.

```java
package ex00;

import java.util.ArrayList;
import java.util.Collection;
import p0_material.Element;

public class Exercici_00 {
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

        // Crear una primera col·lecció que contingui tots els elements de les posicions
        // parelles de la taula unsElement.
        /* COMPLETE */


        // Crear una segona col·lecció que contingui tots els elements de la taula
        // unsElements que s'anomenen "Alpha" o "Omega"
        /* COMPLETE */


        // A la segona col·lecció afegir-hi l'element de la posició (índex) 3 de la
        // taula
        /* COMPLETE */


        // De la primera col·lecció eliminar els elements que són com els de la segona
        /* COMPLETE */


        // Obtenir una taula amb tots els elements de la primera col·lecció. Mostrar-ne
        // el contingut
        /* COMPLETE */

    }
}
```



```java
public class Criatura implements Comparable{
    // Declaració de constants
    public static final int NEN = 10;
    public static final int NENA = 20;
    public static final int MIN_EDAT=0;
    public static final int MAX_EDAT=6;
    
    // Atributs
    private String nom;
    private int edat;
    private int sexe;

    // Constructor amb tots els paràmetres
    public Criatura(String _nom, int _edat, int _sexe) {
        if (_edat<MIN_EDAT || _edat>MAX_EDAT)
            throw new IllegalArgumentException("edat no vàlida: "+_edat);
        if (_sexe!=NEN && _sexe!=NENA)
            throw new IllegalArgumentException("sexe no vàlid: "+_sexe);  
        this.nom = _nom;
        this.edat = _edat;
        this.sexe = _sexe;
    }
    
    // Setters i Getters
    public String getNom() {
        return this.nom;
    }
    
    public int getEdat() {
        return this.edat;
    }
    
    public int getSexe() {
        return this.sexe;
    }

    public void setNom(String _nom) {
        this.nom = _nom;
    }

    public void setEdat(int _edat) {
        this.edat = _edat;
    }

    public void setSexe(int _sexe) {
        this.sexe = _sexe;
    }
  
    // Redefinició del mètode toString heretat d'Object
    public String toString () {
        String resultat;
        resultat = "Criatura de nom: " + this.nom + ", té " + this.edat + " anys. ";
        return resultat += (sexe == NEN) ? "Sexe: nen": "Sexe: nena";
    }
    
    // Implementació de la interfície Comparable
    public int compareTo(Object objecteAComparar) {
        // comparació basada en l'ordre lexicogràfic
        // sense distingir majúscules de minúscules.
        Criatura unaAltraCriatura = (Criatura) objecteAComparar;
        return this.nom.compareToIgnoreCase(unaAltraCriatura.nom);
    }
    
    // Redefinició del mètode equals heretat d'object.
    public boolean equals(Object objecteAComparar) {
        // redefinició compatible amb compareTo
        try {
            return (this.compareTo(objecteAComparar) == 0);
        }
        catch(ClassCastException excepcio) {
            return false;
        }
    }
}
```
Podeu trobar el codi al fitxer [**`Criatura.java`**](./src/p0_material/Criatura.java).
