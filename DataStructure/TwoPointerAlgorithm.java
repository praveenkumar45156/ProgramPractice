import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
class TwoPointerAlgorithm 
{
	/*
	Given an array of integers n and a positive number k, find the maximum sum of any contiguous subarray of size k.
	Example 1:
	Input: [2,1,5,1,3,2] , k=3
	Output: 9
	Explanation: Subarray with maximum sum is [5,1,3]
	Example 2:
	Input: [1,9,-1,-2,7,3,-1,2], k=4
	Output: 13
	Explanation: Subarray with maximum sum is [9, -1, -2 ,7]	
	*/
	
	public static void main(String[] args) 
	{
		//int[] arr = {2,1,5,1,3,2};
		//int k=3;
		
		int[] arr = {1,9,-1,-2,7,3,-1,2};
		int k=4;
		
		HashMap<Integer,String> result = new HashMap<Integer,String>();
		int j= k-1;
		int pos = 0;
		int i = pos;
		
		int sum = 0;
		int max = 0;
		String subSet = "";
		
		while(j<arr.length){
			if(i == j+1){
				j = j+1;
				pos = pos+1;
				i = pos ;
				result.put(sum,subSet);
				if(sum > max){
					max = sum;	
				}
				subSet = "";
				sum = 0;
			}else{
				subSet = subSet +String.valueOf(arr[i])+" ";
				sum = sum+arr[i];
				i++;
			}				
		}
		
		System.out.println("1st way traverse the HashMap");
		
		for(Map.Entry<Integer, String> mapValue : result.entrySet ()){
             int key = mapValue.getKey ();
             String value = mapValue.getValue ();
             System.out.println(key+" : "+value);
        }
		System.out.println("2nd way traverse the HashMap");
		result.forEach((key,value) -> System.out.println(key+" : "+value)); 
		
		System.out.println("Output: "+max+" subSet: "+result.get(max));
		
	}
}
