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
		char l = '0'; // pareil prochain chiffre
		for(int i = 0 ; i <= 7 ; i++) 
		{
			if(choix.charAt(0) == c) // verifie si le premier caractere est egale à char c sinon on increment char c 
			{
				for(int j = 0 ; j <= 7 ; j++) // si ça rentre dedans c'est qu'on a trouvé l'indice de la premiere lettre dans l'échiquier
				{
					if(choix.charAt(1) == l) // meme chose pour le deuxieme caractere
					{
						return echec.getCase(j, i); // l'indice j -> les lettre (ligne) | l'indice i -> pour les chiffres (colonne)
					}
					l++; // '0' = '0' + '1' = '1' etc
				}
			}
			c++; // pour regarder la prochaine lettre 'A' = 'A' + 1 = 'B' etc
		}
		return null; // vu que la saisie est verifié avant ça ne retournera jamais null
		
	}
	
	public String choixPiece(Echiquier echec) // verifie si que le 1er choix est bien une piece
	{
		String depart;
		depart = this.saisieControle(echec).toUpperCase();// on remet en majuscule car sinon ça revient en miniscule
		while(this.getChoix(depart, echec).caseOccupe() == false) // tant que le choix n'est pas une piece il resaisit
		{
			System.out.println("Choix non conforme ! La case choisie n'est pas une pièce : ");
			depart = this.saisieControle(echec).toUpperCase();
		}
		return depart;
	}
	
	public String memeChoix(Echiquier echec, String depart)
	{
		String arrive;
		arrive = this.saisieControle(echec).toUpperCase();
		while(arrive.equals(depart)) // tant que le choix est le meme que le 1er choix il resaisit
		{
			System.out.println("Choix non conforme ! Vous ne pouvez pas choisir la même case : ");
			arrive = this.saisieControle(echec).toUpperCase();
		}
		return arrive;
	}
	
	public void choixDeplacement(Echiquier echec)
	{
		String depart;
		String arrive;
		System.out.println("Veuillez choisir la pièce que vous voulez déplacer (exemple : A6)\n"); // 1er choix une piece
		depart = choixPiece(echec); // verifie 1er choix est une piece
		//System.out.println(getChoix(depart, echec)); // montre la piece choisie par l'utilisateur
		
		System.out.println("Veuillez choisir la case que vous voulez\n"); // 2eme choix n'importe quelle case (deplacementValide de chaque piece validera)
		arrive = memeChoix(echec,depart); // verifie si 2eme choix pas egale au premier choix (pas de mouvement surplace)
		//System.out.println(getChoix(arrive, echec)); //montre la case choisie pour le deplacement		
	}
		
		
		
		
		
}
