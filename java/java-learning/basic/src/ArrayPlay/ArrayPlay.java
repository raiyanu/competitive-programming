package ArrayPlay;

import javax.swing.JOptionPane;

public class ArrayPlay{
	public static void main(String[] args){
		System.out.println("I am Ray");
		String name; 
		do{
			name = JOptionPane.showInputDialog("Enter your name");
		}while(name==null || name.isBlank());
		System.out.println("Your name is : " + name);
	}
}
