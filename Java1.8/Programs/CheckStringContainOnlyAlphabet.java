import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class CheckStringContainOnlyAlphabet 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String word = scanner.next();

		/* Pattern pattern= Pattern.compile("^[a-zA-Z]*$");
		Matcher matches = pattern.matcher(word);
		
		while(matches.find()){
			System.out.println(matches.group());
		} */

		// 1st Way --> Using RegularExpression

		if(!word.equals("") && word != null && word.matches("^[a-zA-Z]*$")){
			System.out.println("String only contain Alphabet");
		}else{
			System.out.println("String not only contain Alphabet");
		}

		// 2nd Way --> Using Lambda Expression

		if(!word.equals("") && word != null && word.chars().allMatch(ch -> Character.isLetter(ch))){  //Character::isLetter --> Method Reference
			System.out.println("String only contain Alphabet");
		}else{
			System.out.println("String not only contain Alphabet");
		}
	}
}
