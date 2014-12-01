package main;

import java.util.Scanner;

/**
 * @author Lisa Joanno & Jérémy Melchor
 * 
 *         Parser.java reads what the user write and return it to be use in some
 *         other methods
 */
public class Parser {
	private Scanner reader; // source of command input

	/**
	 * Create a parser to read from the terminal window.
	 */
	public Parser() {
		reader = new Scanner(System.in);
	}

	/**
	 * @return The next command from the user.
	 */
	public String getCommand() {
		String word1 = null;

		System.out.print("> "); // print prompt
		word1 = reader.nextLine();

		return word1;
	}
}
