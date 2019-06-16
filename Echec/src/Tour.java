 public class Tour extends Piece{
	
	public Tour() {
	}
	
	public Tour(boolean couleur) {
		super(couleur);
		if(couleur == false) // noir
		{
			this.nom = "\u265c";
		}
		if(couleur == true) // blanc
		{
			this.nom = "\u2656";
		}
	}
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {
		
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
		
		
		/* ébauche d'une version plus simple, non finie et qui marche pas de DeplacementValide()
		if(depart.caseOccupe("blanc")) {
			if (arr.caseOccupe() == false || arr.caseOccupe("noir")) { // case arrivée vide ou pièce couleur opposée
				if(arr.getColonne() == dpt.getColonne() || arr.getLigne() == dpt.getLigne()) { // vérifie déplacement sur colonne ou sur ligne
					if () { //si y'a qqn sur le passage
						return true;
					}
				} else {
					System.out.println("La tour ne se déplace qu'en ligne ou en colonne.");
					return false;
				}
			} else {
				System.out.println("La case est occupée par un copain.");
				return false;
			}
		} else {
			return false;
		}*/
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		
		if (deplacementValide(echec, depart, arrive)) {
			echec.setCase(depart.getLigne(), depart.getColonne(), new Case());
			echec.setCase(arrive.getLigne(), arrive.getColonne(), new Case(arrive.getLigne(), arrive.getColonne(), this));
		}
		
		return echec;
	}
	
}