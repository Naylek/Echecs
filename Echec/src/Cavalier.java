public class Cavalier extends Piece {
	
	public Cavalier() {
	}
	
	public Cavalier(String couleur) {
		if(couleur == "noir")
		{
			this.couleur = couleur;
			this.nom = "\u265e";
		}
		if(couleur == "blanc")
		{
			this.couleur = couleur;
			this.nom = "\u2658";
		}
	}
}