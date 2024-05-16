## Ens basarem en aquestes classes per fer els següents exercicis:

### Ìndex de **Classes**

1. **Classe** [**`Element`**](#primera-classe-element)

1. **Classe** [**`Criatura`**](#segona-classe-criatura)

3. **Interfície** [**`Mainaderia`**](#tercera-interfície-mainaderia)

## Primera Classe **`Element`**

### Diagrama UML - Classe **`Element`**

![ClasseElement](../img/eda-04-ClasseElement.png)

### Desenvolupament - Classe **`Element`**

```java
public class Element {
    // Atributs
    private String name;
    private int value;
    // Constructor
    public Element (String name, int value) {
        this.name = name;
        this.value = value;
    }
    // Mètodes Getters
    public String getName() {return this.name;}
    public int getValue() {return this.value;}
    // Mètodes Setters
    public void setName(String _name) {this.name = _name;}
    public void setValue(int _value) {this.value = _value;}
    // Mètode equality (overriding of superclass equals)
    public boolean equals (Object _object) {
        Element elementRebut;
        try {
            elementRebut = (Element) _object;
            return this.name.equals(elementRebut.name);
        }
        catch(Exception e) {
            return false;
        }
    }
    // Mètode toString (overriding of superclass toString)
    public String toString () {
        return "Element["+name+" "+value+"]";
    }
    // Mètode mostra
    public void mostra() {
        System.out.format("\tNom:\t%s\nNom:\t%s", this.name, this.value);
    }
    // Mètode hashCode (overriding of superclass hashCode)
    public int hashCode() {
        return this.name.hashCode();
    }
    // Mètode tornaCadena
    public String tornaComCadena() {
        return String.format("%s,%d", this.name, this.value);
    }
}
```

Podeu trobar el codi al fitxer [**`Element.java`**](../src/classes/Element.java).

[Torna a ìndex de **classes**](#ìndex-de-classes)

## Segona Classe **`Criatura`**

### Diagrama UML - Classe **`Criatura`**

![ClasseCriatura](../img/eda-uml-class-criatura.png)

### _Desenvolupament_ - Classe **`Criatura`**

```java
public class Criatura implements Comparable{
    public static final int NEN = 10;
    public static final int NENA = 20;
    public static final int MIN_EDAT=0;
    public static final int MAX_EDAT=3;
    // Atributs
    private String nom;
    private int edat;
    private int sexe;
    // Constructor
    public Criatura(String _nom, int _edat, int _sexe) {
        if (_edat<MIN_EDAT || _edat>MAX_EDAT)
            throw new IllegalArgumentException("Edat no vàlida: " + _edat);
        if (_sexe!=NEN && _sexe!=NENA)
            throw new IllegalArgumentException("Sexe no vàlid: " + _sexe);
        this.nom = _nom;
        this.edat = _edat;
        this.sexe = _sexe;
    }
    // Mètodes Getters
    public String getNom() {return this.nom;}
    public int getEdat() {return this.edat;}
    public int getSexe() {return this.sexe;}
    // Mètodes Setters
    public void setNom(String _nom) {this.nom = _nom;}
    public void setEdat(int _edat) {this.edat = _edat;}
    public void setSexe(int _sexe) {this.sexe = _sexe;}
    // Redefinició del mètode toString heretat d'Object.
    public String toString () {
        String resultat;
        resultat = "Criatura de nom: " + this.nom +
                " té " + this.edat + " anys. Sexe: ";
        resultat += (this.sexe == NEN) ?
                "nen." : "nena.";
        return resultat;
    }
    // Implementació de la interfície Comparable
    public int compareTo(Object _objecte) {
        // Comparació basada en l'ordre lexicogràfic sense
        // distingir majúscules de minúscules.
        Criatura altra = (Criatura)_objecte;
        return this.nom.compareToIgnoreCase(altra.nom);
    }
    // Redefinició del mètode equals heretat d'object.
    public boolean equals (Object _objecte) {
        // Redefinició compatible amb compareTo
        try { return this.compareTo(_objecte) == 0; }
        catch(ClassCastException e) { return false; }
    }
}
```

Podeu trobar el codi al fitxer [**`Criatura.java`**](../src/classes/Criatura.java).

[Torna a ìndex de **classes**](#ìndex-de-classes)

## Tercera interfície **`Mainaderia`**

A continuació veiem l'exemple de la definició d'una **`interfície`** anomenada **`Mainaderia`** que fa servir la **Classe** [**`Criatura`**](../src/classes/Criatura.java)

```java
public interface Mainaderia {
    // Mètode que afegeix una criatura.
    // Excepció si ja hi ha una criatura igual
    public void matricular (Criatura c) throws IllegalArgumentException;
    // Mètode que dona de baixa la criatura de nom donat.
    // Retorna la criatura que es dona de baixa.
    // Si no n'hi ha cap amb aquell nom retorna null.
    public Criatura donarDeBaixa(String nom);
    // Retorna la criatura que té el nom especificat.
    // Retorna null si no n'hi ha cap
    public Criatura buscar(String nom);
    // Mètode que retorna la quantitat de criatures matriculades
    public int quantitatDeCriatures();
    // Mètode que retorna la quantitat de criatures del sexe especificat com a paràmetre
    public int quantitatPerSexe(int sexe);
    // Mètode que retorna la i-èssima criatura.
    // Excepció si el paràmetre està fora dels límits actuals
    public Criatura get(int i) throws IndexOutOfBoundsException;
}
```

[Torna a ìndex de **classes**](#ìndex-de-classes)

## [Anterior **`Portada`**](./01-portada.md)

## [Següent **`Exercici_00`**](./03-exercici-00)
