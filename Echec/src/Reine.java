public class Reine extends Piece{
	
	public Reine() {
	}
	
	public Reine(String couleur) {
		super(couleur);
		if(couleur == "noir")
		{
			this.nom = "\u265b";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2655";
		}
	}
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive)
	{
		return false;
	}
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		return echec;
	}
}