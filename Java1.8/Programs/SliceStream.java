import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Scanner;

class SliceStream 
{
	public static void main(String[] args) 
	{
		List<Integer> arrList = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting index: ");
		int index = scanner.nextInt();
		System.out.println("Enter number of slice: ");
		int slice = scanner.nextInt();
		System.out.println(slice-index+1);

		Stream<Integer> arrStream = arrList.stream().skip(index).limit(slice-index+1);
		arrStream.forEach(System.out::print);
		System.out.println();
	}
}
