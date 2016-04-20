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
    }
    public String toString(){
	String s = "";
	if(left != null){
	    s+=left.toString();
	}
	return s;
    }

}
