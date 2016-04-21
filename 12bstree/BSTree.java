public class BSTree<T extends comparable<T>>{
    Node root;

    public class Node{
	Node left, right;
	T data;

	public Node(T d, Node l, Node r){
	    data = d;
	    left = l;
	    right = r;
	}
	public T getData(){
	    return data;
	}
	public void setData(T d){
	    data = d;
	}
	public Node getLeft(){
	    return left;
	}
	public void setLeft(Node l){
	    left = l;
	}
	public Node getRight(){
	    return right;
	}
	public void setRight(Node r){
	    right = r;
	}
	public String toString(){
	    String s = "";
	    if(left != null){
		s+=left.toString();
	    }
	    s+=data+" ";
	    if(right != null){
		s+=right.toString();
	    }
	    return s;
	}
	public int height(){
	    int h = 0;
	    if(left==null && right==null){
		h = 1;
	    }else{
		h = 1+Math.max(left.height(),right.height());
	    }
	    return h;
	}
	public void add(T value){
	    if(data.compareTo(value)<0){
		Node n = new Node(value,null,null);
	    }
	}
	public boolean contains(T value){
	    if(data < value){
		
	    }
	    return false;
	}
    }
}
