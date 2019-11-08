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
		this.result = "";
		this.result+="Auteur : "+l.getAuteur()+'\n';
		this.result+="Titre : "+l.getTitre()+'\n';
	}

	@Override
	public void visitBibliotheque(Bibliotheque b) {
		// TODO A faire proprement
		this.result = "";
		for (int i = 0 ; i < b.getLivres().size() ; i++) {
			XMLAttributeSerializer v = new XMLAttributeSerializer();
			b.getLivres().get(i).serialize(v);
			this.result+=v.result;
		}
	}

}
