package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class Quiz - a quiz to know if you master POO enough.
 * 
 * The quiz is a list of questions in shape of a QCM (2 possible answers per question).
 * There are 2 questions, and if you can score a 1/2, you passed the test.
 * 
 * Be very careful when you write the answers. You can write any number of questions, but you have to write a equal number
 * of choices for every question. Oh, and try to be sure that the true answer is really the one you want.
 * 
 */
public class Quiz {
    private ArrayList<String> questions = new ArrayList<String>();
    /* One answer looks like : {choice1, choice2, trueAnswer}, all strings 
     * So the whole list looks like : 
     *    {{choice1,choice2,trueAnswer}, {choice1,choice2,trueAnswer}, ..... }
     * */
    private ArrayList<ArrayList<String>> reponses = new ArrayList<ArrayList<String>>();
    private int score;
	private Scanner sc = new Scanner(System.in);  
	private int numberOfQuestions;
	private int numberOfChoices;

	/**
	 * Prints and controls the quiz.
	 * Prints the questions and the answers, scan the result given by the user, check it, and prints the score.
	 */
    public Quiz() {
    	initialization();    	
    	printIntroduction();
    	// every questions
    	for (int i=1; i<=numberOfQuestions; i++) {
            printQuestion(i); 
            System.out.print("Your answer : ");
            String answer = sc.nextLine();
            checkAnswer(i,answer);
        }
    	endOfGame();
    }
	
	/**
	 * Creates the questions and answers.
	 */
    public void initialization() {    
    	// QUESTION 1
        questions.add("que vaut 1+2 ?");
        ArrayList<String> reponse1 = new ArrayList<String>();
        reponse1.add("a) 2");
        reponse1.add("b) 90");   
        reponse1.add("c) 3");    
        reponse1.add("d) 76"); 
        reponse1.add("c");   
        reponses.add(reponse1);
        // QUESTION 2
        questions.add("que vaut 2+2 ?");          
        ArrayList<String> reponse2 = new ArrayList<String>();
        reponse2.add("a) 42");
        reponse2.add("b) 3"); 
        reponse2.add("c) 45");    
        reponse2.add("d) 4");  
        reponse2.add("d");
        reponses.add(reponse2);        
        // QUESTION 3
        questions.add("que vaut 3+2 ?");          
        ArrayList<String> reponse3 = new ArrayList<String>();
        reponse3.add("a) 4");
        reponse3.add("b) 5"); 
        reponse3.add("c) 50");    
        reponse3.add("d) 3");  
        reponse3.add("b");
        reponses.add(reponse3); 
        
        numberOfQuestions = questions.size(); // if there are 2 questions, numberOfQuestions = 2
        reponses.size(); 
        numberOfChoices = reponses.get(0).size()-1; // because the last String is the true answer
    }
    
    /**
     * Print a message of introduction to the quiz.
     */
    void printIntroduction() {
        System.out.println("Welcome to this quiz, which will determine whether or not you are worthy of this course.");
        System.out.println("There will be "+ numberOfQuestions +" questions, "+numberOfChoices+" choices of answers. Choose one of them by writing the letter.");
    }
    
    /**
     * Print a question and its choices of answers.
     * 
     * @param numQuestion
     *           The number of the question we need to write (and the answers).
     */
    void printQuestion(int numQuestion) {
        System.out.print("Question n°"+numQuestion+" : ");    	
        numQuestion--; /* ArrayList starts with index 0 */
        System.out.println(questions.get(numQuestion));
        for (int i=0; i<numberOfChoices; i++) {
            System.out.println(reponses.get(numQuestion).get(i));
        }
    }
    
    /**
     * Check if the answer of a question is true or false.
     * Incrementes the score if the answer is true.
     * 
     * @param numQuestion
     *         The number of the question we will check.
     * @param rep
     *         The answer given by the user.
     */
    void checkAnswer(int numQuestion, String rep) {
    	if ((reponses.get(--numQuestion).get(numberOfChoices)).equals(rep)) {   // the final element in each list is the answer 		
            System.out.println("Correct. Your score : " + (++score) +"/"+ (++numQuestion));
    	} else {
            System.out.println("False. Your score : " + score +"/"+ (++numQuestion));    		
    	}
    }
    
    /**
     * Check the score and print the result.
     */
    void endOfGame() {
        if (score > numberOfQuestions/2) {
            printCongratulations();
        } else {
            printGameOver();
        }
    }
    
	void printCongratulations() {
	    System.out.println("Congratulations !! You won !");
	}
	
	void printGameOver() {
	    System.out.println("Eeewww. Game over ! ;( Try again later!");	    
	}	
}
