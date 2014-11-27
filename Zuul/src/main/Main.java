package main;

import player.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    	//Game a = new Game();
    	//a.play();
    	Player a = new Player();
    	a.addLecture();
    	a.addLecture();
    	a.forgetOneRandomLecture();
    	a.printCurrentLecture();
    	a.printCurrentLab();
    	
    }
}
