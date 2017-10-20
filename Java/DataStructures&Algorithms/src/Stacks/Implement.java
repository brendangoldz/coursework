package Stacks;

public class Implement<E> implements Stack<E>{
	int length = -1;
	E[] newArray;
	int capacity;
	
	public Implement(){
		capacity = 50;
		length = 0;
		newArray = (E[]) new Object[capacity];
	}
	public Implement(int newCapacity, int newLength){
		capacity = newCapacity;
		length = newLength;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (length+1);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (length==-1);
	}

	@Override
	public void push(E newElement) {
		// TODO Auto-generated method stub
		if(size() == newArray.length){
			
		}
		else{
			newArray[length++] = newElement;
		}
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		E search = newArray[length];
		newArray[length] = null;
		length--;
		return search;
	}
	
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return newArray[length];
	}

}
