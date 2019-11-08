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
		v.visitLivre(l);
		System.out.println(v.getResult());
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
		v.visitBibliotheque(b);
		System.out.println(v.getResult());
	}
}