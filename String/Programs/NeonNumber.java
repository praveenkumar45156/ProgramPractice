import java.util.Scanner;

class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		int square = number * number;
		String str1 = String.valueOf(square);
		int sum = 0;
		for (int i=0;i<str1.length();i++ )
		{
			sum = sum + Integer.parseInt(String.valueOf(str1.charAt(i)));
		}

		if(number ==sum){
			System.out.println("Neaon Number: "+ number);
		}else{
			System.out.println("Not Neaon Number: "+ number);
		}

	}
}
