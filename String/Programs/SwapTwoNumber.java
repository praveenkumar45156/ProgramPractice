class SwapTwoNumber 
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 17;
		System.out.println("a: "+a+" & b:"+b);
		b = a+b; // 18
		a = b-a; // 8
		b = b-a; //10
		System.out.println("a: "+a+" & b:"+b);
	}
}
