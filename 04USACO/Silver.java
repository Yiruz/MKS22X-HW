import java.util.Scanner;
import java.io.*;

public class Silver{
    private int[][]board1, board2;
    private int n, m, t;
    private int r1, c1, r2, c2;

    public Silver(){
	try{
	    Scanner input = new Scanner(new File("ctravel.in"));

	    n = input.nextInt();
	    m = input.nextInt();
	    t = input.nextInt();
	    String line = "";
	    for(int i=0; i<n; i++){
		line = input.nextLine();
		for(int j=0; j<m; j++){
		    if(line.charAt(j)=='.'){
			board1[i][j] = 0;
		    }else{
			board1[i][j] = -1;
		    }
		}
	    }

	    r1 = input.nextInt();
	    c1 = input.nextInt();
	    r2 = input.nextInt();
	    c2 = input.nextInt();

	}catch(FileNotFoundException e){
	    System.out.println("File does not exist!");
	}
    }


}