public class Echiquier {
	
	private Case[][] plateau;

	public Echiquier() {
		this.plateau = new Case[8][8];
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
				else plateau[i][j] = new Case(); // j'arrive pas à mettre une case vide pour l'instant
			}
		}
	}
	
	
	public void getCase(int i, int j) {
		System.out.println(this.plateau[i][j]);
	}

	public void setPlateau(Case[][] plateau) {
		this.plateau = plateau;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0 ; i <= 7 ; i++)
		{
			for(int j = 0 ; j <= 7 ; j++)
			{
				s = s + this.plateau[i][j].toString();
			}
			s = s + "\n";
		}
		return s;		
	}
}