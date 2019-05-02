public class Tour extends Piece{
	
	public Tour() {
	}
	
	public Tour(String couleur) {
		if(couleur == "noir")
		{
			this.couleur = couleur;
			this.nom = "\u265c";
		}
		if(couleur == "blanc")
		{
			this.couleur = couleur;
			this.nom = "\u2656";
		}
	}
}