import java.util.Scanner;

class FactorialNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum= 1;
		while(number > 1)
		{
			sum = sum * number;
			number = number - 1;
		}
		System.out.println(sum);
	}
}
