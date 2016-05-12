public class Driver{
    public static void main(String[]args){
	RunningMedian r = new RunningMedian();

	/*r.add(4);
	System.out.println(r.getMedian());
	r.add(2);
	System.out.println(r.getMedian());
	r.add(6);
	System.out.println(r.getMedian());
	r.add(7);
	System.out.println(r.getMedian());
	r.add(8);
	System.out.println(r.getMedian());
	r.add(9);
	System.out.println(r.getMedian());
	*/

	for(int i=0; i<20; i++){
	    r.add((int)(Math.random()*20-5));
	}

	System.out.println(r.getMedian());
		
    }
}