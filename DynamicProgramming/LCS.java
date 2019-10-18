package DynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class LCS {

	public static void main(String[] args) {
		String str = "abcdabcaba";
		lengthstr(str);
	}

	private static void lengthstr(String str) {
		Set<Character> set = new HashSet<Character>();
		int ans=0,i=0,j=0;
		int temp[] = new int[2];
		int n = str.length();
		while(i<n && j<n) 
		{
			if(!set.contains(str.charAt(j))) 
			{
				set.add(str.charAt(j++));
                ans = Math.max(ans, j - i);
			}
			else
			{
				set.remove(str.charAt(i++));
			}
		}
		System.out.println("ans "+ans);
		for(Character c : set) {
			System.out.print(c+" ");
		}
	}

}
