package classes;

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

	// Mètode hashCode (overriding of superclass hashCode)
	public int hashCode() {
		return this.name.hashCode();
	}
}