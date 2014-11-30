package rooms;
import player.*;
import main.*;

public class Library extends Room {
	private Randomize random;
	
    public Library() {
        super(Language.IN_THE_LIBRARY.toString());
        random = new Randomize();
    }	
    

    /**
     * in the library you can :
     * 1. find the book Objects first with Java, making you instantly know every lectures.
     * 2. find a tablet in which you will either player a video game, or see an on-line course.
     */
    @Override
    public void action(Player player) {
    	// first, the book.
    	if (random.creatingTheCheatBook()) {
    		player.addAllLecture();
    		System.out
    				.println(Language.POO_BOOK);
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
    		player.forgetOneRandomLecture();
    	}
    }
    
    
    /**
     * A method checking if the library is open (because if it's not, you can't enter the room...)
     */
    @Override
    public boolean specialAction(Player player) {
    	return random.isTheLibraryOpen();
    }
}