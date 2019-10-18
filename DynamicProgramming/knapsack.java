package DynamicProgramming;

public class knapsack {
	static int p[]= {60,100,120};
	static int w[]= {10,20,30};
	static int capacity=50;
	static int length=w.length;
	static int mem[][] = new int[length][capacity];
	
public static void main(String[] args) {
		int result = maxprofit(0,capacity);
		System.out.println("Max profit is "+result);		
	}
private static int maxprofit(int length, int capacity) {
	int inc,notinc,result;
	if(length == w.length || capacity == 0) {
		result=0;
	}
	else if(w[length] > capacity) {
		result = maxprofit(length+1, capacity);
	}
	else {
		notinc = maxprofit(length+1, capacity);
		inc    = p[length]+maxprofit(length+1, capacity - w[length]);
		result =  max(inc,notinc);
	}
	return result;
}
private static int max(int inc, int notinc) {
	if(inc > notinc) {
		return inc;
	}
	return notinc;
}

}
