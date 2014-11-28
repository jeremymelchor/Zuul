package rooms;
import main.Language;
import player.*;

public class Corridor extends Room {
	public Corridor() {
		super(Language.CORRIDOR.toString());
	}

	void printDescription() {
		System.out.println(this.getLongDescription());
		System.out
				.println(Language.AMAZING);
	}
}
