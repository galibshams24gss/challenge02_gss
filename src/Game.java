import java.io.*;
import java.util.*;

public class Game {
	public static void main(String[] args) {
			Scanner kb = new Scanner(System.in);
			Random randomGenerator = new Random();
	        int playerAttempts = 100; //number of attempts by player
	        int playerAchievements = 0; //number of achievements of player initially

	        System.out.println(" << Welcome to Monty Hall Problem Game Show >> " + "\n");
	        System.out.print("STAY With Your Door Choice? [y/n]");
	        char playerDecision = kb.nextLine().toLowerCase().charAt(0);
	        if(playerDecision == 'y'){ //player wants to stay with his/her decision
	        	System.out.println("\n" + "Player wants to STAY with his/her Decision.");
	        	for (int i = 1; i <= playerAttempts; i++) {
	            int carDoor = randomGenerator.nextInt(3);
	            int chosenDoor = randomGenerator.nextInt(3);
	            if(chosenDoor == carDoor){
	            	playerAchievements++; //achievements increase           
	            }
	        }
	        System.out.println("\n" + " << STAYING results >> ");
	        System.out.println("Player's Achievements are: " + playerAchievements + " out of: " + playerAttempts); //achievements out of attempts
	        System.out.println("Player's Percentage of Victory is: "+ (float)playerAchievements/playerAttempts*100 +" %"); //victory percentage in decimal
	      }else{ //player wants to switch his/her decision
	    	  System.out.println("\n" + "Player wants to SWITCH his/her Decision.");
	    	  for (int i = 1; i <= playerAttempts; i++) {
	          int carDoor = randomGenerator.nextInt(3);
	          int chosenDoor = randomGenerator.nextInt(3);
	          int goatDoor = carDoor; //put carDoor value into goatDoor
	          while(goatDoor == carDoor || goatDoor == chosenDoor){
	        	  goatDoor = randomGenerator.nextInt(3);
	          }
	          int switchedDoor = 3-chosenDoor-goatDoor; //number of doors is 3
	          if(switchedDoor == carDoor){ //switching happens
	        	  playerAchievements++; //achievements increase
	          	}          
	    	  }
	    	  System.out.println("\n" + " << SWITCHING results >> ");
	          System.out.println("Player's Achievements are: " + playerAchievements + " out of: " + playerAttempts);
	          System.out.println("Player's Percentage of Victory is: "+ (float)playerAchievements/playerAttempts*100 +" %");
	          System.out.println("\n" + " << Well Done! SWITCHING is a better decision rather than STAYING >> ");
		}
	}

}
