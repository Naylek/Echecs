public class Pion extends Piece {
	
	public Pion() {
	}
	
	public Pion(String couleur) {
		this.couleur = couleur;
		if(couleur == "noir")
		{
			this.nom = "\u265f";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2659";
		}
	}
	
	public boolean deplacementValide(Echiquier echec,int x, int y) 
	{
		return false;
	}
}