import java.util.*;

class InterviewQuestion2 
{
	public static void main(String[] args) 
	{
		// Do the product of the input value and display the last 2 character. Example:- 25*10 = 250 and last 2 character is '50'
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter number of Element: ");
		int n = scanner1.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		//String str = String.format("Enter %d number of element:",n);
		System.out.println(String.format("Enter %d number of element:",n));
		String inputValue = scanner2.nextLine();
		String[] inputArr = inputValue.split(" ");
		int product = 1;
		for(int i=0;i<inputArr.length;i++){
			int value = Integer.parseInt(inputArr[i]);	
			product = product * value;
		}
		System.out.println("Product: "+product);
		int[] result = new int[2];
		
		if(product > 99){
			System.out.println("product greater than 99");
			Stack<Integer> stack = new Stack<Integer>();
			int count=1;
			int mod = 0;
			int div = 0;
			while(count>=0){
				div = product/10;
				mod = product%10;
				result[count] = mod;
				stack.push(mod);
				count--;	
				product = div;
			}
			for(int value: result){
				System.out.println("value: "+value+"");
				System.out.println("stack: "+stack.pop());
			}
		}else{
			String productStr = String.valueOf(product);
			for(int i=productStr.length();i>0;i--){
				System.out.print(productStr.charAt(i-1));	
			}
		}
		
	}
}
