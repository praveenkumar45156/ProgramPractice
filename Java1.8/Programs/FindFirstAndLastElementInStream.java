import java.util.stream.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class FindFirstAndLastElementInStream 
{
	public static void main(String[] args) 
	{
		//int[] arr1 = {1,2,3,4,5,6,7,8,9}; //--> not good idea to use the int array and then covert into list and then stream because it's complex
		// if we want to implement the int array into stream then we have to follow following steps likes: -
		
		/*	List<Integer> arr1List = new ArrayList<Integer>();
			for(int value: arr1){
				arr1List.add(Integer.valueOf(value));
			}
			Stream<Integer> arr1Str = arr1List.stream();

		*/

		List<Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9); // --> best way to implement stream

		// First Element

		// 1st Way
		Optional<Integer> arrFirstElement1 = arrList.stream().findFirst();
		if(arrFirstElement1.isPresent()){
			System.out.println(arrFirstElement1.get());
		}

		// 2nd Way
		Optional<Integer> arrFirstElement2 = arrList.stream().reduce((first,second)-> first);
		if(arrFirstElement2.isPresent()){
			System.out.println(arrFirstElement2.get());
		}

		// Last Element
		
		// 1st Way
		Stream<Integer> arrLastElement1 = arrList.stream().skip(arrList.size()-1);
		arrLastElement1.forEach(System.out::println);

		// 2nd Way
		Optional<Integer> arrLastElement2 = arrList.stream().sorted(Comparator.reverseOrder()).reduce((first,second)-> first);
		if(arrLastElement2.isPresent()){
			System.out.println(arrLastElement2.get());
		}

		
		

	}
}
