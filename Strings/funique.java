package Strings;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class funique {
	public static void main(String[] args) {
		String str = "leetcode";
		str.toLowerCase();
		uniquechar(str);
	}
	private static void uniquechar(String str) {
		char arr[]=str.toCharArray();
		Map<Character,Integer> map =new LinkedHashMap<Character,Integer>();
		int count;
		for(char c : arr) {
			count = 0;
			if(map.containsKey(c)){
				count = map.get(c);
				count = count+1;
			}
			map.put(c, count);
		}
		
		Iterator<Map.Entry<Character,Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			String string[] =itr.next().toString().split("=");
			if(string[1].matches("0")) {
				System.out.println("First unique charcter :"+string[0]);
				break;
			}
		}
		}		
}
