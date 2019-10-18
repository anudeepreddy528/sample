package Strings;

public class anagram {

	public static void main(String[] args) {
		String first = "fried";
		String second = "fierd";
		first.toLowerCase();
		second.toLowerCase();
		boolean res = isAnagram(first,second);
		if(res) {
			System.out.println("given Strings are anagram");
		}
		else {
			System.out.println("Not anagram");
		}
	}

	private static boolean isAnagram(String first, String second) {
		char one[] = first.toCharArray();
		char two[] = second.toCharArray();
		int d1=1,d2=1;
		if(one.length == two.length) {
			for(int i=0;i<one.length;i++) {
				d1=d1*one[i];
				d2=d2*two[i];
				System.out.println("d1:"+d1+"d2: "+d2);
			}
			if(d1 == d2) {
				return true;
			}
		}
		
		return false;
		
	}

}
