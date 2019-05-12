public class Cavalier extends Piece {
	
	public Cavalier() {
	}
	
	public Cavalier(String couleur) {
		this.couleur = couleur;
		if(couleur == "noir")
		{
			this.nom = "\u265e";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2658";
		}
	}
	
	public boolean deplacementValide() {
		return false;
	}
}