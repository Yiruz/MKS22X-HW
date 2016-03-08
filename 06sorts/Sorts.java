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
  

    //merge sort
    public static int[] merge(int[]aryA, int[]aryB){
	int[]newAry = new int[aryA.length + aryB.length];
	int a = 0;
	int b = 0;
	int i = 0;
	while(aryA.length>0 && aryB.length>0){
	    if(aryA[a] >= aryB[b]){
		newAry[i] = aryA[a];
		i+=1;
		a+=1;
	    }else{
		newAry[i] = aryB[b];
		i+=1;
		b+=1;
	    }
	}
	return newAry;
    }
    public static void mergesort(int[]data,int left,int right){
	if(data,length == 1){
	    
	}
	mergesort(data,0,);
	mergesort();
	merge();
    }


    public static void main(String[]args){
	int[]a = {0, -12, 43, 4};
	int[]b = {0, 12, 5, -6};
	//merge(a,b);
	System.out.println(merge(a,b));

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
