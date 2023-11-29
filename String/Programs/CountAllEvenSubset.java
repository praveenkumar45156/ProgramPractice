import java.util.*;

class CountAllEvenSubset 
{
	public static int count=0;
    
    public static void generateSubSet(int[] set, int index, ArrayList<Integer> currentSubSet, ArrayList<ArrayList<Integer>> subsets){
        if(set.length == index){
            ArrayList<Integer> temp = new ArrayList<Integer>(currentSubSet);
            boolean flag = true;
            for(Integer value: temp){
                if(value%2 != 0){
                    flag = false;
                }
            }
			
            if(flag && (!subsets.contains(temp))){
				//System.out.println(temp);
				//System.out.println(subsets.contains(temp));
                count++;
            }   
			subsets.add(temp);
            return;
        }
        currentSubSet.add(set[index]);
        generateSubSet(set,index+1,currentSubSet,subsets);
        currentSubSet.remove(currentSubSet.size()-1);
        generateSubSet(set,index+1,currentSubSet,subsets);
    }

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Length of the array:");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=1;i<=n;i++){
			System.out.println("Enter "+i+" value: ");
			arr[i-1] = scanner.nextInt();
		}

		ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subset = new ArrayList<Integer>();
        
        generateSubSet(arr,0,subset,subsets);
        System.out.println(CountAllEvenSubset.count);
		//System.out.println(subsets);
	}
}
