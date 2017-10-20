package QueueLinkedList;

public interface QueueLinkedList<E> {
	//Returns # of elements in Queue
	int size();
	
	//T/F Queue is empty
	boolean isEmpty();
	
	//Inserts element to back of queue
	void enqueue(E e);

	//Removes and Returns first element
	E dequeue();

}
