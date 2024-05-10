package exemples.p03_exemplesList_02;


import exemples.p02_exemplesList_01.Criatura;
import java.util.*;

public class MainaderiaList implements Mainaderia {

    // Referencia a objecte de la classe List on "guardarem" les criatures...
    private List contingut;
    
    public MainaderiaList() {
        // crear la llista. Inicialment ser� buida, clar...
        this.contingut = new ArrayList();
    }
 
   // afegeix una criatura. Excepci� si ja hi ha una criatura igual
    public void matricular (Criatura c) throws IllegalArgumentException {
        if (this.contingut.contains(c))
            throw new IllegalArgumentException("matricular: criatura repetida");
        contingut.add(c);
    }
    
    // desmatricula la criatura de nom donat. Retorna la criatura que 
    // es desmatricula. Si no n'hi ha cap amb aquell nom retorna null
    public Criatura desMatricular(String nom) {
        Criatura target = new Criatura(nom, Criatura.MIN_EDAT, Criatura.NEN);
        int index = contingut.indexOf(target);
        if (index==-1) {
            return null;
        }
        else {
            return (Criatura)contingut.remove(index);
        }
    }
    
    // Retorna la criatura que t� el nom especificat. Retorna null si no
    // n'hi ha cap
    public Criatura buscar(String nom) {
        Criatura target = new Criatura(nom, Criatura.MIN_EDAT, Criatura.NEN);
        int index = contingut.indexOf(target);
        if (index==-1) {
            return null;
        }
        else {
            return (Criatura)contingut.get(index);
        }
    }
    
    // retorna el n�mero de criatures matriculades
    public int numCriatures() {
        return contingut.size();
    }
    
    // retorna el n�mero de criatures del sexe especificat com a par�metre
    public int quantsSexe (int sexe) {
        Criatura c;
        int quants=0;
        //Iterem sobre el contingut, per� sense fer us de l'iterador
        // (mala soluci�. Sempre �s millor fer �s de l'iterador)
        for (int i=0; i<contingut.size(); i++) {
            c = (Criatura)contingut.get(i);
            if (c.getSexe()==sexe) quants++;
        }
        return quants;
    }
    
    // retorna la i-�ssima criatura. Excepci� si el par�metre est� fora
    // dels l�mits actuals
    public Criatura get(int i) throws IndexOutOfBoundsException {
        return (Criatura)contingut.get(i);
        // NOTA: get ja llen�a IndexOutOfBoundsException si el par�metre est�
        // fora de limits
    }

}
