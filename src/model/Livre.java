package model;

import visiteur.VisiteurSerialize;

public class Livre {
	
	private String titre;
	
	public Livre(String title) {
		this.titre = title;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return Auteur;
	}

	public void setAuteur(String auteur) {
		Auteur = auteur;
	}

	private String Auteur;
	
	public void serialize(VisiteurSerialize v) {
		v.visitLivre(this);
	}
}
