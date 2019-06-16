public class Roi extends Piece{
	
	public Roi() {
	}
	
	public Roi(boolean couleur) {
		super(couleur);
		if(couleur == false) // noir
		{
			this.nom = "\u265a";
		}
		if(couleur == true) // blanc
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
	--> dpt.getLigne() == arr.getLigne() && dpt.getColonne() == arr.getColonne()+1
	--> dpt.getLigne() == arr.getLigne() && dpt.getColonne() == arr.getColonne()-1
	--> dpt.getLigne() == arr.getLigne()+1 && dpt.getColonne() == arr.getColonne()
	--> dpt.getLigne() == arr.getLigne()-1 && dpt.getColonne() == arr.getColonne()
	--> dpt.getLigne() == arr.getLigne()+1 && dpt.getColonne() == arr.getColonne()+1
	--> dpt.getLigne() == arr.getLigne()+1 && dpt.getColonne() == arr.getColonne()-1
	--> dpt.getLigne() == arr.getLigne()-1 && dpt.getColonne() == arr.getColonne()+1
	--> dpt.getLigne() == arr.getLigne()-1 && dpt.getColonne() == arr.getColonne()-1
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