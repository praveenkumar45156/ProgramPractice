import java.util.Arrays;
import java.util.List;

class ArraysMethod 
{
	public static void main(String[] args) 
	{
		// asList method --> create new List
		List<Integer> arr1 = Arrays.asList(1,2,3,4,5,6);
		for(int value: arr1){
			System.out.print(value+" ");
		}
		System.out.println();

		// binarySearch method --> first sort and then search key
		int[] arr2 = {1,2,4,5,6};
		int index1 = Arrays.binarySearch(arr2,4); // binarySearch(Array,key)
		System.out.println(index1);

		int index2 = Arrays.binarySearch(arr2,0,4,4); // binarySearch(Array,startIndex,endIndex,key) or binarySearch(Array,startIndex,endIndex,key,comparator)
		System.out.println(index2);

		// compare, equal, mismatch method --> compare 2 array
		int[] arr3 = {1,2,3,4,5,6};
		int result = Arrays.compare(arr2,arr3); //return 0, -1, +1
		System.out.println(result);
		boolean result1 =Arrays.equals(arr2,arr3);  // return true and false
		System.out.println(result1);
		int result2 = Arrays.mismatch(arr2,arr3); // return index of first mismatch
		System.out.println(result2);

		// copyOf method -> copy old array to new array with new size
		System.out.println(arr3.length);
		int[] arr4 = Arrays.copyOf(arr3,12); // copyOf(oldArray,newArraySize)
		for(int value: arr4){
			System.out.print(value+" ");
		}
		System.out.println();
		System.out.println(arr4.length);
		
		// copyOfRange method -> copy particular range value
		int[] arr5 = Arrays.copyOfRange(arr3,2,4);  // copyOfRange(oldArray,fromindex, endindex)
		for(int value: arr5){
			System.out.print(value+" ");
		}
		System.out.println();

		// fill method --> fill array with customize default value
		Arrays.fill(arr5,3);
		for(int value: arr5){
			System.out.print(value+" ");
		}
		System.out.println();

		/* 
		In general, parallelPrefix() should be used when you need to perform a cumulative operation on the elements of an array. parallelSetAll() should be used when you need to set all elements of an array to the same value.
		*/

		// parallel prefix --> perform some operation on array parallelly
		Arrays.parallelPrefix(arr3,(x,y)->x+y);
		for(int value: arr3){
			System.out.print(value+" ");
		}
		System.out.println();

		// parallel set all --> set all array with specific operation
		Arrays.parallelSetAll(arr3, e->  //  parallelSetAll method
        {
            if (arr3[e] % 2 == 0)
                return arr3[e] * arr3[e];
            else
                return arr3[e];
        });
		
		for(int value: arr3){
			System.out.print(value+" ");
		}
		System.out.println();

		Arrays.setAll(arr3, e->  // setAll method
        {
            if (arr3[e] % 2 == 0)
                return arr3[e] * arr3[e];
            else
                return arr3[e];
        });
		
		for(int value: arr3){
			System.out.print(value+" ");
		}
		System.out.println();

		// sort
		Arrays.sort(arr3);
		for(int value: arr3){
			System.out.print(value+" ");
		}
		System.out.println();

		// toString
		String arr7 = Arrays.toString(arr3);  // convert into string
		System.out.println(arr7);

		// check data type
		System.out.println(arr7 instanceof String);

		// hashcode method
		int obj = Arrays.hashCode(arr3);
		System.out.println(obj);
	}
}
