package exemples.p02_exemplesList_01;

import classes.Criatura;
import java.util.*;

public class GuardarCriatures {
	public static void main(String[] args) {
		Criatura[] poblacio = { new Criatura("NIL", 0, Criatura.NEN),
				new Criatura("PERE", 1, Criatura.NEN),
				new Criatura("NEUS", 0, Criatura.NENA),
				new Criatura("ONA", 1, Criatura.NENA),
				new Criatura("DÍDAC", 0, Criatura.NEN),
				new Criatura("NIL", 1, Criatura.NEN),
				new Criatura("EVA", 3, Criatura.NENA),
				new Criatura("FIONA", 2, Criatura.NENA),
				new Criatura("ENIA", 3, Criatura.NENA)
		};
		List llarInfants;
		llarInfants = new LinkedList();
		// List té tots els mètode de Collection
		// per exemple el mètode add(Object o)
		for (int i = 0; i < poblacio.length; i++) {
			llarInfants.add(poblacio[i]);
		}
		// Mètode add(Object o) afegeix al final de la llista
		llarInfants.add(
				new Criatura("OLGA", 2, Criatura.NENA));
		// Mètode add(Object o, int i) afegeix a la posició i-èssima
		// desplaçant elements cap a índexs superiors si cal.
		llarInfants.add(
				3, new Criatura("JOAN", 1, Criatura.NEN));
		// Les llistes són accessibles per posició, quasi
		// com si fossin taules (arrays) però usant get.
		for (int i = 0; i < llarInfants.size(); i++) {
			System.out.println(llarInfants.get(i));
		}
		// Les llistes permeten de canviar el contingut d'una posició
		llarInfants.set(8, new Criatura("ELISA", 3, Criatura.NENA));
		llarInfants.set(2, llarInfants.get(7));
		// Les llistes permeten de fer cerques basades en EQUALS
		int primerNil, darrerNil;
		Criatura target = new Criatura("nil", 3, Criatura.NEN);
		primerNil = llarInfants.indexOf(target);
		darrerNil = llarInfants.lastIndexOf(target);
	}
}