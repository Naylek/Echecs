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
	
}