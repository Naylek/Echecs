public class Cavalier extends Piece {
	
	public Cavalier() {
	}
	
	public Cavalier(String couleur) {
		super(couleur);
		if(couleur == "noir")
		{
			this.nom = "\u265e";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2658";
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