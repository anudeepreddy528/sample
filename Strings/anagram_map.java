package Strings;

import java.util.HashMap;
import java.util.Iterator;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class anagram_map {
	public static void main(String[] args) {
	String first = "silent";
	String second = "listen";
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
		Map<Character,Integer> map1 = new HashMap<Character,Integer>();
		Map<Character,Integer> map2= new HashMap<Character,Integer>();
		int i=0;
		int count;
		while(i<one.length) {
			count=0;
			if(map1.containsKey(one[i])){
				count = (int) map1.get(one[i]);
				count = count+1;
			}
			map1.put(one[i], count);
			i++;
		}
		i=0;
		while(i<two.length) {
			count=0;
			if(map2.containsKey(two[i])){
				count = (int) map2.get(two[i]);
				count = count+1;
			}
			map2.put(two[i], count);
			i++;
		}
		Set<Entry<Character, Integer>> s1 = map1.entrySet();
		Set<Entry<Character, Integer>> s2 = map2.entrySet();
		Iterator<Entry<Character, Integer>> itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		itr = s2.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		if(s1.equals(s2)) {
			return true;
		}
		return false;

	}

}
