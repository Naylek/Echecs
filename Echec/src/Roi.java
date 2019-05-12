public class Roi extends Piece{
	
	public Roi() {
	}
	
	public Roi(String couleur) {
		this.couleur = couleur;
		if(couleur == "noir")
		{
			this.nom = "\u265a";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2654";
		}
	}
	
	public boolean deplacementValide() {
		return false;
	}
}