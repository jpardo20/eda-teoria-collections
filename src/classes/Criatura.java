package classes;

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
