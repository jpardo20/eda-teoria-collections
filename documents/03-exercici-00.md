# Exercici 00

## Familiaritzar-se amb **`Collection`**

### Trobareu aquest exercici en el **paquet `exercicis`**, amb el nom **`Exercici_00`**. S’utilitza la **classe `Element`**, el codi de la qual teniu en el fitxer [**`Element.java`**](../src/classes/Element.java).

### Heu de completar els punts que s’indica per tal de realitzar les accions que s’especifiquen.

```java
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

        // Crear una primera col·lecció que contingui tots
        // els elements de les posicions parelles de la taula unsElements.
        /* COMPLETE */

        // Crear una segona col·lecció que contingui tots els elements
        // de la taula unsElements que s'anomenen "Alpha" o "Omega"
        /* COMPLETE */

        // A la segona col·lecció afegir-hi l'element de
        // la posició (índex) 3 de la taula
        /* COMPLETE */

        // De la primera col·lecció eliminar els elements que són com els de la segona
        /* COMPLETE */

        // Obtenir una taula amb tots els elements de la primera col·lecció.
        //  Mostrar-ne el contingut.
        /* COMPLETE */
    }
}
```

Podeu trobar el fitxer [**`Exercici_00.java`**](../src/exercicis/Exercici_00.java).

### [Anterior <- *README.md*](../README.md)&nbsp;&nbsp;-&nbsp;&nbsp;**Portada**&nbsp;&nbsp;-&nbsp;&nbsp; [Següent -> **_Classes_**](./02-classes.md)