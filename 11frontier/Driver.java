public class Driver{
    public static void main(String[]args){
	BetterMaze m = new BetterMaze();
	if(args.length() > 0){
	    m.solveBFS();
	}else{
	    m.solveDFS();
	}
    }

}
