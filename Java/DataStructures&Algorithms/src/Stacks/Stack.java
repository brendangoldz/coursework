package Stacks;

public interface Stack<E> {

/**
∗ Returns the number of elements in the stack.
* @return number of elements in the stack**/
int size( );

/**
∗ Tests whether the stack is empty.
∗ @return true if the stack is empty, false otherwise
∗*/

boolean isEmpty( );


/**
∗ Inserts an element at the top of the stack.
∗ @param e the element to be inserted
∗*/

void push(E e);


/**
∗ Removes and returns the top element from the stack.
∗ @return element removed (or null if empty)
∗*/

E pop( );

/**
∗ Searches and returns the top element from the stack.
∗ @return element value (or null if empty)
∗*/
E peek( );
}