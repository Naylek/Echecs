public class Reine extends Piece{
	
	public Reine() {
	}
	
	public Reine(boolean couleur) {
		super(couleur);
		if(couleur == false) // noir
		{
			this.nom = "\u265b";
		}
		if(couleur == true) // blanc
		{
			this.nom = "\u2655";
		}
	}
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {
		
		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		
		
		
		return false;
	}
	
	/*
	--> case arrivée vide ou pièce couleur opposée
	--> dpt.getLigne() == arr.getLigne() && dpt.getColonne() == arr.getColonne()+x avec 1<x<7
	--> dpt.getLigne() == arr.getLigne() && dpt.getColonne() == arr.getColonne()-x avec 1<x<7
	--> dpt.getLigne() == arr.getLigne()+x && dpt.getColonne() == arr.getColonne() avec 1<x<7
	--> dpt.getLigne() == arr.getLigne()-x && dpt.getColonne() == arr.getColonne() avec 1<x<7
	--> dpt.getLigne() == arr.getLigne()+x && dpt.getColonne() == arr.getColonne()+x avec 1<x<7
	--> dpt.getLigne() == arr.getLigne()+x && dpt.getColonne() == arr.getColonne()-x avec 1<x<7
	--> dpt.getLigne() == arr.getLigne()-x && dpt.getColonne() == arr.getColonne()+x avec 1<x<7
	--> dpt.getLigne() == arr.getLigne()-x && dpt.getColonne() == arr.getColonne()-x avec 1<x<7
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