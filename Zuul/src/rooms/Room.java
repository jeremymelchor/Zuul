package rooms;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;

import player.Player;
import things.Thing;

/**
 * Class Room - a room in an adventure game.
 * 
 * This class is part of the "World of Zuul" application. "World of Zuul" is a
 * very simple, text based adventure game.
 * 
 * A "Room" represents one location in the scenery of the game. It is connected
 * to other rooms via exits. For each existing exit, the room stores a reference
 * to the neighboring room.
 */

public class Room {
	private String description;  // a description of the room	
	private boolean light; // representing if lights are on or off.
	private HashMap<String, Room> exits; // all the exits
	protected ArrayList<Thing> listOfThings ;  // a list of things you can possibly use in this room.
	
	/**
	 * Create a room described "description". Initially, it has no exits.
	 * "description" is something like "a kitchen" or "an open court yard".
	 * 
	 * @param description
	 *            The room's description.
	 */
	public Room(String description) {
		this.description = description;
		exits = new HashMap<>(); 
    	listOfThings = new ArrayList<Thing>();
    	light = false; 
	}

	/**
	 * Define an exit from this room.
	 * 
	 * @param direction
	 *            The direction of the exit.
	 * @param neighbor
	 *            The room to which the exit leads.
	 */
	public void setExit(String direction, Room neighbor) {
		exits.put(direction, neighbor);
	}

	/**
	 * @return The short description of the room (the one that was defined in
	 *         the constructor).
	 */
	public String getShortDescription() {
		return description;
	}

	/**
	 * Return a description of the room in the form: You are in the kitchen.
	 * Exits: north west
	 * 
	 * @return A long description of this room
	 */
	public String getLongDescription() {
		return "You are " + description + ".\n" + getExitString();
	}

	/**
	 * Return a string describing the room's exits, for example
	 * "Exits: north west".
	 * 
	 * @return Details of the room's exits.
	 */
	private String getExitString() {
		String returnString = "Exits:";
		Set<String> keys = exits.keySet();
		for (String exit : keys) {
			returnString += " " + exit;
		}
		return returnString;
	}

	/**
	 * Return the room that is reached if we go from this room in direction
	 * "direction". If there is no room in that direction, return null.
	 * 
	 * @param direction
	 *            The exit's direction.
	 * @return The room in the given direction.
	 */
	public Room getExit(String direction) {
		return exits.get(direction);
	}

	/**
	 * A method doing what the player wants to do, if it's possible.
	 * It uses the method use(..) defined in the class Thing.
	 */
	public void use(Thing whatToUse, Player player) {
        if (isItUsable(whatToUse)) {
            whatToUse.use(player);
        } else {
        	System.out.println("No ! You can't use this here !");
        }
	}
	
	/**
	 * A method checking if an object is possible to be used in the room.
	 * @param whatToUse, the object we want to check.
	 * @return if it's possible or not.
	 */
    boolean isItUsable(Thing whatToUse) {
	    // check if you can use this thing
		for (Thing thing : listOfThings) { 
			String name = thing.getDescription();
			if (whatToUse.getDescription().equals(name)) {				
				return true;
			}
		}
		return false;
	}
    
    /**
     * A method switching on or off the lights.
     */
    public void switchLight() {
    	light = !light;
    	if (light) {
    		System.out.println("The lights are now on.");
    	} else {
    		System.out.println("The lights are now off.");
		}
	}
}
