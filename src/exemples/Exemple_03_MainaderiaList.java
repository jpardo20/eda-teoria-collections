package exemples;
import classes.Criatura;
import classes.MainaderiaList;

import static eines.EinesJoan.*;
import static eines.EinesJoan.pintaComSubTitolSenseSubratllar;

public class Exemple_03_MainaderiaList {
    /* Aquest programa de prova té molt poc valor per a determinar la
     * presència d'errors en la implementació de la interfície Mainaderia.
     * Més que com una prova es pot entendre com un exemple d'ús de les
     * classes que puguin implementar la interfície. */
    public static void main (String [] args) {
        // Definició de variables
        Criatura criaturaEsborrada, criaturaTrobada;
        String nomCriatura;
        MainaderiaList aparcaNens;
        // Inicialització de variables
        Criatura[] poblacioInfantil = {
                new Criatura("NIL",0, Criatura.NEN),
                new Criatura("PERE",1, Criatura.NEN),
                new Criatura("NEUS",0, Criatura.NENA),
                new Criatura("ONA",1, Criatura.NENA),
                new Criatura("DÍDAC",0, Criatura.NEN),
                new Criatura("MARIONA",1, Criatura.NENA),
                new Criatura("EVA",3, Criatura.NENA),
                new Criatura("FIONA",2, Criatura.NENA),
                new Criatura("ENIA",3, Criatura.NENA)
        };
        String[] nomsADonarDeBaixa = {"Pere", "Mariona", "Laia"};
        String[] nomsABuscar = {"fiona", "Mariona"};

        pintaIniciPrograma("Exemple_03_MainaderiaList");
        pintaComSubTitolSenseSubratllar("\t1a PART: Provant el mètode add amb un bucle for.");
        pintaComSubTitolSenseSubratllar("\"Matriculem\" a \"aparcaNens\" tota la \"població\" infantil.");
        mostraVectorCriatura(poblacioInfantil,"poblacioInfantil");
        aparcaNens = new MainaderiaList();
        // Matriculem tota la població infantil.
        for (int i=0; i<poblacioInfantil.length; i++) {
            aparcaNens.matricular(poblacioInfantil[i]);
        }
        mostraMainaderiaList(aparcaNens,"aparcaNens");
        // Ens interessem per quants matriculats hi ha.
        System.out.format("\nEn aquest moment tenim %d criatures," +
                " de les quals %d son nens i %d son nenes.\n",
                aparcaNens.quantitatDeCriatures(),
                aparcaNens.quantitatPerSexe(Criatura.NEN),
                aparcaNens.quantitatPerSexe(Criatura.NENA)
        );
        pintaPartAcabada(1);
        pintaComSubTitolSenseSubratllar("\t2a PART: Provant el mètode" +
                " donarDeBaixa amb un bucle for.");
        pintaComSubTitolSenseSubratllar("Donem de baixa unes quantes criatures" +
                " fent un for sobre el vector 'nomsADonarDeBaixa'.");
        // Donem de baixa unes quantes criatures.
        mostraVector(nomsADonarDeBaixa, "nomsADonarDeBaixa");
        pitjaTeclaPerContinuar();

        for (int i = 0; i < nomsADonarDeBaixa.length; i++) {
            nomCriatura = nomsADonarDeBaixa[i];
            pintaComSubTitolSenseSubratllar("\n\tVolem donar de baixa" +
                    " a una criatura amb el nom " + nomCriatura);
            criaturaEsborrada = aparcaNens.donarDeBaixa(nomCriatura);
            System.out.println();
            if (criaturaEsborrada != null) {
                System.out.format("S'ha donat de baixa " +
                        "a la següent criatura: \n");
                System.out.println(criaturaEsborrada);
            }
            else {
                System.out.format("No hi ha cap criatura de nom "
                        + nomCriatura + " per donar de baixa.\n");
            }
            if(i<nomsADonarDeBaixa.length-1) {
                pitjaTeclaPerContinuar();
            }
        }
        pintaPartAcabada(2);
        pintaComSubTitolSenseSubratllar("Ens tornem a interessar per quantes criatures matriculades hi ha.");
        //  Tornem a preguntar quants nens i nenes hi ha matriculats.
        System.out.format("\nEn aquest moment tenim %d criatures," +
                        " de les quals %d son nens i %d son nenes.\n",
                aparcaNens.quantitatDeCriatures(),
                aparcaNens.quantitatPerSexe(Criatura.NEN),
                aparcaNens.quantitatPerSexe(Criatura.NENA)
        );
        pintaPartAcabada(2);
        pintaComSubTitolSenseSubratllar("3a Part: Busquem criatures.");
        pintaComSubTitolSenseSubratllar("Busquem unes" +
                " quantes criatures fent un for sobre" +
                " el vector 'nomsABuscar'.");
        mostraVector(nomsABuscar, "nomsABuscar");
        // Busquem unes criatures en concret
        for (int i = 0; i < nomsABuscar.length; i++) {
            nomCriatura = nomsABuscar[i];
            pintaComSubTitolSenseSubratllar("\tBusquem una" +
                    " criatura amb el nom " + nomCriatura);
            criaturaTrobada = aparcaNens.buscar(nomCriatura);
            if (criaturaTrobada!=null)  {
                System.out.println("S'ha trobat una " +
                        "criatura de nom " + nomCriatura + ":");
                System.out.println(criaturaTrobada);
            }
            else
                System.out.println("No s'ha trobat cap " +
                        "criatura de nom " + nomCriatura);
        }
        pintaPartAcabada(3);
        // i finalment fem un recorregut per tota la mainaderia.
        pintaComSubTitolSenseSubratllar("Finalment fem un recorregut" +
                " amb un for, per veure tota la mainaderia.");
        for (int i = 0; i<aparcaNens.quantitatDeCriatures(); i++) {
            System.out.println(aparcaNens.get(i));
        }
        pintaFinalPrograma("Exemple_03_MainaderiaList");
    }
}