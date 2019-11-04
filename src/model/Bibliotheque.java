package model;

import java.util.ArrayList;

import visiteur.Visiteur;

public class Bibliotheque {
	
	private ArrayList<Livre> livres = new ArrayList<Livre>();
	
	public ArrayList<Livre> getLivres() {
		return livres;
	}

	public void setLivres(ArrayList<Livre> livres) {
		this.livres = livres;
	}
	
	public void addLivre(Livre l) {
		this.livres.add(l);
	}

	public void serialize(Visiteur v) {
		v.visitBibliotheque(v);
	}
}
