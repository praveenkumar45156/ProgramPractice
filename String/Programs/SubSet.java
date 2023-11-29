import java.util.Scanner;

class SubSet 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter word: ");
		Scanner scanner = new Scanner(System.in);

		String word = scanner.nextLine();
		/*if(word.length() > 1){
			for(int i=0;i<word.length();i++){
				System.out.print(word.charAt(i)+",");
				for(int j=i+1;j<word.length();j++){
					System.out.print(word.charAt(i)+""+word.substring(i+1,j+1)+",");
				}
			}
		}else{
			System.out.print(word);
		}*/

		System.out.println();

		int len = word.length();  
        int temp = 0;  
        
		String arr[] = new String[len*(len+1)/2];  
  
        for(int i = 0; i < len; i++) {  
            for(int j = i; j < len; j++) {  
                arr[temp] = word.substring(i, j+1);  
                temp++;  
            }  
        }
		
		for(String value: arr){
			System.out.print(value+" ");
		}
		
	}
}
