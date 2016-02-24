import java.util.Scanner;
import java.io.*;

public class Bronze{
    int[][]map;
    int row, col, elevation, n;
    Scanner in;
    

    public Bronze(){
	map = new int[100][100];
	try{
	    in = new Scanner(new File("makelake.in"));
	}catch(FileNotFoundException e){
	    System.out.println("File does not exist!");
	}
	row = in.nextInt();
	col = in.nextInt();
	elevation = in.nextInt();
	n = in.nextInt();
	for(int r=0; r<row; r++){
	    for(int c=0; c<col; c++){
		map[r][c] = in.nextInt();
	    }
	}
    }


    public void stomp(int R_s, int C_s, int D_s){
	int max = map[R_s][C_s];
	for(int r=0; r<3; r++){
	    for(int c=0; c<3; c++){
		max = Math.max(max, map[R_s+r][C_s+c]);
	    }
	} 
	int d = max-D_s;
	for(int r=0; r<3; r++){
	    for(int c=0; c<3; c++){
		if(map[R_s+r][C_s+c] > d){
		    map[R_s+r][C_s+c]=d;
		}
	    }
	}
    }

    public int volume(){
	int vol = 0;
	for(int r=0; r<map.length; r++){
	    for(int c=0; c<map[r].length; c++){
		if(elevation-map[r][c] > 0){
		    vol += elevation-map[r][c];
		}
	    }
	}
	vol = vol * 72 * 72;
	return vol;
    }
    public static void main(String[]args){
	Bronze l = new Bronze();

	System.out.println(l.volume()+",6,Zheng,Yiru");
    }

}
