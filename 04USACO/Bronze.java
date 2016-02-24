import java.util.Scanner;
import java.io.*;

public class Bronze{
    int[][]map;
    int row, col, elevation, n;
    Scanner in;
    int[][]command;

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
	command = new int[n][3];
	for(int i=0; i<n; i++){
	    for(int j=0; j<3; j++){
		command[i][j]=in.nextInt();
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
    public void stomp(){
	for(int i=0; i<n; i++){
	    stomp(command[i][0], command[i][1], command[i][2]);
	}
    }

    public void fill(){
	for(int r=0; r<map.length; r++){
	    for(int c=0; c<map[r].length; c++){
		map[r][c] = elevation - map[r][c];
		if(map[r][c]<0){
		    map[r][c] = 0;
		}
	    }
	}
    }
    public int volume(){
	int vol = 0;
	for(int r=0; r<map.length; r++){
	    for(int c=0; c<map[r].length; c++){
		vol += map[r][c];
	    }
	}
	vol = vol * 72 * 72;
	return vol;
    }
    public static void main(String[]args){
	Bronze l = new Bronze();
	
	l.stomp();
	System.out.println(l.volume()+",6,Zheng,Yiru");
    }

}
