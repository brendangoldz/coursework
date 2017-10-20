package QueueLinkedList;

public class Implementation<E> implements QueueLinkedList<E> {
	private static Node first = null;
	private static Node last = null;
	private static int length = 0;
	private static class Node<E>{
		private E item;
		private Node next;
		public String toString(){
			return item+" ";		
		}
	}
	public Implementation(){
		first = null;
		last = null;
		length = 0;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (length);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (first==null);
	}
	
	public String toString(){
		Node thisE = first;
		while(thisE != null){
			System.out.println(thisE.toString() + " ");
			first =	thisE.next;
		}
		return null;
	}

	public void enqueue(E item) {
		// TODO Auto-generated method stub
		Node oldNode = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()){
			first = last;
		}
		else{
			oldNode.next = last;
		}
		length++;
		System.out.println(item + " has been added to queue");
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			return null;
		}
		E element = (E)first.item; 
		first = first.next;
		length--;
		if(isEmpty()){
			last = null;
		}
		return element;
	}


}
