import java.util.Scanner;
public class Main{
	public static void main(String[] args){
System.out.println("Please type your name");


		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		System.out.println("Hello " + input + " please you age");


			int age = scanner.nextInt();



			System.out.println("You are " + age + " years old");


			int retireAge = 67;

			int yearsUntilRetirement = retireAge - age;

			System.out.println("You have " + yearsUntilRetirement + " years until retirement");



	}

	



	
}
