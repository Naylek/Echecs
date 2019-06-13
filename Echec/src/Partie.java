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
		for(int i = 0; i < 10; i++)//pour faire plusieurs fois la saisie juste pour tester plus efficacement
		{
			j1.choixDeplacement(plateau);
			System.out.println(plateau);
		}
		//j1.choixDeplacement(plateau);
		//j1.sauver("sauvegarde.txt", plateau);
		//j1.charger("sauvegarde.txt", plateau);
	}
}