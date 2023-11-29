import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class ReadInputFromConsole 
{
	public static void main(String[] args) 
	{
		// 4 ways to read the data from console: -1. Buffered Reader Class, 2. Scanner Class, 3. Console Class, 4. Command Line Argument

		// 1. Using Buffered Reader Class
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1st way input String: ");
			String input1 = br.readLine();
			System.out.println(input1);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

		// 2. Using Scanner Class
		Scanner scanner = new Scanner(System.in);
		System.out.println("2nd way input String: ");
		System.out.println(scanner.nextLine());

		//3. Using Console Class
		System.out.println("3nd way input String: ");
		String password = System.console().readLine();
		System.out.println(password);

		//4. Using Command Line Argument
		if(args.length>0){
			System.out.println("Command Line Argument are: ");
			for(String value: args){
				System.out.println(value);
			}
		}else{
			System.out.println("No Command Line Argument");
		}

	}
}
