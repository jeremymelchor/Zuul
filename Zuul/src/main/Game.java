package main;

import rooms.*;
import player.*;
import things.*;

/**
 * @author Lisa Joanno & Jérémy Melchor
 * 
 *         Game.java allows to make the game works
 */
public class Game {
	Room currentRoom;
	public Player player;
	private Parser parser;

	public Game() throws InterruptedException {
		parser = new Parser();
		whatLanguage();
		player = new Player();
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
		c1.setExit(Language.NORTH_WORD.toString(), c2);
		c1.setExit(Language.SOUTH_WORD.toString(), foyer);
		c1.setExit(Language.EAST_WORD.toString(), lecture1);
		c1.setExit(Language.WEST_WORD.toString(), secretariat);
		c2.setExit(Language.NORTH_WORD.toString(), c3);
		c2.setExit(Language.SOUTH_WORD.toString(), c1);
		c2.setExit(Language.EAST_WORD.toString(), lecture2);
		c2.setExit(Language.WEST_WORD.toString(), u1);
		c3.setExit(Language.NORTH_WORD.toString(), c6);
		c3.setExit(Language.SOUTH_WORD.toString(), c2);
		c3.setExit(Language.EAST_WORD.toString(), lecture3);
		c3.setExit(Language.WEST_WORD.toString(), c4);
		c4.setExit(Language.EAST_WORD.toString(), c3);
		c4.setExit(Language.WEST_WORD.toString(), c5);
		c5.setExit(Language.SOUTH_WORD.toString(), exam);
		c5.setExit(Language.EAST_WORD.toString(), c4);
		c6.setExit(Language.NORTH_WORD.toString(), c7);
		c6.setExit(Language.SOUTH_WORD.toString(), c3);
		c6.setExit(Language.EAST_WORD.toString(), lab1);
		c7.setExit(Language.NORTH_WORD.toString(), c8);
		c7.setExit(Language.SOUTH_WORD.toString(), c6);
		c7.setExit(Language.EAST_WORD.toString(), lab2);
		c8.setExit(Language.NORTH_WORD.toString(), c9);
		c8.setExit(Language.SOUTH_WORD.toString(), c7);
		c8.setExit(Language.EAST_WORD.toString(), lab3);
		c9.setExit(Language.NORTH_WORD.toString(), c10);
		c9.setExit(Language.SOUTH_WORD.toString(), c8);
		c9.setExit(Language.EAST_WORD.toString(), c11);
		c9.setExit(Language.WEST_WORD.toString(), lunchRoom);
		c10.setExit(Language.NORTH_WORD.toString(), library);
		c10.setExit(Language.SOUTH_WORD.toString(), c9);
		c11.setExit(Language.EAST_WORD.toString(), c12);
		c11.setExit(Language.WEST_WORD.toString(), c9);
		c12.setExit(Language.NORTH_WORD.toString(), ali);
		c12.setExit(Language.SOUTH_WORD.toString(), print);
		c12.setExit(Language.EAST_WORD.toString(), u2);
		c12.setExit(Language.WEST_WORD.toString(), c11);
		lecture1.setExit(Language.WEST_WORD.toString(), c1);
		lecture2.setExit(Language.WEST_WORD.toString(), c2);
		lecture3.setExit(Language.WEST_WORD.toString(), c3);
		lab1.setExit(Language.WEST_WORD.toString(), c6);
		lab2.setExit(Language.WEST_WORD.toString(), c7);
		lab3.setExit(Language.WEST_WORD.toString(), c8);
		secretariat.setExit(Language.EAST_WORD.toString(), c1);
		exam.setExit(Language.NORTH_WORD.toString(), c5);
		u1.setExit(Language.EAST_WORD.toString(), c2);
		u2.setExit(Language.WEST_WORD.toString(), c12);
		lunchRoom.setExit(Language.EAST_WORD.toString(), c9);
		library.setExit(Language.SOUTH_WORD.toString(), c10);
		print.setExit(Language.NORTH_WORD.toString(), c12);
		foyer.setExit(Language.NORTH_WORD.toString(), c1);
		ali.setExit(Language.SOUTH_WORD.toString(), c12);
		currentRoom = foyer;
	}

	/**
	 * A method returning the player.
	 * 
	 * @return this.player.
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Main play routine. Loops until end of play.
	 */
	public void play() {
		createRooms();
		printWelcome();
		// Enter the main command loop. Here we repeatedly read commands and
		// execute them until the game is over.
		boolean finished = false;
		while (!finished) {
			this.player.verficationEnergy();
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
		if (command.equals(Language.HELP_WORD.toString()))
			System.out.println(Language.HELP);
		else if (command.equals(Language.QUIT_WORD.toString()))
			quit(command);
		else if (command.equals(Language.COFFEE_WORD.toString()))
			currentRoom.use(new Coffee(), player);
		else if (command.equals(Language.LIGHTS_WORD.toString()))
			currentRoom.switchLight();
		else if (command.equals("babyfoot"))
			currentRoom.use(new Babyfoot(), player);
		else if (command.equals("stats"))
			printStats();
		else
			goRoom(command);
		return wantToQuit;
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
			if (nextRoom.getShortDescription().equals(
					Language.IN_THE_LIBRARY.toString())
					&& !(nextRoom.specialAction(player))) {
				System.out.println(Language.LIBRARY_CLOSED);
			} else if (nextRoom.getShortDescription().equals(
					Language.IN_A_LECTURE.toString())
					|| nextRoom.getShortDescription().equals(
							Language.IN_A_LAB.toString())) {
				System.out.println(nextRoom.getLongDescription());
				boolean choice = nextRoom.specialAction(player);
				if (choice) {
					currentRoom = nextRoom;
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

	/**
	 * A method asking the user the game's language
	 */
	public void whatLanguage() {
		System.out.println("Language ? EN / FR");
		String lang = parser.getCommand();
		Language.setLanguage(lang);
	}
}