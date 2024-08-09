package Classes;

import java.util.Random;

public class RollDice{
	//public static void main(String[] args){
	//	System.out.println("why run from this class???");
	//}
	int         number;
	Random random;
	RollDice(){
		random = new Random();
		System.out.println("Initialized Dice to Rock and Roll...");
	}
	void roll(){
		this.number = random.nextInt(6)+1;
		System.out.println("Dice Rolled...");
	}

}
