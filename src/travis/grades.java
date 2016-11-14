package travis;

import java.util.Scanner;

public class grades {
	
	public static void main(String[] args){
					
		Scanner input = new Scanner(System.in);
	
			System.out.println("How many students will we be averaging grades for?");

			int students = input.nextInt();
	
	
			//for loop for entering students 
				for (int counter=students; counter > 0; counter--){
		
		
					System.out.println("How many grades will you be entering for this student?");
		
					int grades = input.nextInt();
					
					int counter2= grades;
					
					int total = 0;
					
					int isayso = grades;
		
					//while loop for entering grades
						while (grades > 0){
					
							System.out.println("Enter grades now....");
			
							int grade = input.nextInt();
			
							total= total + grade;
			
							grades--;
			
		
		
	}
		//the average of all grades with a corresponding letter grade for each
		int average = total / isayso;
		
		
		if (average >= 90){
			System.out.println("This student gets an A (This student's average was " + average+ ")");
		}
		else if(average >=80){
			System.out.println("This student gets a B (This student's average was " + average+ ")");
		}
		else if(average >=70){
			System.out.println("This student gets a C (This student's average was " + average+ ")");
		}
		else if(average >=60){
			System.out.println("This student gets a D (This student's average was " + average+ ")");
		}
		else 
			System.out.println("This student gets a F (This student's average was " + average+ ")");
		
		
		
	
	}
		System.out.println("Thank you for using the Travis Way Grade Calculator Application");
	}
	
}
