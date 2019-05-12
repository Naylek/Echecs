public class Roi extends Piece{
	
	public Roi() {
	}
	
	public Roi(String couleur) {
		if(couleur == "noir")
		{
			this.couleur = couleur;
			this.nom = "\u265a";
		}
		if(couleur == "blanc")
		{
			this.couleur = couleur;
			this.nom = "\u2654";
		}
	}
	
	public boolean deplacementValide() {
		return false;
	}
}