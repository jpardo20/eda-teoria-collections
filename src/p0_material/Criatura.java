package p0_material;

@SuppressWarnings("rawtypes")
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