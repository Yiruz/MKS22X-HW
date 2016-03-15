public class MyLinkedList{
    LNode start;
    int size;

    public MyLinkedList(){
	start = null;
	size = 0;
    }
    public boolean add(int value){
	LNode current = start;
	if(start == null){
	    current = new LNode(value,null);
	}
	while(current != null){
	    current = current.getNext();
	    return false;
	}
	LNode val = new LNode(value, null);
        current.setNext(val);
	return true;
    }
    public String toString(){
	String s = "[";
	LNode current = start;
	while(current != null){
	    s += current.getNext() + ",";
	}
	s+="]";
	return s;
    }

    private class LNode{
	int data;
	LNode next;

	public LNode(int d, LNode n){
	    data = d;
	    next = n;
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

}
