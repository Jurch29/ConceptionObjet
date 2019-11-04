package main;

import model.Bibliotheque;
import model.Livre;
import visiteur.XMLAttributeSerializer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bibliotheque b = new Bibliotheque();
		b.addLivre(new Livre("Le fleuve"));
		XMLAttributeSerializer s = new XMLAttributeSerializer();
		b.serialize(s);
	}
}
