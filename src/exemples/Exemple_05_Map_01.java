package exemples;

import java.util.*;
import static eines.EinesJoan.*;

import classes.Criatura;

public class Exemple_05_Map_01 {
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

        String nomPediatra;
        String[] nomsPediatres = {"Dr. Abelardo", "Dra. Banach", "Dra. Canyet"};

        // Es crea una variable de tipus Map<Criatura,String>
        // per aparellar cada criatura (Clau => Criatura) amb
        // el nom del seu pediatre (Value => String).
        Map<Criatura,String> serveiPediatria;

        // Instanciem el servei de serveiPediatria com una
        // variable de tipus HashMap<Criatura, String>
        serveiPediatria = new HashMap<Criatura, String>();

        pintaIniciPrograma("Exemple_05_Map_01");
        pintaComSubTitolSenseSubratllar("\t1a PART: Provant el mètode put de HashMap<Criatura, String>\n");
        pintaExecucioComanda("serveiPediatria.put(poblacio[i], nomsPediatres[0]);");
        // Fem un for per guardar a la variable serveiPediatria
        // cada criatura quin pediatre té assignat.
        for (int i=0; i<poblacio.length; i++) {
            // Els tres primers amb el Dr. Abelardo => nomsPediatres[0]
            if(i>=0 && i<3) {
                serveiPediatria.put(poblacio[i], nomsPediatres[0]);
            }
            else {
            // Els tres següents amb la Dra. Banach => nomsPediatres[1]
                if(i>=3 && i<6) {
                    serveiPediatria.put(poblacio[i], nomsPediatres[1]);
                } else {
            // I tota la resta amb la Dra. Canyet => nomsPediatres[2]
                    if(i>=6 && i<poblacio.length) {
                        serveiPediatria.put(poblacio[i], nomsPediatres[2]);
                    }
                }
            }
        }
        mostraMapCriaturaString(serveiPediatria,"serveiPediatria");
        pintaPartAcabada(1);
        pintaComSubTitolSenseSubratllar("\t2a PART: Consulta per obtenir el pediatres de cada criatura.");
        pintaExecucioComanda("\tfor (Criatura criaturaActual: poblacio) {\n" +
                "\t\tnomPediatra = serveiPediatria.get(criaturaActual);\n" +
                "\t\tString criaturaCadena = criaturaActual.toString();\n" +
                "\t\tSystem.out.format(\"%s pediatra de la criatura\\n\\t%s\\nés %s %s.\",\n" +
                "\t\t\t\tarticlePediatre, criaturaCadena,\n" +
                "\t\t\t\tarticlePediatre.toLowerCase(),\n" +
                "\t\t\t\tnomPediatra)");

        String articlePediatre = "";
        // Es realitza una consulta per esbrinar quin és el pediatre
        // de cada criatura, i per fer-ho es fa servir un for per
        // recórrer el Vector de Criatures (serveiPediatria).
        for (Criatura criaturaActual: poblacio) {
            nomPediatra = serveiPediatria.get(criaturaActual);
            articlePediatre = (nomPediatra.startsWith("Dr.")? "El":"La");
            String criaturaCadena = criaturaActual.toString();
            System.out.format("%s pediatra de la criatura\n\t%s\nés %s %s.\n\n",
                    articlePediatre, criaturaCadena,
                    articlePediatre.toLowerCase(),
                    nomPediatra);
//            System.out.println(articlePediatre + " pediatra de la criatura");
//            System.out.println("   " + criaturaActual);
//            System.out.println("   és " + articlePediatre.toLowerCase() + " " + nomPediatra);
        }

        pintaPartAcabada(3);
        pintaComSubTitolSenseSubratllar("\t4a PART: Consulta per recuperar el conjunt de claus.");

        // Map també ens permet recuperar el conjunt de claus
        // en el nostre cas les claus són les criatures.
        Set<Criatura> criaturesAteses;
        criaturesAteses = serveiPediatria.keySet();

        System.out.println("\n Les criatures ateses pel servei són:");
        for (Criatura criaturaActual : criaturesAteses)
            System.out.println("\t" + criaturaActual);

        pintaPartAcabada(2);
        pintaComSubTitolSenseSubratllar("\t3a PART: Consulta per recuperar el conjunt de claus.");
        // Map ens permet recuperar la col·lecció de valors associats
        // a les claus (en aquest exemple els valors són els pediatres
        // -Strings-)
        Collection<String> pediatres;
        pediatres = serveiPediatria.values();
        System.out.println("\n Els/les pediatres del servei són:");
        for (String ped : pediatres) System.out.println("  "+ped);

    }
}
