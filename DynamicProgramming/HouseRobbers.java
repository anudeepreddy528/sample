package DynamicProgramming;

import java.util.Arrays;

public class HouseRobbers {
	static int[] memo;
	public static void main(String[] args) {
		int house[] = {2,1,1,2};
		memo = new int[house.length];
		Arrays.fill(memo,-1);
		int max;
		max = rob(house);
		System.out.println("Max money is: "+max);
	}
    public static int rob(int[] house) {
    /*	if(i < 0)return 0;
    	if(memo[i] > 0)return memo[i];
    	int res = Math.max(rob(house,i-2)+house[i],rob(house,i-1));
    	memo[i] = res;	
       return memo[i];
    }
}*/

    	memo[0] = house[0];
    	memo[1] = Math.max(house[0], house[1]);
    	int var;
    	for(int i=2;i<house.length;i++) {
    		var = house[i];
    		memo[i] = Math.max(memo[i-2]+var, memo[i-1]);
    		System.out.println(memo[i]);
    	}
    	return memo[memo.length-1];
  	}
}
