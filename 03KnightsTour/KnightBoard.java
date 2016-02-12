public class KnightBoard{
    private int[][]board;

    public KnightBoard(int size){
	board = new int [size+4][size+4];
	for(int r=0; r<board.length; r++){
	    for(int c=0; c<board.length; c++){
		if(r<2 || r>board.length-3 || c<2 || c>board.length-3){
		    board[r][c]=-1;
		}else{
		    board[r][c]=0;
		}
	    }
	}
	}
    /*public KnightBoard(int size){
	board = new int[size][size];
	}*/

    public boolean solve(){
	return solveH(2,2,1);
    }
    public boolean solveH(int r, int c, int step){
	if(step == board.length-4*board.length-4){
	    return true;
	}
	if(board[r][c]!=0){
	    
	    return false;
	}
	board[r][c]=step;
	System.out.println(toString());
	if(solveH(r+2, c+1, step+1) ||
	   solveH(r+2, c-1, step+1) ||
	   solveH(r-2, c+1, step+1) ||
	   solveH(r-2, c-1, step+1) ||
	   solveH(r+1, c+2, step+1) ||
	   solveH(r+1, c-2, step+1) ||
	   solveH(r-1, c+2, step+1) ||
	   solveH(r-1, c-2, step+1)){
	    return true;
	}else{
	    return
		solveH(r-2, c-1, step-1) ||
		solveH(r-2, c+1, step-1) ||
		solveH(r+2, c-1, step-1) ||
		solveH(r+2, c+1, step-1) ||
		solveH(r-1, c-2, step-1) ||
		solveH(r-1, c+2, step-1) ||
		solveH(r+1, c-2, step-1) ||
		solveH(r+1, c+2, step-1);
	}
	
	    }
    public boolean upRight(int r, int c, int step){
	if(board[r][c]!=0){
	    return false;
	}
	board[r][c]=step;
	return upRight(r+2, c-1, step-1);
    }
    /*public boolean solveH(int r, int c, int step){
	if(step == board.length-4*board.length-4){
	    return true;
	}
	return upRight(r, c, step);
	}*/

    public String toString(){
	String ans="";
	for(int r=2; r<board.length-2; r++){
	    for(int c=2; c<board.length-2; c++){
		ans+=board[r][c]+"\t";
	    }
	    ans+="\n";
	}
	return ans;
    }

    
}
