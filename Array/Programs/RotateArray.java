import java.util.*;

class RotateArray 
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
		System.out.println("Enter number based on that want to rotate elements: ");
		int pos = scanner.nextInt();
		System.out.println("Position: "+pos);
		int index = 0;
		int[] arr2 = new int[n1];
		for(int i=pos;i<arr1.length;i++){
			arr2[index] = arr1[i];
			index++;
		}		
		System.out.println("index: "+index);
		int count=0;
		while(pos>0){
			arr2[index] = arr1[count];
			pos--;
			index++;
			count++;
		}
		for(int value: arr2){
			System.out.print(value+" ");
		}
	}
}
