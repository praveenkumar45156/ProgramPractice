import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class CountOccurenceOfCharacter 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String word = scanner.next();
		System.out.println("Enter Character: ");
		char ch = scanner.next().charAt(0);

		char[] chArr = word.toCharArray();
		List<Character> chArrList = new ArrayList<Character>();
		for(char value: chArr){
			chArrList.add(Character.valueOf(value));
		}
		long count = chArrList.stream().filter(n -> n == ch).count();
		System.out.println(count);

	}
}
