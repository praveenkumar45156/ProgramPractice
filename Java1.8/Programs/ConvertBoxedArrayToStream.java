import java.util.Arrays;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

class ConvertBoxedArrayToStream 
{
	public static void main(String[] args) 
	{
		// A boxed array is an array which is defined in the form of an object, instead of the primitives.
		String arr1[] = {"Geeks", "forGeeks", "A Computer Portal"};

		// 1st Way
		List<String> arr1List = Arrays.asList(arr1);
		Stream<String> arr1Stream = arr1List.stream();
		arr1Stream.forEach(System.out::print);
		System.out.println();

		// *2nd Way
		Stream<String> arr2Stream = Stream.of(arr1);
		arr2Stream.forEach(System.out::print);
		System.out.println();

		// *3rd Way
		Stream<String> arr3Stream = Arrays.stream(arr1);
		arr3Stream.forEach(System.out::print);
		System.out.println();
	}
}
