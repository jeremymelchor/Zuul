package rooms;
import player.*;
import main.*;

public class Library extends Room {
	private Randomize random;
	
    public Library() {
        super("at the library");
        random = new Randomize();
    }	
    

    
    @Override
    public void action(Player player) {
    	// first, the book.
    	if (random.creatingTheCheatBook()) {
    		player.addLecture();
    		System.out.println(Language.FIND_BOOK);
    	} 
    	// now, about the tablet.
    	System.out.print(Language.FIND_TABLETTE);
    	if (random.isItAGameOrAnOnlineLecture()) {
    		// it's a online lecture.
    		player.addLecture();
    		System.out.println(Language.LEARN_LECTURE);
    	} else if (random.isItWorldOfZuulGameOnTablet()) {
    		System.out.println(Language.PLAY_WORLD_OF_ZUUL);
    	} else {
    		System.out.println(Language.PLAY_VIDEO_GAME);
    		// here player.forgetOneRandomLecture();
    	}
    }
    
    @Override
    public boolean specialAction(Player player) {
    	return random.isTheLibraryOpen();
    }
}