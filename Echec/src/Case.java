public class Case {
	
	private int ligne;
	private int colonne;
	private Piece piece;
	
	public Case() {
		this.piece = new Pion();
	}
	
	public Case(int l, int c) {
		this.ligne = l;
		this.colonne = c;
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
		s = this.piece.toString();
		return s;
	}
}