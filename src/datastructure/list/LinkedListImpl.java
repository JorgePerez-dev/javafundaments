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
	    if (first == null) {
	        return null;
	    }

	    if (first == Last) {
	        E data = first.getData();
	        first = null;
	        Last = null;
	        return data;
	    }

	    Node<E> current = first;

	    while (current.getNext() != Last) {
	        current = current.getNext();
	    }

	    E data = Last.getData();

	    current.setNext(null); 

	    return data;
	}

	@Override
	public void clear() {
	    first = null;
	    Last = null;
	}

	@Override
	public void printList() {
	    Node<E> current = first;

	    while (current != null) {
	        System.out.print(current.getData() + " ");
	        current = current.getNext();
	    }

	    System.out.println();
	}

}

