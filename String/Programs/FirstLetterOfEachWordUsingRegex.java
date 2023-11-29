import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class FirstLetterOfEachWordUsingRegex 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String word = scanner.nextLine();

		Pattern p = Pattern.compile("\\b[a-zA-Z]"); // first character from each word
		// "[a-zA-Z]+" ==> each word from the string

		Matcher m = p.matcher(word);

		while(m.find()){
			System.out.println(m.group());
		}
	}
}
