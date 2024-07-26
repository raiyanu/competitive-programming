package ArrayPlay;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMachineSoCalledDB{
	public static void main(String[] args){
		System.out.println("------[ S T A R T ]-------");
		Scanner s = new Scanner(System.in);
		@SuppressWarnings("unchecked")
		ArrayList<ArrayList<String>> TodoDB = new ArrayList();
		System.out.println("Todo: " + TodoDB);
		String task="begin";
		while(task!="end"){
			System.out.println("\n---------------------------");
			System.out.println("1. Add Task");
			System.out.println("2. Show Tasks");
			System.out.println("3. Delete Tasks");
			System.out.println("Select your task : ");
			int taskSelection = s.nextInt();
			s.nextLine();
			if(taskSelection == 1){
				ArrayList<String> taskItem = new ArrayList();
				System.out.println("Task Name : ");
				taskItem.add(s.nextLine());
				System.out.println("Task Completed? : ");
				taskItem.add(s.nextLine());
				System.out.println("Task Short Desc : ");
				taskItem.add(s.nextLine());
				TodoDB.add(taskItem);
				System.out.println("Task Added Successfully!...");
				System.out.println("Press ENTER to Continue...");
				s.nextLine();

			}else if(taskSelection == 2){
				System.out.println("\n\n---------------------------------------------");
				System.out.println("S.no. :   TaskName   :   Completed   :   Desc");
				for(int i = 0; i < TodoDB.size();i++){
					System.out.println(i + ". " + TodoDB.get(i).get(0) +" : "+ TodoDB.get(i).get(1)+" : " + TodoDB.get(i).get(2));
				}
				System.out.println("---------------------------------------------\n\n");
				System.out.println("Press ENTER to Continue...");
				s.nextLine();

			}else if(taskSelection == 4){
				System.out.println("Which task to Delete?");
				int taskIndex = s.nextInt();
				s.nextLine();
				if(taskIndex >TodoDB.size()){
					System.out.println("Task Index is invalid");
				} else {
					TodoDB.remove(taskIndex);
					System.out.println("Task removed Pefectly");
				}
				System.out.println("Press ENTER to Continue...");
				s.nextLine();

			}else if(taskSelection == 6){
				System.out.println("Exiting...");
				task = "end";
			}else {
				System.out.println("Unknown Task");
				System.out.println("Press ENTER to Continue...");
				s.nextLine();
			}
		}
		System.out.println("------[ E N D ]-----------");
	}
}
