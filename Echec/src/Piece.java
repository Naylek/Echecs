public abstract class Piece {
	
	protected boolean couleur;
	protected String nom;
	
	public Piece() {
		
	}
	
	public Piece(Piece p) {
		this.couleur = p .couleur;
		this.nom = p.nom;
	}
	
	public Piece(boolean couleur)
	{
		this.couleur = couleur;
	}
	
	public boolean getCouleur() {
		return this.couleur;
	}
	
	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//method abstract
	public abstract Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive);
	
	public abstract boolean deplacementValide(Echiquier e, Case x, Case y);
	
	public String toString() {
		return this.nom;
	}
}