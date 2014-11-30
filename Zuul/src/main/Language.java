package main;

public enum Language {
	HELLO(""), EXIT(""), HELP(""), NODOOR(""), LIBRARY_CLOSED(""), EXITS_LIST(
			""), UPTODATE(""), LECTURE(""), LAB(""), ENERGY_LEVEL(""), STATS(""), USELESS_ROOM(
			""), ALI(""), CORRIDOR(""), AMAZING(""), EXAM_ROOM(""), FOYER(""), DRINK(
			""), IN_A_LAB(""), IN_A_LECTURE(""), IN_THE_LIBRARY(""), FIND_BOOK(
			""), FIND_TABLETTE(""), LEARN_LECTURE(""), PLAY_WORLD_OF_ZUUL(""), PLAY_VIDEO_GAME(
			""), LUNCH_ROOM(""), PRINT_ROOM(""), YOU_ARE(""), EXIT_WORD(""), NO_USABLE(
			""), LIGHTS_ON(""), LIGHTS_OFF(""), SECRETARIAT(""), PEOPLE_HERE(""), BABYFOOT(
			""), COFFE_WORD(""), DRINK_COFFE(""), OOP_BOOK_WORD(""), READ_OOP_BOOK(
			""), NOT_OOP_COURSE(""), FOLLOW_COURSE(""), KICKED_ROOM(""), OOP_COURSE(
			""), EMPTY_ROOM(""), YES_WORD(""), NOT_OOP_LAB(""), FOLLOW_LAB(""), OOP_LAB(
			""), MESSY(""), NORTH_WORD(""), SOUTH_WORD(""), EAST_WORD(""), WEST_WORD(
			""), HELP_WORD(""), QUIT_WORD(""), COFFEE_WORD(""), LIGHTS_WORD(""), THIS_IS_OOP_LECTURE(
			""), THIS_IS_OOP_LAB(""), YOU_FOLLOW_IT(""), NO_LECTURE_LEFT(""), LAB_UP_TO_DATE(
			""), WELCOME_QUIZ(""), THERE_WILL_BE(""), MUST_ANSWER(""), CORRECT_ANSWER(
			""), FALSE_ANSWER(""), CONGRATULATIONS(""), GAME_OVER(""), TRUE_WORD(
			""), FALSE_WORD(""), POO_BOOK(""), CANT_TAKE_EXAM(""), YOUR_ANSWER(""), CHEAT(""), FOUND_CHEAT(""), DEAD(""), ALMOST_DEAD(""), DESIGNING_CLASSES(
			""), INHERITANCE(""), POLYMORPHISM(""), ABSTRACTION(""), INTERFACE(
			""), ERRORS(""), DEBUG(""), QUESTION_1(""), QUESTION_2(""), QUESTION_3(
			""), QUESTION_4(""), QUESTION_5("");
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
			"La bibliothèque est fermée. Réessayez plus tard.",
			"Mouvements: nord / sud / est / ouest" + "Actions: "
					+ "options: quitter / aide",
			"Vos cours sont à jour !",
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
			"dans une salle de TD",
			"dans une salle de cours",
			"à la bibliothèque",
			"Vous avez trouvé un livre de POO ! Vous avez appris un cours de POO.",
			"Vous trouvez une tablette. ",
			"Vous avez appris un cours de POO.",
			"Vous avez joué au monde de Zuul ! Vous vous êtes bien amusé !",
			"Vous avez joué à un jeu vidéo. Vous avez oublié un cours, et le TD correspondant.",
			"dans la cafétéria",
			"dans la salle des imprimantes",
			"\nVous êtes",
			"Sorties:",
			"Vous ne pouvez pas utiliser ça ici !",
			"Les lumières sont allumées.",
			"Les lumières sont éteintes.",
			"au secrétariat",
			"Il y a des gens ici, mais ils ne semblent pas être accueillants ! Vous devriez vous en aller.",
			"Vous venez de jouer au babyfoot. Vous avez oublié un cours, et le TD correspondant. Energie -5.",
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
			"Wow ! C'est le bordel ici ! Vous feriez mieux de partir !",
			"nord",
			"sud",
			"est",
			"ouest",
			"aide",
			"quitter",
			"café",
			"lumière",
			"C'est un cours de POO.",
			"C'est un TD de POO",
			"Vous le suivez. Energie -10",
			"Il semblerait que vous n'ayez plus rien à apprendre. Passez l'examen si vous vous en sentez capable.",
			"Vos TD sont à jour. Vous devriez suivre un nouveau cours.",
			"Voici l'examen final, qui déterminera si vous avez le niveau requis en POO. Vous n'avez qu'une seule chance.",
			"Il y aura ",
			" questions, vous devez répondre par \"vrai\" ou \"faux\".",
			"Correct. Votre score : ",
			"Faux. Votre score : ",
			"Félicitations ! Vous avez gagné le jeu !",
			"Eeeew. Vous avez échoué... ;(",
			"vrai",
			"faux",
			"Vous venez de trouver le livre : Objects First with Java. En le lisant, vous avez appris tout ce que vous deviez savoir sur la POO. Vous n'avez plus besoin d'assister à aucun cours ! Mais vous devez tout de même assister aux TD.",
			"Vous ne pouvez pas encore passer l'examen !",
			"Votre réponse ",
			"Vous aviez trouvé la feuille de triche, vous avez donc sournoisement triché à l'examen. \nVous avez réussi haut la main ! \nVous avez terminé le jeu ! Félicitations ! ",
			"Vous avez trouvé une feuille de triche. C'est la correction de l'examen de POO ! Vous êtes donc sûr de passer l'examen !",
			"Vous n'avez plus d'énergie... VOUS ETES MORT.",
			"Faites attention ! Votre niveau d'énergie est bas !",
			"Organiser les classes",
			"Héritage",
			"Polymorphisme",
			"Abstraction",
			"Interface",
			"Gestion des erreurs",
			"Debugage",
			"Si vous voulez comparer deux chaines de caractères s1 et s2, vous pouvez très bien utiliser : s1 == s2.",
			"Dans : \nclass Goalkeeper extends Player {...}\nC'est Player qui hérite de Goalkeeper.",
			"Dans : \nPlayer player; \nGoalkeeper goal = new Goalkeeper(); \nL'expression player = goal va compiler.",
			"Les classes abstraites ne peuvent pas être instanciées.",
			"Dans une interface, vous devez définir comme \"abstract\" toutes les méthodes." };
	private final static String[] en = {
			"\nWelcome to the World of Zuul!\n"
					+ "World of Zuul is a new, incredibly not boring adventure game.\n"
					+ "Type \"help\" if you need help.\n",
			"Thank you for playing. Good bye.",
			"\nThings you can do : \n"
					+ "movements: north / south / east / west \n"
					+ "actions: quit / help / stats \n"
					+ "objets: coffee / light / babyfoot\n",
			"This leads to nothing !",
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
			"in a lecture class",
			"in the library",
			"You found an OOP book ! You learned a OOP lecture.",
			"You found a tablet. ",
			"You learned a OOP lecture.",
			"You played a game of World of Zuul ! So much fun.",
			"You played a video game. You forgot a lecture, and the corresponding lab.",
			"in the lunch room",
			"in the print room",
			"You are",
			"Exits:",
			"No ! You can't use this here !",
			"The lights are now on.",
			"The lights are now off.",
			"at the secretariat",
			"There are people here, they don't seem to acknowledge you. You should probably leave.",
			"You just played babyfoot. You forgot a lecture, and the corresponding lab. Energy -5.",
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
			"light",
			"This is an OOP lecture",
			"This is an OOP lab.",
			"You follow it. Energy -10",
			"It seems like you have nothing new to learn. You should take the exam, if you're brave enough...",
			"Your labs are up to date. You should attend a new lecture.",
			"Welcome to this quiz, which will determine whether or not you are worthy of this course.",
			"There will be ",
			" questions, you must answer \"true\" or \"false\".",
			"Correct. Your score : ",
			"False. Your score : ",
			"Congratulations !! You won !",
			"Eeewww. Game over ! ;( Try again later!",
			"true",
			"false",
			"You just found the book : Objects First with Java. When reading it, you learned every thing you needed to know ajout POO. You don't need to attend any lecture now. But you must still go to lab classes!",
			"You can't take the exam yet !",
			"Your answer ",
			"You found the cheat sheet, and you used it during the exam. \nYou passed the test. \nYou won the game. Congratulations !",
			"You finds a cheat sheet. It's the correction of the OOP exam ! You should pass the test, you are sure to know all the answers !",
			"You can't move... YOU DIED",
			"Be careful ! You energy level is low :",
			"Designing classes",
			"Inheritance",
			"Polymorphism",
			"Abstraction",
			"Interface",
			"Errors",
			"Debug",
			"If you want to compare two strings s1 and s2, you can use : s1 == s2.",
			"In : \nclass Goalkeeper extends Player {...}\nPlayer inherits Goalkeeper.",
			"In : \nPlayer player; \nGoalkeeper goal = new Goalkeeper(); \nThe expression player = goal compiles.",
			"Abstract classes cannot be instantiated.",
			"In an interface, you must define as \"abstract\" every methods." };
}