import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

class ListAverage 
{
	public static void main(String[] args) 
	{
		List<Integer> value = Arrays.asList(1,2,3,4,5,6,7);
		Double average = value.stream().mapToDouble(Integer::intValue).average().orElse(0.0);
		System.out.println(average);
		
		List<String> value1 = Arrays.asList("name:abc","name:xyz","name:def");
		List<String> result = value1.stream().map(str -> str.split(":")[1]).collect(Collections.);
		System.out.println(result);
		
	}
}
