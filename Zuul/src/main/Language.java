package main;

public enum Language {

	HELLO(""), DUNNO("");
	private String str;

	Language(String str) {
		this.str = str;
	}

	void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return str;
	}

	public static void setLanguage(String lang) {
		String[] whatLanguage;

		switch (lang) {
		case "FR":
			whatLanguage = fr;
			break;
		case "EN":
			whatLanguage = en;
			break;
		default:
			whatLanguage = en;
			break;
		}

		int i = 0;
		for (Language l : Language.values()) {
			l.setStr(whatLanguage[i]);
			i++;
		}
	}

	private final static String[] fr = {
			"Bienvenue dans le monde de Zuul !"
					+ "Le monde de Zuul est un nouveau et incroyable jeu d'aventure absolument pas ennuyant !"
					+ "Tapez \"aide\" si vous avez besoin d'aide.\n",
			"Je n'ai pas compris votre commande",
			"Vos actions possibles sont : ",
			"Il n'y a pas de portes !",
			"La librairie est ferm�e. R�essayez plus tard.",
			"Mouvements: nord / sud / est / ouest" + "Actions: "
					+ "options: quitter / aide",
			"Vos cours sont � jours !",
			"Vos cours : ",
			"Vos TD : ",
			"Votre niveau d'�nergie : ",
			"Statistiques : ",
			"une salle inutile",
			"bureau d'Ali",
			"dans un couloir",
			"Ce couloir est g�nial ! Mais y'a rien pour vous ici !",
			"dans la salle d'examen",
			"au foyer",
			"Ici, vous pouvez boire un caf�.",
			"dans un TD d'informatique",
			"dans un cours",
			"� la librairie",
			"Vous avez trouv� un livre de POO ! Vous avez appris un cours de POO.",
			"Vous trouvez une tablette. ",
			"Vous avez appris un cours de POO.",
			"Vous avez jou� au monde de Zuul ! Vous vous �tes bien amus� !.",
			"Vous avez jou� � un jeu vid�o. Vous avez oubli� un cours.",
			"dans la caf�t�ria",
			"dans l'imprimerie",
			"Vous �tes ",
			"Sorties:",
			"Vous ne pouvez pas utiliser �a ici !",
			"Les lumi�res sont allum�s.",
			"Les lumi�res sont �teintes.",
			"au secr�tariat",
			"Il ya des gens ici, mais ils ne semblent pas �tre accueillant ! Vous vous en allez.",
			"Vous venez de jouer au babyfoot. Vous avez oubli� un cours ! Energie -5.",
			"caf�",
			"Vous venez de boire un caf�. Energie +10",
			"livre de POO",
			"Vous venez juste de lire un livre de POO !" };

	private final static String[] en = {
			"Welcome to the World of Zuul!"
					+ "World of Zuul is a new, incredibly and not boring adventure game."
					+ "Type \"help\" if you need help.\n",
			"I don't know what you mean...",
			"Your command words are:",
			"There is no door!",
			"The library is closed. Try again later.",
			"moves: north / south / east / west" + "interact: "
					+ "options: quit / help",
			"Your labs are up to date !",
			"Your lectures : ",
			"Your labs : ",
			"Your current level of energy : ",
			"Here are your stats : ",
			"a useless room",
			"Ali's office",
			"in a corridor",
			"This corridor is amazing ! But there's nothing for you here !",
			"in the exam classroom",
			"at the foyer",
			"Here, you can drink coffe.",
			"in a computing lab",
			"in a lecture",
			"at the library",
			"You found an OOP book ! You learned a OOP lecture.",
			"You found a tablet. ",
			"You learned a OOP lecture.",
			"You played a game of World of Zuul ! So much fun.",
			"You played a video game. You forgot one lecture.",
			"in the lunch room",
			"in the print room",
			"You are ",
			"Exits:",
			"No ! You can't use this here !",
			"The lights are now on.",
			"The lights are now off.",
			"at the secretariat",
			"There are people here, they don't seem to acknoledge you. You should probably leave.",
			"You just played babyfoot. You forgot a lecture ! Energy -5.",
			"coffe",
			"You just drank a coffe. Energy +10.",
			"OOP book",
			"You just read an OOP book !" };
}
