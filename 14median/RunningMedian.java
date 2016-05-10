import java.util.*;

public class RunningMedian{
    private MyHeap<Integer> small;
    private MyHeap<Integer> big;

    public RunningMedian(){
	small = new MyHeap<Integer>();
	big = new MyHeap<Integer>(false);
    }

    public double getMedian(){
	if(small.size()==0 && big.size()==0){
	    throw new NoSuchElementException();
	}
	if(small.size() == big.size()){
	    return (small.peek()+big.peek())/2;
	} 
	if(small.size() > big.size()){
	    return small.peek();
	}
	if(small.size() < big.size()){
	    return big.peek();
	}
	return 0;
    }
    public void add(Integer x){
	if(x < getMedian()){
	    small.add(x);
	}
	if(x > getMedian()){
	    big.add(x);
	}
    }
}
