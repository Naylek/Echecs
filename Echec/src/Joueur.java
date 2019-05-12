import java.util.Scanner;

public class Joueur {
	blabla de Kelyan;
	
	public void choixDeplacement(Echiquier echec)
	{
		String depart;
		String arrive;
		
		Scanner choix = new Scanner(System.in);
		System.out.println("Veuillez choisir la pièce que vous voulez déplacer (exemple : A6)\n");
		depart = choix.nextLine();
		while(depart.charAt(0) >= 'A' && depart.charAt(0) <= 'H')
		{
			if(depart.charAt(1) >= '0' && depart.charAt(1) <= '7')
			{
				System.out.println("Choix non conforme");
			}
		}
	}
}