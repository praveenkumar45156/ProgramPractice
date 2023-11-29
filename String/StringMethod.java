class StringMethod 
{
	public static void main(String[] args) 
	{
		// string length
		String str1 = new String("Hello World");
		int length = str1.length();
		System.out.println(length);

		// charAt
		char ch = str1.charAt(4);
		System.out.println(ch);

		// substring and subsequence
		String str2 = str1.substring(6); // substring(start,end)
		System.out.println(str2);
		CharSequence subStr1 = str1.subSequence(2,8); // subSequence
		System.out.println(subStr1);

		// concat
		String str3 = " of Java";
		String str4 = str1.concat(str3);
		System.out.println(str4);

		// indexOf
		int index1 = str4.indexOf('z'); // return -1 if not available
		System.out.println(index1);
		int index2 = str4.indexOf('o',5);
		System.out.println(index2);

		// equals
		String str5 = " Hello  ";
		String str6 = "HELLO";
		boolean result1 = str5.equals(str6);
		//boolean result = (str5 == str6);
		System.out.println(result1);
		boolean result2 = str5.equalsIgnoreCase(str6);
		System.out.println(result2);

		// compareTo
		int compareResult1 = str5.compareTo(str6);
		System.out.println(compareResult1);
		int compareResult2 = str5.compareToIgnoreCase(str6);
		System.out.println(compareResult2);

		// toLowerCase and toUpperCase
		System.out.println(str5.toUpperCase());
		System.out.println(str6.toLowerCase());

		// trim
		System.out.println(str5.trim());

		// replace
		String str7 = str5.replace('e','E');
		System.out.println(str7);

		// contains
		boolean containResult = str5.contains("o");
		System.out.println(containResult);

		// codePointAt
		int codePoint = str5.codePointAt(5);
		System.out.println(codePoint);

		// startwith and endwith
		boolean startWithResult = str5.startsWith(" ");
		System.out.println(startWithResult);
		boolean endWithResult = str5.endsWith(" ");
		System.out.println(endWithResult);

		// toCharArray
		char[] chArray = str6.toCharArray();
		System.out.println(chArray);

		// contentEquals
		boolean contentResult = str6.contentEquals("HELLO");
		System.out.println(contentResult);

		// copyValueOf
		String str8 = String.copyValueOf(chArray);
		System.out.println(str8);
		String str9 = String.valueOf(chArray);
		System.out.println(str9);

		// getBytes
		byte[] strBytes = str6.getBytes();
		for(Byte value: strBytes){
			System.out.print(value+" ");
		}
		System.out.println();

		// getChars
		char[] tempChar = new char[6];
		String str10 = " Hello";
		str10.getChars(0,5,tempChar,1);
		System.out.println(tempChar);

		// Matches
		boolean matchResult = str10.matches(" H(.*)");
		System.out.println(matchResult);

		// replace
		String src1 = "Hello";		
		System.out.println(src1.replace('l','z'));
		System.out.println(src1.replaceAll("ll","z"));

		// split
		String src2 = "Hello World";
		String[] strArr = src2.split(" ");
		for(String value: strArr){
			System.out.print(value+" ");
		}
		System.out.println();

		// Join --> delimiter is "<" and elements are "Four", "Five", "Six", "Seven" 
        String gfg1 = String.join(" < ", "Four", "Five", "Six", "Seven");   
        System.out.println(gfg1);
		

	}
}
