package numbers;
public class reverse {
	public static void main(String[] args) {
		int number=125,rev=0,temp;
		while(number>0) {
			temp   = number%10;
			rev    = (rev*10)+temp;
			number = number/10;
		}
		System.out.println(rev);
		}

	}
