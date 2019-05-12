public class Partie {
	
	public static void main (String[] args)
	{
		Echiquier plateau = new Echiquier();
		//System.out.println(plateau);
		//System.out.println(plateau.getCase(2, 7));
		Tour t = new Tour("noir");
		plateau.setCase(2, 7, t);
		System.out.println(plateau);
		Joueur j1 = new Joueur();
		j1.choixDeplacement(plateau);
		
		
	}
}