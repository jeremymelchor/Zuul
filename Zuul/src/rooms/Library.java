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
    		System.out.println("You found an OOP book ! You learned a OOP lecture.");
    	} 
    	// now, about the tablet.
    	System.out.print("You found a tablet. ");
    	if (random.isItAGameOrAnOnlineLecture()) {
    		// it's a online lecture.
    		player.addLecture();
    		System.out.println("You learned a OOP lecture.");
    	} else if (random.isItWorldOfZuulGameOnTablet()) {
    		System.out.println("You played a game of World of Zuul ! So much fun.");
    	} else {
    		System.out.println("You played a video game. You forgot one lecture.");
    		// here player.forgetOneRandomLecture();
    	}
    }
    
    @Override
    public boolean isLibraryOpen() {
    	return random.isTheLibraryOpen();
    }
}