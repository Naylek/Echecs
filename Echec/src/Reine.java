public class Reine extends Piece{
	
	public Reine() {
	}
	
	public Reine(String couleur) {
		this.couleur = couleur;
		if(couleur == "noir")
		{
			this.nom = "\u265b";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2655";
		}
	}
	
	public boolean deplacementValide() {
		return false;
	}
}