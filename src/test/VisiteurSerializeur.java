package test;

import org.junit.jupiter.api.Test;

import model.Bibliotheque;
import model.Livre;
import serializeur.XMLAttributeSerializer;

class VisiteurSerializeur {

	@Test
	void testXMLVisiteurLivre() {
		XMLAttributeSerializer v = new XMLAttributeSerializer();
		Livre l = new Livre("Le livre");
		l.setAuteur("Louis 2");
		l.serialize(v);
		System.out.println(v.getoutput());
	}
	
	@Test
	void testXMLVisiteurBibliotheque() {
		XMLAttributeSerializer v = new XMLAttributeSerializer();
		Livre l = new Livre("Le livre");
		l.setAuteur("Louis 2");
		Livre l1 = new Livre("Larousse");
		l1.setAuteur("Poche");
		
		Bibliotheque b = new Bibliotheque();
		b.addLivre(l);
		b.addLivre(l1);
		b.serialize(v);
		System.out.println(v.getoutput());
	}
}