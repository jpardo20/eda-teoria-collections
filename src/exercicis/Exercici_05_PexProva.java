package exercicis;

import classes.DiccioAmbMap;
import classes.Teclat;

import java.util.*;

public class Exercici_05_PexProva {

  // opcions del menú que es presentarà a l'usuari del programet
  private static final int FINAL = 0;
  private static final int BUSCAR = 1;
  private static final int AFEGIR= 2;
  private static final int AFEGIR_CJT = 3;
  private static final int LLISTAR = 4;

  private static DiccioAmbMap elMeuDiccionari;

  public static void main (String [] args) {

    int opcio; // opció del menú i triada

    // crear el diccionari
    elMeuDiccionari = new DiccioAmbMap();


    // iterar mentre l'opció seleccionada no sigui la d'abandonar el programa
    opcio = menu();
    while (opcio!=FINAL)  {
      // processar l'opcio seleccionada
      switch (opcio) {
        case BUSCAR: buscarSinonims(); break;
        case AFEGIR: afegirSinonim(); break;
        case AFEGIR_CJT: afegirConjunt(); break;
        case LLISTAR: llistarParaules(); break;
      }
      opcio = menu();
    }
  } // final de main

  // procediment que presenta el menú i llegeix (i retorna) l'opció escollida
  private static int menu ()  {

    System.out.println("(0) FINALITZAR");
    System.out.println("(1) BUSCAR ELS SINÒNIMS D'UNA PARAULA");
    System.out.println("(2) AFEGIR UN SINÒNIM A UNA PARAULA");
    System.out.println("(3) AFEGIR UN CONJUNT DE SINONIMS A UNA PARAULA");
    System.out.println("(4) LLISTAR TOTES LES PARAULES");
    System.out.println();

    // iterar mentre l'opció no sigui una de les permeses
    String cadOpcio; // l'opció, tal com la llegim
    int opcio; // l'opció convertida en un número
    do {
      System.out.print("opció? ");
      cadOpcio = Teclat.llegirCadena();
      try {
        opcio = Integer.parseInt(cadOpcio);
      }
      catch(NumberFormatException e) {
          opcio = -1;
      }
    }
    while (opcio<FINAL || opcio>LLISTAR);

    return opcio;
  }

  private static void premerPerContinuar() {
    System.out.print("Prem return per continuar...");
    Teclat.llegirCadena();
  }


  private static void buscarSinonims ()  {
    String paraula;
    String [] sinonims;


    // demanar la paraula (cadena)
    System.out.print("Paraula: ");
    paraula = Teclat.llegirCadena();

    // interrogar al diccionari
    sinonims = elMeuDiccionari.recuperar(paraula);

    if (sinonims.length==0) {
      // una taula de mida zero indica que la paraula no es coneix
      System.out.println("La paraula no apareix al diccionari");
    }
    else {
      // iterar sobre la taula i anar escribint els sinonims
      for (String s: sinonims) System.out.println("  "+s);
    }
    premerPerContinuar();
  }

  private static void afegirSinonim ()  {
    String paraula;
    String sinonim;

    // demanar la paraula
    System.out.print("Paraula: ");
    paraula = Teclat.llegirCadena();
    // demanar el sin�nim
    System.out.print("Sinonim: ");
    sinonim = Teclat.llegirCadena();

    // afegir i dir com ha anat
    if (elMeuDiccionari.afegir(paraula, sinonim))
        System.out.println("  Sin�nim afegit");
    else
        System.out.println("  Sin�nim NO afegit. Possible repetici�");


    premerPerContinuar();
  }

  private static void afegirConjunt ()  {
    String paraula;
    String sinonims;
    boolean resultat = false;

    // demanar la paraula
    System.out.print("Paraula: ");
    paraula = Teclat.llegirCadena();
    // demanar tots els sin�nim
    System.out.print("Sinonims (separats per espai(s)): ");
    sinonims = Teclat.llegirCadena();

    // passar-ho a un Set
    String [] taulaSinonims = sinonims.split(" ");
    Set<String> cjtSinonims = new HashSet<String>();
    for (String sin : taulaSinonims) cjtSinonims.add(sin);


    // afegir i dir com ha anat
    if (elMeuDiccionari.afegir(paraula, cjtSinonims))
        System.out.println("  Sin�nims afegit");
    else
        System.out.println("  Sin�nims NO afegits. Possible repetici�");

    premerPerContinuar();
  }


   private static void llistarParaules ()  {
    String [] paraules;

    paraules = elMeuDiccionari.paraulesConegudes();

    if (paraules.length==0) {
      // una taula de mida zero indica que la paraula no es coneix
      System.out.println("El diccionari �s buit");
    }
    else {
      // iterar sobre la taula i anar escribint les paraules
      for (String s: paraules) System.out.println("  "+s);
    }
    premerPerContinuar();
  }

}
