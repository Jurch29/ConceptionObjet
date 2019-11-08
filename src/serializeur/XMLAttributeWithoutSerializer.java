package serializeur;

import model.Bibliotheque;
import model.Livre;
import visiteur.VisiteurSerialize;

public class XMLAttributeWithoutSerializer extends VisiteurSerialize {
	
	String result;
	
	public String getResult() {
		return result;
	}

	@Override
	public void visitLivre(Livre l) {
		// TODO A faire proprement
		
	}

	@Override
	public void visitBibliotheque(Bibliotheque b) {
		// TODO A faire proprement
		
	}

}
