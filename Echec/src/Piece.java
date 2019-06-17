public abstract class Piece {
	
	protected boolean couleur;
	protected String nom;
	
	public Piece() {
		
	}
	
	public Piece(Piece p) {
		this.couleur = p .couleur;
		this.nom = p.nom;
	}
	
	public Piece(boolean couleur)
	{
		this.couleur = couleur;
	}
	
	public boolean getCouleur() {
		return this.couleur;
	}
	
	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		
		if (deplacementValide(echec, depart, arrive)) {
			echec.setCase(depart.getLigne(), depart.getColonne(), new Case());
			echec.setCase(arrive.getLigne(), arrive.getColonne(), new Case(arrive.getLigne(), arrive.getColonne(), this));
		}
		
		return echec;
	}
	
	
	public boolean deplacementValideTour(Echiquier echec, Case depart, Case arrive) {4
		
		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		int compteur = 0;
		
		if (!arr.caseOccupe() || !arr.caseOccupe(this.couleur)) { // case arrivée vide ou pièce couleur opposée
			if(arr.getLigne() == dpt.getLigne() && arr.getColonne() > dpt.getColonne()) { //vers la droite
				for(int i = dpt.getColonne()+1; i <= arr.getColonne() -1; i++) {
					if(!echec.getCase(dpt.getLigne(), i).caseOccupe()) {
						compteur++;
					}
				}
				if(compteur == Math.abs(arr.getColonne() - dpt.getColonne())-1) {
					return true;
				} else {
					System.out.println("Il y a une pièce sur le chemin à droite.");
					return false;
				}
			} else if(arr.getLigne() == dpt.getLigne() && arr.getColonne() < dpt.getColonne()) { //vers la gauche
				for(int i = dpt.getColonne()-1; i >= arr.getColonne()+1; i--) {
					if(!echec.getCase(dpt.getLigne(), i).caseOccupe()) {
						compteur++;
					}
				}
				if(compteur == Math.abs(arr.getColonne() - dpt.getColonne())-1 ) {
					return true;
				} else {
					System.out.println("Il y a une pièce sur le chemin à gauche.");
					return false;
				}
			} else if(arr.getLigne() < dpt.getLigne() && arr.getColonne() == dpt.getColonne()) { //vers le haut
				for(int i = dpt.getLigne()-1; i >= arr.getLigne()+1; i--) {
					if(!echec.getCase(i, dpt.getColonne()).caseOccupe() ) {
						compteur++;
					}
				}
				if(compteur == Math.abs(arr.getLigne() - dpt.getLigne() )-1 ) {
					return true;
				} else {
					System.out.println("Il y a une pièce sur le chemin en haut.");
					return false;
				}
			} else if(arr.getLigne() > dpt.getLigne() && arr.getColonne() == dpt.getColonne()) { //vers le bas
				for(int i = dpt.getLigne()+1; i <= arr.getLigne()-1; i++) {
					if(!echec.getCase(i, dpt.getColonne()).caseOccupe()) {
						compteur++;
					}
				}
				if(compteur == Math.abs(arr.getLigne() - dpt.getLigne() )-1 ) {
					return true;
				} else {
					System.out.println("Il y a une pièce sur le chemin en bas.");
					return false;
				}
			} else {
				System.out.println("Déplacement impossible.");
				return false;
			}
		} else {
			System.out.println("Déplacement impossible : un copain est sur la case demandée.");
			return false;
		}
	}
	
	
	public boolean deplacementValideFou(Echiquier echec, Case depart, Case arrive) {
		
		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		int j = 0;
		int compteur = 0;
		
		if (!arr.caseOccupe() || !arr.caseOccupe(this.couleur)) { // case arrivée vide ou pièce couleur opposée
			if(arr.getLigne() < dpt.getLigne() && arr.getColonne() > dpt.getColonne()) { // vers haut/droite
				if(dpt.getLigne() + dpt.getColonne() == arr.getLigne() + arr.getColonne()) { //dans la diagonale
					j = dpt.getColonne()+1;
					for(int i = dpt.getLigne()-1; i >=  arr.getLigne()+1; i--) {
						if(!echec.getCase(i, j).caseOccupe()) {
							compteur++;
							j++;
						}
					}
					if(compteur == Math.abs(arr.getLigne() - dpt.getLigne() )-1) {
						return true;
					} else {
						System.out.println("Il y a une pièce sur le chemin.");
						return false;
					}
				} else {
					System.out.println("Le fou ne se déplace pas dans cette direction.");
					return false;
				}
			} else if(arr.getLigne() < dpt.getLigne() && arr.getColonne() < dpt.getColonne()) { // vers haut/gauche
				if(dpt.getLigne() - dpt.getColonne() == arr.getLigne() - arr.getColonne() ) { //dans la diagonale
					j = dpt.getColonne()-1;
					for(int i = dpt.getLigne()-1; i >= arr.getLigne()+1; i--) {
						if(!echec.getCase(i, j).caseOccupe()) {
							compteur++;
							j++;
						}
					}
					if(compteur == Math.abs(arr.getLigne() - dpt.getLigne() )-1) {
						return true;
					} else {
						System.out.println("Il y a une pièce sur le chemin.");
						return false;
					}
				} else {
					System.out.println("Il y a une pièce sur le chemin.");
					return false;
				}
			} else if(arr.getLigne() > dpt.getLigne() && arr.getColonne() < dpt.getColonne()) { // vers bas/gauche
				if(dpt.getLigne() + dpt.getColonne() == arr.getLigne() + arr.getColonne() ) { //dans la diagonale
					j = dpt.getColonne()-1;
					for(int i = dpt.getLigne()+1; i <= arr.getLigne()-1; i++) {
						if(!echec.getCase(i, j).caseOccupe()) {
							compteur++;
							j++;
						}
					}
					if(compteur == Math.abs(arr.getLigne() - dpt.getLigne() )-1) {
						return true;
					} else {
						System.out.println("Il y a une pièce sur le chemin.");
						return false;
					}
				} else {
					System.out.println("Il y a une pièce sur le chemin.");
					return false;
				}
			} else if(arr.getLigne() > dpt.getLigne() && arr.getColonne() > dpt.getColonne()) { // vers bas/droite
				if(dpt.getLigne() - dpt.getColonne() == arr.getLigne() - arr.getColonne() ) { //dans la diagonale
					j = dpt.getColonne()+1;
					for(int i = dpt.getLigne()+1; i <= arr.getLigne()-1; i++) {
						if(!echec.getCase(i, j).caseOccupe()) {
							compteur++;
							j++;
						}
					}
					if(compteur == Math.abs(arr.getLigne() - dpt.getLigne() )-1) {
						return true;
					} else {
						System.out.println("Il y a une pièce sur le chemin.");
						return false;
					}
				} else {
					System.out.println("Il y a une pièce sur le chemin.");
					return false;
				}
			} else {
				System.out.println("Déplacement impossible.");
				return false;
			}
		} else {
			System.out.println("Un copain occupe la case.");
			return false;
		}
	}
	
	
	//method abstract
	public abstract boolean deplacementValide(Echiquier e, Case x, Case y);
	
	public String toString() {
		return this.nom;
	}
}