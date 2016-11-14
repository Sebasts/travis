package travis;

import java.util.Scanner;

public class grades {
	
	public static void main(String[] args){
					
		Scanner input = new Scanner(System.in);
	
			System.out.println("How many students will we be averaging grades for?");

			int students = input.nextInt();
	
	
			//for loop for entering students 
				for (int counter=students; counter > 0; counter--){
		
					System.out.println("Enter the next student's name");
					
					input.nextLine();
					
					String name = input.nextLine();
					
					
					System.out.println("How many grades will you be entering for " + name +  "?");
		
					int grades = input.nextInt();
					
					int counter2;
					
					int total = 0;
					
					int isayso = grades;
				
		
					//for loop for entering grades
					
					
					
					for (counter2 = grades; counter2 > 0; counter2--){
					
							System.out.println("Enter next grade now....");
			
							int grade = input.nextInt();
			
							total = total + grade;
			
							
			
		
	}
					
					;
		//the average of all grades with a corresponding letter grade for each
		int average = total / isayso;
		
		
		
		
		
		System.out.println("Student Name\t\tAverage");
		
		
		
		
		if (average >= 90){
			System.out.println(name +"\t\tA (" +average+ ")");
		}
		else if(average >=80){
			System.out.println(name +"\t\tB (" +average+ ")");
		}
		else if(average >=70){
			System.out.println(name +"\t\tC (" +average+ ")");
		}
		else if(average >=60){
			System.out.println(name +"\t\tD (" + average+ ")");
		}
		else 
			System.out.println(name +"\t\tF ( " + average+ ")");
		
		
					
	
	
				}		
				
				
				
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("Thank you for using the Travis Way Grade Calculator Application");
	}
	
}
