public class Echiquier {
	
	private Case[][] plateau;

	public Echiquier() {
		this.plateau = new Case[8][8];
//		Piece t1n = new Tour("noir");
//		Piece t2n = new Tour("noir");
//		Piece c1n = new Cavalier("noir");
//		Piece c2n = new Cavalier("noir");
//		Piece f1n = new Fou("noir");
//		Piece f2n = new Fou("noir");
//		Piece r1n = new Roi("noir");
//		Piece d1n = new Reine("noir");
//		Piece p1n = new Pion("noir"); Piece p2n = new Pion("noir"); Piece p3n = new Pion("noir"); Piece p4n = new Pion("noir"); 
//		Piece p5n = new Pion("noir"); Piece p6n = new Pion("noir"); Piece p7n = new Pion("noir"); Piece p8n = new Pion("noir");
//		
//		Piece t1b = new Tour("blanc");
//		Piece t2b = new Tour("blanc");
//		Piece c1b = new Cavalier("blanc");
//		Piece c2b = new Cavalier("blanc");
//		Piece f1b = new Fou("blanc");
//		Piece f2b = new Fou("blanc");
//		Piece r1b = new Roi("blanc");
//		Piece d1b = new Reine("blanc");
//		Piece p1b = new Pion("blanc"); Piece p2b = new Pion("blanc"); Piece p3b = new Pion("blanc"); Piece p4b = new Pion("blanc"); 
//		Piece p5b = new Pion("blanc"); Piece p6b = new Pion("blanc"); Piece p7b = new Pion("blanc"); Piece p8b = new Pion("blanc");
		for(int i = 0 ; i <= 7 ; i++)
		{
			for(int j = 0 ; j <=7 ; j++)
			{
				if(i == 0 && j == 0)
				{
					plateau[i][j] = new Case(new Tour("noir"));
				}
				else if(i == 0 && j == 1)
				{
					plateau[i][j] = new Case(new Cavalier("noir"));
				}
				else if(i == 0 && j == 2)
				{
					plateau[i][j] = new Case(new Fou("noir"));
				}
				else if(i == 0 && j == 3)
				{
					plateau[i][j] = new Case(new Roi("noir"));
				}
				else if(i == 0 && j == 4)
				{
					plateau[i][j] = new Case(new Reine("noir"));
				}
				else if(i == 0 && j == 5)
				{
					plateau[i][j] = new Case(new Fou("noir"));
				}
				else if(i == 0 && j == 6)
				{
					plateau[i][j] = new Case(new Cavalier("noir"));
				}
				else if(i == 0 && j == 7)
				{
					plateau[i][j] = new Case(new Tour("noir"));
				}
				else if(i == 1) 
				{
					plateau[i][j] = new Case(new Pion("noir"));
				}
				else if(i == 6)
				{
					plateau[i][j] = new Case(new Pion("blanc"));
				}
				else if(i == 7 && j == 0)
				{
					plateau[i][j] = new Case(new Tour("blanc"));
				}
				else if(i == 7 && j == 1)
				{
					plateau[i][j] = new Case(new Cavalier("blanc"));
				}
				else if(i == 7 && j == 2)
				{
					plateau[i][j] = new Case(new Fou("blanc"));
				}
				else if(i == 7 && j == 3)
				{
					plateau[i][j] = new Case(new Roi("blanc"));
				}
				else if(i == 7 && j == 4)
				{
					plateau[i][j] = new Case(new Reine("blanc"));
				}
				else if(i == 7 && j == 5)
				{
					plateau[i][j] = new Case(new Fou("blanc"));
				}
				else if(i == 7 && j == 6)
				{
					plateau[i][j] = new Case(new Cavalier("blanc"));
				}
				else if(i == 7 && j == 7)
				{
					plateau[i][j] = new Case(new Tour("blanc"));
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

	public void setPlateau(Case[][] plateau) {
		this.plateau = plateau;
	}
	
	public String toString() {
		String s = "";
		char l = '8';
		char c = 'a';
		for(int i = 0 ; i <= 7 ; i++)
		{
			s = s + l + "  ";
			for(int j = 0 ; j <= 7 ; j++)
			{
				s = s + this.plateau[i][j].toString();
			}
			s = s + "\n";
			l--;
		}
		s = s + "   ";
		for(int m = 0 ; m < 8 ; m++)
		{
			s = s + c + " ";
			c++;
		}
		return s;		
	}
}