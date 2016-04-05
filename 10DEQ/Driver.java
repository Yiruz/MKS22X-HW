public class Driver{
    public static void main(String[]args){
	MyDeque<Integer> d = new MyDeque<Integer>();
	d.addFirst(3);
	d.addFirst(4);	
	System.out.println(d);
	d.addFirst(8);
	d.addLast(5);
	System.out.println(d);

    }

}
