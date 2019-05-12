import java.util.Scanner;

public class Joueur {
	
	public Joueur() {
		
	}
	
	public boolean choixValide(String choix) // verifie si le choix est conforme par rapport aux lettres et chiffres
	{
		choix = choix.toUpperCase(); // met la saisie de l'utilisateur en MAJUSCULE
		if(choix.length() > 2 && choix.length() < 2) // verifie que l'utilisateur n'a pas mis plus de 2 caractere à la saisie
		{
			return false;
		}
		return((choix.charAt(0) >= 'A' && choix.charAt(0) <= 'H') && (choix.charAt(1) >= '0' && choix.charAt(1) <= '7'));
	}//verifie si la saisie est entre [A-H] (premier caractere) et [1-7] (deuxieme caractere)
	
	public boolean saisieControle(Echiquier echec)
	{
		String arrive; // la case où le joueur veut deplacer la piece
		String depart; // le choix de la piece qu'il veut deplacer
		Scanner choix = new Scanner(System.in);
		System.out.println("Veuillez choisir la pièce que vous voulez déplacer (exemple : A6)\n");
		depart = choix.nextLine();
		
		while(choixValide(depart) == false) // il resaisie jusqu'a que la saisie soit correcte
		{
			System.out.println(echec);
			System.out.println("Choix non conforme ! Veuillez choisir la pièce que vous voulez déplacer (exemple : [A-H][1-7]) : ");
			depart = choix.nextLine();
		}
		return(choixValide(depart));
	}
	
	public void choixDeplacement(Echiquier echec)
	{
		if(saisieControle(echec) == true)
		{
			System.out.println("bon");
		}
		else System.out.println("pas bon");
		
		
		
		
	}
}