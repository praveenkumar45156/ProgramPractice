import java.util.Scanner;

class HCF 
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
			}else{
				break;
			}			
		}

		System.out.println("HCF(Hightest common factor) or GCD(greatest common divisor) Product: "+lcmProduct);
	}
}
