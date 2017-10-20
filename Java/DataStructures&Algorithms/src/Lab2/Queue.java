package Lab2;

public class Queue<E> implements impQueue<E>{
	int length = 0;
	int first = 0;
	E[] newArray;
	static int capacity;
	
	public Queue(){
		this(capacity=1000);
	}
	public Queue(int capacity){
		newArray = (E[]) new Object[capacity];
	}
	
	public Queue(int newCapacity, int newLength){
		capacity = newCapacity;
		length = newLength;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (length);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (length==0);
	}

	public void enqueue(E e) {
		// TODO Auto-generated method stub
		int pos = (length+first)%newArray.length;
		newArray[pos] = e;
		length++;
	}
	@Override
	public E first() {
		// TODO Auto-generated method stub
		return newArray[first];
	}
	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			return null;
		}
		E firstEl = newArray[first];
		newArray[first] = null;
		first = (first+1)%newArray.length;
		length--;
		return firstEl;
	}
}