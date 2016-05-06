import java.util.*;
@SuppressWarnings("unchecked");
public class MyHeap<T extends Comparable<T>>{
    private T[] data;
    private int size;
    private boolean max;

    public MyHeap(){
	data = (T[])new Comparable[1];
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
	T temp = data[k];
	data[k] = data[k*2];
	data[k*2] = temp;
    }
    private void pushUp(int k){
	T temp = data[k];
	data[k] = data[k/2];
	data[k/2] = temp;
    }
    private void heapify(){
	for(int i=0; i<data.length/2; i++){
	    if(data[i].compareTo(data[i*2]) > 0 ||
	       data[i].compareTo(data[i*2+1]) > 0){
		pushDown(i);
	    }
	}
    }
    public T delete(){
	return data[0];
    }
    public void add(T x){
	
    }
    private void doubleSize(){
	size *= 2;
	T[] temp = (T[])new Comparable(size);
	for(int i=0; i<data.length; i++){
	    temp[i] = data[i];
	}
	data = temp;
    }
    public String toString(){
	return "";
    }
}
