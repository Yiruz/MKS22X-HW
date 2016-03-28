public class test{
    public static void main(String[]args){
	Recursion r = new Recursion();

	System.out.println(r.name());
	System.out.println(r.sqrt(0));
	System.out.println(r.sqrt(1));
	System.out.println(r.sqrt(2));
	System.out.println(r.sqrt(4));
	System.out.println(r.sqrt(100));
	System.out.println(r.sqrt(0.000000000001));
	System.out.println(r.sqrt(-1));
    }
}