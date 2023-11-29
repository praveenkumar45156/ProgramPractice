import java.util.*;

class CommonElementInTwoArray 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first array number of elements: ");
		int n1 = scanner.nextInt();
		String[] arr1 = new String[n1];
		for(int i=1;i<=n1;i++){
			System.out.println("Enter FirstArray "+i+" element: ");
			arr1[i-1] = scanner.next();
		}
		System.out.println("Enter second array number of elements: ");
		int n2 = scanner.nextInt();
		String[] arr2 = new String[n2];
		for(int i=1;i<=n2;i++){
			System.out.println("Enter FirstArray "+i+" element: ");
			arr2[i-1] = scanner.next();
		}

		Set<String> set = new HashSet<String>();
		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++){
				if(arr1[i].equals(arr2[j])){
					set.add(arr1[i]);
				}
			}
		}

		for(String value: set){
			System.out.print(value+" ");
		}
	}
}
