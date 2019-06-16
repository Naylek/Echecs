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
		
		
		/*
		--> case arrivée vide ou pièce couleur opposée
		--> dpt.getLigne() == arr.getLigne()+x && dpt.getColonne() == arr.getColonne()+x avec 1<X<7
		--> dpt.getLigne() == arr.getLigne()+x && dpt.getColonne() == arr.getColonne()-x avec 1<X<7
		--> dpt.getLigne() == arr.getLigne()-x && dpt.getColonne() == arr.getColonne()+x avec 1<X<7
		--> dpt.getLigne() == arr.getLigne()-x && dpt.getColonne() == arr.getColonne()-x avec 1<X<7
		--> si meme couleur devant, peut se deplacer jusqu'avant le pion meme couleur, pas après
		--> si couleur ennemi devant, peut se deplacer jusqu'au pion ennemi (et le bouffer), pas après
		*/
		
		return false;
	}
	
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		
		if (deplacementValide(echec, depart, arrive)) {
			echec.setCase(depart.getLigne(), depart.getColonne(), new Case());
			echec.setCase(arrive.getLigne(), arrive.getColonne(), new Case(arrive.getLigne(), arrive.getColonne(), this));
		}
		
		return echec;
	}
	
}