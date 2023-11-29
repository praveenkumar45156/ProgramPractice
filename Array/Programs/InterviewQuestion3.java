import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

class InterviewQuestion3
{
	/*
		Find the length of the longest arithmetic progression
		{ 1,7,10,13,14,19} => output 4 becuase (1,7,13,19) same difference 6
		{ 2,4,6,8,10} => output 5 becuase all value have same difference 2
	*/
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // number of element
		scanner.nextLine();
		String M = scanner.nextLine(); // element
		
		String[] mSplitStr = M.split(" ");
		
		HashMap<Integer,HashSet<Integer>> pair = new HashMap<>();
		for(int i=0;i<mSplitStr.length-1;i++){
			for(int j=i+1;j<mSplitStr.length;j++)
			{
				int sub =(int)(Integer.parseInt(mSplitStr[j]) - Integer.parseInt(mSplitStr[i]));
				HashSet<Integer> tempValue = new HashSet<Integer>();
				if(pair.containsKey(sub)){
					//System.out.println(pair.get(sub));
					tempValue.addAll(pair.get(sub));
					tempValue.add(Integer.parseInt(mSplitStr[j]));
					tempValue.add(Integer.parseInt(mSplitStr[i]));
					pair.put(sub,tempValue);
				}else{
					tempValue.add(Integer.parseInt(mSplitStr[j]));
					tempValue.add(Integer.parseInt(mSplitStr[i]));
					pair.put(sub,tempValue);
				}
			}
		}
		
		// Iterate HashMap
		int maxValue = 1;
		HashSet<Integer> resultPair = null;
		for(int key: pair.keySet()){
			//System.out.println("Key: "+key+ " Value: "+pair.get(key));
			if(pair.get(key).size() > maxValue){
				maxValue = pair.get(key).size();
				resultPair = pair.get(key);
			}
		}
		System.out.println("Output: "+maxValue);
		System.out.println("Pair: "+resultPair);
		
	}
		
}
