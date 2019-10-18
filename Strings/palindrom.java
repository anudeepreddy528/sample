package Strings;

public class palindrom {
public static void main(String[] args) {
	String str = "nitin";
	char c[]=str.toCharArray();
	int i=0,j=c.length-1;
	boolean result = true;
	while(i<j || i==j) {
		if(c[i]!=c[j]) 
		{
			result=false;
			break;
		}
		i++;j--;
	}
	System.out.println("result is "+result);
}
}
