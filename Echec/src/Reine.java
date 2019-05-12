public class Reine extends Piece{
	
	public Reine() {
	}
	
	public Reine(String couleur) {
		if(couleur == "noir")
		{
			this.couleur = couleur;
			this.nom = "\u265b";
		}
		if(couleur == "blanc")
		{
			this.couleur = couleur;
			this.nom = "\u2655";
		}
	}
	
	public boolean deplacementValide() {
		return false;
	}
}