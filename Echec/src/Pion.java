public class Pion extends Piece {
	
	public Pion() {
	}
	
	public Pion(boolean couleur) {
		super(couleur);
		if(couleur == false) // noir
		{
			this.nom = "\u265f";
		}
		if(couleur == true) // blanc
		{
			this.nom = "\u2659";
		}
	}
	
	public boolean EnnemiDiag(Case depart, Case arrive) { // verifie si une piece de couleur opposée est dans la diagonale+1
		
		if(depart.getColonne() == arrive.getColonne()+1 && arrive.caseOccupe(this.couleur) == false) {
			return true;
		} else if (depart.getColonne() == arrive.getColonne()-1 && arrive.caseOccupe(this.couleur) == false) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {
		
		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		Case dptSuivB = echec.getCase(depart.getLigne()-1, depart.getColonne());
		Case dptSuivN = echec.getCase(depart.getLigne()+1, depart.getColonne());
		
		if(depart.caseOccupe(true)) {
			if (depart.getColonne() == arrive.getColonne() || this.EnnemiDiag(depart, arrive)) { //si meme colonne ou si pion couleur adverse dans diagonale direct
				if (arr.caseOccupe() == false || (arr.caseOccupe(false) && depart.getColonne() != arrive.getColonne() ) ) { // si case d'arrivée vide OU contient piece noire en diag
					if (dpt.getLigne() == 6) { // si 1er tour de pion
						if ((arr.getLigne() == dpt.getLigne() - 2 && dptSuivB.caseOccupe() == false) || arr.getLigne() == dpt.getLigne() - 1) { // si c 2 fois la case plus haute ou 1
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
		
		else if (depart.caseOccupe(false)) {
			if (depart.getColonne() == arrive.getColonne() || this.EnnemiDiag(depart, arrive) ) { //si meme colonne
				if (arr.caseOccupe() == false || (arr.caseOccupe(true) && depart.getColonne() != arrive.getColonne() ) ) { // si case d'arrivée vide OU contient piece noire pas en face
					if (dpt.getLigne() == 1) { // si 1er tour de pion
						if ((arr.getLigne() == dpt.getLigne() + 2 && dptSuivN.caseOccupe() == false) || arr.getLigne() == dpt.getLigne() + 1) { // si c 2 fois la case plus haute
							return true;
						} else {
							System.out.println("Déplacement impossible : le pion ne se déplace pas aussi loin1.");
							return false;
						}
					} else if (arr.getLigne() == dpt.getLigne() + 1) {
						return true;
					} else {
						System.out.println("Déplacement impossible : le pion ne se déplace pas aussi loin2.");
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