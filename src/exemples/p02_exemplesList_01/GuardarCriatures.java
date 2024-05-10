package exemples.p02_exemplesList_01;

import java.util.*;

public class GuardarCriatures {

	public static void main(String[] args) {

		Criatura[] poblacio = { new Criatura("NIL", 0, Criatura.NEN), new Criatura("PERE", 1, Criatura.NEN),
				new Criatura("NEUS", 0, Criatura.NENA), new Criatura("ONA", 1, Criatura.NENA),
				new Criatura("D�DAC", 0, Criatura.NEN), new Criatura("NIL", 1, Criatura.NEN),
				new Criatura("EVA", 3, Criatura.NENA), new Criatura("FIONA", 2, Criatura.NENA),
				new Criatura("ENIA", 3, Criatura.NENA) };

		List llarInfants;
		llarInfants = new LinkedList();

		// List t� tots els m�tode de Collection
		// per exemple el metode add(Object o)
		for (int i = 0; i < poblacio.length; i++) {
			llarInfants.add(poblacio[i]);
		}
		// add(Object o) afegeix al final de la llista
		llarInfants.add(new Criatura("OLGA", 2, Criatura.NENA));

		// ---------------

		// add(Object o, int i) afegeix en la posici� i-�ssima
		// despla�ant elements cap a �ndexs superiors si cal
		llarInfants.add(3, new Criatura("JOAN", 1, Criatura.NEN));

		// Les llistes s�n accessibles per posici�, quasi b�
		// con si fossin taules (arrays) per� usant get
		for (int i = 0; i < llarInfants.size(); i++) {
			System.out.println(llarInfants.get(i));
		}

		// les llistes permeten de canviar el contingut d'una posici�
		llarInfants.set(8, new Criatura("ELISA", 3, Criatura.NENA));
		llarInfants.set(2, llarInfants.get(7));

		// les llistes permeten de fer cerques basades en EQUALS
		int primerNil, darrerNil;
		Criatura target = new Criatura("nil", 3, Criatura.NEN);
		primerNil = llarInfants.indexOf(target);
		darrerNil = llarInfants.lastIndexOf(target);

	}

}
