public class Tour extends Piece{
	
	public Tour() {
	}
	
	public Tour(String couleur) {
		this.couleur = couleur;
		if(couleur == "noir")
		{
			this.nom = "\u265c";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2656";
		}
	}
	
	public boolean deplacementValide(Echiquier echec,int x, int y) 
	{
		return false;
	}
	
	public void seDeplacer()
	{
		
	}
}