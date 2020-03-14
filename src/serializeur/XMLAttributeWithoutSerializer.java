package serializeur;

import model.Bibliotheque;
import model.Livre;
import visiteur.VisiteurSerialize;

public class XMLAttributeWithoutSerializer extends VisiteurSerialize {
	
	String output;
	
	public String getoutput() {
		return output;
	}

	@Override
	public void visitLivre(Livre l) {
		// TODO A faire proprement
		this.output = "";
		this.output+="Auteur : "+l.getAuteur()+'\n';
		this.output+="Titre : "+l.getTitre()+'\n';
	}

	@Override
	public void visitBibliotheque(Bibliotheque b) {
		// TODO A faire proprement
		this.output = "";
		for (int i = 0 ; i < b.getLivres().size() ; i++) {
			XMLAttributeSerializer v = new XMLAttributeSerializer();
			b.getLivres().get(i).serialize(v);
			this.output+=v.output;
		}
	}

}
