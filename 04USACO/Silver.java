import java.util.Scanner;
import java.io.*;

public class Silver{
    int[][]board1, board2;
    int rows, cols, t;
    int r1, c1, r2, c2;
    int s;

    public Silver(){
	try{
	    Scanner input = new Scanner(new File("ctravel.in"));

	    String line = "";
	    rows = input.nextInt();
	    cols = input.nextInt();
	    t = input.nextInt();
	    board1 = new int[rows][cols];
	    for(int i=0; i<rows; i++){
		line = input.nextLine();
		for(int j=0; j<cols; j++){
		    if(line.charAt(j)=='*'){
			board1[i][j] = -1;
		    }else{
			board1[i][j] = 0;
		    }
		}
	    }
	    r1 = input.nextInt();
	    c1 = input.nextInt();
	    r2 = input.nextInt();
	    c2 = input.nextInt();
	    board1[r1][c1] = 1;
	    board2 = new int[rows][cols];
	}catch(FileNotFoundException e){
	    System.out.println("File does not exist!");
	}
    }

    public int solve(){
	for(int i=0; i<t; i++){
	    for(int r=0; r<rows; r++){
		for(int c=0; c<cols; c++){
		    board2[r][c] = board1[r+1][c] + board1[r-1][c] + 
			board1[r][c+1] + board1[r][c-1];
		}
	    }
	    for(int r=0; r<rows; r++){
		for(int c=0; c<cols; c++){
		    board1[r][c] = board2[r][c];
		}
	    }
	}
	return board1[r2][c2];
    }
    
    public int findPath(int r, int c){
	int path = 0;
	return path;
    }

    public static void main(String[]args){
	Silver c = new Silver();

	System.out.println(c.solve()+",6,zheng,yiru");
    }

}