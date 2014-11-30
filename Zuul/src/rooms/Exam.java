package rooms;
import player.Player;
import main.Language;
import main.Quiz;

public class Exam extends Room {
    public Exam() {
        super(Language.EXAM_ROOM.toString());
    }	
    
	@Override
	public void action(Player player) {
		if (!cheat(player)) {
			if (player.canTakeTheExam()) {
				new Quiz();
			} else {
				System.out.println("You can't take the exam yet !");
			}
		} else {
			System.out.println(Language.CHEAT);
		}
	}
	
    /**
     * A method checking if you have read or not the sheet cheat.
     * 
     * @param player
     * @return true if the player read the cheat sheet.
     */
    boolean cheat(Player player) {
    	return player.getTheCheatSheet();
    }
}