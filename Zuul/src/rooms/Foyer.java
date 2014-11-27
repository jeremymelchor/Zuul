package rooms;

import things.*;

public class Foyer extends Room {

	private Coffee coffee;
	private Babyfoot babyfoot;
	
    public Foyer() {
        super("at the foyer");
    	coffee = new Coffee();
    	babyfoot = new Babyfoot();
    	listOfThings.add(coffee);
    	listOfThings.add(babyfoot);
    }	


	void printDescription() {
		System.out.println(this.getLongDescription());
		System.out
				.println("Here, you can drink coffe and play babyfoot.");
	}
	
}