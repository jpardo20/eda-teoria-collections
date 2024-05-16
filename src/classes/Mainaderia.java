package classes;

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
    // Mètode que retorna la quantitat de criatures
    // del sexe especificat com a paràmetre
    public int quantitatPerSexe(int sexe);
    // Mètode que retorna la i-èssima criatura.
    // Excepció si el paràmetre està fora dels límits actuals
    public Criatura get(int i) throws IndexOutOfBoundsException;
}
