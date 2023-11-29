import java.util.Scanner;

class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		
		/// --> Using Core Java
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int number1 = scanner.nextInt();
		System.out.println("Enter second number");
		int number2 = scanner.nextInt();

		for(int i=number1;i<=number2;i++)
		{
			String str1 = String.valueOf(i);
			int sum=0;
			for(int j=0;j<str1.length();j++){
				int product=1;
				int digit = Integer.parseInt(String.valueOf(str1.charAt(j)));
				for(int k=0;k<str1.length();k++){
					product= product* digit;
				}
				sum = sum + product;
			}

			if(i == sum){
				System.out.println("Armstrong Number: "+ i);
			}
		}
		
		/// --> Using Stream
		
	}
}
