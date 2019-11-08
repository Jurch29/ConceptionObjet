package visiteur;

import model.Bibliotheque;
import model.Livre;

public abstract class VisiteurSerialize {
	
	public abstract void visitLivre(Livre l);
	public abstract void visitBibliotheque(Bibliotheque b);

}
