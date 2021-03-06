import java.util.*;

public class MyStack<T>{
    private MyLinkedList<T> myll;
    
    public MyStack(){
	myll = new MyLinkedList<T>();
    }
    /**
     * Adds the given item to the top of the stack.
     */
    void push(T item){
	myll.add(item);
    }

    /**
     * Removes the top item from the stack and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T pop(){
	if(isEmpty()){
	    throw new NoSuchElementException();
	}
	return myll.remove(size()-1);
    }

    /**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T peek(){
	if(isEmpty()){
	    throw new NoSuchElementException();
	}
	return myll.get(size()-1);
    }

    /**
     * Returns the number of items currently in the stack.
     */
    int size(){
	return myll.size();
    }

    /**
     * Returns whether the stack is empty or not.
     */
    boolean isEmpty(){
	return size() == 0;
    }


}
