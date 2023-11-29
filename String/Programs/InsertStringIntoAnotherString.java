import java.util.Scanner;

class InsertStringIntoAnotherString 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String str1 = scanner.nextLine();
		System.out.println("Enter 2nd String: ");
		String str2 = scanner.nextLine();
		System.out.println("Enter index: ");
		int index = scanner.nextInt();
		int temp = index;

		char[] chArr = str1.toCharArray();
		char[] result = new char[str1.length()+str2.length()];

		for(int i=1;i<=str2.length();i++){
			result[index+i] = str2.charAt(i-1);
		}

		for(int i=0;i<chArr.length;i++){
			//System.out.println("i: "+i);
			if(i > index){
				//System.out.println("index: "+(index-1));
				result[i+(index-1)] = chArr[i];
			}else{
				result[i] = chArr[i];
			}
		}
		for(char value: result){
			System.out.print(value);
		}

	}
}
