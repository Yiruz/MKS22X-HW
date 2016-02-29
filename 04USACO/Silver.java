public class Silver{
    private int [][]board1, board2;
    private int n, m, t;
    private int r1, c1, r2, c2;

    public Silver(){
	try{
	    Scanner input = new Scanner(new File("ctravel.in"));
	}catch(FileNotFoundException e){
	    System.out.println("File does not exist!");
	}
	n = input.nextInt();
	m = input.nextInt();
	t = input.nextInt();
	String line = "";
	for(int i=0; i<n; i++){
	    line = input.nextLine();
	    for(int j=0; j<m; i+=0){
		if(line.charAt(j)=='.'){
		    board1[i][j] = 0;
		}
	    }
	     
	}
    }
}
