package datastructure.list;


/**
 * List implementaion by linking node objects
 * @author Jorge
 * Mar 10, 2026
 * @param <E>
 */


public class LinkedListImpl<E> implements List<E> {
	
	
	private Node<E> first;
	private Node<E> Last;
	
		
	

	@Override
	public void add(E data) {
		// TODO Auto-generated method stub
		Node<E>   newNode = new Node<E>(data);
		
		if (first == null) {
			first = Last = newNode;
			
		}
		else {
			Last.setNext(newNode);
			
			Last = newNode;
		}
		
		
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		
	}

}

