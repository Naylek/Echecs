public class Fou extends Piece {
	
	public Fou() {
	}
	
	public Fou(boolean couleur) {
		super(couleur);
		if(couleur == false) // noir
		{
			this.nom = "\u265d";
		}
		if(couleur == true) // blanc
		{
			this.nom = "\u2657";
		}
	}
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {
		
		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		int j = 0;
		int compteur = 0;
		
		if (!arr.caseOccupe() || !arr.caseOccupe(this.couleur)) { // case arrivée vide ou pièce couleur opposée
			if(arr.getLigne() < dpt.getLigne() && arr.getColonne() > dpt.getColonne()) { // vers haut/droite
				if(dpt.getLigne()+ dpt.getColonne() == arr.getLigne() + arr.getColonne()) { //dans la diagonale
					for(int i = dpt.getLigne()-1; i >=  arr.getLigne()+1; i--) {
						j = i;
						if(!echec.getCase(i, j).caseOccupe()) {
							compteur++;
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
					for(int i = dpt.getLigne()-1; i >= arr.getLigne()+1; i--) {
						j = i;
						if(!echec.getCase(i, j).caseOccupe()) {
							compteur++;
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
					for(int i = dpt.getLigne()+1; i <= arr.getLigne()-1; i++) {
						j = i;
						if(!echec.getCase(i, j).caseOccupe()) {
							compteur++;
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
					for(int i = dpt.getLigne()+1; i <= arr.getLigne()-1; i++) {
						j = i;
						if(!echec.getCase(i, j).caseOccupe()) {
							compteur++;
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
	
}