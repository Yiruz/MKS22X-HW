public class KnightBoard{
    private int[][]board;

    public KnightBoard(int size){
	board = new int [size+4][size+4];
	for(int r=0; r<board.length; r++){
	    for(int c=0; c<board[r].length; c++){
		if(r<2 || r>board.length-3 || c<2 || c>board[r].length-3){
		    board[r][c]=-1;
		}else{
		    board[r][c]=0;
		}
	    }
	}
    }
    public KnightBoard(int rows, int cols){
	board = new int [rows+4][cols+4];
	for(int r=0; r<board.length; r++){
	    for(int c=0; c<board[r].length; c++){
		if(r<2 || r>board.length-3 || c<2 || c>board[r].length-3){
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
	if(step == (board.length-4)*(board[r].length-4)+1){
	    return true;
	}
	if(board[r][c]<0){
	    return false;
	}
	if(board[r][c]!=0){	    
	  return false;
	}
	board[r][c]=step;
	//System.out.println(toString());
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
	    board[r][c]=0;
	    step--;
	    //System.out.println(toString());
	return false;
	}
    }

    public void printSolution(){
	for(int r=2; r<board.length-2; r++){
	    for(int c=2; c<board[r].length-2; c++){
		if(board[r][c]<10){
		    System.out.print("0"+board[r][c]+"  ");
		}else{
		    System.out.print(board[r][c]+"  ");
		}
	    }
	    System.out.println();
	}
	System.out.println();
    }

    
}
