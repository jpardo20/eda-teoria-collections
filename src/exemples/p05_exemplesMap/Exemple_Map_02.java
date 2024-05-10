package exemples.p05_exemplesMap;

import exemples.p02_exemplesList_01.Criatura;
import java.util.*;

public class Exemple_Map_02 {
	public static void main (String [] args) {

        Criatura [] poblacio = {
            new Criatura("NIL",0,Criatura.NEN),
            new Criatura("PERE",1, Criatura.NEN),
            new Criatura("NEUS",0, Criatura.NENA),
            new Criatura("ONA",1, Criatura.NENA),
            new Criatura("D�DAC",0, Criatura.NEN),
            new Criatura("N�RIA",1, Criatura.NEN),
            new Criatura("EVA",3, Criatura.NENA),
            new Criatura("FIONA",2, Criatura.NENA),
            new Criatura("ENIA",3, Criatura.NENA)
        };

        // Map per aparellar cada criatura amb el nom del seu pediatra
        Map<Criatura,String> serveiPediatria;

        String nomPediatra;

        serveiPediatria = new HashMap<Criatura, String>();

        //els tres primers amb el Dr. Abelardo
        for (int i=0; i<3; i++) {
            serveiPediatria.put(poblacio[i], "Abelardo");
        }
        //els tres seg�ents amb la Dra. Banach
         for (int i=3; i<6; i++) {
            serveiPediatria.put(poblacio[i], "Banach");
        }
        //i tota la resta amb la Dra. Canyet
         for (int i=6; i<poblacio.length; i++) {
            serveiPediatria.put(poblacio[i], "Canyet");
        }

        // Ara podem consultar qui es el pedriatra de cada criatura:
        System.out.println();
        for (Criatura c: poblacio) {
            nomPediatra = serveiPediatria.get(c);
            System.out.println("El/la pediatra de la critura");
            System.out.println("   "+c);
            System.out.println("   �s el/la Dr./Dra. "+ nomPediatra);
        }

        // Map tamb� ens permet recuperar el conjunt de claus
        // (en aquest cas les claus s�n les criatures)
        Set<Criatura> criaturesAteses;
        criaturesAteses = serveiPediatria.keySet();

        System.out.println("\n Les criatures ateses pel servei s�n:");
        for (Criatura c : criaturesAteses) System.out.println("  "+c);

        // Map ens permet recuperar la col�lecci� de valors associats
        // a les claus (en aquest exemple els valors s�n els pediatres
        // -Strings-)
        Collection<String> pediatres;
        pediatres = serveiPediatria.values();
        System.out.println("\n Els/les pediatres del servei s�n:");
        for (String ped : pediatres) System.out.println("  "+ped);

    }
}
