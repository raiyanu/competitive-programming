package FileLib;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
  FileLibDB db;

  static void printTasks(ArrayList<ArrayList<String>> TodoDB) {
    System.out.println("\n\n---------------------------------------------");
    System.out.println("S.no. :   TaskName   :   Completed   :   Desc");
    for (int i = 0; i < TodoDB.size(); i++) {
      System.out.println(
          i
              + ". "
              + TodoDB.get(i).get(0)
              + " : "
              + TodoDB.get(i).get(1)
              + " : "
              + TodoDB.get(i).get(2));
    }

    System.out.println("---------------------------------------------\n\n");
    System.out.println("Press ENTER to Continue...");
  }

  public static void main(String[] args) {
    FileLibDB db = new FileLibDB();
    db.greet();
    System.out.println("------[ S T A R T ]-------");
    Scanner s = new Scanner(System.in);
    @SuppressWarnings({"unchecked", "rawtypes"})
    ArrayList<ArrayList<String>> TodoDB = new ArrayList();
    System.out.println("Todo: " + TodoDB);
    String task = "begin";
    while (task != "end") {
      System.out.println("\n===========================");
      System.out.println("1. Add Task");
      System.out.println("2. Show Tasks");
      System.out.println("3. Edit Tasks");
      System.out.println("4. Delete Tasks");
      System.out.println("5. Clear All Task");
      System.out.println("6. EXIT");
      System.out.println("Select your task : ");
      int taskSelection = s.nextInt();
      s.nextLine();
      if (taskSelection == 1) {
        @SuppressWarnings({"unchecked", "rawtypes"})
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

      } else if (taskSelection == 2) {
        printTasks(TodoDB);
        s.nextLine();
      } else if (taskSelection == 3) {
        printTasks(TodoDB);
        s.nextLine();
        System.out.println("Which task to update:");
        int editTaskSelection;
        editTaskSelection = s.nextInt() - 1;
        s.nextLine();
        if (editTaskSelection > TodoDB.size() - 1) {
          System.out.println("Task Index is invalid");
        } else {
          System.out.println("Task is ");
          System.out.println(TodoDB.get(editTaskSelection) + " ");
          System.out.println("Task New Tittle: ");
          TodoDB.get(editTaskSelection).set(0, s.nextLine());
          System.out.println("Task New Completion: ");
          TodoDB.get(editTaskSelection).set(1, s.nextLine());
          System.out.println("Task New Desc: ");
          TodoDB.get(editTaskSelection).set(2, s.nextLine());
          System.out.println("Updated Task : ");
          System.out.println(
              editTaskSelection
                  + ". "
                  + TodoDB.get(editTaskSelection).get(0)
                  + " : "
                  + TodoDB.get(editTaskSelection).get(1)
                  + " : "
                  + TodoDB.get(editTaskSelection).get(2));
        }
      } else if (taskSelection == 4) {
        System.out.println("Which task to Delete?");
        int taskIndex = s.nextInt();
        s.nextLine();
        if (taskIndex > TodoDB.size() - 1) {
          System.out.println("Task Index is invalid");
        } else {
          TodoDB.remove(taskIndex);
          System.out.println("Task removed Pefectly");
        }
        System.out.println("Press ENTER to Continue...");
        s.nextLine();

      } else if (taskSelection == 5) {
        System.out.println("ARE YOU SURE...?");
        System.out.println("(Yes/yes/Y/y or no/n) : ");
        String emptyAllSelection = s.nextLine();
        System.out.println("Your selection is : " + emptyAllSelection);
        if (emptyAllSelection.equals("Yes")
            || emptyAllSelection.equals("yes")
            || emptyAllSelection.equals("Y")
            || emptyAllSelection.equals("y")) {
          TodoDB.clear();
          System.out.println("CLEARED !!");
        } else {
          System.out.println("SKIPPED !!");
        }
        System.out.println("Press ENTER to Continue...");
        s.nextLine();

      } else if (taskSelection == 6) {
        System.out.println("Exiting...");
        task = "end";
      } else {
        System.out.println("Unknown Task");
        System.out.println("Press ENTER to Continue...");
        s.nextLine();
      }
    }
    s.close();
    System.out.println("------[ E N D ]-----------");
  }
}
