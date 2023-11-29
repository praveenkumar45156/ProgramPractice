import java.util.*;

class RemoveAllOccurrence 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first array number of elements: ");
		int n1 = scanner.nextInt();
		int[] arr1 = new int[n1];
		for(int i=1;i<=n1;i++){
			System.out.println("Enter FirstArray "+i+" element: ");
			arr1[i-1] = scanner.nextInt();
		}
		System.out.println("Enter element which you want to element: ");
		int element = scanner.nextInt();

		int[] arr2 = new int[n1];

		int count = 0;
		int occurrence = 0;
		for(int value: arr1){
			if(value != element){
				arr2[count] = value;
				count++;
			}else{
				occurrence++;
			}
		}

		int[] arr3 = Arrays.copyOf(arr2,n1-occurrence);
		for(int value: arr3){
			System.out.print(value+" ");
		}


	}
}
