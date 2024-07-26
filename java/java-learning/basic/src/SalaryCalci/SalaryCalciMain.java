package SalaryCalci;

import java.util.Scanner;

public class SalaryCalciMain{

	public static void main(String[] args){
		double salary = 1000;
		double bonus = 250;
		int quota = 10;

		System.out.print("How many sales does the Employer made in a week? :");
		Scanner scan = new Scanner(System.in);
		int sales=0; 
		try{
			sales = scan.nextInt();
		} catch(Exception e){
			System.out.println("Input error" );
			scan.close();
		}
		if(quota < sales){
			salary = (salary*sales) + bonus;
			System.out.println("Employe salary is " + salary);
			System.out.println("Program ended Successfully!");
			return;
		}
		System.out.println("Employe salary is " + salary*sales);
		System.out.println("Program ended Successfully!");
		Test t = new Test();
		t.crack();
		t.crack();
		Test ts = new Test();
		System.out.println(t.i);
		scan.close();
	}

}

public class Test{
	public int i =12;
	public static void crack(){
		System.out.println("Test!");
	}
}
