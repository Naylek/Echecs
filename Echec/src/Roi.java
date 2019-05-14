public class Roi extends Piece{
	
	public Roi() {
	}
	
	public Roi(String couleur) {
		super(couleur);
		if(couleur == "noir")
		{
			this.nom = "\u265a";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2654";
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