public class MyDeque<T>{
    private Object[] data;
    private int start, end;
    private int size;

    public MyDeque(){
	data = new Object[10];
	size = 0;
    }

    public Object[] resize(Object[] data){
	Object[] newAry = new Object[data.length * 2];
	for(int i=0; i<size; i++){
	    if(start == data.length-1){
		start = 0;
	    }
	    newAry[i] = data[start];
	}
	start = 0;
	end = size-1;
	return newAry;
    }
    public void addFirst(T value){
	if(size == 0){
	    data[0] = value;
	    start = 0;
	    end = 0;
	}else if(size == data.length){
	    resize(data);
	    data[data.length-1] = value;
	    start = data.length-1;
	}else if(start == 0){
	    data[data.length-1] = value;
	    start = data.length-1;
	}else{
	    data[start-1] = value;
	    start--;
	}
	size++;
    }
    public void addLast(T value){
	if(size == 0){}
    }

    public String toString(){
	String result = "[";
	for(int i=0; i<size; i++){
	    if(start == data.length-1){
		start 
	    }
	}
    }

    public static void main(String[]args){
	MyDeque d = new MyDeque();
	
    }
}
