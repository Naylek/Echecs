public class Pion extends Piece {
	
	public Pion() {
	}
	
	public Pion(String couleur) {
		super(couleur);
		if(couleur == "noir")
		{
			this.nom = "\u265f";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2659";
		}
	}
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {
		
		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		
		/*
		 * depart.getColonne() == arrive.getColonne()+1 && arrive.caseOccupe("noir")
		 * depart.getColonne() == arrive.getColonne()-1 && arrive.caseOccupe("noir")
		 */
		
		if(depart.caseOccupe("blanc")) {
			if (depart.getColonne() == arrive.getColonne()) { //si meme colonne ou si pion couleur adverse dans diagonale direct
				if (arr.caseOccupe() == false || arr.caseOccupe("noir")) { // si case d'arrivée vide OU contient piece noire 
					if (dpt.getLigne() == 6) { // si 1er tour de pion
						if (arr.getLigne() == dpt.getLigne() - 2 || arr.getLigne() == dpt.getLigne() - 1) { // si c 2 fois la case plus haute
							return true;
						} else {
							System.out.println("Déplacement impossible : le pion ne se déplace pas aussi loin.");
							return false;
						}
					} else if (arr.getLigne() == dpt.getLigne() - 1) {
						return true;
					} else {
						System.out.println("Déplacement impossible : le pion ne se déplace pas aussi loin.");
						return false;
					}
				} else {
					System.out.println("Déplacement impossible : case voulue occupée.");
					return false;
				}
			} else {
				System.out.println("Déplacement impossible : le pion se déplace seulement en colonne.");
				return false;
			}
		}
		
		else if (depart.caseOccupe("noir")) {
			if (depart.getColonne() == arrive.getColonne()) { //si meme colonne
				if (arr.caseOccupe() == false || arr.caseOccupe("blanc")) { // si case d'arrivée vide OU contient piece noire 
					if (dpt.getLigne() == 1) { // si 1er tour de pion
						if (arr.getLigne() == dpt.getLigne() + 2 || arr.getLigne() == dpt.getLigne() + 1) { // si c 2 fois la case plus haute
							return true;
						} else {
							System.out.println("Déplacement impossible : le pion ne se déplace pas aussi loin.");
							return false;
						}
					} else if (arr.getLigne() == dpt.getLigne() + 1) {
						return true;
					} else {
						System.out.println("Déplacement impossible : le pion ne se déplace pas aussi loin.");
						return false;
					}
				} else {
					System.out.println("Déplacement impossible : case voulue occupée.");
					return false;
				}
			} else {
				System.out.println("Déplacement impossible : le pion se déplace seulement en colonne.");
				return false;
			}
		}
		else return false;
	} // fin deplacementValide
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		
		if (deplacementValide(echec, depart, arrive)) {
			echec.setCase(depart.getLigne(), depart.getColonne(), new Case());
			echec.setCase(arrive.getLigne(), arrive.getColonne(), new Case(arrive.getLigne(), arrive.getColonne(), this));
		}
		return echec;
	}
}