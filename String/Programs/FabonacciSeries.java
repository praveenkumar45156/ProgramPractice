import java.util.Scanner;

class FabonacciSeries 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int first = 0;
		int second = 1;
		int sum = 1;
		int count = 1;

		while(count<=n*2){
			int temp = first;
			first = second;
			second = temp + second;
			if(count %2 ==0){
				System.out.println(sum+" : "+ first+" : "+second);
				sum =sum+first+second;
			}
			count++;
		}
		System.out.println(sum);
	}
}
