package Strings;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class longsubstr {

	public static void main(String[] args) {
		String str = "pwwkeakrui";
		int max = substr(str);
		System.out.println("Max len is : "+max);
	}
	
	private static int substr(String str) {
		char c[] = str.toCharArray();
		int range;
		Set<Character> Gset = new LinkedHashSet<Character>();
		List<Character> list = new ArrayList<Character>();
		for(int i = 0; i < c.length; i++ ) {
			if(list.contains(c[i])) {
				range = list.indexOf(c[i]);
				if(Gset.size() < list.size()) 
				{
					Gset.clear();
					Gset.addAll(list);
				}
				list.subList(0,range+1).clear();
				list.add(c[i]);
			}
			else 
			{
				list.add(c[i]);
			}
		}
		if(Gset.size() < list.size()) {
			Gset.clear();
			Gset.addAll(list);
		}
		System.out.println(Gset);
		return Gset.size();
	}

}
