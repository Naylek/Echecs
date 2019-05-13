public class Pion extends Piece {
	
	public Pion() {
	}
	
	public Pion(String couleur) {
		this.couleur = couleur;
		if(couleur == "noir")
		{
			this.nom = "\u265f";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2659";
		}
	}
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive)
	{
		if (/*caseDevantLibre*/)
		{
			if (/*1erTourPion && 2CasesDevantLibres*/)
			{
				return true;
			}
		}
		else
		{
			return false;
		}
	}
	
	public void seDeplacer() {}
}