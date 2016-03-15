public class MyLinkedList{
    LNode start;
    int size;

    public boolean add(int value){
	LNode current = start;
	while(current != null){
	    current = current.getNext();
	    return false;
	}
        current.setData(value);
	return true;
    }
    public String toString(){
	String s = "[";
	LNode current = start;
	for(int i=0; i<size; i++){
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
