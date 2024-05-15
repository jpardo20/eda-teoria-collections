package exemples;

import classes.Criatura;
import java.util.*;

public class Exemple_07_Map_03 {
	public static void main (String [] args) {
        Criatura[] poblacio = {
            new Criatura("NIL",0, Criatura.NEN),
            new Criatura("PERE",1, Criatura.NEN),
            new Criatura("NEUS",0, Criatura.NENA),
            new Criatura("ONA",1, Criatura.NENA),
            new Criatura("DÍDAC",0, Criatura.NEN),
            new Criatura("NÚRIA",1, Criatura.NEN),
            new Criatura("EVA",3, Criatura.NENA),
            new Criatura("FIONA",2, Criatura.NENA),
            new Criatura("ENIA",3, Criatura.NENA)
        };

        // Es crea un objecte de tipus Map per aparellar
        // cada criatura amb el nom del seu pediatre
        Map<Criatura,String> serveiPediatria;
        String nomPediatra;
        serveiPediatria = new HashMap<Criatura, String>();

        // Els tres primers amb el Dr. Abelardo
        for (int i=0; i<3; i++) {
            serveiPediatria.put(poblacio[i], "Dr. Abelardo");
        }
        // Els tres següents amb la Dra. Banach
         for (int i=3; i<6; i++) {
            serveiPediatria.put(poblacio[i], "Dra. Banach");
        }
        // i tota la resta amb la Dra. Canyet
         for (int i=6; i<poblacio.length; i++) {
            serveiPediatria.put(poblacio[i], "Dra. Canyet");
        }

        // Ara podem consultar qui és el pediatre de cada criatura:
        System.out.println();

         String articlePediatre;

        for (Criatura c: poblacio) {
            nomPediatra = serveiPediatria.get(c);
            if (nomPediatra.startsWith("Dr.")){
                articlePediatre = "El";
            } else {
                articlePediatre = "La";
            }
            System.out.println(articlePediatre + " pediatra de la criatura");
            System.out.println("   "+c);
            System.out.format("   és %s %s.\n", articlePediatre.toLowerCase(), nomPediatra);
        }

        // Map tamb� ens permet recuperar el conjunt de claus
        // (en aquest cas les claus són les criatures)
        Set<Criatura> criaturesAteses = serveiPediatria.keySet();

        System.out.println("\n Les criatures ateses pel servei són:");
        for (Criatura c : criaturesAteses) System.out.println("  "+c);

        // Map ens permet recuperar la col·lecció de valors associats
        // a les claus (en aquest exemple els valors són els pediatres
        // -Strings-)
        Collection<String> pediatres;
        pediatres = serveiPediatria.values();
        System.out.println("\n Els/les pediatres del servei són:");
        for (String pediatre : pediatres) System.out.println("  " + pediatre);

        System.out.printf("SENSE DUPLICATS\n");
        HashSet<String> pediatresSenseDuplicat = new HashSet<String>();
        pediatresSenseDuplicat.addAll(pediatres);
        for (String ped : pediatresSenseDuplicat) System.out.println("  "+ped);


    }
}
