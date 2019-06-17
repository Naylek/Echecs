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
		return this.deplacementValideFou(echec, depart, arrive);
	}
	
}