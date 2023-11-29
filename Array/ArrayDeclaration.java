class ArrayDeclaration 
{
	public static void main(String[] args) 
	{
		// Single Array Declaration
		int[] arr1 = new int[5];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = i+1;
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		int arr3[] = {1,2,3,4,5};
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.print("-------------");
		// 2D Array Declaration
		int[][] arr4 = new int[3][3];
		for(int i=0;i<arr4.length;i++)
		{
			for(int j=0;j<arr4.length;j++)
			{
				arr4[i][j] = i+j;
			}
		}
		System.out.println();
		// for each loop
		for(int[] internalArray: arr4)
		{
			for( int value: internalArray)
			{
				System.out.print(value+" ");
			}
		}

		int arr5[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println();
		for(int[] internalArray: arr5)
		{
			for( int value: internalArray)
			{
				System.out.print(value+" ");
			}
			System.out.println();
		}

		// 3D Array Declaration
		System.out.println("-------------");
		int[][][] arr6 = new int[3][3][3];
		int i=0;
		for(int[][] firstLoop: arr6)
		{
			int j=0;
			for(int[] secondLoop: firstLoop)
			{
				int k=0;
				for(int value: secondLoop)
				{					
					arr6[i][j][k] = i+j+k;
					k++;
				}
				j++;
			}
			i++;
		}
		for(int l=0;l<arr6.length;l++)
		{
			for(int j=0;j<arr6.length;j++)
			{
				for(int k=0;k<arr6.length;k++)
				{
					System.out.print(arr6[l][j][k]+" ");
				}
				System.out.println();
			}
		}
		System.out.println();
		int arr7[][][] = {{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}}};
		for(int l=0;l<arr7.length;l++)
		{
			for(int j=0;j<arr7.length;j++)
			{
				for(int k=0;k<arr7.length;k++)
				{
					System.out.print(arr7[l][j][k]+" ");
				}
				System.out.println();
			}
		}
		
		// Jagged Array- It's possible at 2-D array only.
		System.out.println("-------------");
		int[][] arr8 = {{1,2,3},{4,5,6,7,8,9},{10,11,12,13},{14,15}};
		for(int[] internalArray: arr8)
		{
			for( int value: internalArray)
			{
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}
}
