package rooms;

import main.Language;
import things.*;

public class LunchRoom extends Room {
	private Coffee coffee;
	private Babyfoot babyfoot;
	
    public LunchRoom() {
        super(Language.LUNCH_ROOM.toString());
    	coffee = new Coffee();
    	babyfoot = new Babyfoot();
    	listOfThings.add(coffee);   
    	listOfThings.add(babyfoot);
    }	
}