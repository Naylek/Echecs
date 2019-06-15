 public class Tour extends Piece{
	
	public Tour() {
	}
	
	public Tour(String couleur) {
		super(couleur);
		if(couleur == "noir")
		{
			this.nom = "\u265c";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2656";
		}
	}
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {
		
		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		
		if(depart.caseOccupe("blanc")) {
			if (arr.caseOccupe() == false || arr.caseOccupe("noir")) { // case arrivée vide ou pièce couleur opposée
				if(dpt.getLigne() == arr.getLigne() && dpt.getColonne() == arr.getColonne()+x) { // vers la droite
					return true;
				} else if(dpt.getLigne() == arr.getLigne() && dpt.getColonne() == arr.getColonne()-x) { // vers la gauche
					return true;
				} else if(dpt.getLigne() == arr.getLigne()+x && dpt.getColonne() == arr.getColonne()) { // vers le bas
					return true;
				} else if(dpt.getLigne() == arr.getLigne()-x && dpt.getColonne() == arr.getColonne()) { // vers le haut
					return true;
				}
			}
		}
		
		for(int i = dpt.getColonne(); i < arr.getColonne(); i++) {
			
		}
		
		
		return false;
	}
	
	/*
	--> case arrivée vide ou pièce couleur opposée
	--> dpt.getLigne() == arr.getLigne() && dpt.getColonne() == arr.getColonne()+x avec 1<X<7
	--> dpt.getLigne() == arr.getLigne() && dpt.getColonne() == arr.getColonne()-x avec 1<X<7
	--> dpt.getLigne() == arr.getLigne()+x && dpt.getColonne() == arr.getColonne() avec 1<X<7
	--> dpt.getLigne() == arr.getLigne()-x && dpt.getColonne() == arr.getColonne() avec 1<X<7
	--> si meme couleur devant, peut se deplacer jusqu'avant le pion meme couleur, pas après (
	--> si couleur ennemi devant, peut se deplacer jusqu'au pion ennemi (et le bouffer), pas après
	*/
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		
		if (deplacementValide(echec, depart, arrive)) {
			echec.setCase(depart.getLigne(), depart.getColonne(), new Case());
			echec.setCase(arrive.getLigne(), arrive.getColonne(), new Case(arrive.getLigne(), arrive.getColonne(), this));
		}
		
		return echec;
	}
	
}