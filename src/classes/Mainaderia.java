package classes;



public interface Mainaderia {
    
    // afegeix una criatura. Excepci� si ja hi ha una criatura igual
    public void matricular (Criatura c) throws IllegalArgumentException;
    
    // desmatricula la criatura de nom donat. Retorna la criatura que 
    // es desmatricula. Si no n'hi ha cap amb aquell nom retorna null
    public Criatura desMatricular(String nom);
    
    // Retorna la criatura que t� el nom especificat. Retorna null si no
    // n'hi ha cap
    public Criatura buscar(String nom);
    
    // retorna el n�mero de criatures matriculades
    public int numCriatures();
    
    // retorna el n�mero de criatures del sexe especificat com a par�metre
    public int quantsSexe (int sexe);
    
    // retorna la i-�ssima criatura. Excepci� si el par�metre est� fora
    // dels l�mits actuals
    public Criatura get(int i) throws IndexOutOfBoundsException;
        
}
