import java.util.*;

class MergeTwoArray 
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
		System.out.println("Enter second array number of elements: ");
		int n2 = scanner.nextInt();
		int[] arr2 = new int[n2];
		for(int i=1;i<=n2;i++){
			System.out.println("Enter FirstArray "+i+" element: ");
			arr2[i-1] = scanner.nextInt();
		}

		int[] mergeArray = new int[n1+n2];
		int count=0;
		for(int value: arr1){
			mergeArray[count] = value;
			count++;
		}
		for(int value: arr2){
			mergeArray[count] = value;
			count++;
		}

		for(int value: mergeArray){
			System.out.print(value+" ");
		}
	}
}
