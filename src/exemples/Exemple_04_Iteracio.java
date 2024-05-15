package exemples;

import classes.Criatura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static eines.EinesJoan.*;
import static eines.EinesJoan.pintaExecucioComanda;

public class Exemple_04_Iteracio {
	public static void main (String [] args ) {
		
		List nens = new LinkedList();
		List nenes = new LinkedList();
		List llarInfants = new LinkedList();
		Iterator it;
		Object membre;
		Criatura criaturaProfe = null;
		
		nens.add(new Criatura("NIL",0, Criatura.NEN));
		nens.add(new Criatura("PERE",1, Criatura.NEN));
		nens.add(new Criatura("DÍDAC",0, Criatura.NEN));
		nens.add(new Criatura("NIL",1, Criatura.NEN));
		nens.add(new Criatura("VICTOR", 2, Criatura.NEN));
		nens.add(new Criatura("PAU", 3, Criatura.NEN));
		
		nenes.add(new Criatura("NEUS",0, Criatura.NENA));
		nenes.add(new Criatura("ONA",1, Criatura.NENA));
		nenes.add(new Criatura("EVA",3, Criatura.NENA));
		nenes.add(new Criatura("FIONA",2, Criatura.NENA));
		nenes.add(new Criatura("ENIA",3, Criatura.NENA));

		pintaIniciPrograma("Exemple_04_Iteracio");
		pintaComSubTitolSenseSubratllar("\n\t1a PART: Provant el mètode addAll\n");
		mostraListCriatures(nens, "nens");
		mostraListCriatures(nenes, "nenes");

		pintaExecucioComanda("\tllarInfants.addAll(nens)");
		llarInfants.addAll(nens);

		mostraListCriatures(llarInfants, "llarInfants");

		pintaExecucioComanda("\tllarInfants.addAll(nenes)");
		llarInfants.addAll(nenes);

		mostraListCriatures(llarInfants, "llarInfants");
		pintaPartAcabada(1);
	  	// Fer servir un iterador per mostrar el contingut.
		pintaComSubTitolSenseSubratllar("\n\t2a PART: Provant un iterador amb un bucle for" +
				" per mostrar el contingut.\n");

		it = llarInfants.iterator();
		while (it.hasNext()) {
			membre = it.next();
			System.out.println(membre);
		}
		pintaPartAcabada(2);
		pintaComSubTitolSenseSubratllar("\n\t3a PART: Fent servir un iterador" +
				"amb un bucle for per calcular edat mitjana de totes les " +
				"Criatures de llarInfants.\n");
		// Fer servir un iterador per calcular edat mitjana

		double sumaEdats = 0;
		double edatMitja;
		it = llarInfants.iterator();
		while (it.hasNext()) {
			membre = it.next(); // membre ha estat declarat Object
			criaturaProfe = (Criatura)membre;
			sumaEdats = sumaEdats+ criaturaProfe.getEdat();
		}
		edatMitja = sumaEdats/llarInfants.size();
		System.out.format("L'edat mitja és de %,.2f anys.\n", edatMitja);

		// Fer servir un iterador per buscar una nena de tres anys
		pintaPartAcabada(3);
		pintaComSubTitolSenseSubratllar("\n\t4a PART: Fent servir un iterador" +
				"amb un bucle for per buscar una " +
				" nena de tres anys.\n");
		mostraListCriatures(llarInfants, "llarInfants");

		boolean trobada = false;
		it = llarInfants.iterator();
		while (it.hasNext() && !trobada) {
			criaturaProfe = (Criatura)it.next();
			if (criaturaProfe.getSexe()== Criatura.NENA && criaturaProfe.getEdat()==3)
				trobada = true;
		}
		if (trobada) {
			System.out.println("La nena de tres anys trobada és: ");
			System.out.println(criaturaProfe);
		}
		else
			System.out.println("La cerca no ha tingut èxit!");

		pintaPartAcabada(4);
		pintaComSubTitolSenseSubratllar("\n\t5a PART: Fent servir un iterador\" +\n" +
				"amb un bucle for per eliminar les criatures de 0 o de 3 anys.");
		mostraListCriatures(llarInfants, "llarInfants");
		// Eliminar criatures de 0 o de 3 anys
		it = llarInfants.iterator();
		while (it.hasNext()) {
			criaturaProfe = (Criatura)it.next();
			if (criaturaProfe.getEdat()==0 || criaturaProfe.getEdat()==3) {
				// llarInfants.remove(criatura) // incorrecte!!!
				it.remove(); // CORRECTE!!! Elimina el darrer element proporcionat per next
			}
		}

		mostraListCriatures(llarInfants, "llarInfants");
		pintaFinalPrograma("Exemple_04_Iteracio");
	}
}
