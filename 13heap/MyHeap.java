import java.util.*;
@SuppressWarnings("unchecked");
public class MyHeap<T extends Comparable<T>>{
    private T[] data;
    private int size;
    private boolean isMax;

    public MyHeap(){
	data = new T[1];
    }
    public MyHeap(T[] ary){
	data = new T[ary.length];
	for(int i=1; i<ary.length; i++){
	    data[i] = ary[i];
	}
    }
    /*public MyHeap(boolean isMax){
	this.isMax = isMax;
    }
    public MyHeap(T[] ary, boolean isMax){
	
    }*/

    private void pushDown(int k){
	if(data[k].compareTo(data[k/2]) > 0){
	    
	}
    }
    private void pushUp(int k){

    }
    private void heapify(){

    }
    public T delete(){
	return data[0];
    }
    public void add(T x){
	
    }
    private void doubleSize(){
	
    }
    public String toString(){
	return "";
    }
}
