public class Pion extends Piece {
	
	public Pion() {
	}
	
	public Pion(String couleur, String nom) {
		if(couleur == "noir")
		{
			this.couleur = couleur;
			this.nom = "\u265f";
		}
		if(couleur == "blanc")
		{
			this.couleur = couleur;
			this.nom = "\u2659";
		}
	}
}