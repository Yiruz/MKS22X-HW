import java.util.*;
public class Sorts{
    public static void insertionSort(int[]data){
	for(int i=1;i<data.length;i++){
	    int current = data[i];
	    int j=i;
	    while(j>0 && current<data[j-1]){
		data[j]=data[j-1];
		data[j-1]=current;
		j--;
	    }
	}
    }
    public static void selectionSort(int[]data){
	System.out.println("Start");
	for(int i=0;i<data.length;i++){
	    int first = i;
	    for(int j=i;j<data.length;j++){
		if(data[first]>data[j]){
		    first=j;
		}
	    }
	    int temp = data[first];
	    data[first]=data[i];
	    data[i]=temp;
	    System.out.println(Arrays.toString(data));
	}
	System.out.println("End");
    }
    public static void bubbleSort(int[]data){
	boolean swap = false;
	System.out.println("Start");
	int end = data.length;
	for(int i=0;i<end;i++){
	    for(int j=0;j<end-1;j++){
		if(data[j]>data[j+1]){
		    int temp = data[j];
		    data[j]=data[j+1];
		    data[j+1]=temp;
		    swap = true;
		    System.out.println(Arrays.toString(data));
		}
	    }
	    if(!swap){
		System.out.println(Arrays.toString(data));
		return;
	    }
	    end--;
	}
    }
  
    //merge sort-------------------------------------------
    public static void merge(int[]data,int startA,int endA,int startB,int endB){
	int[]copy = new int[endB-startA+1];
	int ind = 0;
	int s = startA;
	while(startA<=endA && startB<=endB){
	    if(data[startA]<=data[startB]){
		copy[ind] = data[startA];
		startA++;
		ind++;
	    }else{
		copy[ind] = data[startB];
		startB++;
		ind++;
	    }
	}
	for(int i=0;i<copy.length;i++){
	    data[s] = copy[i];
	    s++;
	}
    }
    public static void mergesort(int[]data,int left,int right){
	if(left<right){
	    mergesort(data,left,(left+right)/2-1);
	    mergesort(data,(left+right)/2,right);
	    merge(data,left,(left+right)/2-1,(left+right)/2,right);
	}
    }
    public static void mergesort(int[]data){
	mergesort(data,0,data.length-1);
    }
	


    public static void main(String[]args){
	int[]a = {0, -12, 43, 4, 3, 57, 7};
	int[]b = {0, 12, 5, -6, 8, -2};
	System.out.println(Arrays.toString(a));
	mergesort(a);
	System.out.println(Arrays.toString(a));

	/*int[]data=new int[5];
	for(int i=0;i<data.length;i++){
	    data[i]=(int)(Math.random()*100-50);
	}
	int[]copy=new int[5];
	for(int i=0;i<data.length;i++){
	    copy[i]=data[i];
	}
	System.out.println(Arrays.toString(data));
	bubbleSort(data);
	System.out.println(Arrays.toString(data));
	selectionSort(copy);
	System.out.println(Arrays.toString(data));*/
	
	}
}
