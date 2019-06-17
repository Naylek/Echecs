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
		
		if (arr.caseOccupe() == false || arr.caseOccupe(this.couleur) == false) { // case arrivée vide ou pièce couleur opposée
			if(arr.getLigne() == dpt.getLigne()) { // meme ligne
				if(arr.getColonne() == dpt.getColonne()+1 || arr.getColonne() == dpt.getColonne()-1) { //deplacement a droite ou a gauche
					return true;
				} else {
					System.out.println("Le roi ne se déplace pas aussi loin.");
					return false;
				}
			} else if(arr.getLigne() == dpt.getLigne()-1) { // ligne du dessus
				if(arr.getColonne() == dpt.getColonne() || arr.getColonne() == dpt.getColonne()+1 || arr.getColonne() == dpt.getColonne()-1) { //meme colonne, droite ou gauche
					return true;
				} else {
					System.out.println("Le roi ne se déplace pas aussi loin.");
					return false;
				}
			} else if(arr.getLigne() == dpt.getLigne()+1) { // ligne du dessous
				if(arr.getColonne() == dpt.getColonne() || arr.getColonne() == dpt.getColonne()+1 || arr.getColonne() == dpt.getColonne()-1) { //meme colonne, droite ou gauche
					return true;
				} else {
					System.out.println("Le roi ne se déplace pas aussi loin.");
					return false;
				}
			} else {
				System.out.println("Le roi ne se déplace pas aussi loin.");
				return false;
			}
		} else {
			System.out.println("Un copain est sur la case demandée.");
			return false;
		}
	}
	
}