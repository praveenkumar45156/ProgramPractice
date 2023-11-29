import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Stack;

class ListImplementationClass 
{
	public static void main(String[] args) 
	{
		// ArrayList

		// ArrayList Declaration

		// Default Constructor with default capacity 10
		List<Integer> arrList1 = new ArrayList<Integer>();
		// OR
		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		
		// Constructs a list containing the elements of the specified collection
		List<Integer> temp = Arrays.asList(1,2,3,4,5);
		System.out.println(temp);
		ArrayList<Integer> arrList3 = new ArrayList<Integer>(temp);
		System.out.println(arrList3.size());

		// Constructor with inital capacity
		ArrayList<Integer> arrList4 = new ArrayList<Integer>(15);
		System.out.println(arrList4.size());

		// ArrayList Methods

		// add(element)
		arrList2.add(1);
		System.out.println(arrList2);
		// add(index, element)
		arrList2.add(1,2);
		System.out.println(arrList2);
		// addAll(collection)
		arrList2.addAll(temp);
		System.out.println(arrList2);
		// addAll(index, collection)
		arrList2.addAll(5,temp);
		System.out.println(arrList2);
		// clone
		arrList4 = (ArrayList)arrList2.clone();
		System.out.println(arrList4);
		// clear
		arrList2.clear();
		System.out.println(arrList2);
		// contains
		System.out.println(arrList4.contains(5));
		// foreach
		arrList4.forEach((n)-> System.out.print(n+" "));
		System.out.println();
		// get(index)
		System.out.println(arrList4.get(7));
		// indexOf(object)
		System.out.println(arrList4.get(3));
		// set(index,element)
		arrList4.set(9,14);
		System.out.println(arrList4);
		// isEmpty
		System.out.println(arrList4.isEmpty());
		// Iterator
		Iterator<Integer> iter = arrList4.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		// remove
		arrList4.remove(9);
		// remove(object)
		arrList4.remove(Integer.valueOf(5));
		// removeAll(Collection)
		List<Integer> temp1 = Arrays.asList(1,2,1);
		arrList4.removeAll(temp1);
		// ListIterator
		ListIterator<Integer> listIter = arrList4.listIterator();
		while(listIter.hasNext()){
			System.out.print(listIter.next()+" ");
		}
		System.out.println();
		// ListIterator(index)
		// System.out.println(arrList4.listIterator(4).next());

		// removeIf(Predicate<T> filter), removeRange(fromIndex, toIndex)
		
		// replaceAll(UnaryOperator)
		arrList4.replaceAll(e -> e*2);
		ListIterator<Integer> listIter1 = arrList4.listIterator();
		while(listIter1.hasNext()){
			System.out.print(listIter1.next()+" ");
		}
		System.out.println();
		// sort --> public static <T extends Comparable<? super T>> void sort(List<T> list)  
		Collections.sort(arrList4);
		Collections.sort(arrList4, Collections.reverseOrder());   
		// subList(fromIndex, toIndex)
		List<Integer> arr5 = arrList4.subList(1, 3);
		System.out.println(arr5);
		// toArray()
		Object[] arr6 = arrList4.toArray();
		System.out.println(Arrays.toString(arr6));
		// toArray(T[] a)
		Integer arr7[] = new Integer[6];
        arr7 = arrList4.toArray(arr7);
		System.out.println(Arrays.toString(arr7));
		//trimToSize()
		ArrayList<Integer> arrList5 = new ArrayList<Integer>(Arrays.asList(arr7));
		System.out.println(arrList5);
		arrList5.trimToSize();
		System.out.println(arrList5);



		///////////////////////////////////////////////////////////////////

		// Vector

		// Default Constructor with default capacity 10
		Vector<Integer> vec1 = new Vector<Integer>();
		vec1.add(1);
		vec1.add(2);
		System.out.println(vec1);

		// Vector(Collection<? extends E> c)--> Constructs a vector containing the elements of the specified collection, in the order they are returned by the collection's iterator.
		// Vector(int initialCapacity) --> Constructs an empty vector with the specified initial capacity and with its capacity increment equal to zero.
		// Vector(int initialCapacity, int capacityIncrement) --> Constructs an empty vector with the specified initial capacity and capacity increment.
		
		// Note: Method Similar to the ArrayList

		// LinkedList
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Hello");
		ll1.add("World");
		System.out.println(ll1);

		// LinkedList(Collection<? extends E> c) --> Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
		

		// Stack
		Stack<String> stc1 = new Stack<String>();
		stc1.push("hello");
		stc1.push("world");
		System.out.println(stc1);
		stc1.pop();
		stc1.pop();
		System.out.println(stc1);
		
		// Queue
		/*

		Constructor and Description: -

		PriorityQueue()
		Creates a PriorityQueue with the default initial capacity (11) that orders its elements according to their natural ordering.
		PriorityQueue(Collection<? extends E> c)
		Creates a PriorityQueue containing the elements in the specified collection.
		PriorityQueue(Comparator<? super E> comparator)
		Creates a PriorityQueue with the default initial capacity and whose elements are ordered according to the specified comparator.
		PriorityQueue(int initialCapacity)
		Creates a PriorityQueue with the specified initial capacity that orders its elements according to their natural ordering.
		PriorityQueue(int initialCapacity, Comparator<? super E> comparator)
		Creates a PriorityQueue with the specified initial capacity that orders its elements according to the specified comparator.
		PriorityQueue(PriorityQueue<? extends E> c)
		Creates a PriorityQueue containing the elements in the specified priority queue.
		PriorityQueue(SortedSet<? extends E> c)
		Creates a PriorityQueue containing the elements in the specified sorted set.

		Method and Description: - 

		boolean	add(E e)
		Inserts the specified element into this priority queue.
		void	clear()
		Removes all of the elements from this priority queue.
		Comparator<? super E>	comparator()
		Returns the comparator used to order the elements in this queue, or null if this queue is sorted according to the natural ordering of its elements.
		boolean	contains(Object o)
		Returns true if this queue contains the specified element.
		Iterator<E>	iterator()
		Returns an iterator over the elements in this queue.
		boolean	offer(E e)
		Inserts the specified element into this priority queue.
		E	peek()
		Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		E	poll()
		Retrieves and removes the head of this queue, or returns null if this queue is empty.
		boolean	remove(Object o)
		Removes a single instance of the specified element from this queue, if it is present.
		int	size()
		Returns the number of elements in this collection.
		Spliterator<E>	spliterator()
		Creates a late-binding and fail-fast Spliterator over the elements in this queue.
		Object[]	toArray()
		Returns an array containing all of the elements in this queue.
		<T> T[]	toArray(T[] a)
		Returns an array containing all of the elements in this queue; the runtime type of the returned array is that of the specified array.

		*/
	}
}
