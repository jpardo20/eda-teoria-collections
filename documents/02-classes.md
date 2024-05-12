## Ens basarem en aquestes classes per fer els següents exercicis:

![ClasseElement](../img/eda-04-ClasseElement.png)

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
	
	// Setters & Getters
	public String getName() {return this.name;}
	public int getValue() {return this.value;}
	public void setValue(int newVal) {this.value=newVal;} 
	
	// Mètode equality (overriding of superclass equals)
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
	
	// Mètode toString (overriding of superclass toString)
	public String toString () {
		return "Element["+name+" "+value+"]";
	}
	
	// Mètode hashCode (overriding of superclass hashCode)
	public int hashCode() {
		return this.name.hashCode();
	}
}
```

Podeu trobar el codi al fitxer [**`Element.java`**](src/exemples/p01_exempleCollection/Element.java).

## [Anterior](./01-portada.md)

## [Següent](./03-exercici-01)


### [Anterior <- *Portada*](./01-portada.md)&nbsp;&nbsp;-&nbsp;&nbsp;**Portada**&nbsp;&nbsp;-&nbsp;&nbsp; [Següent -> **_Classes_**](./01-portada.md)