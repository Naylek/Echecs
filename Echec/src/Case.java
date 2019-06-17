public class Case {
	
	private int ligne;
	private int colonne;
	private Piece piece;
	private boolean estMenace;
	
	public Case() {
		
	}
	
	public Case(int l, int c, Piece p) {
		this.ligne = l;
		this.colonne = c;
		this.piece = p;
		this.estMenace = false;
	}
	
	public Case(int l, int c) {
		this.ligne = l;
		this.colonne = c;
		this.estMenace = false;
	}
	
	public Case(Piece p) {
		this.piece = p;
		this.estMenace = false;
	}
	
	public int getLigne() {
		return this.ligne;
	}
	
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}
	
	public int getColonne() {
		return this.colonne;
	}
	
	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
	
	public Piece getPiece() {
		return this.piece;
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public boolean caseOccupe()
	{
		return (this.piece != null);
	}
	
	public boolean caseOccupe(boolean couleur)
	{
		if(this.piece == null)
		{
			return false;
		}
		else return (this.piece.couleur == couleur);
	}
	
	public Echiquier caseDanger(Echiquier echec) { // retourne l'echiquier avec les cases sous la menace d'une autre pieces marquees (EstMenace = true)
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(echec.getCase(i, j).caseOccupe()) {
					for (int k = 0; k < 8; k++) {
						for (int l = 0; l < 8; l++) {
							if(echec.getCase(i, j).getPiece().deplacementValide(echec, echec.getCase(i, j), echec.getCase(k, l))) {
								echec.getCase(i, j).estMenace = true;
							}
						}
					}
				}
			}
		}
		
		return echec;
	}
	
	public String toString() {
		String s;
		if(this.piece == null) //si la case est vide
		{
			s = ". ";
		}
		else //si la case contient une piece
		{
			s = this.piece.toString() + " ";
		}
		return s;
	}
	
	
	
}