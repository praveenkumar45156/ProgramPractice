class SinglyLinkedList<T>
{
	private Node head;
	class Node
	{
		private T data;
		private Node next;
		
		public Node(T data){			
			this.data = data;
			this.next = null;			
		}
	}
	
	public boolean isEmpty(){
		//System.out.println("IsEmpty Operation........");
		if(head == null){
			return true;	
		}
		return false;
	}
	
	public void add(T data){
		//System.out.println("Adding Operation........");
		Node newNode = new Node(data);
		if(isEmpty()){
			head = 	newNode;
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;		
	}
	
	public void deleteLast(){
		//System.out.println("Delete Last Operation........");
		Node current = head;
		Node prev = null;
		
		if(isEmpty()){
			System.out.println("List is Empty. Unable to process delete operation in the empty list");
			return;
		}
		if(current.next == null){
			head = null;
		}
		while(current.next != null){
			prev = current;
			current = current.next;			
		}
		prev.next = null;
	}
	
	public void deleteData(T data){
		Node current = head;
		Node prev = null;
		if(isEmpty()){
			System.out.println("List is Empty. Unable to process delete operation in the empty list");
			return;
		}
		if(current.data == data){
			head = current.next;
			return;
		}
		while(current.next != null){
			if(current.data == data){
				prev.next = current.next;
				return;
			}
			prev = current;
			current = current.next;
		}
		System.out.println("Data is not available");
	}
	
	public void display(){
		//System.out.println("Display Operation........");
		Node current = head;
		if(isEmpty()){
			System.out.println("List is Empty...");
			return;
		}
		if(current.next ==null){
			System.out.print(current.data+"-->");	
		}
		
		while(current.next != null){
			System.out.print(current.data+"-->");	
			current = current.next;
		}
		System.out.print("null");
		System.out.println();		
	}
	
	public static void main(String[] args) 
	{
		SinglyLinkedList<Integer> singleLinkedList = new SinglyLinkedList<Integer>();
		singleLinkedList.display();
		singleLinkedList.add(10);
		singleLinkedList.add(20);
		singleLinkedList.add(30);
		singleLinkedList.add(40);
		singleLinkedList.add(50);
		singleLinkedList.display();
		singleLinkedList.deleteLast();
		singleLinkedList.deleteLast();
		singleLinkedList.display();
		singleLinkedList.deleteData(50);
		singleLinkedList.display();
	}
}
