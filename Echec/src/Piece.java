public abstract class Piece {
	
	protected String couleur;
	protected String nom;
	
	public String getCouleur() {
		return this.couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//method abstract
	public void seDeplacer() {
		
	}
	
	public abstract boolean deplacementValide(Echiquier e, int x, int y);
	
	public String toString() {
		return this.nom;
	}
}