import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Echiquier {
	
	private Case[][] plateau;
	private ArrayList<Piece> listeEnnemi;

	public Echiquier() {
		this.plateau = new Case[8][8];
//		Piece t1n = new Tour(false);
//		Piece t2n = new Tour(false);
//		Piece c1n = new Cavalier(false);
//		Piece c2n = new Cavalier(false);
//		Piece f1n = new Fou(false);
//		Piece f2n = new Fou(false);
//		Piece r1n = new Roi(false);
//		Piece d1n = new Reine(false);
//		Piece p1n = new Pion(false); Piece p2n = new Pion(false); Piece p3n = new Pion(false); Piece p4n = new Pion(false); 
//		Piece p5n = new Pion(false); Piece p6n = new Pion(false); Piece p7n = new Pion(false); Piece p8n = new Pion(false);
//		
//		Piece t1b = new Tour(true);
//		Piece t2b = new Tour(true);
//		Piece c1b = new Cavalier(true);
//		Piece c2b = new Cavalier(true);
//		Piece f1b = new Fou(true);
//		Piece f2b = new Fou(true);
//		Piece r1b = new Roi(true);
//		Piece d1b = new Reine(true);
//		Piece p1b = new Pion(true); Piece p2b = new Pion(true); Piece p3b = new Pion(true); Piece p4b = new Pion(true); 
//		Piece p5b = new Pion(true); Piece p6b = new Pion(true); Piece p7b = new Pion(true); Piece p8b = new Pion(true);
		
		for(int i = 0 ; i <= 7 ; i++)
		{
			for(int j = 0 ; j <=7 ; j++)
			{
				if(i == 0 && j == 0)
				{
					plateau[i][j] = new Case(new Tour(false));
				}
				else if(i == 0 && j == 1)
				{
					plateau[i][j] = new Case(new Cavalier(false));
				}
				else if(i == 0 && j == 2)
				{
					plateau[i][j] = new Case(new Fou(false));
				}
				else if(i == 0 && j == 3)
				{
					plateau[i][j] = new Case(new Reine(false));
				}
				else if(i == 0 && j == 4)
				{
					plateau[i][j] = new Case(new Roi(false));
				}
				else if(i == 0 && j == 5)
				{
					plateau[i][j] = new Case(new Fou(false));
				}
				else if(i == 0 && j == 6)
				{
					plateau[i][j] = new Case(new Cavalier(false));
				}
				else if(i == 0 && j == 7)
				{
					plateau[i][j] = new Case(new Tour(false));
				}
				else if(i == 1) 
				{
					plateau[i][j] = new Case(new Pion(false));
				}
				else if(i == 6)
				{
					plateau[i][j] = new Case(new Pion(true));
				}
				else if(i == 7 && j == 0)
				{
					plateau[i][j] = new Case(new Tour(true));
				}
				else if(i == 7 && j == 1)
				{
					plateau[i][j] = new Case(new Cavalier(true));
				}
				else if(i == 7 && j == 2)
				{
					plateau[i][j] = new Case(new Fou(true));
				}
				else if(i == 7 && j == 3)
				{
					plateau[i][j] = new Case(new Reine(true));
				}
				else if(i == 7 && j == 4)
				{
					plateau[i][j] = new Case(new Roi(true));
				}
				else if(i == 7 && j == 5)
				{
					plateau[i][j] = new Case(new Fou(true));
				}
				else if(i == 7 && j == 6)
				{
					plateau[i][j] = new Case(new Cavalier(true));
				}
				else if(i == 7 && j == 7)
				{
					plateau[i][j] = new Case(new Tour(true));
				}
				else plateau[i][j] = new Case();
			}
		}
	}
	
	public void afficheCasePlateau(int i, int j) {
		System.out.println(this.plateau[i][j]);
	}
	
	public Case getCase(int i, int j)
	{
		return(this.plateau[i][j]);
	}
	
	public void setCase(int i, int j, Piece p)
	{
		this.plateau[i][j] = new Case(p);
	}
	
	public void setCase(int ligne, int colonne, Case c) 
	{
		this.plateau[ligne][colonne] = c;
	}
	
	public void setPlateau(Case[][] plateau) {
		this.plateau = plateau;
	}
	
	public Case[][] getPlateau()
	{
		return this.plateau;
	}
	
	public Echiquier caseDanger() { // retourne l'echiquier avec les cases sous la menace d'une autre pieces marquees (EstMenace = true)
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(this.getCase(i, j).caseOccupe()) {
					for (int k = 0; k < 8; k++) {
						for (int l = 0; l < 8; l++) {
							if(this.getCase(i, j).getPiece().deplacementValide(this, this.getCase(i, j), this.getCase(k, l))) {
								this.getCase(i, j).setEstMenace(true);
							}
						}
					}
				}
			}
		}
		
		return this;
	}
	
	public String toString() {
		String s = "";
		char l = '0';
		char c = 'A';
		for(int i = 0 ; i <= 8 ; i++)
		{
			if(i <= 7)
			{
				s = s + l + "  "; // afficher les chiffres de plateau
				for(int j = 0 ; j <= 7 ; j++) // afficher le contenu du plateau
				{
					s = s + this.plateau[i][j].toString();
				}
				s = s + "\n";
				l++; // incremente le code ascii pour les chiffres
			}
			if(i == 8) // derniere ligne pour afficher les lettres du plateau
			{
				s = s + "   "; 
				for(int k = 0 ; k < 8 ; k++)
				{
					s = s + c + " ";
					c++;
				}
			}
		}
		return s;		
	}

}