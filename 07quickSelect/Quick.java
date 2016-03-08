public class Quick{
    
    private static int partition(int[]data, int left, int right){
	int ind = (int)(Math.random()*(right-left+1))+left;
	System.out.println(ind);
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

    public static void print(int[]data){
	String s = "[";
	for(int i=0; i<data.length; i++){
	    s+=data[i]+", ";
	}
	s+="]";
	System.out.println(s);
    }


    public static void main(String[]args){
	int[]data={-3,2,5,9,3,-5,34,0};
	print(data);
	System.out.println(partition(data,0,data.length-1));
	print(data);
    }
}