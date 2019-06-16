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
	
	public Echiquier seDeplacer(Echiquier echec, Case depart, Case arrive) {
		
		if (deplacementValide(echec, depart, arrive)) {
			echec.setCase(depart.getLigne(), depart.getColonne(), new Case());
			echec.setCase(arrive.getLigne(), arrive.getColonne(), new Case(arrive.getLigne(), arrive.getColonne(), this));
		}
		
		return echec;
	}
	
	//method abstract
	public abstract boolean deplacementValide(Echiquier e, Case x, Case y);
	
	public String toString() {
		return this.nom;
	}
}