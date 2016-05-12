import java.util.*;

public class RunningMedian{
    private MyHeap<Integer> small;
    private MyHeap<Integer> big;
    boolean debug = false;

    public RunningMedian(){
	small = new MyHeap<Integer>();
	big = new MyHeap<Integer>(false);
    }

    public double getMedian(){
	if(small.size()==0 && big.size()==0){
	    throw new NoSuchElementException("There are no elements.");
	}
	if(small.size() > big.size()){
	    return small.peek();
	}
	if(small.size() < big.size()){
	    return big.peek();
	}
	return (small.peek()+big.peek())/2.0;
    }
    public void add(Integer x){
	if(small.size() == 0 && big.size() == 0){
	  small.add(x);
	}else
	if(x < getMedian()){
	    small.add(x);
	}else{
	    big.add(x);
	}
	if(small.size() - big.size() > 1){
	    big.add(small.delete());
	}
	if(big.size() - small.size() > 1){
	    small.add(big.delete());
	}
	if(debug){
	    System.out.println("small:\t"+small);
	    System.out.println("big:\t"+big);
	}
    }
}
