public class Quick{
    
    //Old*************************************************
    private static int partitionOld(int[]data, int left, int right){
	int ind = (int)(Math.random()*(right-left+1))+left;
	//System.out.println(ind);
        int element = data[ind];
	data[ind] = data[right];
	data[right] = element;
	int i = left;
	int j = right-1;
	while(i <= j){
	    if(data[i]>element){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		j--;
	    }else{
		i++;
	    }
	}
        data[right] = data[j+1];
	data[j+1] = element;
	return j+1;
    }
    public static int quickselectOld(int[]data, int k){
	//System.out.println("k = "+k);
	return quickselectOld(data,k,0,data.length-1);
    }
    public static int quickselectOld(int[]data,int k,int left,int right){
	int ind = partitionOld(data,left,right);
	int val = 0;
	if(k == ind){
	    val = data[k];
	}else if(k > ind){
	    val = quickselectOld(data,k,ind+1,right);
	}else if(k < ind){
	    val = quickselectOld(data,k,left,ind-1);
	}
	return val;
    }
    public static void quickSortOld(int[]data){
	quickSortOld(data,0,data.length-1);
    }
    public static void quickSortOld(int[]data,int left,int right){
	if(left<right){
	    int ind = partitionOld(data,left,right);
	    quickSortOld(data,ind+1,right);
	    quickSortOld(data,left,ind-1);
	}
    }
    //***************************************************

    //new************************************************
    private static int[] partition(int[]data, int left, int right){
	int ind = (int)(Math.random()*(right-left+1))+left;
	int count = 1;
        int element = data[ind];
	//data[ind] = data[right];
	//data[right] = element;
	int i = left;
	int j = right;
	while(i <= j){
	    if(data[i] == element){
		count++;
	    }else if(data[i] > element){
		swap(data, i, j);
		j--;
	    }else if(data[i] < element){
		i++;
	    }
	}
        int[]par = new int[2];
	par[0] = i;
	par[1] = j;
	return par;
    }
    /*public static int quickselect(int[]data, int k){
	//System.out.println("k = "+k);
	return quickselect(data,k,0,data.length-1);
    }
    public static int quickselect(int[]data,int k,int left,int right){
	int ind = partition(data,left,right);
	int val = 0;
	if(k == ind){
	    val = data[k];
	}else if(k > ind){
	    val = quickselect(data,k,ind+1,right);
	}else if(k < ind){
	    val = quickselect(data,k,left,ind-1);
	}
	return val;
    }
    public static void quickSort(int[]data){
	quickSort(data,0,data.length-1);
    }
    public static void quickSort(int[]data,int left,int right){
	if(left<right){
	    int ind = partition(data,left,right);
	    quickSort(data,ind+1,right);
	    quickSort(data,left,ind-1);
	}
	}*/

    public static void swap(int[]data,int a,int b){
	int temp = data[a];
	data[a] = data[b];
	data[b] = temp;
    }

    public static void print(int[]data){
	String s = "[";
	for(int i=0; i<data.length-1; i++){
	    s+=data[i]+", ";
	}
	s+=data[data.length-1]+"]";
	System.out.println(s);
    }

    public static String name(){
	return "6,Zheng,Yiru";
    }
    public static void main(String[]args){
	int[]data = new int[400000];
	for(int i=0; i<data.length; i++){
	    data[i] = (int)(Math.random()*5)-3;
	}
	print(data);
	System.out.println(partition(data, 0, data.length-1));
	print(data);
	//quickSort(data);
	//print(data);
    }
}
