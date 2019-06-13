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
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {return false;}
		/*
		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		
		if(depart.caseOccupe("blanc")) {
			if (arr.caseOccupe() == false || arr.caseOccupe("noir")) { // case arrivée vide ou pièce couleur opposée
				if(dpt.getLigne() == (arr.getLigne()-2) && (dpt.getColonne() == (arr.getColonne())+1)) { // vers haut-droite
					return true;
				} else if (dpt.getLigne() == (arr.getLigne())-2 && (dpt.getColonne() == (arr.getColonne()-1))) { // vers haut-gauche
					return true;
				}
			}
		} else {
			return false;
		}
	}*/
	
	/*
	--> 
	--> (dpt.getLigne() == (arr.getLigne())+2 && (dpt.getColonne() == (arr.getColonne())+1) // vers bas-droite
	--> (dpt.getLigne() == (arr.getLigne())+2 && (dpt.getColonne() == (arr.getColonne())-1) // vers bas-gauche
	--> (dpt.getLigne() == (arr.getLigne())-1 && (dpt.getColonne() == (arr.getColonne())+2) // vers haut-droite
	--> (dpt.getLigne() == (arr.getLigne())-1 && (dpt.getColonne() == (arr.getColonne())-2) // vers haut-gauche
	--> (dpt.getLigne() == (arr.getLigne())+1 && (dpt.getColonne() == (arr.getColonne())+2) // vers bas-droite
	--> (dpt.getLigne() == (arr.getLigne())+1 && (dpt.getColonne() == (arr.getColonne())-2) // vers bas-gauche
	*/
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		return echec;
	}
}