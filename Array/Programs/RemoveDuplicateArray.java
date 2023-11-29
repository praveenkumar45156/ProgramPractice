import java.util.*;
class RemoveDuplicateArray 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		for(int i=1;i<=n;i++){
			System.out.println("Enter "+i+" element: ");
			arr[i-1] = scanner.nextInt();
		}

		// Asc order
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Remove Duplicate
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i] == arr[j]){
					arr[j] = Integer.MIN_VALUE;
				}else{
					i=j;
				}
			}
		}

		for(int value: arr){
			if(value != Integer.MIN_VALUE){
				System.out.print(value+" ");
			}
		}

	}
}
