package visiteur;

import model.Bibliotheque;
import model.Livre;

public class XMLAttributeWithoutSerializer extends Visiteur {
	
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
