import java.util.*;
class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = scanner.nextLine();
		StringBuffer reverse = new StringBuffer();
		char[] chArr = word.toCharArray();
		for(int i=chArr.length-1;i>=0;i--)
		{
			reverse.append(chArr[i]);
		}
		System.out.println(reverse);

		Stack<String> stack = new Stack<String>();
		for(int i=0;i<chArr.length;i++)
		{
			stack.push(String.valueOf(chArr[i]));
		}

		for(int i=0;i<chArr.length;i++)
		{
			System.out.print(stack.pop());
		}

	}
}
