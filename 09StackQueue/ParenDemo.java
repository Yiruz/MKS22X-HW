public class ParenDemo{

    public static boolean isMatching(String s){
	MyStack<Character> c = new MyStack<Character>();
	for(int i=0; i<s.length(); i++){
	    if(charAt(i)=='(' || charAt(i)=='[' || charAt(i)=='{' || charAt(i)=='<'){
		c.push(i);
	    }
	    if(i == ')'){

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
