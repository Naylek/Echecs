import java.util.Scanner;

public class Partie {
	
	public void menu()
	{
		Echiquier plateau = new Echiquier();
		Joueur j1 = new Joueur(true); //blanc
		Joueur j2 = new Joueur(false); //noir
		int choix;
		boolean tour = true;
		
	
		while(tour == true)//tour joueur blanc
		{
			System.out.println(plateau);
			System.out.println("Vous voulez : 1 -> sauvegarder ? | 2 -> restaurer une partie ?  | 3 -> jouer ?");
			Scanner sc = new Scanner(System.in);
			choix = sc.nextInt();
			while(choix < 1 && choix > 3)
			{
				System.out.println("Saisie incorrect. Veuillez choisir un chiffre entre : [1-2-3]");
				System.out.println("Vous voulez : 1 -> sauvegarder ? | 2 -> restaurer une partie ?  | 3 -> jouer ?");
			}
			if(choix == 1)
			{
				j1.sauver("sauvegarde.txt", plateau);
			}
			else if(choix == 2)
			{
				j1.charger("sauvegarde.txt", plateau);
			}
			else if(choix == 3)
			{
				//tant que pas echec et mat alors on joue
				j1.choixDeplacement(plateau);
				System.out.println(plateau);
			}
		}
	}
	
	public static void main (String[] args)
	{
		Echiquier plateau = new Echiquier();
		Tour t = new Tour(false);
		plateau.setCase(2, 5, t);
		System.out.println(plateau);
		Joueur j1 = new Joueur(true);
		Joueur j2 = new Joueur(false);
//		j1.sauver("sauvegarde.txt", plateau);
		for(int i = 0; i < 10; i++)//pour faire plusieurs fois la saisie juste pour tester plus efficacement
		{
			j1.choixDeplacement(plateau);
			System.out.println(plateau);
		}
//		j1.choixDeplacement(plateau);
		
//		j1.charger("sauvegarde.txt", plateau);
//		System.out.println(plateau);
	}
}