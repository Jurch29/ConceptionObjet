package model;

import visiteur.Visiteur;

public class Livre {
	
	private String titre;
	private String Auteur;
	
	public Livre(String title) {
		this.titre = title;
	}
	
	public void serialize(Visiteur v) {
		v.visitLivre(v);
	}
}
