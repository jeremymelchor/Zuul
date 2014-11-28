package rooms;
import player.*;

public class UselessRoom extends Room {
    public UselessRoom() {
        super("in a useless room");
    }	
    
	/**
	 * Here the action is very limited...
	 */
	@Override
	public void action(Player player) {
		System.out.println("There is nothing in this room.");
	}
}