// You better be not laughing, 
// since its just tradition to do this, 
// playing with numbers are the first thing
// Everyone does !!!! DIZ
package SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculatorMain{ 

	public static void main(String[] args){
		Scanner get = new Scanner(System.in);
		System.out.print("Enter the value for A: ");
		int a = get.nextInt();
		System.out.print("Enter the value for B: ");
		int b = get.nextInt();
		System.out.println("A + B =  " + (a+b));
		System.out.print("Enter your name :  ");
		String name = get.next();
		String message = "So, your name : " + name;
		System.out.println(message);
		get.close();
	} 
}
