public class BetterMaze{

    //node class
    public class Node{
	int[] xy;
	Node from;

	public Node(int x,int y){
	    xy = new int[2];
	    xy[0] = x;
	    xy[1] = y;
	}
	public Node(int x, int y, Node from){
	    xy = new int[2];
	    xy[0] = x;
	    xy[1] = y;
	    this.from = from;
	}
	public void setPrev(Node n){
	    prev = n;
	}
	public Node getPrev(){
	    return from;
	}
	public int getRow(){
	    return xy[1];
	}
	public int getCol(){
	    return xy[0];
	}
    }

    private char[][] maze;
    private int[]    solution;
    private int      startRow,startCol;
    private Frontier<Node> placesToGo;
    private boolean  animate;

    /**return a copy of solution.
      This should be : [x1,y1,x2,y2,x3,y3...]
      *the coordinates of the solution from start to end.
      *Precondition :  solveBFS() OR solveDFS() has already been 
      * called (otherwise an empty array is returned)
      *Postcondition:  the correct solution is in the returned array
      **/
    public int[] solutionCoordinates(){   
        /** IMPLEMENT THIS **/      
	return solution;
    }    


    /**initialize the frontier as a queue and call solve
    **/
    public boolean solveBFS(){  
        /** IMPLEMENT THIS **/      
	return false;
    }   


   /**initialize the frontier as a stack and call solve
    */ 
    public boolean solveDFS(){  
        /** IMPLEMENT THIS **/  
	return false;
    }    

   /**Search for the end of the maze using the frontier. 
      Keep going until you find a solution or run out of elements on the frontier.
    **/
    private boolean solve(){  
        /** IMPLEMENT THIS **/
	int row = startRow;
	int col = startCol;
	Node head = new Node(col, row);
	if(maze[row][col] == 'E'){
	    return true;
	}

	if(moveable(col+1,row+1)){
	    maze[row][col] = '.';
	    row += 1;
	    col += 1;
	}
	if(moveable(col-1,row+1)){
	    maze[row][col] = '.';
	    row += 1;
	    col -= 1;
	}
	if(moveable(col+1,row-1)){
	    maze[row][col] = '.';
	    row -= 1;
	    col += 1;
	}
	Node n = new Node(col, row);
	placesToGo.add();
	
	return false;
    }    
     
    private boolean moveable(int row, int col){
	Char c = maze[row][col];
	return c == ' ' || c == 'E';
    }

   /**mutator for the animate variable  **/
    public void setAnimate(boolean b){
	animate = b;
    }    


    public BetterMaze(String filename){
	animate = false;
	int maxc = 0;
	int maxr = 0;
	startRow = -1;
	startCol = -1;
	//read the whole maze into a single string first
	String ans = "";
	try{
	    Scanner in = new Scanner(new File(filename));

	    //keep reading next line
	    while(in.hasNext()){
		String line = in.nextLine();
		if(maxr == 0){
		    //calculate width of the maze
		    maxc = line.length();
		}
		//every new line add 1 to the height of the maze
		maxr++;
		ans += line;
	    }
	}
	catch(Exception e){
	    System.out.println("File: " + filename + " could not be opened.");
	    e.printStackTrace();
	    System.exit(0);
	}
	System.out.println(maxr+" "+maxc);
	maze = new char[maxr][maxc];
	for(int i = 0; i < ans.length(); i++){
	    char c = ans.charAt(i);
	    maze[i / maxc][i % maxc] = c;
	    if(c == 'S'){
		startCol = i % maxc;
		startRow = i / maxc;
	    }
	}
    
}
