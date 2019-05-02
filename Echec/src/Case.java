public class Case {
	
	private int ligne;
	private int colonne;
	private Piece piece;
	
	public Case() {
		
	}
	
	public Case(int l, int c, Piece p) {
		this.ligne = l;
		this.colonne = c;
		this.piece = p;
	}
	
	public Case(Piece p) {
		this.piece = p;
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
	
	public String toString() {
		String s;
		if(this.piece == null) //si la case est vide
		{
			s = ". ";
		}
		else //si la case contient une piece
		{
			s = this.piece.toString() +" ";
		}
		return s;
	}
}