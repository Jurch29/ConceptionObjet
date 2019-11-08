package model;

import visiteur.VisiteurSerialize;

public class Livre {
	
	private String titre;
	private String Auteur;
	
	public Livre(String title) {
		this.titre = title;
	}
	
	public void serialize(VisiteurSerialize v) {
		v.visitLivre(this);
	}
}
