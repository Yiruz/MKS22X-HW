import java.util.*;

public class MyDeque<T>{
    private T[] data;
    private int start, end;
    private int size;

    //@SuppressWarnings("unchecked")
    public MyDeque(){
	data = (T[])new Object[10];
	size = 0;
    }

    public void resize(){
	T[] temp = (T[])new Object[data.length * 2];
	for(int i=0; i<size; i++){
	    if(start == data.length-1){
		start = 0;
	    }
	    temp[i] = data[start+i];
	}
	data = temp;
	start = 0;
	end = size-1;
	size *= 2;
    }
    public void addFirst(T value){
	if(size == data.length){
	    resize();
	}	
	if(size == 0){
	    start = 0;
	    end = 0;
	}else if(start == 0){
	    start = data.length-1;
	}else{
	    start--;
	}
	data[start] = value;
	size++;
    }
    public void addLast(T value){
	if(size == data.length){
	    resize();
	}
	if(size == 0){
	    start = 0;
	    end = 0;
	}else if(end == data.length-1){
	    end = 0;
	}else{
	    end++;
	}
	data[end] = value;
	size++;
    }

    public T removeFirst(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	T temp = data[start];
	if(start == data.length-1){
	    start = 0;
	}else{
	    start++;
	}
	size--;
	return temp;
    }
    public T removeLast(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	T temp = data[end];
	if(end == 0){
	    end = data.length-1;
	}else{
	    end--;
	}
	size--;
	return temp;
    }
    
    public T getFirst(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	return data[start];
    }
    public T getLast(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	return data[end];
    }

    public String toString(){
	String result = "[";
	for(int i=0; i<size; i++){
	    if(start == data.length){
		start = 0;
	    }
	    result += i;
	    if(i < size-1){
		result +=",";
	    }
	}
	return result+"]";
    }

}
