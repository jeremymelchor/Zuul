package main;

import rooms.*;
import player.*;
import things.*;

public class Game {
	Room currentRoom;
    public Player player;
    private Parser parser;
	
    public Game() throws InterruptedException {
    	Player player = new Player();
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
        Room lab1 = new Lab(); // 3 labs
        Room lecture1 = new Lecture(); // 3 salles de classe
        Room library = new Library();
        Room lunchRoom = new LunchRoom();
        Room print = new Print();
        Room secretariat = new Secretariat();
        Room td1 = new Td(); // 3 salles de td
        Room c1 = new Corridor();
        
        foyer.setExit("north",c1);
        
        c1.setExit("south",foyer);
        c1.setExit("north", secretariat);
        
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
        printWelcome();

        // Enter the main command loop. Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (!finished) {
			String command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome() {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type \"help\" if you need help.");
        System.out.println();
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
        
        default:
        	System.out.println("I don't know what you mean...");
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
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    /**
     * Try to go in one direction. If there is an exit, enter the new room,
     * otherwise print an error message.
     */
    private void goRoom(String command) {
        String direction = command;

         //Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no door!");
        } else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
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
}
