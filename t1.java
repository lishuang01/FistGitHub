package ls;

public class t1{
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int b=1; b<=i; b++) {
				System.out.print(i+"*"+b+"="+(i*b)+"\t");
			}
			System.out.println();
		}
	}

}