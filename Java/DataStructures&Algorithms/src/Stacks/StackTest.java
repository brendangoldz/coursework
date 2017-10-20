package Stacks;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> newStack = new Implement<>();
		newStack.push(4);
		newStack.push(7);
		newStack.push(8);
		System.out.println(newStack.size());
		System.out.println(newStack.peek());
		System.out.println(newStack.pop());
		System.out.println(newStack.peek());
	}

}
