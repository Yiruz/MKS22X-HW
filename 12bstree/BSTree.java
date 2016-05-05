
public class BSTree<T extends Comparable<T>>{
    Node root;

    public class Node{
	Node left, right;
	T data;

	public Node(T d){
	    data = d;
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
	    String s = data + " ";
	    if(left != null){
		s += left.toString();
	    }else{
		s += "_ ";
	    }
	    if(right != null){
		s += right.toString();
	    }else{
		s += "_ ";
	    }
	    return s;
	}
	public int height(){
	    int lefth = 0;
	    int righth = 0;
	    if(left == null && right == null){
		return 1;
	    }
	    if(left != null){
		lefth += left.height();
	    }
	    if(right != null){
		righth += right.height();
	    }
	    return 1 + Math.max(lefth,righth);
	}
	//when they are equal?
	public void add(T value){
	    if(value.compareTo(data) < 0){
		if(left == null){
		    setLeft(new Node(value));
		}else{
		    left.add(value);
       		}
	    }
	    if(value.compareTo(data) > 0){
		if(right == null){
		    setRight(new Node(value));
		}else{
		    right.add(value);
		}
	    }
	}
	public boolean contains(T value){
	    if(data.compareTo(value) == 0){
		return true;
	    }else if(data.compareTo(value) > 0 && left != null){
		return left.contains(value);
	    }else if(right != null){
		return right.contains(value);
	    }
	    return false;
	}
    }

    public BSTree(){
	root = null;
    }
    public BSTree(T val){
	root = new Node(val);
    }

    public void add(T val){
	if(root == null){
	    root = new Node(val);
	}else{
	    root.add(val);
	}
    }
    public String toString(){
	if(root == null){
	    return "";
	}else{
	    return root.toString();
	}
    }
    public boolean contains(T value){
	if(root == null){
	    return false;
	}else{
	    return root.contains(value);
	}
    }
    public int height(){
	if(root == null){
	    return 0;
	}else{
	    return root.height();
	}
    }
}
