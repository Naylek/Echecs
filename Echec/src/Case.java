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
	
	public boolean getEstMenace() {
		return this.estMenace;
	}
	
	public void setEstMenace(boolean menace) {
		this.estMenace = menace;
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
	
	public String toString() {
		String s;
		if(this.piece == null) //si la case est vide
		{
			s = ". ";
		}
		else //si la case contient une pièce
		{
			s = this.piece.toString() + " ";
		}
		return s;
	}
	
	
	
}