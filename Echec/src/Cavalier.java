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
	}
	
	/*
	--> 
	--> (dtp.ligne == arr.ligne+2 && (dpt.colonne == arr.colonne+1) // vers bas-droite
	--> (dtp.ligne == arr.ligne+2 && (dpt.colonne == arr.colonne-1) // vers bas-gauche
	--> (dpt.ligne == arr.ligne-1 && (dpt.colonne == arr.colonne+2) //
	--> (dpt.ligne == arr.ligne-1 && (dpt.colonne == arr.colonne-2)
	--> (dpt.ligne == arr.ligne+1 && (dpt.colonne == arr.colonne+2)
	--> (dpt.ligne == arr.ligne+1 && (dpt.colonne == arr.colonne-2)
	*/
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		return echec;
	}
}