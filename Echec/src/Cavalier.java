public class Cavalier extends Piece {
	
	public Cavalier() {
	}
	
	public Cavalier(String couleur) {
		super(couleur);
		if(couleur == "noir")
		{
			this.nom = "\u265e";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2658";
		}
	}
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {
		
		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		
		if (arr.caseOccupe() == false || arr.caseOccupe("noir")) { // case arrivée vide ou pièce couleur opposée
			if(dpt.getLigne() == (arr.getLigne()-2)) { // 2 cases vers le haut
				if(dpt.getColonne() == (arr.getColonne())+1 || dpt.getColonne() == (arr.getColonne()-1)) {
					return true;
				} else {
					return false;
				}
			} else if (dpt.getLigne() == (arr.getLigne())+2) { // 2 cases vers le bas
				if(dpt.getColonne() == (arr.getColonne())+1 || dpt.getColonne() == (arr.getColonne())-1) {
					return true;
				} else {
					return false;
				}
			} else if (dpt.getLigne() == (arr.getLigne())-1) { // 1 case vers le haut
				if(dpt.getColonne() == (arr.getColonne())+2 || dpt.getColonne() == (arr.getColonne())-2) {
					return true;
				} else {
					return false;
				}
			} else if (dpt.getLigne() == (arr.getLigne())+1) { // 1 case vers le bas
				if(dpt.getColonne() == (arr.getColonne())+2 || dpt.getColonne() == (arr.getColonne())-2) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	} // fin deplacementValide()
	
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		
		if (deplacementValide(echec, depart, arrive)) {
			echec.setCase(depart.getLigne(), depart.getColonne(), new Case());
			echec.setCase(arrive.getLigne(), arrive.getColonne(), new Case(arrive.getLigne(), arrive.getColonne(), this));
		}
		
		return echec;
	}
	
}