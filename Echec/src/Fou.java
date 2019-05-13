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
	
	public boolean deplacementValide(Echiquier echec,int x, int y) 
	{
		return false;
	}
}