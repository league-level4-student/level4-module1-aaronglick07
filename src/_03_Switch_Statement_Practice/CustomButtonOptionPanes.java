package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
			case "Sunday": System.out.println("it is sunday"); break;
			case "Monday": System.out.println("it is monday"); break;
			case "Tuesday": System.out.println("it is tuesday"); break;
			case "Wednesday": System.out.println("it is wednesday"); break;
			case "Thursday": System.out.println("it is thursday"); break;
			case "Friday": System.out.println("it is friday"); break;
			case "Saturday": System.out.println("it is saturday"); break;
			default : System.out.println("it is today"); break;
		}
	}
}
