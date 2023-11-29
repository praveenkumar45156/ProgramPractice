class StackUsingDoubleLinkedList<T>
{
	private Node top;
	
	class Node
	{
		private T data;
		private Node next;
		private Node prev;
		
		public Node(T data){
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	
	public boolean isEmpty(){
		if(top == null){
			return true;	
		}
		return false;
	}
	
	public void push(T data){
		Node newNode = new Node(data);
		if(isEmpty()){
			top = newNode;
			return;
		}
		top.next = newNode;
		newNode.prev = top;
		top = newNode;
	}
	
	public void pop(){
		System.out.println("removing top value: "+	top.data);
		top = top.prev;
		top.next = null;		
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Stack is Empty....");
			return;
		}		
		Node current = top;
		while(current != null){
			System.out.print(current.data+"-->");
			current = current.prev;
		}
		System.out.println("null");
	}
	
	
	public static void main(String[] args) 
	{
		StackUsingDoubleLinkedList<Integer> stack = new StackUsingDoubleLinkedList<Integer>();
		stack.display();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.display();
		stack.pop();
		stack.pop();
		stack.display();		
	}
}
