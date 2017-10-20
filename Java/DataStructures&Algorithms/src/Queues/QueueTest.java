package Queues;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> newStack = new Implement<>();
		if(newStack.isEmpty()){
		for(int i = 1; i<10;i++){
			newStack.enqueue(Integer.toString(i));
		}}
		System.out.println("Size of Queue: " + newStack.size());
		System.out.println("First of Queue: " + newStack.first());
		System.out.println("Removal of First in Queue: " + newStack.dequeue());
		

	}

}
