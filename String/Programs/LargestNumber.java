class LargestNumber 
{
	public static void main(String[] args) 
	{
		
		int x = 700;
		int y = 100;
		int z = 56;
		
		if(x > y){
			if(x > z){
				System.out.println("The Largest No: "+x);
			}else{
				System.out.println("The Largest No: "+z);
			}
		}else {
			if(y > z){
				System.out.println("The Largest No: "+y);
			}else{
				System.out.println("The Largest No: "+z);
			}
		}
	}
}
