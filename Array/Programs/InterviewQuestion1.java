import java.util.Scanner;
class InterviewQuestion1 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N and M");
		String value = scanner.nextLine();
		String[] valueArray = value.split(" ");
		int N = Integer.parseInt(valueArray[0]);
		int M = Integer.parseInt(valueArray[1]);
		
		System.out.println("Shooting Values: ");
		String Pi = scanner.nextLine();
		String[] piArray = Pi.split(" ");
		
		int[] shootingList = new int[N];
		for(int i=0;i<N;i++){
			shootingList[i] = Integer.parseInt(piArray[i]);	
		}
		
		for(int i=0;i<N;i++){
			int sub = M - shootingList[i];
			if(Pi.contains(String.valueOf(sub)) && sub != shootingList[i]){
				if(M == (sub+shootingList[i])){
					System.out.println(sub+" "+shootingList[i]);
					return;
				}
			}
		}
	}
}
