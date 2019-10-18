package DynamicProgramming;

public class pow {
public static void main(String[] args) {
	int e=31;
	int b=2;
	int res = power(b,e);
	System.out.println(res);
}
private static int power(int b,int e) {
int result=1;
if(e == 0) {
	result = 1;
}
else if(e < 0) {
	result = b*power(b,e+1);
}
else if(e == 1) {
	result = b;
}
else {
	result = b*power(b,e-1);	
}
return result;

}
}
