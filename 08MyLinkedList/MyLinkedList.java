public class MyLinkedList<T>{
    private class LNode<T>{
	T data;
	LNode next;

	public LNode(T d){
	    data = d;
	    // next = n;
	}
	public T getData(){
	    return data;
	}
	public LNode getNext(){
	    return next;
	}
	public void setData(T d){
	    data = d;
	}
	public void setNext(LNode n){
	    next = n;
	}
    }

    LNode start;
    int size;

    public MyLinkedList(){
	start = null;
	size = 0;
    }
    public boolean add(T value){
	if(start == null){
	    start = new LNode<T>(value);
	}else{
	    LNode<T> current = start;
	    while(current.getNext() != null){
		current = current.getNext();
	    }
	    LNode<T> val = new LNode<T>(value);
	    current.setNext(val);
	}
	size+=1;
	return true;
    }
    public boolean add(int index, T value){
	if(index>=size){
	    //throw new indexOutOfBoundsException();
	}else if(index == 0){
	    start = new LNode<T>(value);
	}else{
	    LNode<T> head = start;
	    for(int i=0; i<index-1;i++){
		head = head.getNext();
	    }
	    LNode<T> val = new LNode<T>(value);
	
	    return true;
	}
	return false;
    }
    /*public int remove(int index){
	return 0;
	}*/
    public int indexOf(T value){
	LNode<T> head = start;
	int index = 0;
        if(index == size){
	    return -1;
	}
	while(start.getData() != value){
	    start = start.getNext();
	    index+=1;
	}
	return index;
    }
    public String toString(){
	String s = "[";
	LNode<T> current = start;
	while(current != null){
	    s += current.getData();
	    if(current.getNext()!=null){
		s += ", ";
	    }
	    current = current.getNext();
	}
	s+="]";
	return s;
    }
    public int size(){
	return size;
    }
    public T get(int index){
	LNode<T> cur = start;
	if(index<0 || index >=size){
	    throw new IndexOutOfBoundsException();
	}
	while(index > 0){
	    cur = cur.getNext();
	    index--;
	}
	return cur.getData();
    }
    public T set(int index,T newValue){
	LNode<T> cur = start;
	while(index > 0){
	    cur = cur.getNext();
	    index--;
	}
	cur.setData(newValue);
	return cur.getData();
    }

    public static void main(String[]args){
	MyLinkedList m = new MyLinkedList();
	System.out.println(m);
	m.add(6);
	m.add(5);
	m.add(23);
        m.add(9);
	System.out.println(m);
	System.out.println(m.get(2));
	m.set(1,0);
	System.out.println(m);


    }

}
