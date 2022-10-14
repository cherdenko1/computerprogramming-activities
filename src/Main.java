import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int project, longExam, midtermExam, buffer;
		double finalExam;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter the project score: ");
		buffer = scan.nextInt();
		if(buffer >= 0 && buffer <= 100) project = buffer;
		else project = 0;
		
		System.out.print("Enter the long exam score: ");
		buffer = scan.nextInt();
		if(buffer >= 0 && buffer <= 100) longExam = buffer;
		else longExam = 0;
		
		System.out.print("Enter the midterm exam score: ");
		buffer = scan.nextInt();
		if(buffer >= 0 && buffer <= 100) midtermExam = buffer;
		else midtermExam = 0;
		
		scan.close();
		
		finalExam = (project * .15) + (longExam * .20) + (midtermExam * .25);
		finalExam = (90 - finalExam) * 2.52 - 0.9 / 1.5;
		
		if(finalExam > 100)
			System.out.println("Wala na, finish na!");
		else
			System.out.printf("Final exam score needed = %d", Math.round(finalExam));
	}

}
