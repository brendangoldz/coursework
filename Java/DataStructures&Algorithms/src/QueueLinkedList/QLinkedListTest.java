package QueueLinkedList;

public class QLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList testQ = new Implementation<>();
		
		testQ.enqueue(3);
		testQ.enqueue(5);
		System.out.println(testQ.dequeue() + " has been removed");
		testQ.enqueue(7);
		testQ.enqueue(55);
		System.out.println(testQ.dequeue() + " has been removed");
	}
	
}
