package rooms;
import player.*;

public class Ali extends Room {
	public Ali() {
		super("Ali's office");
	}
	
	/**
	 * Here the action is very limited...
	 */
	@Override
	public void action(Player player) {
		System.out.println("Wow ! It's messy here ! You better get out of here !");
	}
}