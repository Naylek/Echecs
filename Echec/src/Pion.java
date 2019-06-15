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
	
	public boolean CouleurOpDiagBlanc(Case depart, Case arrive) { // verifie si une piece de couleur opposée est dans la diagonale+1
		
		if(depart.getColonne() == arrive.getColonne()+1 && arrive.caseOccupe("noir")) {
			return true;
		} else if (depart.getColonne() == arrive.getColonne()-1 && arrive.caseOccupe("noir")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean CouleurOpDiagNoir(Case depart, Case arrive) { // verifie si une piece de couleur opposée est dans la diagonale+1
		
		if(depart.getColonne() == arrive.getColonne()+1 && arrive.caseOccupe("blanc")) {
			return true;
		} else if (depart.getColonne() == arrive.getColonne()-1 && arrive.caseOccupe("blanc")) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {
		
		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		Case temp = echec.getCase(depart.getLigne()-1, depart.getColonne());
		
		if(depart.caseOccupe("blanc")) {
			if (depart.getColonne() == arrive.getColonne() || this.CouleurOpDiagBlanc(depart, arrive)) { //si meme colonne ou si pion couleur adverse dans diagonale direct
				if (arr.caseOccupe() == false || (arr.caseOccupe("noir") && depart.getColonne() != arrive.getColonne() ) ) { // si case d'arrivée vide OU contient piece noire en diag
					if (dpt.getLigne() == 6) { // si 1er tour de pion
						if ((arr.getLigne() == dpt.getLigne() - 2 && temp.caseOccupe() == false) || arr.getLigne() == dpt.getLigne() - 1) { // si c 2 fois la case plus haute ou 1
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
			if (depart.getColonne() == arrive.getColonne() || this.CouleurOpDiagNoir(depart, arrive) ) { //si meme colonne
				if (arr.caseOccupe() == false || (arr.caseOccupe("blanc") && depart.getColonne() != arrive.getColonne() ) ) { // si case d'arrivée vide OU contient piece noire pas en face
					if (dpt.getLigne() == 1) { // si 1er tour de pion
						if ((arr.getLigne() == dpt.getLigne() + 2 && temp.caseOccupe() == false) || arr.getLigne() == dpt.getLigne() + 1) { // si c 2 fois la case plus haute
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