import java.util.Scanner;

public class Partie {

	public static boolean saisieControle(int choix)
	{
		if((choix >= 1 && choix <= 4))
		{
			return true;
		}
		return false;
	}
	
	public static void main (String[] args)
	{
		Echiquier plateau = new Echiquier();
		Joueur j1 = new Joueur(true); //blanc
		Joueur j2 = new Joueur(false); //noir
		int choix;
		boolean tour = true;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while(i < 10)//pas echec et mat joueur 1 || pas echec et mat joueur 2)
		{
			System.out.println(plateau);
			System.out.println("Vous voulez : 1 -> sauvegarder ? | 2 -> restaurer une partie ?  | 3 -> jouer ? | 4 -> arrêter la partie ?");
			
			choix = sc.nextInt();
			while(saisieControle(choix) == false)//saisie controlé
			{
				System.out.println("Saisie incorrect. Veuillez choisir un chiffre entre : [1-2-3-4]");
				System.out.println("Vous voulez : 1 -> sauvegarder ? | 2 -> restaurer une partie ?  | 3 -> jouer ? | 4 -> arrêter la partie ?");
				choix = sc.nextInt();
			}
			if(choix == 1)
			{
				if(tour == true)
				{
					j1.sauver("sauvegarde.txt", plateau);//sauvegarde dans un fichier texte
				}
				else if(tour == false)
				{
					j2.sauver("sauvegarde.txt", plateau);
				}
			}
			else if(choix == 2)
			{
				if(tour == true)
				{
					j1.charger("sauvegarde.txt", plateau);//charge par rapport a la sauvegarde effectuer
				}
				else if(tour == false)
				{
					j2.charger("sauvegarde.txt", plateau);
				}
			}
			else if(choix == 3)
			{	
				//plateau.caseDanger(); //mise a jour echiquier pour savoir quel piece peut se deplacer où
				if(tour == true)
				{
					System.out.println("C'est au joueur blanc de jouer");
					j1.choixDeplacement(plateau);//doit dire aussi que le joueur est en echec
				}
				else if(tour == false)
				{
					System.out.println("C'est au joueur noir de jouer");
					j2.choixDeplacement(plateau);
				}
			}
			else if(choix == 4)
			{
				break;
			}
			if(tour == true)//pour changer le tour
			{
				tour = false; 
			}
			else tour = true;
			
			
		}
//		if()//si J1 est en echec et mat J2 a gagné 
//		{
//			System.out.println("Joueur noir a gagné !");
//		}
//		if()//si j2 est en echec et met j1 a gagné
//		{
//			System.out.println("Joueur blanc a gagné !");
//		}
		System.out.println("Fin de jeu.");
	}
}