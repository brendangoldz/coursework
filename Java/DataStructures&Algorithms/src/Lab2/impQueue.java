package Lab2;

public interface impQueue<E> {
	//Returns # of elements in Queue
		int size();
		
		//T/F Queue is empty
		boolean isEmpty();
		
		//Inserts element to back of queue
		void enqueue(E e);
		
		//Returns but does not remove first element
		E first();
		
		//Removes and Returns first element
		E dequeue();
}
