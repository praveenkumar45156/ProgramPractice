import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class SubSetAll 
{
	public static void gss(String ans,String s){
		if(s.length() == 0){
			System.out.println("Output: "+ans);
			return;
		}
		//System.out.println("Pick: "+(ans+s.charAt(0))+" : "+s.substring(1));
		gss(ans+s.charAt(0),s.substring(1)); //gss(addToAns, pickRemainingSubString) -->base Condition
		//System.out.println("NotPick: "+(ans)+" : "+s.substring(1));
		gss(ans,s.substring(1)); //gss(passAns, passNotPickSubString) 
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter word");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String ans="";
		//System.out.println("Sub String: "+word.substring(1));
		gss(ans,word);		

	}
}
