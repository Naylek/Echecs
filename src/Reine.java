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
		
		if(this.deplacementValideFou(echec, depart, arrive) || this.deplacementValideTour(echec, depart, arrive)) {
			return true;
		} else {
			return false;
		}
	}
	
}