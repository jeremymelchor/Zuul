package main;

import rooms.*;
import player.*;
import things.*;

public class Game {
	Room currentRoom;
	public Player player;
	private Parser parser;

	public Game() throws InterruptedException {
		player = new Player();
		parser = new Parser();
	}

	/**
	 * A method which will be used when the user is following a lecture, a lab,
	 * reading a book, etc... It "passes the time".
	 *
	 * @throws InterruptedException
	 */
	public void waiting() throws InterruptedException {
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(1000);
	}

	/**
	 * A method creating every rooms in the game. Will be launch once in a game.
	 */
	private void createRooms() {
		Room ali = new Ali();
		Room exam = new Exam();
		Room foyer = new Foyer();
		Room lab1 = new Lab();
		Room lab2 = new Lab();
		Room lab3 = new Lab();
		Room lecture1 = new Lecture();
		Room lecture2 = new Lecture();
		Room lecture3 = new Lecture();
		Room library = new Library();
		Room lunchRoom = new LunchRoom();
		Room print = new Print();
		Room secretariat = new Secretariat();
		Room c1 = new Corridor();
		Room c2 = new Corridor();
		Room c3 = new Corridor();
		Room c4 = new Corridor();
		Room c5 = new Corridor();
		Room c6 = new Corridor();
		Room c7 = new Corridor();
		Room c8 = new Corridor();
		Room c9 = new Corridor();
		Room c10 = new Corridor();
		Room c11 = new Corridor();
		Room c12 = new Corridor();
		Room u1 = new UselessRoom();
		Room u2 = new UselessRoom();
		
		c1.setExit("north", c2);
		c1.setExit("south", foyer);
		c1.setExit("east", lecture1);
		c1.setExit("west", secretariat);
		
		c2.setExit("north", c3);
		c2.setExit("south", c1);
		c2.setExit("east", lecture2);
		c2.setExit("west", u1);
		
		c3.setExit("north", c6);
		c3.setExit("south", c2);
		c3.setExit("east", lecture3);
		c3.setExit("west", c4);
		
		c4.setExit("east", c3);
		c4.setExit("west", c5);
		
		c5.setExit("south", exam);
		c5.setExit("east", c4);
		
		c6.setExit("north", c7);
		c6.setExit("south", c3);
		c6.setExit("east", lab1);
		
		c7.setExit("north", c8);
		c7.setExit("south", c6);
		c7.setExit("east", lab2);
		
		c8.setExit("north", c9);
		c8.setExit("south", c7);
		c8.setExit("east", lab3);
		
		c9.setExit("north", c10);
		c9.setExit("south", c8);
		c9.setExit("east", c11);
		c9.setExit("west", lunchRoom);
		
		c10.setExit("north", library);
		c10.setExit("south", c9);
		
		c11.setExit("east", c12);
		c11.setExit("west", c9);
		
		c12.setExit("north", ali);
		c12.setExit("south", print);
		c12.setExit("east", u2);
		c12.setExit("west", c11);
		
		lecture1.setExit("west",c1);
		lecture2.setExit("west",c2);
		lecture3.setExit("west",c3);
		lab1.setExit("west",c6);
		lab2.setExit("west",c7);
		lab3.setExit("west",c8);
		secretariat.setExit("east",c1);
		exam.setExit("north",c5);
		u1.setExit("east",c2);
		u2.setExit("west",c12);
		lunchRoom.setExit("east",c9);
		library.setExit("south",c10);
		print.setExit("north",c12);
		foyer.setExit("north", c1);
		ali.setExit("south",c12);
		currentRoom = foyer;
	}

	public Player getPlayer() {
		return player;
	}

	/**
	 * Main play routine. Loops until end of play.
	 */
	public void play() {
		createRooms();
		whatLanguage();
		printWelcome();
		// Enter the main command loop. Here we repeatedly read commands and
		// execute them until the game is over.
		boolean finished = false;
		while (!finished) {
			String command = parser.getCommand();
			finished = processCommand(command);
		}
		System.out.println(Language.EXIT);
	}

	/**
	 * Print out the opening message for the player.
	 */
	private void printWelcome() {
		System.out.println(Language.HELLO);
		System.out.println(currentRoom.getLongDescription());
	}

	/**
	 * Given a command, process (that is: execute) the command.
	 *
	 * @param command
	 *            The command to be processed.
	 * @return true If the command ends the game, false otherwise.
	 */
	private boolean processCommand(String command) {
		boolean wantToQuit = false;
		switch (command) {
		case "help":
			printHelp();
			break;
		case "east":
			goRoom(command);
			break;
		case "west":
			goRoom(command);
			break;
		case "north":
			goRoom(command);
			break;
		case "south":
			goRoom(command);
			break;
		case "quit":
			wantToQuit = quit(command);
			break;
		case "stats":
			printStats();
			break;
		case "coffee":
			currentRoom.use(new Coffee(), player);
			break;
		case "lights":
			currentRoom.switchLight();
			break;
		case "babyfoot":
			currentRoom.use(new Babyfoot(), player);
			break;
		default:
			System.out.println(Language.DUNNO);
			break;
		}
		return wantToQuit;
	}

	// implementations of user commands:
	/**
	 * Print out some help information. Here we print some stupid, cryptic
	 * message and a list of the command words.
	 */
	private void printHelp() {
		System.out.println(Language.HELP);
		parser.showCommands();
	}

	/**
	 * Try to go in one direction. If there is an exit, enter the new room,
	 * otherwise print an error message.
	 */
	private void goRoom(String command) {
		String direction = command;
		// Try to leave current room.
		Room nextRoom = currentRoom.getExit(direction);
		if (nextRoom == null) {
			System.out.println(Language.NODOOR);
		} else {
			// if we want to enter the library, we need to check it's open
			if (nextRoom.getShortDescription().equals("at the library") && !(nextRoom.specialAction(player))) { 
			    System.out.println(Language.LIBRARY_CLOSED);
			} else if (nextRoom.getShortDescription().equals(Language.LECTURE) || nextRoom.getShortDescription().equals(Language.LAB)) {
				boolean choice = nextRoom.specialAction(player);
				if (choice) {
					currentRoom = nextRoom;
					System.out.println(currentRoom.getLongDescription());					
					currentRoom.action(player);
				}
			} else {
				currentRoom = nextRoom;
				System.out.println(currentRoom.getLongDescription());				
				currentRoom.action(player);
			}
		}
	}

	/**
	 * "Quit" was entered. Check the rest of the command to see whether we
	 * really quit the game.
	 *
	 * @return true, if this command quits the game, false otherwise.
	 */
	private boolean quit(String command) {
		return true; // signal that we want to quit
	}

	/**
	 * A method printing all the player's stats in case he wants to know his
	 * energy level, his current lectures and current labs.
	 */
	private void printStats() {
		player.printAllStats();
	}
	
	private void whatLanguage() {
		System.out.println("Language ? EN / FR");
		String lang = parser.getCommand();
		Language.setLanguage(lang);
	}
}
