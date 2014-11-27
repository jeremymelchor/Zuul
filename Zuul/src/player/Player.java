package player;

import java.util.ArrayList;

public class Player {
	/**
	 * The player starts with 100 points of energy. Every actions will change
	 * this level (drinking coffee, attending lectures...).
	 */
	public int lvlEnergy = 100;
	private ArrayList<String> completeList = new ArrayList<String>();
	private ArrayList<String> listLecture = new ArrayList<String>();
	private ArrayList<String> listLab = new ArrayList<String>();

	public Player() {
		initialize();
	}

	/**
	 * A method used to know the player's current level of energy.
	 * 
	 * @return the level of energy.
	 */
	public int getLvlEnergy() {
		return lvlEnergy;
	}

	/**
	 * A method lowering the level of energy. The lowest possible level is 0.
	 * 
	 * @param difference
	 *            , in fact how many "points of energy" is lost.
	 */
	public void lowEnergy(int difference) {
		if (lvlEnergy - difference >= 0) {
			lvlEnergy -= difference;
		}
	}

	/**
	 * A method raising the level of energy. The highest possible level is 100.
	 * 
	 * @param difference
	 *            , in fact how many "points of energy" is gained.
	 */
	public void raiseEnergy(int difference) {
		if (lvlEnergy + difference <= 100) {
			lvlEnergy += difference;
		}
	}

	/**
	 * A method initializing the list of theme the player can learn. Must be
	 * filled by the user of the application.
	 */
	void initialize() {
		String[] tab = { "POO 1", "POO 2", "POO 3", "POO 4", "POO 5", "POO 6", "POO 7", "POO 8", "POO 9", "POO 10" };
		for (String el : tab) {
			completeList.add(el);
		}
	}

	/**
	 * A method adding a lecture. Used when the player follows a lecture.
	 */
	void addLecture() {
		int element = listLecture.size();
		listLecture.add(completeList.get(element));
	}

	/**
	 * A method removing the last lecture. Used if the player forgets a lecture,
	 * when spending too much time on video game...
	 */
	void removeLecture() {
		listLecture.remove(listLecture.size() - 1);
	}

	
	
	public String whatLectureToAttend() {
		for (String el : completeList) {

		}
		return null;
	}
	
	
	/**
	 * A method printing every possible lecture.
	 */
	public void printAllPossibleLecture() {
		for (String el : completeList) {
			System.out.println(el);
		}
	}

	/**
	 * A method printing which lecture the player learned so far.
	 */
	public void printCurrentLecture() {
		System.out.println("Your lectures : ");
		for (String el : listLecture) {
			System.out.println(el);
		}
	}

	/**
	 * A method printing which lab the player learned so far.
	 */
	public void printCurrentLab() {
		System.out.println("Your labs : ");
		for (String el : listLab) {
			System.out.println(el);
		}
	}

	/**
	 * A method printing the energy level.
	 */
	public void printEnergy() {
		System.out.println("Your current level of energy : " + lvlEnergy);
	}
	
	/**
	 * A method printing all your stats. (energy, lectures and labs)
	 */
	public void printAllStats() {
		System.out.println("Here are your stats : ");
		printEnergy();
		printCurrentLecture();
		printCurrentLab();
	}
}
