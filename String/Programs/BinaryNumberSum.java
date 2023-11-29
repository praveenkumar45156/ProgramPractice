import java.util.Scanner;
class BinaryNumberSum 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Binary Number:");
		String value1 = scanner.nextLine();
		System.out.println("Enter Second Binary Number:");
		String value2 = scanner.nextLine();

		int value1Size= value1.length();
		int value2Size= value2.length();
		StringBuffer sb = new StringBuffer();
		int carry = 0;
		// 0&0=0, 1&0=1, 0&1=1, 1&1=10
		//System.out.println("carry: "+carry);

		while(value1Size > 0 && value2Size > 0){
			int x = Integer.parseInt(String.valueOf(value1.charAt(value1Size-1)));
			//System.out.println("x: "+x);
			int y = Integer.parseInt(String.valueOf(value2.charAt(value2Size-1)));
			//System.out.println("y: "+y);
			int sum=0;
			
			if(((x == 0 && y==0)||(x == 1 && y==0)||(x == 0 && y==1)) && carry == 0){
				sum = x + y;
				sb.append(sum);
			}else if(((x == 0 && y==0)||(x == 1 && y==0)||(x == 0 && y==1)) && carry == 1){
				sum = x + y + carry;
				if( sum == 2){
					sb.append(0);
					carry = 1;
				}else{
					sb.append(sum);
					carry = 0;
				}
				
			}			
			if((x==1 && y==1) && carry==0){
				sb.append(0);
				carry = 1;
			}else if((x==1 && y==1) && carry==1){
				sb.append(1);
				carry = 1;
			}
			value1Size--;
			value2Size--;
			//System.out.println("sum: "+sb);
			//System.out.println("carry: "+carry);
		}

		if(value1.length() > value2.length()){
			//System.out.println("value1 greater then value2");
			int diff = value1.length() - value2.length();
			//System.out.println(diff);
			while(diff>0){
				int remaining = Integer.parseInt(String.valueOf(value1.charAt(diff-1)));
				//System.out.println("remaining: "+remaining);
				if(carry == 0){
					sb.append(remaining);
				}else{
					if(remaining ==0 && carry == 1){
						sb.append(1);
					}else{
						sb.append(0);
						carry = 1;
					}
				}
				diff--;
			}
		}else if(value1.length() < value2.length()){
			//System.out.println("value2 greater then value1");
			int diff = value2.length() - value1.length();
			//System.out.println(diff);
			while(diff>0){
				int remaining = Integer.parseInt(String.valueOf(value2.charAt(diff-1)));
				//System.out.println("remaining: "+remaining);
				if(carry == 0){
					sb.append(remaining);
				}else{
					if(remaining ==0 && carry == 1){
						sb.append(1);
					}else{
						sb.append(0);
						carry = 1;
					}
				}
				diff--;
			}
		}

		if(carry == 1){
			//System.out.println("carry is 1");
			sb.append(1);
		}

		String result = String.valueOf(sb);
		//System.out.println("result: "+result);
		System.out.print("result: ");
		for(int i=0;i<result.length();i++){
			System.out.print(result.charAt(result.length()-i-1));
		}


		/*
			// 2nd Way
			int num1 = Integer.parseInt(x, 2);
			// converting binary string into integer(decimal
			// number)
	 
			int num2 = Integer.parseInt(y, 2);
			// converting binary string into integer(decimal
			// number)
	 
			int sum = num1 + num2;
			// Adding those two decimal numbers and storing in
			// sum
	 
			String result = Integer.toBinaryString(sum);
			// Converting that resultant decimal into binary
			// string
	 
			return result;
		*/
	}
}
