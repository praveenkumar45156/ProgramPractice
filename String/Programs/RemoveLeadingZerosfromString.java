import java.util.Scanner;

class RemoveLeadingZerosfromString 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = scanner.next();
		char[] chArr = word.toCharArray();

		StringBuffer sb = new StringBuffer();
		boolean flag = false;
		for(char value: chArr){
			if(value != '0' && !flag){
				flag = true;
			}
			if(flag){
				sb.append(value);
			}
		}

		System.out.println(sb);
	}
}
