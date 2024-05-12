package eines;

import eines.Teclat.*;

public class EinesJoan {
    public static void mostraCollection(Object colleccioAMostrar, String nomColleccio){
        String cadenaToString = colleccioAMostrar.toString();
        String cadenesAEliminar[] = {"Element","], ","]]"};
        String cadenaTitol = "\tContingut de " + nomColleccio;
        System.out.println(cadenaTitol);
        for (int i = 0; i < cadenesAEliminar.length; i++) {
            cadenaToString = cadenaToString.replace(cadenesAEliminar[i],"");
        }
        String[] trossosCadenaToString = cadenaToString.split("\\[");
        String[] elements;
        String cadena = "";

        for (int i = 2; i < trossosCadenaToString.length; i++) {
            elements = trossosCadenaToString[i].split(" ");
            cadena += "[" + elements[0] + "," + elements[1] + "] ";
        }
        System.out.println(cadena);
//        cadenaTitol += "\t";
        pintaLiniaSotaTitol(cadenaTitol,true);
    }

    public static void pintaLiniaSotaTitol(String titol, boolean ... tabulador){
        if (tabulador!=null)
            System.out.print("\t");
    }

    public static void pintaComSubTitol(String subTitol, boolean ... tabulador){
        if (tabulador!=null)
            System.out.print("\t");
        System.out.println(subTitol);
        if (tabulador!=null)
            System.out.print("\t");
        System.out.println("-".repeat(subTitol.length()));
    }
    
    public static void pintaComTitol(String titol, boolean ...  tabulador){
        if (tabulador!=null)
            System.out.print("\t");
        System.out.println(titol);
        pintaLiniaSotaTitol(titol, true);
    }

    public static void saltDeLinia(){
        System.out.println();
    }

    public static void saltaLinies(int quantitatDeSalts){
        for (int i = 0; i < quantitatDeSalts; i++)
            saltDeLinia();
    }

    public static void pitjaTeclaPerContinuar(String...  missatgesRebuts){
        if (missatgesRebuts.length == 0)
            System.out.print("\t ---- Pitja INTRO per continuar... ----");
        else
            System.out.print(missatgesRebuts[0]);
        try { System.in.read();
        }
        catch(Exception e) {}
    }
}
