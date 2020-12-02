//creating a guessing game ,, in which 2 players will complete with each other by guessing target number

import java.util.*;
 class Guessgame{
	player p1;
	player p2;
	public void startGame(){
		p1=new player(); //creating obj for player class
		p2=new player();
		int guessp1=0;
		int guessp2=0;
		boolean p1isright=false;
		boolean p2isright=false;
		
		int targetnum = (int) (Math.random()*10); // get a random integer between 0 to 9
		System.out.println("I am thinking of number between 0 to 9" +" "+ targetnum);
		while(true){
			p1.guess();
			p2.guess();
			guessp1= p1.number;
			System.out.println("Player1 is guessing "+guessp1);
			guessp2= p2.number;
			System.out.println("Player2 is guessing "+guessp2);
			if(guessp1==targetnum){
				 p1isright = true;
			}
			if(guessp2==targetnum){
				 p2isright = true;
			}
			if(p1isright||p2isright){
				System.out.println("We have a winner");
				System.out.println("Player1 is winner?"+ p1isright);
				System.out.println("Player2 is winner? "+p2isright);
				System.out.println("Game is over");
				break;
			}
			else{
				System.out.println("keep guessing the target number");
			}

		}
	}
}

 class player{
	int number =0;
	public void guess(){
	number = (int) (Math.random()*10);
	System.out.println("I'm guessing "+number);
}

}

public class GameLauncher{
	public static void main(String[] args){
		Guessgame game = new Guessgame();
		game.startGame();
	}
}