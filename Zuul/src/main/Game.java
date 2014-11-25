package main;

import rooms.*;
import player.*;
import things.*;

public class Game {
	Room currentRoom;
	public Player player;

	public Game() throws InterruptedException {
		Player player = new Player();
		createRooms();
		System.out.println(currentRoom.getLongDescription());
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
		Room lab1 = new Lab(); // 3 labs
		Room lecture1 = new Lecture(); // 3 salles de classe
		Room library = new Library();
		Room lunchRoom = new LunchRoom();
		Room print = new Print();
		Room secretariat = new Secretariat();
		Room td1 = new Td(); // 3 salles de td
		Room c1 = new Corridor();

		/**
		 * temporairement, on commence au foyer et il y a un couloir au nord, et
		 * le secretariat au nord de ce couloir
		 */
		foyer.setExit("north", c1);

		c1.setExit("south", foyer);
		c1.setExit("north", secretariat);

		currentRoom = foyer;
	}

	public Player getPlayer() {
		return player;
	}

}
