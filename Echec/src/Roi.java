public class Roi extends Piece{
	
	public Roi() {
	}
	
	public Roi(String couleur) {
		super(couleur);
		if(couleur == "noir")
		{
			this.nom = "\u265a";
		}
		if(couleur == "blanc")
		{
			this.nom = "\u2654";
		}
	}
	
	public boolean deplacementValide(Echiquier echec, Case depart, Case arrive) {

		Case dpt = echec.getCase(depart.getLigne(), depart.getColonne());
		Case arr = echec.getCase(arrive.getLigne(), arrive.getColonne());
		
		
		
		return false;
	}
	
	/*
	--> case arrivée vide ou pièce couleur opposée
	--> dpt.ligne == arr.ligne && dpt.colonne == arr.colonne+1
	--> dpt.ligne == arr.ligne && dpt.colonne == arr.colonne-1
	--> dpt.ligne == arr.ligne+1 && dpt.colonne == arr.colonne
	--> dpt.ligne == arr.ligne-1 && dpt.colonne == arr.colonne
	--> dpt.ligne == arr.ligne+1 && dpt.colonne == arr.colonne+1
	--> dpt.ligne == arr.ligne+1 && dpt.colonne == arr.colonne-1
	--> dpt.ligne == arr.ligne-1 && dpt.colonne == arr.colonne+1
	--> dpt.ligne == arr.ligne-1 && dpt.colonne == arr.colonne-1
	--> ne passe pas par dessus sa couleur
	--> peut bouffer un pion ennemi SI CA LE MET PAS EN ECHEC !!
	*/
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		
		if (deplacementValide(echec, depart, arrive)) {
			echec.setCase(depart.getLigne(), depart.getColonne(), new Case());
			echec.setCase(arrive.getLigne(), arrive.getColonne(), new Case(arrive.getLigne(), arrive.getColonne(), this));
		}
		
		return echec;
	}
	
}