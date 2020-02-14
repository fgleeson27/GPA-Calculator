import java.util.Scanner;

public class GPA 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter grade: ");
		String letterGrade = in.next();
		double numberGrade = 0;
		switch (letterGrade) 
		{
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
		System.out.println(numberGrade);
}
}
