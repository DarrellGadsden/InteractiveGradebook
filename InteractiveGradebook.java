/*Darrell Gadsden Jr
 * Comp163
 * This program will allow user to input grades for assignments then will display the final grade along with letter grade
 */
import java.util.Scanner;
public class InteractiveGradebook {
	private static Scanner scnr; 
	public static void main(String args[]) {
		
		//Declaring variables for category
		double project1 = 0;
		double project2 = 0;
		double midterm1 = 0;
		double midterm2 = 0;
		double midterm3 = 0;
		double finalExam = 0;
		double midtermFinal = 0;
		double projectFinal = 0;
		double total;
		int newTotal;
		String name;
		double participation;
		String credit = "yes";
			
		scnr = new Scanner(System.in); 
		
		System.out.println("Welcome to the interactive grade book. What is the student name?");
		 name = scnr.nextLine();
	
		 
		System.out.println("Did student receive participation credit? (yes/no)");
		credit = scnr.next();
		
		if(credit.equalsIgnoreCase("yes")) {
			
			participation = 100;
		}else {
			participation =0;
		}
		System.out.println("Enter grade for Project 1");
		project1 = scnr.nextDouble();
		
		System.out.println("Enter grade for Project 2");
		project2 = scnr.nextDouble();
		
		System.out.println("Enter grade for Midterm 1");
		midterm1  = scnr.nextDouble();
		
		System.out.println("Enter grade for Midterm 2");
		midterm2  = scnr.nextDouble();
		
		System.out.println("Enter grade for Midterm 3");
		midterm3  = scnr.nextDouble();
		
		System.out.println("Enter grade for Final Exam");
		finalExam  = scnr.nextDouble();
	
		midtermFinal = ((midterm1 + midterm2 + midterm3)/3);
		projectFinal = ((project1 + project2)/2);
		total = ((midtermFinal * .30) + (projectFinal * .35) + (finalExam * .25) + (participation * .1));
		
		System.out.println("Here is the grade summary for " + name + ".");
		
		System.out.println("Participation: " + participation);
		System.out.println("Project score: " + projectFinal);
		System.out.println("Midterm score: " + midtermFinal);
		System.out.println("Final exam score: " + finalExam);
		System.out.println("Total score: " + total);
		
		newTotal = (int)(total/10);
		switch(newTotal) {
		case 10:
		case 9:
			System.out.println("Final Grade: A");
		break;
		case 8:
			System.out.println("Final Grade: B");
		break;
		case 7: 
			System.out.println("Final Grade: C");
		break;
		case 6:
			System.out.println("Final Grade: D");
		break;
			default:
				System.out.println("Final Grade: F");
			break;
		}
	}

	}

	

