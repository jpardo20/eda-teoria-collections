package exercicis.classes;

import classes.Criatura;

import java.util.*;

/* implementaci� de la interficie MainaderiaTres basada en Set */
public class MainaderiaTresSet { // implements MainaderiaTres, Iterable<Criatura>{

    private Set<Criatura> infrastructura; //Conjunt que far�, com el seu nom
    //indica, d'infrastructura per a guardar les criatures
    
    public MainaderiaTresSet() {
        // constructor
        /* ENCARA S'HA DE COMPLETAR */
        
    }

    /* CAL IMPLEMENTAR TOTS ELS M�TODES DEFINITS A LA INTERFICIE */
    // Excepte iterator que ja el teniu implementat de regal

    /* retorna un iterador que permet rec�rrer la mainaderia */
    public Iterator<Criatura> iterator() {
        return infrastructura.iterator();
    }
    
}
