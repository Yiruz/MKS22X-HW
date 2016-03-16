public class MyLinkedList{
    private class LNode{
	int data;
	LNode next;

	public LNode(int d){
	    data = d;
	    // next = n;
	}
	public int getData(){
	    return data;
	}
	public LNode getNext(){
	    return next;
	}
	public void setData(int d){
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
    public boolean add(int value){
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
    public int get(int index){
	LNode cur = start;
	while(index > 0){
	    cur = cur.getNext();
	    index--;
	}
	return cur.getData();
    }
    public int set(int index,int newValue){
	LNode cur = start;
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

    }

}
