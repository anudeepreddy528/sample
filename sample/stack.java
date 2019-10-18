package sample;

import java.util.Scanner;

public class stack {
	static String str[];
	static int i=0;
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 String input;
	 input = s.nextLine();
	  System.out.println("input is : "+input);
	  input=input.trim();
	  String arr[] =  input.split(" ");
	  str = new String[arr.length];
	  for(int i=0;i<arr.length;i++) {
		 int position=arr.length-1-i;
		 str[position--]=arr[i];
	  }
	  for(i=0;i<str.length;i++) {
		  System.out.print(str[i]+" ");
	  }
	}

}
