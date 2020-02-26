import java.util.Scanner;
public class GPA2 {

	public static void main(String[] args) 
	{
		try (Scanner in = new Scanner(System.in)) {
			in.useDelimiter("\n");
			String transcript = "Course\tCredit\tGrade\n\tHours\n";
			int totalHours = 0;
			double totalGrade = 0;	
			double finalGPA = 0;
			
			while(true) 
			{ 
				String courseName = "";
				int creditHours = 0;
				String letterGrade = "";
				double numberGrade = 0;
				double gradePoints = 0;
				
				System.out.println("Enter the Course Name: ");
				courseName = in.next();
				if(courseName.equalsIgnoreCase("end"))
				{
					break;
				}
				System.out.println("Enter the Credit Hours: ");
				creditHours = in.nextInt();
				System.out.println("Enter the Grade: ");
				letterGrade = in.next();

				totalHours = totalHours + creditHours;
				
				
				switch (letterGrade) {
				
				
				case "A": numberGrade = 4.0;
				break;

				case "A-": numberGrade = 3.70;
				break;

				case "B+": numberGrade = 3.33;
				break;

				case "B": numberGrade = 3.0;
				break;

				case "B-": numberGrade = 2.70;
				break;

				case "C+": numberGrade = 2.30;
				break;

				case "C": numberGrade = 2.0;
				break;

				case "C-": numberGrade = 1.70;
				break;

				case "D+": numberGrade = 1.30;
				break;

				case "D": numberGrade = 1.00;
				break;

				case "D-": numberGrade = 0.70;
				break;
				}
				
				gradePoints = numberGrade * creditHours;
				totalGrade = totalGrade + gradePoints;
				
				
				transcript = transcript + courseName + "\t" + creditHours + "\t" + letterGrade + "\t" + gradePoints + "\n";
			}
			
			finalGPA = totalGrade / totalHours;
			
			
			
			transcript = transcript + totalHours + "  Total Credit Hours Attempted" + totalGrade + "  Total Grade Points";
			transcript = transcript + finalGPA + "GPA = ";
			System.out.println(transcript);
		}
	}
}

