public abstract class Piece {
	
	private String couleur;
	private String nom;
	
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
	
	public String toString() {
		return "oui";
	}
}