import java.util.*;
@SuppressWarnings("unchecked")
    
    public class MyHeap<T extends Comparable<T>>{
    private T[] data;
    private int size;
    private boolean max;
    private boolean debug = true;

    public MyHeap(){
	data = (T[])new Comparable[10];
	size = 0;
	max = true;
    }
    public MyHeap(T[] ary){
	size = ary.length;
	data = (T[])new Comparable[size+1];
	for(int i=0; i<ary.length; i++){
	    data[i+1] = ary[i];
	}
	max = true;
	heapify();
    }
    public MyHeap(boolean isMax){
	data = (T[])new Comparable[10];
	size = 0;
	max = isMax;
    }
    public MyHeap(T[] ary, boolean isMax){
	size = ary.length;
	data = (T[])new Comparable[size+1];
	for(int i=0; i<ary.length; i++){
	    data[i+1] = ary[i];
	}
	max = isMax;
	heapify();
    }
    private void swap(int a, int b){
	T temp = data[a];
	data[a] = data[b];
	data[b] = temp;
    }

    private void pushDown(int k){
	if(k*2+1 <= size){
	    if(max){
		if(data[k].compareTo(data[k*2]) < 0 || 
		   data[k].compareTo(data[k*2+1]) < 0){	
		    if(data[k*2].compareTo(data[k*2+1]) > 0){
			swap(k, k*2);
			pushDown(k*2);
		    }else{
			swap(k, k*2+1);
			pushDown(k*2+1);
		    }
		}
	    }else{
		if(data[k].compareTo(data[k*2+1]) > 0 ||
		   data[k].compareTo(data[k*2]) > 0){
		    if(data[k*2].compareTo(data[k*2+1]) > 0){
			swap(k, k*2+1);
			pushDown(k*2+1);
		    }else{			
			swap(k, k*2);
			pushDown(k*2);
		    }
		}
	    }
	    if(debug){
		System.out.println(toString());
		
	    }
	}
    }

    private void pushUp(int k){
	if(k/2 >= 1){
	    if(compare(k/2,k)){	
		swap(k, k/2);
		pushUp(k/2);
	    }
	}
    }
    private void heapify(){
	for(int i=size/2; i>0; i--){
	    pushDown(i);
	}
    }
    public T peek(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	return data[1];
    }
    public T delete(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	T temp = data[1];
	for(int i=1; i<size+1; i++){
	    data[i] = data[i+1];
	}
	data[size] = null;
	size--;
	return temp;
    }
    public void add(T x){
	if(data.length <= size+1){
	    doubleSize();
	}
	data[size+1] = x;
	pushUp(size+1);
	size++;
    }
    private void doubleSize(){
	T[] temp = (T[])new Comparable[data.length*2];
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
	return ret + data[size] + "]";
	
	//return Arrays.toString(data);
    }

    private boolean compare(int a, int b){
	if(max){
	    return data[a].compareTo(data[b]) > 0; 
	}else{
	    return data[a].compareTo(data[b]) < 0; 
	}
    }
}
