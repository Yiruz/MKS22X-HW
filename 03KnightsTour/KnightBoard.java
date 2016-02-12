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
