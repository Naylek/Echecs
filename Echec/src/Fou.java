public class Fou extends Piece {
	
	public Fou() {
	}
	
	public Fou(String couleur) {
		this.couleur = couleur;
		if(couleur == "noir")
		{
			this.nom = "\u265d";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2657";
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