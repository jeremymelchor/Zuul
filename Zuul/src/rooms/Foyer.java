package rooms;
import player.*;

import things.*;

public class Foyer extends Room {

	private Coffee coffee;
	
    public Foyer() {
        super("at the foyer");
    	coffee = new Coffee();
    	listOfThings.add(coffee);
    }	


	void printDescription() {
		System.out.println(this.getLongDescription());
		System.out
				.println("Here, you can drink coffe.");
	}
	
	@Override
	public void action(Player player) {
		/** Nothing */
	}
}