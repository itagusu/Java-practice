
public class Soft3 {
	public static void main(String[]args) {
//		soft3_1();
//		soft3_2();
		soft3_4();
	}
	public static void soft3_1() {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		if (x > y) {
			System.out.println("xはyより大きい");
		}else {
			System.out.println("xはyより小さい");
		}
	}
	public static void soft3_2() {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		if (x > y) {
			System.out.println(x);
		}else {
			System.out.println(y);
		}
	}
	public static void soft3_4() {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		if( x > y )
		    System.out.println( "xはyより大きい。" );
		else if( x < y )
		    System.out.println( "xはyより小さい。" );
		else
		    System.out.println( "xとyは等しい。" );
	}
}
