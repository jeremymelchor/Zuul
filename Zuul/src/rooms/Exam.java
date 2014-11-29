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
		if (player.canTakeTheExam()) {
			new Quiz();
		} else {
			System.out.println("You can't take the exam yet !");
		}
	}
}