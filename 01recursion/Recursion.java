public class Recursion implements hw01{
    public String name(){
	return "Zheng,Yiru";
    }
    public double sqrt(double n){
	if(n<0){
	    throw new IllegalArgumentException();
	}
	return helper(n, n/2);
    }


    public double helper(double n, double guess){
	if(n==0){
	    return 0;
	}else
	if(Math.abs((n-(guess*guess))/n) < 0.001){
	    return guess;
	}else{
	    return helper(n, (n/guess + guess)/2);
	}
    }
    public double percentError(double n, double guess){
	return Math.abs(n-(guess*guess)/n) * 100;
    }

}