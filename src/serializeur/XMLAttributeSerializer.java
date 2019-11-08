package serializeur;

import model.Bibliotheque;
import model.Livre;
import visiteur.VisiteurSerialize;

public class XMLAttributeSerializer extends VisiteurSerialize {

	String result;
	
	public String getResult() {
		return result;
	}

	@Override
	public void visitLivre(Livre l) {
		// TODO proper
		
	}

	@Override
	public void visitBibliotheque(Bibliotheque b) {
		// TODO proper
		
	}



}
