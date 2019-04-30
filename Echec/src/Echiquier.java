public class Echiquier {
	
	private Case[][] plateau;

	public Echiquier() {
		plateau = new Case[8][8];
		for(int i = 0 ; i <= 7 ; i++)
		{
			for(int j = 0 ; j <=7 ; j++)
			{
				plateau[i][j] = new Case();
			}
		}
	}
	
	
	public Case[][] getPlateau() {
		return this.plateau;
	}

	public void setPlateau(Case[][] plateau) {
		this.plateau = plateau;
	}
	
	public String toString() {
		String s = null;
		for(int i = 1 ; i <= 8 ; i++)
		{
			for(int j = 1 ; j <=8 ; j++)
			{
				s = s + this.plateau[i][j].toString();
			}
			s = s + "\n";
		}
		return s;		
	}
}