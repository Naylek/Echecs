public class Cavalier extends Piece {
	
	public Cavalier() {
	}
	
	public Cavalier(String couleur) {
		super(couleur);
		if(couleur == "noir")
		{
			this.nom = "\u265e";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2658";
		}
	}
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {
		
		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		
		/*
		--> case arrivée vide ou pièce couleur opposée
		--> (dtp.ligne == arr.ligne-2 && (dpt.colonne == arr.colonne+1)
		--> (dtp.ligne == arr.ligne-2 && (dpt.colonne == arr.colonne-1)
		--> (dtp.ligne == arr.ligne+2 && (dpt.colonne == arr.colonne+1)
		--> (dtp.ligne == arr.ligne+2 && (dpt.colonne == arr.colonne-1)
		--> (dpt.ligne == arr.ligne-1 && (dpt.colonne == arr.colonne+2)
		--> (dpt.ligne == arr.ligne-1 && (dpt.colonne == arr.colonne-2)
		--> (dpt.ligne == arr.ligne+1 && (dpt.colonne == arr.colonne+2)
		--> (dpt.ligne == arr.ligne+1 && (dpt.colonne == arr.colonne-2)
		*/
		
		return false;
	}
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		return echec;
	}
}