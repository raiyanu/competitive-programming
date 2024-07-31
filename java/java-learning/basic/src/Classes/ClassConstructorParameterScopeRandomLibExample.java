package Classes;

/**
 * Like Program file name suggest, 
 * but i forgot to add parameter 
 * features cuz this type program 
 * doesn't need on
 */

public class ClassConstructorParameterScopeRandomLibExample{
	public static void main(String[] args){
		System.out.println("Storted!!!");
		RollDice diceRoller = new RollDice();
		System.out.println("Number is " + diceRoller.number);
		diceRoller.roll();
		System.out.println("Number is " + diceRoller.number);
		diceRoller.roll();
		System.out.println("Number is " + diceRoller.number);
	}
}

