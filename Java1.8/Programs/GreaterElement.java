import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

class GreaterElement
{
	public static void main(String[] args) 
	{
		// ----------
		System.out.println("number greater than a specific value ");
		List<Integer> arrList = Arrays.asList(1,2,2,3,3,4,5,6,6,7);
		int value = 3;
		List<Integer> strArrList1 = arrList.stream().filter(v-> v>value).collect(Collectors.toList());
		strArrList1.forEach(System.out::print);
		System.out.println();
		System.out.println("number less than a specific value ");
		List<Integer> strArrList2 = arrList.stream().filter(v-> v<value).collect(Collectors.toList());
		strArrList2.forEach(System.out::print);
		System.out.println();
		System.out.println("number equal than a specific value ");
		List<Integer> strArrList3 = arrList.stream().distinct().filter(v-> v==value).collect(Collectors.toList());
		strArrList3.forEach(System.out::print);
		System.out.println();
		System.out.println("number not equal than a specific value ");
		List<Integer> strArrList4 = arrList.stream().distinct().filter(v-> v!=value).collect(Collectors.toList());
		strArrList4.forEach(System.out::print);
		// -----------
	}
}
