public class Fou extends Piece {
	
	public Fou() {
	}
	
	public Fou(String couleur) {
		if(couleur == "noir")
		{
			this.couleur = couleur;
			this.nom = "\u265d";
		}
		if(couleur == "blanc")
		{
			this.couleur = couleur;
			this.nom = "\u2657";
		}
	}
}