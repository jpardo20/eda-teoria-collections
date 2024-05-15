package exemples;

import java.util.*;

import classes.Criatura;
import static eines.EinesJoan.*;

public class Exemple_02_GuardarCriatures {
	public static void main(String[] args) {
		// Es crea un magatzem del tipus Criatura
		Criatura[] poblacioDeCriatures = { new Criatura("NIL", 0, Criatura.NEN),
				new Criatura("PERE", 1, Criatura.NEN),
				new Criatura("NEUS", 0, Criatura.NENA),
				new Criatura("ONA", 1, Criatura.NENA),
				new Criatura("DÍDAC", 0, Criatura.NEN),
				new Criatura("NIL", 1, Criatura.NEN),
				new Criatura("EVA", 3, Criatura.NENA),
				new Criatura("FIONA", 2, Criatura.NENA),
				new Criatura("ENIA", 3, Criatura.NENA)
		};

		// Es creen el magatzem llarInfants, es crea del tipus List i
		// es crea una instància de tipus LinkedList
		List llarInfants;
		llarInfants = new LinkedList();
		// List té tots els mètodes de Collection
		// per exemple el mètode add(Object o)
		// Es fa servir el mètode add per afegir
		// els elements de la variable 'poblacio'
		// d'un amb un fent servir un for.
		for (int i = 0; i < poblacioDeCriatures.length; i++) {
			llarInfants.add(poblacioDeCriatures[i]);
		}
		pintaIniciPrograma("ExempleGuardarCriatures");
		pintaComSubTitolSenseSubratllar("\n\t1a PART: Provant el mètode add amb un bucle for\n");
		mostraListCriatures(llarInfants,"poblacioDeCriatures");
//		mostraGuardarCriaturesList(llarInfants,"llarInfants");

		pintaPartAcabada(1);
		pintaComSubTitolSenseSubratllar("\n\t2a PART: Provant el mètode add per posició\n");
		mostraListCriatures(llarInfants,"llarInfants");
		pintaExecucioComanda("\tllarInfants.add(\n" +
				"\t\tnew Criatura(\"OLGA\", 2, Criatura.NENA));");
		// El mètode add(Object obj) afegeix l'objecte rebut
		// al final de la llista.
		llarInfants.add(
				new Criatura("OLGA", 2, Criatura.NENA));
		mostraListCriatures(llarInfants,"llarInfants");
		pitjaTeclaPerContinuar();
		pintaExecucioComanda("\tllarInfants.add(3,\n" +
				"\t\t\tnew Criatura(\"JOAN\", 1, Criatura.NEN))");
		// El mètode add(Object o, int i) afegeix a la posició i
		// l'element rebut desplaçant la resta d'elements cap
		// als índexs superiors si cal.
		llarInfants.add(3,
				new Criatura("JOAN", 1, Criatura.NEN));
		mostraListCriatures(llarInfants,"llarInfants");
		pintaPartAcabada(2);
		pintaComSubTitolSenseSubratllar("\n\t3a PART: Accedint a la Llista amb el mètode 'get(posicio)'\n");
		pintaExecucioComanda("\tfor (int i = 0; i < llarInfants.size(); i++) {\n" +
				"\t\tSystem.out.println(llarInfants.get(i));\n" +
				"\t}");
		saltDeLinia();
		// Les llistes són accessibles per posició,
		// com si fossin vectors (Arrays) però fent
		// servir el mètode get.
		for (int i = 0; i < llarInfants.size(); i++) {
			System.out.println(llarInfants.get(i));
		}
		saltDeLinia();
		pintaPartAcabada(3);
		pintaComTitol("\n\t4a PART: Accedint a la Llista amb el mètode 'get(posicio)'\n");
		pintaExecucioComanda("\tllarInfants.set(8,\n" +
				"\t\tnew Criatura(\"ELISA\", 3, Criatura.NENA));");
		// Les llistes permeten de canviar el contingut d'una posició
		llarInfants.set(8, new Criatura("ELISA", 3, Criatura.NENA));
		mostraListCriatures(llarInfants,"llarInfants");
		pitjaTeclaPerContinuar();
		pintaExecucioComanda("\tllarInfants.set(2,\n" +
				"\t\t\tllarInfants.get(7));");
		llarInfants.set(2, llarInfants.get(7));
		mostraListCriatures(llarInfants,"llarInfants");
		pitjaTeclaPerContinuar();
		// Les llistes permeten de fer cerques basades en EQUALS
		int primerNil, darrerNil;
		Criatura objetiuDeLaCerca = new Criatura("nil", 3, Criatura.NEN);
		pintaExecucioComanda("\tCriatura objetiuDeLaCerca =\n\t\t new Criatura(\"nil\", 3, Criatura.NEN);");
		primerNil = llarInfants.indexOf(objetiuDeLaCerca);
		pintaExecucioComanda("\tprimerNil = llarInfants.indexOf(objetiuDeLaCerca);");
		System.out.format("primerNil = %s.\n", primerNil);
		darrerNil = llarInfants.lastIndexOf(objetiuDeLaCerca);
		pintaExecucioComanda("\tdarrerNil = llarInfants.lastIndexOf(objetiuDeLaCerca);");
		System.out.format("darrerNil = %s.\n", darrerNil);
		pintaPartAcabada(4);
		pintaFinalPrograma("ExempleGuardarCriatures");
	}
}