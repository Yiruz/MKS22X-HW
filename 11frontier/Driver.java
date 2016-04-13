public class Driver{
    public static void main(String[]args){
	BetterMaze m = new BetterMaze("data1.dat");
	if(args.length > 0){
	    m.solveBFS();
	}else{
	    m.solveDFS();
	}
	System.out.println(m);
    }

}
