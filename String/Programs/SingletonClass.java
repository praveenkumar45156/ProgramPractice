class SingletonClass 
{
	public static SingletonClass obj = null;

	public String s;

	private SingletonClass(String s){
		this.s = s;
	}

	public static synchronized SingletonClass getInstance(){
		if(obj == null){
			obj = new SingletonClass("Singleton Object Created");
		}
		return obj;
	}

	public static void main(String[] args) 
	{

		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		SingletonClass obj3 = SingletonClass.getInstance();

		if(obj1 == obj2 && obj1 == obj3 && obj2 == obj3)
		{
			System.out.println("Obj1 , Obj2 and Obj3 are same ");
			System.out.println(obj1+" : "+obj2+" :"+obj3);
			System.out.println(obj1.s);
		}		
	}
}
