package rooms;
import main.Language;
import player.*;

public class UselessRoom extends Room {
    public UselessRoom() {
        super(Language.USELESS_ROOM.toString());
    }	
    
	/**
	 * Here the action is very limited...
	 */
	@Override
	public void action(Player player) {
		System.out.println(Language.EMPTY_ROOM);
	}
}