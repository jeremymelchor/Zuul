package rooms;
import main.Language;
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
		System.out.println(Language.MESSY);
	}
}