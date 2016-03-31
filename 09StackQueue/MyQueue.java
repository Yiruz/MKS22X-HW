import java.util.*;

public class MyQueue<T>{
    private MyLinkedList<T> myll;

    public MyQueue(){
	myll = new MyLinkedList<T>();
    }
 /**
     * Adds the given item to the rear of the queue.
     */
    void enqueue(T item){
	myll.add(item);
    }

    /**
     * Removes the front item from the queue and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T dequeue(){
	if(isEmpty()){
	    throw new NoSuchElementException();
	}
	return myll.remove(0);
    }

    /**
     * Returns the front item from the queue without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T peek(){
	if(isEmpty()){
	    throw new NoSuchElementException();
	}
	return myll.get(0);
    }
    /**
     * Returns the number of items currently in the queue.
     */
    int size(){
	return myll.size();
    }

    /**
     * Returns whether the queue is empty or not.
     */
    boolean isEmpty(){
	return size() == 0;
    }
    
    void print(){
	System.out.println(myll.toString());
    }
    /*public static void main(String[]args){
	MyQueue<Integer> q = new MyQueue<Integer>();
	System.out.println(q.isEmpty());
	q.enqueue(2);
	q.print();
	q.enqueue(6);
	q.enqueue(3);
	q.print();
	q.dequeue();
	q.print();
	System.out.println(q.peek());
	}*/
}
