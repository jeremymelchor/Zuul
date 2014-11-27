package main;

import java.util.Random;

/**
 * Class regrouping all randomize methods
 * 
 * @author Joanno Lisa & Melchor Jérémy
 */
public class Randomize {
	Random rand;

	/**
	 * Constructor
	 */
	public Randomize() {
		rand = new Random();
	}

	/**
	 * @param rand
	 *            will be the number randomly chosen
	 * @param test
	 *            will be the limit that allows determining it'll be true or
	 *            false
	 * @return true if rand <= test
	 */
	public boolean determineRandomize(int rand, int test) {
		if (rand <= test) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Determine if a room is about OOP, anything else or empty
	 * 
	 * @param rand
	 *            will be the number randomly chosen
	 * @param test
	 *            will be the limit that allows determining it'll about OOP,
	 *            anything else or empty
	 * @return 0 means not OOP, 1 is OOP and 2 is an empty room
	 */
	public int determineRoomRandomize(int rand, int test) {
		if (rand <= test) {
			return 0; // Not OOP
		} else {
			if (rand <= test + 5) {
				return 1; // OOP
			} else {
				return 2; // empty room
			}
		}
	}

	/**
	 * Determine if the library is open or not
	 * 
	 * @return true means library open
	 */
	public boolean isTheLibraryOpen() {
		return determineRandomize(rand.nextInt(11), 5);
	}

	/**
	 * Determine if the player will play or have an online lecture when he takes
	 * the tablet
	 * 
	 * @return true means it's an online lecture
	 */
	public boolean isItAGameOrAnOnlineLecture() {
		return determineRandomize(rand.nextInt(11), 7);
	}

	/**
	 * Determine if the player, when he will take the tablet, will play a basic
	 * video game or World of Zuul game
	 * 
	 * @return true means it's World of Zuul on the tablet
	 */
	public boolean isItWorldOfZuulGameOnTablet() {
		return determineRandomize(rand.nextInt(11), 6);
	}

	/**
	 * Determine if the player will read a lesson or a lab in an on-line lecture
	 * 
	 * @return true means it's a lesson lecture
	 */
	public boolean isItALessonLecture() {
		return determineRandomize(rand.nextInt(11), 6);
	}

	/**
	 * Determine if a lecture is an OOP lecture or another
	 * 
	 * @return 0 means not OOP, 1 is OOP and 2 is an empty room
	 */
	public int isItAnOOPLecture() {
		return determineRoomRandomize(rand.nextInt(16), 5);
	}

	/**
	 * Determine if a lab is an OOP lab or another
	 * 
	 * @return 0 means not OOP, 1 is OOP and 2 is an empty room
	 */
	public int isItAnOOPLab() {
		return determineRoomRandomize(rand.nextInt(16), 5);
	}

	/**
	 * Determine if an exam is an OOP exam
	 * 
	 * @return 0 means not OOP, 1 is OOP and 2 is an empty room
	 */
	public int isItAnOOPExam() {
		return determineRoomRandomize(rand.nextInt(16), 5);
	}

	/**
	 * Determine if the player will play BabyFoot when he enters the lunchroom
	 * 
	 * @return true means he will play BabyFoot
	 */
	public boolean willHePlayBabyfoot() {
		return determineRandomize(rand.nextInt(11), 7);
	}

	/**
	 * Determine if the player would find a lab item
	 * 
	 * @return true means he found a lab item
	 */
	public boolean creatingLabItem() {
		return determineRandomize(rand.nextInt(11), 8);
	}

	/**
	 * Determine if the player would find a lecture item
	 * 
	 * @return true means he found a lecture item
	 */
	public boolean creatingLectureItem() {
		return determineRandomize(rand.nextInt(11), 8);
	}

	/**
	 * Determine if the player would find the book in the library
	 * 
	 * @return true means he found the book
	 */
	public boolean creatingTheCheatBook() {
		return determineRandomize(rand.nextInt(11), 9);
	}

	/**
	 * Determine it the player would find the cheat sheet in the printer
	 * 
	 * @return true means he found the cheat sheet
	 */
	public boolean creatingTheCheatSheet() {
		return determineRandomize(rand.nextInt(11), 9);
	}

}
