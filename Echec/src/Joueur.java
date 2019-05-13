import java.util.Scanner;

public class Joueur {
	
	public Joueur() {
		
	}
	
	public boolean choixValide(String choix) // verifie si le choix est conforme par rapport aux lettres et chiffres
	{
		choix = choix.toUpperCase(); // met la saisie de l'utilisateur en MAJUSCULE
		if(choix.length() == 2) // verifie que l'utilisateur n'a pas mis plus de 2 caractere à la saisie
		{
			return((choix.charAt(0) >= 'A' && choix.charAt(0) <= 'H') && (choix.charAt(1) >= '0' && choix.charAt(1) <= '7'));
			//verifie si la saisie est entre [A-H] (premier caractere) et [1-7] (deuxieme caractere)
		}
		else return false;		
	}
	
	public String saisieControle(Echiquier echec)
	{
		String deplac; // le choix de la piece qu'il veut deplacer
		Scanner choix = new Scanner(System.in);
		deplac = choix.nextLine();	
		
		while(choixValide(deplac) == false) // il resaisie jusqu'a que la saisie soit correcte
		{
			System.out.println(echec);
			System.out.println("Choix non conforme ! Veuillez choisir entre -> [A-H][1-7] : ");
			deplac = choix.nextLine();
		}
		return deplac;
	}
	
	public void choixDeplacement(Echiquier echec)
	{
		String depart;
		String arrive;
		System.out.println("Veuillez choisir la pièce que vous voulez déplacer (exemple : A6)\n");
		depart = this.saisieControle(echec);
		System.out.println("Veuillez choisir la case que vous voulez\n");
		arrive = this.saisieControle(echec);
		System.out.println(depart);
		System.out.println(arrive);
	}
		
		
		
		
		
}
