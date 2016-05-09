import java.util.*;
@SuppressWarnings("unchecked")
    
    public class MyHeap<T extends Comparable<T>>{
    private T[] data;
    private int size;
    private boolean max;
    
    public MyHeap(){
	data = (T[])new Comparable[1];
	size = 0;
    }
    public MyHeap(T[] ary){
	data = (T[])new Comparable[ary.length];
	for(int i=1; i<ary.length; i++){
	    data[i] = ary[i];
	}
	size = ary.length;
    }
    /*public MyHeap(boolean isMax){
      max = isMax;
      }
      public MyHeap(T[] ary, boolean isMax){
      
      }*/
    
    private void pushDown(int k){
	if(data[k].compareTo(data[k*2])<0 || data[k].compareTo(data[k*2+1])<0){
	    if(data[k*2].compareTo(data[k*2+1]) > 0){
		T temp = data[k];
		data[k] = data[k*2];
		data[k*2] = temp;
		pushDown(k*2);
	    }else{
		T temp = data[k];
		data[k] = data[k*2+1];
		data[k*2+1] = temp;
		pushDown(k*2+1);
	    }
	}
    }
    private void pushUp(int k){
	if(data[k].compareTo(data[k/2])>0 || data[k].compareTo(data[k/2+1])>0){	
	    if(data[k/2].compareTo(data[k/2+1]) > 0){
		T temp = data[k];
		data[k] = data[k/2];
		data[k/2] = temp;
		pushUp(k/2);
	    }else{
		T temp = data[k];
		data[k] = data[k/2+1];
		data[k/2+1] = temp;
		pushUp(k/2+1);
	    }
	}
    }
    private void heapify(){
	for(int i=size/2; i>0; i--){
	    pushDown(i);
	}
    }
    public T delete(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	T temp = data[1];
	for(int i=1; i<size; i++){
	    data[i] = data[i+1];
	}
	//data[size+1] = ;
	size--;
	return temp;
    }
    public void add(T x){
	if(data.length <= size){
	    doubleSize();
	}
	data[size] = x;
	pushUp(size);
	size++;
    }
    private void doubleSize(){
	size *= 2;
	T[] temp = (T[])new Comparable[size];
	for(int i=0; i<data.length; i++){
	    temp[i] = data[i];
	}
	data = temp;
    }
    public String toString(){
	String ret = "[";
	for(int i=1; i<size; i++){
	    ret += data[i] + ", ";
	}
	return ret + data[size];
    }
}
