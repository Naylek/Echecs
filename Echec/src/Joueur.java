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
		String deplac; // le choix de la case selon l'affichage sur le terminale
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
	
	public Case getChoix(String choix, Echiquier echec)// retourn la case choisie selon la saisie de l'utilisateur
	{
		char c = 'A'; // quand on increment on a la prochaine lettre
		char l = '0'; // pareille prochain chiffre
		for(int i = 0 ; i <= 7 ; i++) 
		{
			if(choix.charAt(0) == c) // verifie si le premier caractere est egale à char c sinon on increment char c 
			{
				for(int j = 0 ; j <= 7 ; j++) // si sa rentre dedans c'est quand on a trouvé l'indice de la premiere lettre dans l'éechiquier
				{
					if(choix.charAt(1) == l) // meme chose pour le deuxieme caractere
					{
						return echec.getCase(j, i); // l'indice j -> les lettre (ligne) | l'indiece i -> pour les chiffres (colonne)
					}
					l++; // '0' = '0' + '1' = '1' etc
				}
			}
			c++; // pour regarder la prochaine lettre 'A' = 'A' + 1 = 'B' etc
		}
		return null; // vu que la saisie est verifié avant ça ne retournera jamais null
		
	}
	
	public void choixDeplacement(Echiquier echec)
	{
		String depart;
		String arrive;
		System.out.println("Veuillez choisir la pièce que vous voulez déplacer (exemple : A6)\n");
		depart = this.saisieControle(echec).toUpperCase(); // on remet en majuscule car sinon ça revient en miniscule
		//System.out.println("Veuillez choisir la case que vous voulez\n");
		//arrive = this.saisieControle(echec).toUpperCase();
//		if(this.getChoix(depart, echec).caseOccupe() == true) // si case occupe donc si ya une piece dedans
//		{
//			System.out.println(this.getChoix(depart, echec).getPiece().getClass().getTypeName()); //pour avoir le nom de la class
//		}
//		else System.out.println("."); // si pas piece donc case vide
		
	}
		
		
		
		
		
}
