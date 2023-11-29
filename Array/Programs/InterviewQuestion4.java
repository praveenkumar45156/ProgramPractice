import java.util.Arrays;

class InterviewQuestion4
{
	/*
	Move all zero to the right side of the array
	Ex:- int[] arr = {7,12,3,5,0,0,12,23,0,2,10}
	So here the O(1)-> constant time, O(n)-> linear time, not allowed to create 2nd array, not allowed to use an inner for 1loop, in one loop we have to write the logic
	*/
	public static void main(String[] args) 
	{
		int[] arr = {7,12,3,5,1,1,12,23,1,2,10}; //7,12,3,5,12,0,0,23,0,2,10
		int i=0;
		int j=0;
		while(j < arr.length){
			//System.out.println("i: "+i+" j: "+j);
			if(arr[i] != 0){
				i++;
				j++;
			}else if(arr[j] == 0){
				j++;	
			}else if(arr[i] == 0 && arr[j] != 0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j=i;
			}			
		}
		System.out.println(Arrays.toString(arr));
	}
}
