public class ParenDemo{

    public static boolean isMatching(String s){
	MyStack<Character> c = new MyStack<Character>();
	for(i : s){
	    if(c.peek() == '('){
		c.push(i);
	    }
	}
    }

    public static void main(String[]args){
	String input = "";
	if(args.length > 0){
	    input = args[0];
	    System.out.println(isMatching(input));
	}
	
    }

}
