package main;

public enum Language {

	HELLO(""),
	EXIT(""),
	DUNNO(""),
	NODOOR(""),
	LIBRARY_CLOSED(""),
	HELP(""),
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
	LAB_INFO(""),
	IN_A_LAB(""),
	AT_THE_LIBRARY(""),
	FIND_BOOK(""),
	FIND_TABLETTE(""),
	LEARN_LECTURE(""),
	PLAY_WORLD_OF_ZUUL(""),
	PLAY_VIDEO_GAME(""),
	LUNCH_ROOM(""),
	PRINT_ROOM(""),
	EXITS_LIST(""),
	YOU_ARE(""),
	NO_USABLE(""),
	LIGHTS_ON(""),
	LIGHTS_OFF(""),
	SECRETARIAT(""),
	PEOPLE_HERE(""),
	BABYFOOT(""),
	COFFE(""),
	DRINK_COFFE(""),
	OOP_BOOK(""),
	OOP_READ(""),
	NOT_OOP_COURSE(""),
	FOLLOW_COURSE(""),
	KICKED_ROOM(""),
	OOP_COURSE(""),
	EMPTY_ROOM(""),
	YES(""),
	NOT_OOP_LAB(""),
	FOLLOW_LAB(""),
	OOP_LAB(""),
	MESSY("");
	
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
			"Merci d'avoir jou� ! Au revoir.",
			"Je n'ai pas compris votre commande",
			"\nVos actions possibles sont : ",
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
			"Vous �tes",
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
			"Vous venez juste de lire un livre de POO !",
			"Ce n'est pas un cours de POO. Voulez-vous assister au cours ?",
			"Vous avez suivi le cours. Energie -10",
			"Vous avez �t� vir� de la salle.",
			"C'est un cours de POO. Vous le suivez. Vous avez appris un nouveau cours ! Energie -10",
			"La salle est vide.",
			"oui",
			"Ce n'est pas un TD de POO. Voulez-vous assister au TD ?",
			"Vous avez suivi le TD. Energie -10",
			"C'est un TD de POO. Vous le suivez. Vous avez appris un nouveau TD ! Energie -10",
			"Wow ! C'est le bordel ici ! Vous ferez mieux de partir !"};

	private final static String[] en = {
			"\nWelcome to the World of Zuul!\n"
					+ "World of Zuul is a new, incredibly and not boring adventure game.\n"
					+ "Type \"help\" if you need help.\n",
			"Thank you for playing. Good bye.",
			"I don't know what you mean...",
			"\nYour command words are:",
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
			"Wow ! It's messy here ! You better get out of here !" };
}
