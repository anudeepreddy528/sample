package numbers;

public class armstrong {

	public static void main(String[] args) {
		int number=371,temp=0,temp1,orginal=371;
		while(number > 0) {
			temp1 = number%10;
			System.out.println(temp1);
			temp = temp+(temp1*temp1*temp1);
			number = number/10;
		}
		System.out.println(temp);
		if(temp == orginal) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
	}

}
