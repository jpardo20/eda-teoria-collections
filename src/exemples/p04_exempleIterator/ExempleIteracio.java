package exemples.p04_exempleIterator;

import classes.Criatura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExempleIteracio {
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
		
		llarInfants.addAll(nens);
		llarInfants.addAll(nenes);
		
		//-----------------------------------------------------


		it = llarInfants.iterator();
		while (it.hasNext()) {
			membre = it.next();
			System.out.println(membre);
		}
		
		// --------------------------------------
		// calcular edat mitjana
		
		double sumaEdats = 0;
		double edatMitja;
		it = llarInfants.iterator();
		while (it.hasNext()) {
			membre = it.next(); // membre ha estat declarat Object
			criaturaProfe = (Criatura)membre;
			sumaEdats = sumaEdats+ criaturaProfe.getEdat();
		}
		edatMitja = sumaEdats/llarInfants.size();
		System.out.println("L'edat mitja és: "+edatMitja);
		
		// -----------------------------------
		// buscar una nena de tres anys
		
		boolean trobada = false;
		it = llarInfants.iterator();
		while (it.hasNext() && !trobada) {
			criaturaProfe = (Criatura)it.next();
			if (criaturaProfe.getSexe()== Criatura.NENA && criaturaProfe.getEdat()==3)
				trobada = true;
		}
		if (trobada) {
			System.out.println("Nena de tres anys trobada: ");
			System.out.println(criaturaProfe);
		}
		else {
			System.out.println("La cerca no ha tingut exit");
		}
		
		
		//-------------------------------------
		// Eliminar critatures de 0 o de 3 anys
		it = llarInfants.iterator();
		while (it.hasNext()) {
			criaturaProfe = (Criatura)it.next();
			if (criaturaProfe.getEdat()==0 || criaturaProfe.getEdat()==3) {
				// llarInfants.remove(criatura) // incorrecte!!!
				it.remove(); // OK. Elimina el darrer element proporcionat per next
			}
		}
		
		//--------------------------------------
		it = llarInfants.iterator();
		while (it.hasNext()) {
			membre = it.next();
			System.out.println(membre);
		}
		
	}
}
