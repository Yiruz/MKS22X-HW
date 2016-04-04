public class MyDeque<T>{
    private Object[] data;
    private int start, end;
    private int size;

    public MyDeque(){
	data = new Object[10];
	size = 0;
    }

    public void resize(){
	Object[] temp = new Object[data.length * 2];
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
