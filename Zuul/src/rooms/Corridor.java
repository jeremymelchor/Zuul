package rooms;

public class Corridor extends Room {
	public Corridor() {
		super("in a corridor");
	}

	void printDescription() {
		System.out.println(this.getLongDescription());
		System.out
				.println("This corridor is amazing ! But there's nothing for you here !");
	}
}
