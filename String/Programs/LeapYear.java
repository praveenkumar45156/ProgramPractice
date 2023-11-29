import java.util.Scanner;

class LeapYear 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = scanner.nextInt();

		if((year % 400 == 0) || (year%4 == 0 && year%100 != 0)){
			System.out.println("Leap Year: "+year);
		}else{
			System.out.println("Not Leap Year: "+year);
		}
	}
}
