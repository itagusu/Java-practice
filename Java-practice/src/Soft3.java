
public class Soft3 {
	public static void main(String[]args) {
//		soft3_1();
//		soft3_2();
//		soft3_4();
//		soft3_6();
//		soft3_7();
//		soft3_8();
		soft3_10();
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
	public static void soft3_7() {
		System.out.println("スコアを入力");
		int score = new java.util.Scanner(System.in).nextInt();
		if (score >= 60 && score < 80) {
			System.out.println("合格！よくできました");
		}else if(score >= 80) {
			System.out.println("合格！大変よくできました");
		}else {
			System.out.println("不合格。残念でした");
		}
	}
	public static void soft3_8() {
//		両方とも 60 点以上の場合、合格
//		合計が 130 点以上の場合、合格
//		合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
//		上記以外は不合格
		System.out.println("中間テストの点数を入力");
		int midternTestScore = new java.util.Scanner(System.in).nextInt();
		System.out.println("期末テストの点数を入力");
		int finalTestScore = new java.util.Scanner(System.in).nextInt();
		if(midternTestScore >= 60 && finalTestScore >= 60) {
			System.out.println("合格");
		} else if((midternTestScore + finalTestScore) >=130) {
			System.out.println("合格");
		} else if((midternTestScore + finalTestScore) >=100 &&
				(midternTestScore >= 90 || finalTestScore >= 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}
	public static void soft3_10() {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		
		if(x < y && (x%2 == 0 && y%2 == 0))
		    System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );

		if( ～ 条件 ～ )
		    System.out.println( "xとyは等しく、かつ、負の数である。" );

		if( ～ 条件 ～ )
		    System.out.println( "xはyより小さい、または、xは偶数である。" );

		if( ～ 条件 ～ )
		    System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );

		if( ～ 条件 ～ )
		    System.out.println( "xもyも負の数である、ではない。" );
	}
}
