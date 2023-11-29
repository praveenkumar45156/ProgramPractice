import java.util.*;
class SwappingPairOfCharacter 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = scanner.next();
		char[] chArr = word.toCharArray();

		if(chArr.length %2 == 0){
			for(int i=0;i<chArr.length;){
				char temp = chArr[i];
				chArr[i] = chArr[i+1];
				chArr[i+1] = temp;
				if(i+2 < chArr.length){
					i=i+2;
				}else{
					break;
				}
			}
		}else{
			for(int i=0;i<chArr.length;){
				char temp = chArr[i];
				chArr[i] = chArr[i+1];
				chArr[i+1] = temp;
				if(i+2 < chArr.length-1){
					i=i+2;
				}else{
					break;
				}
			}

		}


		/*
			for (int i = 0; i < len - 1; i += 2) { 
            sb.append(str.charAt(i + 1)); 
            sb.append(str.charAt(i)); 
			}
			
			if (len % 2 != 0) { 
            sb.append(str.charAt(len - 1)); 
			} 

		*/

		for(char value: chArr){
			System.out.print(value);
		}

	}
}
