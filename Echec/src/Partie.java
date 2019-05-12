public class Partie {
	
	public static void main (String[] args)
	{
		Echiquier plateau = new Echiquier();
		System.out.println(plateau);
		Case c;
		c = plateau.getCase(0, 0);
		//System.out.println(c.getPiece().couleur);
	}
}