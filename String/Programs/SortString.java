import java.util.*;
class SortString 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = scanner.nextLine();
		StringBuffer reverse = new StringBuffer();
		char[] chArr = word.toCharArray();
		for(int i=0;i<chArr.length;i++){
			for(int j=i+1;j<chArr.length;j++){
				if(chArr[i] > chArr[j]){
					char chTemp = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = chTemp;
				}
			}
		}

		// Arrays.sort(chArr);

		for(char character: chArr){
			System.out.print(character+" ");
		}
	}
}
