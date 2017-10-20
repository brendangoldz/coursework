package LinkedLists;

public class Implementation<E> implements StackLinkedList<E>{
	int length = -1;
	E[] newArray;
	int capacity;
	
	private static class Node<E>{
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n){
			element = e;
			next = n;
		}
		public E getElement(){
			return element;
		}
		public Node<E> getNext(){
			return next;
		}
		public void setNext(Node<E> n){
			next = n;
		}
	}
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	public Implementation(){
		capacity = 50;
		length = 0;
		newArray = (E[]) new Object[capacity];
	}
	public Implementation(int newCapacity, int newLength){
		capacity = newCapacity;
		length = newLength;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public E peek(){
		if(isEmpty()){
			return null;
		}
		return head.getElement();
	}
	/* FOR QUEUES ONLY
	public E last(){
		if(isEmpty()){
			return null;
		}
		return tail.getElement();
	}*/
	public void push(E e){
		head = new Node<>(e, head);
		if(size == 0){
			tail = head;
		}
		size++;
	}
	public E pop(){
		if(isEmpty()){
			return null;
		}
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if(size == 0){
			tail = null;
		}
		return answer;
	}
	/*FOR QUEUES ONLY
	public void addLast(E e){
		Node<E> newNode = new Node<>(e, null);
		if(isEmpty()){
			head = newNode;
		}
		else{
			tail.setNext(newNode);
		}
		tail = newNode;
		size++;
	}*/	
}
