public class MyLinkedList<T> /*implements Iterable<T>*/{
    /*
      public class iter implements Iterator<T>{
      private LNode next;
      public iter(){next = head;}
      public boolean hasNext(){return next != null;}
      public T next(){
      if(!hasNext()){
      throw new 
      }
      T ans = next.getData();
      next = next.getNext();
      return ans;}
      public void remove(){
      throw new UnsupportedOperationException();
      }
      }
      public Iterator<T> iterator(){
      return new iter();
      }
     */
    private class LNode{
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
	public T setData(T d){
	    T old = data;
	    data = d;
	    return old;
	}
	public LNode setNext(LNode n){
	    LNode old = next;
	    next = n;
	    return old;
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
	    start = new LNode(value);
	}else{
	    LNode current = start;
	    while(current.getNext() != null){
		current = current.getNext();
	    }
	    LNode val = new LNode(value);
	    current.setNext(val);
	}
	size+=1;
	return true;
    }
    public boolean add(int index, T value){
	if(index > size() || index < 0){
	    throw new IndexOutOfBoundsException();
	}else if(index == 0){
	    start = new LNode(value);
	}else{
	    LNode head = start;
	    for(int i=0; i<index-1;i++){
		head = head.getNext();
	    }
	    LNode val = new LNode(value);
	    val.setNext(head.getNext());
	    head.setNext(val);
	    size++;
	    return true;
	}
	return false;
    }
    /*public int remove(int index){
	return 0;
	}*/
    public int indexOf(T value){
	LNode head = start;
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
	LNode current = start;
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
	LNode cur = start;
	if(index<0 || index >=size()){
	    throw new IndexOutOfBoundsException();
	}
	while(index > 0){
	    cur = cur.getNext();
	    index--;
	}
	return cur.getData();
    }
    public T set(int index,T newValue){
	LNode cur = start;
	if(index<0 || index >= size()){
	    
	}
	while(index > 0){
	    cur = cur.getNext();
	    index--;
	}
	cur.setData(newValue);
	return cur.getData();
    }

    /* public static void main(String[]args){
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


	}*/

}
