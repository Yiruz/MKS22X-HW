import java.util.*;

public class FrontierQueue<T> implements Frontier<T>{
    /***Make This Work This Weekend!***/
    /***You can use your classes or built in ones***/
    /***You can extend another class OR wrap around it***/
    Queue<T> q;

    public FrontierQueue(){
	q = new LinkedList<T>();
    }
    public void add(T element){
	q.add(element);
    }
    public T next(){
	return q.remove();
    }
    public boolean hasNext(){
	return q.peek() != null;
    }
}
