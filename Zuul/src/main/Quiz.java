package main;

import java.util.ArrayList;

/**
 * @author Lisa Joanno & Jérémy Melchor
 * 
 *         Class Quiz - a quiz to know if you master POO enough.
 * 
 *         The quiz is a list of questions in shape of a QCM (2 possible answers
 *         per question). There are 2 questions, and if you can score a 1/2, you
 *         passed the test.
 * 
 *         Be very careful when you write the answers. You can write any number
 *         of questions, but you have to write a equal number of choices for
 *         every question. Oh, and try to be sure that the true answer is really
 *         the one you want.
 * 
 */
public class Quiz {
	private ArrayList<String> questions = new ArrayList<String>();
	private ArrayList<String> reponses = new ArrayList<String>();
	private int score;
	private Parser parser;
	private int numberOfQuestions;

	/**
	 * Prints and controls the quiz. Prints the questions and the answers, scan
	 * the result given by the user, check it, and prints the score.
	 */
	public Quiz() {
		parser = new Parser();
		score = 0;
		initialization();
		printIntroduction();
		// every questions
		for (int i = 1; i <= numberOfQuestions; i++) {
			printQuestion(i);
			System.out.print(Language.YOUR_ANSWER);
			String answer = parser.getCommand();
			checkAnswer(i, answer);
		}
		endOfGame();
	}

	/**
	 * Creates the questions and answers.
	 */
	public void initialization() {
		// QUESTION 1
		questions.add(Language.QUESTION_1.toString());
		reponses.add(Language.FALSE_WORD.toString());
		// QUESTION 2
		questions.add(Language.QUESTION_2.toString());
		reponses.add(Language.FALSE_WORD.toString());
		// QUESTION 3
		questions.add(Language.QUESTION_3.toString());
		reponses.add(Language.TRUE_WORD.toString());
		// QUESTION 4
		questions.add(Language.QUESTION_4.toString());
		reponses.add(Language.TRUE_WORD.toString());
		// QUESTION 5
		questions.add(Language.QUESTION_5.toString());
		reponses.add(Language.FALSE_WORD.toString());

		numberOfQuestions = questions.size(); // if there are 2 questions,
												// numberOfQuestions = 2
	}

	/**
	 * Print a message of introduction to the quiz.
	 */
	void printIntroduction() {
		System.out.println(Language.WELCOME_QUIZ);
		System.out.print(Language.THERE_WILL_BE);
		System.out.print(numberOfQuestions);
		System.out.println(Language.MUST_ANSWER);
	}

	/**
	 * Print a question and its choices of answers.
	 * 
	 * @param numQuestion
	 *            The number of the question we need to write (and the answers).
	 */
	void printQuestion(int numQuestion) {
		System.out.print("\nQuestion " + numQuestion + " : ");
		numQuestion--; /* ArrayList starts with index 0 */
		System.out.println(questions.get(numQuestion));
	}

	/**
	 * Check if the answer of a question is true or false. Increments the score
	 * if the answer is true.
	 * 
	 * @param numQuestion
	 *            The number of the question we will check.
	 * @param rep
	 *            The answer given by the user.
	 */
	void checkAnswer(int numQuestion, String rep) {
		if (reponses.get(--numQuestion).equals(rep)) { // the final element in
														// each list is the
														// answer
			System.out.print(Language.CORRECT_ANSWER);
			System.out.println((++score) + "/" + (++numQuestion));
		} else {
			System.out.print(Language.FALSE_ANSWER);
			System.out.println(score + "/" + (++numQuestion));
		}
	}

	/**
	 * Check the score and print the result.
	 */
	void endOfGame() {
		if (score > numberOfQuestions / 2) {
			printCongratulations();
		} else {
			printGameOver();
		}
		System.exit(0);
	}

	/**
	 * A method printing congratulations, because the player won the game.
	 */
	void printCongratulations() {
		System.out.println(Language.CONGRATULATIONS);
	}

	/**
	 * A method printing a message like "game over" because he failed the test.
	 */
	void printGameOver() {
		System.out.println(Language.GAME_OVER);
	}
}
