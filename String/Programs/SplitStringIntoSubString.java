import java.util.*;

class SplitStringIntoSubString 
{
	public static void generateSubString(String sentence, String ans){
		if(sentence.length() == 0){
			System.out.println("Output: "+ans);
			return;
		}
		generateSubString(sentence.substring(1),ans + sentence.charAt(0));
		generateSubString(sentence.substring(1),ans);
	}

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String sentence = scanner.nextLine();
		generateSubString(sentence,"");

	}
}
