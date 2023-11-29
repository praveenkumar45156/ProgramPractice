import java.util.Arrays;
class StringDeclaration 
{
	public static void main(String[] args) 
	{
		// Default Constructor
		String str = new String("Hello World");
		System.out.println(str);

		// Create String object using byte array
		byte[] byteObj = {'H','e','l','l','o'};
		String str1 = new String(byteObj);
		System.out.println(str1);

		// Create String object using int array
		int[] intObj = {1,2,3,4,5};
		// String str2 = new String(intObj); --> Not possible
		String str2 = Arrays.toString(intObj);
		System.out.println(str2);

		// Create String Object using char array
		char[] charObj = {'W','o','r','l','d'};
		String str3 = new String(charObj);
		System.out.println(str3);

		String str4 = new String(charObj,2,2); //String(charObj,start_index,count)
		System.out.println(str4);

		// Create String Object using stringbuffer
		StringBuffer sbuf = new StringBuffer("Hello String Buffer World");
		String str5 = new String(sbuf);
		System.out.println(str5);

		// Create String Object using stringbuilder
		StringBuilder sbuild = new StringBuilder("Hello String Builder World");
		String str6 = new String(sbuild);
		System.out.println(str6);

	}
}
