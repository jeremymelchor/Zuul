package main;

public enum Language {

	HELLO(""),
	EXIT(""),
	HELP(""),
	NODOOR(""),
	LIBRARY_CLOSED(""),
	EXITS_LIST(""),
	UPTODATE(""),
	LECTURE(""),
	LAB(""),
	ENERGY_LEVEL(""),
	STATS(""),
	USELESS_ROOM(""),
	ALI(""),
	CORRIDOR(""),
	AMAZING(""),
	EXAM_ROOM(""),
	FOYER(""),
	DRINK(""),
	IN_A_LAB(""),
	IN_A_LECTURE(""),
	IN_THE_LIBRARY(""),
	FIND_BOOK(""),
	FIND_TABLETTE(""),
	LEARN_LECTURE(""),
	PLAY_WORLD_OF_ZUUL(""),
	PLAY_VIDEO_GAME(""),
	LUNCH_ROOM(""),
	PRINT_ROOM(""),
	YOU_ARE(""),
	EXIT_WORD(""),
	NO_USABLE(""),
	LIGHTS_ON(""),
	LIGHTS_OFF(""),
	SECRETARIAT(""),
	PEOPLE_HERE(""),
	BABYFOOT(""),
	COFFE_WORD(""),
	DRINK_COFFE(""),
	OOP_BOOK_WORD(""),
	READ_OOP_BOOK(""),
	NOT_OOP_COURSE(""),
	FOLLOW_COURSE(""),
	KICKED_ROOM(""),
	OOP_COURSE(""),
	EMPTY_ROOM(""),
	YES_WORD(""),
	NOT_OOP_LAB(""),
	FOLLOW_LAB(""),
	OOP_LAB(""),
	MESSY(""),
	NORTH_WORD(""),
	SOUTH_WORD(""),
	EAST_WORD(""),
	WEST_WORD(""),
	HELP_WORD(""),
	QUIT_WORD(""),
	COFFEE_WORD(""),
	LIGHTS_WORD("");
	
	
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
			"\nBienvenue dans le monde de Zuul !\n"
					+ "Le monde de Zuul est un nouveau et incroyable jeu d'aventure absolument pas ennuyant !\n"
					+ "Tapez \"aide\" si vous avez besoin d'aide.\n",
			"Merci d'avoir joué ! Au revoir.",
			"\nVos actions possibles sont : \n"
					+ "mouvements: nord / sud / est / ouest \n"
					+ "actions: quitter / aide / stats \n"
					+ "objets: café / lumière / babyfoot\n",
			"Cela ne mène à rien !",
			"La librairie est fermée. Réessayez plus tard.",
			"Mouvements: nord / sud / est / ouest" + "Actions: "
					+ "options: quitter / aide",
			"Vos cours sont à jours !",
			"Vos cours : ",
			"Vos TD : ",
			"Votre niveau d'énergie : ",
			"\nStatistiques : ",
			"une salle inutile",
			"dans le bureau d'Ali",
			"dans un couloir",
			"Ce couloir est génial ! Mais y'a rien pour vous ici !",
			"dans la salle d'examen",
			"au foyer",
			"Ici, vous pouvez boire un café.",
			"dans un TD d'informatique",
			"dans un cours",
			"à la librairie",
			"Vous avez trouvé un livre de POO ! Vous avez appris un cours de POO.",
			"Vous trouvez une tablette. ",
			"Vous avez appris un cours de POO.",
			"Vous avez joué au monde de Zuul ! Vous vous êtes bien amusé !.",
			"Vous avez joué à un jeu vidéo. Vous avez oublié un cours.",
			"dans la cafétéria",
			"dans l'imprimerie",
			"\nVous êtes",
			"Sorties:",
			"Vous ne pouvez pas utiliser ça ici !",
			"Les lumières sont allumées.",
			"Les lumières sont éteintes.",
			"au secrétariat",
			"Il ya des gens ici, mais ils ne semblent pas être accueillant ! Vous vous en allez.",
			"Vous venez de jouer au babyfoot. Vous avez oublié un cours ! Energie -5.",
			"café",
			"Vous venez de boire un café. Energie +10",
			"livre de POO",
			"Vous venez juste de lire un livre de POO !",
			"Ce n'est pas un cours de POO. Voulez-vous assister au cours ?",
			"Vous avez suivi le cours. Energie -10",
			"Vous avez été viré de la salle.",
			"C'est un cours de POO. Vous le suivez. Vous avez appris un nouveau cours ! Energie -10",
			"La salle est vide.",
			"oui",
			"Ce n'est pas un TD de POO. Voulez-vous assister au TD ?",
			"Vous avez suivi le TD. Energie -10",
			"C'est un TD de POO. Vous le suivez. Vous avez appris un nouveau TD ! Energie -10",
			"Wow ! C'est le bordel ici ! Vous ferez mieux de partir !",
			"nord",
			"sud",
			"est",
			"ouest",
			"aide",
			"quitter",
			"café",
			"lumière"};

	private final static String[] en = {
			"\nWelcome to the World of Zuul!\n"
					+ "World of Zuul is a new, incredibly and not boring adventure game.\n"
					+ "Type \"help\" if you need help.\n",
			"Thank you for playing. Good bye.",
			"\nVos Possible actions : \n"
					+ "movements: north / south / east / west \n"
					+ "actions: quit / help / stats \n"
					+ "objets: coffee / light / babyfoot\n",
			"This lead to nothing !",
			"The library is closed. Try again later.",
			"moves: north / south / east / west" + "interact: "
					+ "options: quit / help",
			"Your labs are up to date !",
			"Your lectures : ",
			"Your labs : ",
			"Your current level of energy : ",
			"\nHere are your stats : ",
			"a useless room",
			"Ali's office",
			"in a corridor",
			"This corridor is amazing ! But there's nothing for you here !",
			"in the exam classroom",
			"in the foyer",
			"Here, you can drink coffe.",
			"in a computing lab",
			"in a lecture",
			"in the library",
			"You found an OOP book ! You learned a OOP lecture.",
			"You found a tablet. ",
			"You learned a OOP lecture.",
			"You played a game of World of Zuul ! So much fun.",
			"You played a video game. You forgot one lecture.",
			"in the lunch room",
			"in the print room",
			"You are",
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
			"You just read an OOP book !",
			"This is not an OOP class. Would you like to follow it ?",
			"You followed the class. Energy -10",
			"You were kicked out of the room.",
			"This is an OOP class. You follow it. You learned a new lecture. Energy -10",
			"The room is empty.",
			"yes",
			"This is not an OOP lab. Would you like to follow it ?",
			"You followed the lab. Energy -10",
			"This is an OOP lab. You follow it. You learned a new labs. Energy -10",
			"Wow ! It's messy here ! You better get out of here !",
			"north",
			"south",
			"east",
			"west",
			"help",
			"quit",
			"coffee",
			"light"};
}
