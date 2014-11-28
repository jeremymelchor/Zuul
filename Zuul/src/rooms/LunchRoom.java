package rooms;
import player.*;

import things.*;

public class LunchRoom extends Room {
	private Coffee coffee;
	private Babyfoot babyfoot;
	
    public LunchRoom() {
        super("in the lunch room");
    	coffee = new Coffee();
    	babyfoot = new Babyfoot();
    	listOfThings.add(coffee);   
    	listOfThings.add(babyfoot);
    }	
}