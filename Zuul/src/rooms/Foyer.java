package rooms;
import main.Language;
import player.*;
import things.*;

public class Foyer extends Room {

	private Coffee coffee;
	
    public Foyer() {
        super(Language.FOYER.toString());
    	coffee = new Coffee();
    	listOfThings.add(coffee);
    }	


	void printDescription() {
		System.out.println(this.getLongDescription());
		System.out
				.println(Language.DRINK_COFFE);
	}
	
	@Override
	public void action(Player player) {
		/** Nothing */
	}
}