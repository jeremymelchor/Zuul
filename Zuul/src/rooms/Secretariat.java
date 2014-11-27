package rooms;
import player.*;

public class Secretariat extends Room {
	public Secretariat() {
		super("at the secretariat");
	}


	void printDescription() {
		System.out.println(this.getLongDescription());
		System.out
				.println("There are people here, they don't seem to acknoledge you. You should probably leave.");
	}

}