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
		
		if (arr.caseOccupe() == false || arr.caseOccupe(this.couleur) == false) { // case arrivée vide ou pièce couleur opposée
			if(arr.getLigne() < dpt.getLigne() && arr.getColonne() > dpt.getColonne() || arr.getLigne() > dpt.getLigne() && arr.getColonne() < dpt.getColonne()) { //diagonale vers haut/droite et bas/gauche
				if(dpt.getLigne() + dpt.getColonne() == arr.getLigne() + arr.getColonne() ) {
					return true;
				} else {
					System.out.println("Il y a une pièce sur le chemin.");
					return false;
				}
			} else if(arr.getLigne() < dpt.getLigne() && arr.getColonne() < dpt.getColonne() || arr.getLigne() > dpt.getLigne() && arr.getColonne() > dpt.getColonne()) { //diagonale vers haut/gauche et bas/droite
				if(dpt.getLigne() - dpt.getColonne() == arr.getLigne() - arr.getColonne() ) {
					return true;
				} else {
					System.out.println("Il y a une pièce sur le chemin.");
					return false;
				}
			} else {
				return false;
			}
		} else {
			System.out.println("Un copain occupe la case.");
			return false;
		}
	}
	
	/*
	--> dpt.getLigne() == arr.getLigne()+x && dpt.getColonne() == arr.getColonne()+x avec 1<X<7
	--> dpt.getLigne() == arr.getLigne()+x && dpt.getColonne() == arr.getColonne()-x avec 1<X<7
	--> dpt.getLigne() == arr.getLigne()-x && dpt.getColonne() == arr.getColonne()+x avec 1<X<7
	--> dpt.getLigne() == arr.getLigne()-x && dpt.getColonne() == arr.getColonne()-x avec 1<X<7
	--> si meme couleur devant, peut se deplacer jusqu'avant le pion meme couleur, pas après
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