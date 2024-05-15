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