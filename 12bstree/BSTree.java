
public class BSTree<T extends Comparable<T>>{
    Node root;

    public class Node{
	Node left, right;
	T data;

	public Node(T d){
	    data = d;
	    //left = l;
	    //right = r;
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
	    /*   if(left == null && right == null){
		return data + " "+"_"+" "+"_";
	    }else if(left==null){
		return data + " "+"_"+right.toString();
	    }else if(right == null){
		return data + left.toString()+" "+"_";
	    }else{
		return data + " "+left.toString()+" "+right.toString();
		}*/
	    String s = data + " ";
	    if(left != null){
		s += left.toString();
	    }else{
		s += "_";
	    }
	    if(right != null){
		s += right.toString();
	    }else{
		s += "_";
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
	//when they are equal?
	public void add(T value){
	    if(value.compareTo(data) < 0){
		if(left == null){
		    left = new Node(value);
		}else{
		    left.add(value);
       		}
	    }
	    if(value.compareTo(data) > 0){
		if(right == null){
		    right = new Node(value);
		}else{
		    right.add(value);
		}
	    }
	}
	public boolean contains(T value){
	     if(value.compareTo){
		
	     }
	    return false;
	}
    }
}
