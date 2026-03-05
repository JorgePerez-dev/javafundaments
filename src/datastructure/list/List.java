package datastructure.list;

public interface List<E> {


	public void add(E e);
	
	/* Removie the Last element in the list
	 */
	
	
	public E removeLast();
	
	/*
	 * Remove all the elements in the list
	 */
	
	
	public void clear();
	
	/*
	 * Print all the elements in the list
	 */
	
	
	public void printList();
}
