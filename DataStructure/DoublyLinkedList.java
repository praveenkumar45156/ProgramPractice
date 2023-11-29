class DoublyLinkedList<T>
{
	private Node head;
	
	class Node
	{
		private Node prev;
		private Node next;
		private T data;
		
		public Node(T data){
			this.data = data;
			this.prev = null;
			this.next = null;			
		}
	}
	
	public boolean isEmpty(){
		if(head == null){
			return true;	
		}
		return false;
	}
	
	public void addElementAtLast(T data){
		Node newNode = new Node(data);
		Node current = head;
		if(isEmpty()){
			head = newNode;
			return;
		}
		while(current.next != null){
			current = current.next;	
		}
		current.next = newNode;
		newNode.prev = current;		
	}
	
	public void displayForwardDirection(){
		Node current = head;
		if(isEmpty()){
			System.out.println("List is Empty");
			return;	
		}
		while(current.next != null){
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print(current.data+"-->null");		
		System.out.println();		
	}
	
	public void delete(T data){
		Node current = head;
		if(isEmpty()){
			System.out.println("List is empty... No need to perform delete operation");
			return;
		}
		// Delete First Node
		if(current.data == data){
			current = current.next;
			head = current;	
			return;
		}
		// Delete Middle node
		while(current.next != null){
			Node temp = current.next;
			if(temp.data == data && temp.next != null){
				temp = temp.next;
				current.next = temp;
				temp.prev = current;
				return;
			}
			current = current.next;
		}
		// Delete Last Node
		if(current.data == data){
			current.prev.next = null;
		}
		
	}
	
	public static void main(String[] args) 
	{
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
		doublyLinkedList.isEmpty();
		doublyLinkedList.addElementAtLast(10);
		doublyLinkedList.addElementAtLast(20);
		doublyLinkedList.addElementAtLast(30);
		doublyLinkedList.addElementAtLast(40);
		doublyLinkedList.addElementAtLast(50);
		doublyLinkedList.addElementAtLast(60);
		doublyLinkedList.displayForwardDirection();
		doublyLinkedList.delete(10);
		doublyLinkedList.displayForwardDirection();
		doublyLinkedList.delete(30);
		doublyLinkedList.displayForwardDirection();
		doublyLinkedList.delete(60);
		doublyLinkedList.displayForwardDirection();		
	}
}
