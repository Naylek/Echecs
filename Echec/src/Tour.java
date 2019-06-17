 public class Tour extends Piece{
	
	public Tour() {
	}
	
	public Tour(boolean couleur) {
		super(couleur);
		if(couleur == false) // noir
		{
			this.nom = "\u265c";
		}
		if(couleur == true) // blanc
		{
			this.nom = "\u2656";
		}
	}
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {
		return this.deplacementValideTour(echec, depart, arrive);
	}
	
}