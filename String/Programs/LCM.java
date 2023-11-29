import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int value1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int value2 = scanner.nextInt();
		int dividend = 2;
		int lcmProduct = 1;

		while(value1>1 || value2>1){
			dividend = 2;
			int max =(value1>value2) ? value1:value2;
			
			while(dividend < max && (value1%dividend != 0 || value2%dividend !=0)){
				dividend++;
			}
			
			if(dividend < max){
				lcmProduct = lcmProduct * dividend;
				value1 = value1/dividend;
				value2 = value2/dividend;
				System.out.println(lcmProduct+" : "+value1+" : "+value2);
			}else{
				System.out.println(lcmProduct+" # "+value1+" # "+value2);
				if(value1 != 1){
					lcmProduct = lcmProduct * value1;
				}
				if(value2 != 1){
					lcmProduct = lcmProduct * value2;
				}
				break;
			}			
		}

		System.out.println("LCM Product: "+lcmProduct);


		/*
			// 2nd way

			// Numbers
			int a = 15, b = 25;
	 
			// Checking for the smaller
			// Number between them
			int ans = (a > b) ? a : b;
	 
			// Checking for a smallest number that
			// can de divided by both numbers
			while (true) {
				if (ans % a == 0 && ans % b == 0)
					break;
				ans++;
			}
	 
			// Printing the Result
			System.out.println("LCM of " + a + " and " + b
							   + " : " + ans);
		*/
	}
}
