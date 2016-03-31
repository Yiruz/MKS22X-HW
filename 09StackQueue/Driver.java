public class Driver{
    public static void main(String[]args){
	MyStack<Integer> s = new MyStack<Integer>();
	MyQueue<Integer> q = new MyQueue<Integer>();

	for(int i=0; i<20; i++){
	    s.push(i);
	    q.enqueue(i);
	}
	s.print();
	q.print();

	//test remove
	s.pop();
	q.dequeue();
	s.pop();
	q.dequeue();
	s.pop();
	q.dequeue();
	s.pop();
	q.dequeue();
	s.print();
	q.print();
	System.out.println("-----pop 4 times --------------------");

	//test add
	s.push(-1);
	q.enqueue(-1);
	s.push(-2);
	q.enqueue(-2);
	s.print();
	q.print();
	
    }

}
