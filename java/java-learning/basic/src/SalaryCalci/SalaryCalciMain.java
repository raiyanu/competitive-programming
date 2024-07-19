package SalaryCalci;

import java.util.Scanner;

public class SalaryCalciMain{

	public static void main(String[] args){
		double salary = 1000;
		double bonus = 250;
		int quota = 10;

		System.out.print("How many sales does the Employer made in a week? :");
		Scanner scan = new Scanner(System.in);
		int sales = scan.nextInt();
		if(quota < sales){
			salary = salary + bonus;
		}
		System.out.println("Employe salary is " + salary);
		System.out.println("hello there!");

	}

}
