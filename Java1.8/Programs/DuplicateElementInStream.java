import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

class DuplicateElementInStream 
{
	public static void main(String[] args) 
	{
		List<Integer> arrList = Arrays.asList(1,2,3,1,4,2,5);
		Set<Integer> duplicateValue = arrList.stream().filter(i -> Collections.frequency(arrList,i) > 1).collect(Collectors.toSet());
		System.out.println(duplicateValue);
	}
}
