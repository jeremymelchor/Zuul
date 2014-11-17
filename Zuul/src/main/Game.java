package main;

import rooms.*;

public class Game {
	Room currentRoom;
	
    public Game() throws InterruptedException {
    	waiting();
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
        Room Print = new Print();
        Room secretariat = new Secretariat();
        Room td1 = new Td(); // 3 salles de td
        Room c1 = new Corridor();
        
        foyer.setExit("west",c1);
        
        c1.setExit("north",lecture1);
        c1.setExit("south", secretariat);
        
        currentRoom = foyer;    
    }
}
