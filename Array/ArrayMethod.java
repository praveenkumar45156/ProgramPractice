
import java.lang.reflect.*;

class ArrayMethod 
{
	public static void main(String[] args) 
	{
		System.out.println("Methods available in the java.lang.reflect.Array");

		// newInstance

		// For String
		// Note:- Boolean we have to implement in the same way as String

		String[] stringTypeArray = (String[]) Array.newInstance(String.class,5);  // single dimention array
		// Set String
		Array.set(stringTypeArray,0,"Hello");
		Array.set(stringTypeArray,1,"World");
		Array.set(stringTypeArray,2,"My");
		Array.set(stringTypeArray,3,"Name");
		Array.set(stringTypeArray,4,"Praveen");

		// Normal foreach loop
		for(String value: stringTypeArray)
		{
			System.out.println(value);
		}

		System.out.println("--------------");
		// Get String
		System.out.println(Array.get(stringTypeArray,0));
		System.out.println(Array.get(stringTypeArray,1));

		// For Integer
		// Note:- Byte, Char, Double, Float, Long, Short we have to implement in the same way as Integer
		int[] intTypeArray = new int[5];
		// Set Int
		Array.set(intTypeArray,0,1);
		Array.set(intTypeArray,1,2);
		Array.set(intTypeArray,2,3);
		Array.set(intTypeArray,3,4);
		Array.set(intTypeArray,4,5);
		
		// Normal foreach loop
		for(int value: intTypeArray)
		{
			System.out.println(value);
		}

		// Get int
		System.out.println(Array.get(intTypeArray,0));
		System.out.println(Array.get(intTypeArray,1));

		// getChar
		char[] chars = new char[5];
		chars[0] = 'a';
		chars[1] = 'b';
		chars[2] = 'c';
		chars[3] = 'd';
		chars[4] = 'e';

		System.out.println(Array.getChar(chars, 2));
	}
}
