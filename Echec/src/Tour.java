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
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) 
	{
		return false;
	}
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		return echec;
	}
}