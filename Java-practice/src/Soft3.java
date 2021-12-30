
public class Soft3 {
	public static void main(String[]args) {
//		soft3_1();
//		soft3_2();
//		soft3_4();
		soft3_6();
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
		if((x%2)==0) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
	}
	public static void soft3_6() {
		System.out.println("数字を入力");
		int x = new java.util.Scanner(System.in).nextInt();
		if((x%2)==0) {
			if(x>=0) {
				System.out.println("正の偶数");
			}else {
				System.out.println("負の偶数");
			}
		}else {
			if(x>=0) {
				System.out.println("正の奇数");
			}else {
				System.out.println("負の奇数");
			}
		}
	}
}
