package rooms;
import main.Language;
import player.*;

public class Secretariat extends Room {
	public Secretariat() {
		super(Language.SECRETARIAT.toString());
	}


	void printDescription() {
		System.out.println(this.getLongDescription());
		System.out
				.println(Language.PEOPLE_HERE);
	}
	
	/**
	 * Here the action is very limited...
	 */
	@Override
	public void action(Player player) {
		System.out.println(Language.PEOPLE_HERE);
	}

}