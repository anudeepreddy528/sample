package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int n=3;
		hanoiTower(n,1,2,3);
	}

	static void hanoiTower(int n, int source, int temp, int dest) {
		if(n == 1) {
			System.out.println("move disk 1 from "+source+"->"+dest);
		}
		if (n > 1) {
			hanoiTower(n-1,source,dest,temp);
			System.out.println("move disk "+n+" from "+source+ "->"+dest);
			hanoiTower(n-1,temp,source,dest);
		}
		}
		
	}
