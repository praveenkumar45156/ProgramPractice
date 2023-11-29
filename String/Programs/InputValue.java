import java.util.Scanner;

class InputValue 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int value1 = scanner.nextInt();
		System.out.println("Enter Second value: ");
		int value2 = scanner.nextInt();

		System.out.println("Sum: "+ (value1+value2));

		System.out.println("Enter first name: ");
		String firstName = scanner.next();
		System.out.println("Enter lastname name: ");
		String secondName = scanner.next();

		System.out.println("Full Name: "+ (firstName+" "+secondName));


	}
}
