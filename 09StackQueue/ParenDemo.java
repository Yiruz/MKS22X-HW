public class ParenDemo{

    public static boolean isMatching(String s){
	MyStack<Character> c = new MyStack<Character>();
	for(int i=0; i<s.length(); i++){
	    if(s.charAt(i)=='(' || s.charAt(i)=='[' || 
	       s.charAt(i)=='{' || s.charAt(i)=='<'){
		c.push(s.charAt(i));
	    }else{
		if(s.charAt(i) == ')'){
		    if(c.peek() == '('){
			c.pop();
		    }else{
			return false;
		    }
		}else
		if(s.charAt(i) == ']'){
		    if(c.peek() == '['){
			c.pop();
		    }else{
			return false;
		    }
		}else
		if(s.charAt(i) == '}'){
		    if(c.peek() == '{'){
			c.pop();
		    }else{
			return false;
		    }
		}else
		if(s.charAt(i) == '>'){
		    if(c.peek() == '<'){
			c.pop();
		    }else{
			return false;
		    }
		}
		if(c.isEmpty() && (s.charAt(i)==')' || s.charAt(i)==']' || 
				   s.charAt(i)=='}' || s.charAt(i)=='>')){
		    System.out.println("closing without opening");
		    return false;
		    
		}
	    }
	}
	return c.isEmpty();
    }

    public static void main(String[]args){
	String input = "()()(([[]]))";
	if(args.length > 0){
	    input = args[0];
	    System.out.println( isMatching(input)); 
	}else{
	    System.out.println("Usage:"); 
	    System.out.println("java ParenDemo \"text\""); 
	}
	
    }

}
