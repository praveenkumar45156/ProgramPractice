import java.util.Scanner;
class Pangram 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String word = scanner.next();
		char[] chArr = word.toCharArray();

		// 'a-z' => 97-122 and 'A-Z' => 65-90 'a-z' => sum is 2847

		
		if(chArr.length == 26){
			// convert into lower case
			for(int i=0;i<chArr.length;i++){
				if(chArr[i] >= 65 && chArr[i] <= 90){
					chArr[i] = (char)(chArr[i]+32);
				}
			}
			
			// sort 
			for(int i=0;i<chArr.length-1;i++){
				if(chArr[i] > chArr[i+1]){
					char ch = chArr[i];
					chArr[i] = chArr[i+1];
					chArr[i+1] = ch;
				}
			}
			int sum = 0;
			for(char value: chArr){
				sum = sum + value;
			}

			if(sum == 2847){
				System.out.println("Given word is Pangram word");
			}else{
				System.out.println("Given word is not Pangram word");
			}
		}else{
			System.out.println("Given word is not Pangram word");
		}


		/*

		2nd Way:-

		// Loop over each character itself
        for (char ch = 'a'; ch <= 'z'; ch++) {
 
            // Check if the string does not
            // contains all the letters
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }

		3rd Way:-
		// Create a frequency array to
        // mark the present letters
        boolean[] present = new boolean[size];
 
        // Traverse for each character
        // of the string
        for (int i = 0; i < len; i++) {
 
            // If the current character
            // is a letter
            if (isLetter(str.charAt(i))) {
 
                // Mark current letter as present
                int letter = str.charAt(i) - 'a';
                present[letter] = true;
            }
        }
		// Traverse for every letter
        // from a to z
        for (int i = 0; i < size; i++) {
 
            // If the current character
            // is not present in string
            // then return false,
            // otherwise return true
            if (!present[i])
                return false;
        }
		*/


		
	}
}
