//
//public class Operator {
//	public static void main(String[] args) {
//		int a = 20;
//		int b = a + 5;
//		System.out.println(a);
//		System.out.println(b);
//	}
//}

//public class Operator{
//	public static void main(String[] args) {
//		System.out.println("私の好きな記号は二重引用符(\")です");
//	}
//}

//public class Operator{
//	public static void main(String[] args) {
//		//本来int(整数型)に入らないdouble(少数型)を強制的に入れる
//		int age = (int)3.8;
//		System.out.println(age);
//	}
//}

//public class Operator{
//	public static void main(String[] args) {
//		double d = 5.0;
//		int i = 2;
//		System.out.println(d / i);
//	}
//}

//public class Operator{
//	public static void main(String[] args) {
//		double d = 8.8 / 2;
//		long l = 5 + 2L;
//		String msg = "私の年齢は" + 23;
//		System.out.println(d);
//		System.out.println(l);
//		System.out.println(msg);
//	}
//}

//命令実行の文
//public class Operator{
//	public static void main(String[] args) {
//		String name = "亮";
//		String message = name + "さん、こんにちは";
//		System.out.println(message);
//	}
//}

//public class Operator{
//	public static void main(String[] args) {
//		String name = "板楠";
//		//print => 改行を行わない
//		System.out.print("私の名前は");
//		System.out.println(name);
//		System.out.print("です");
//	}
//}

//public class Operator{
//	public static void main(String[] args) {
//		int a = 3;
//		int b = 5;
//		int m = Math.max(a, b);
//		System.out.println(a +"と" + b +"で大きいのは" + m + "です");
//	}
//}

//文字列を数値に変更する命令
//public class Operator{
//	public static void main(String[] args) {
//		String age = "27";
//		int n  = Integer.parseInt(age);
//		System.out.println("来年あなたは" + (n+1) + "歳になりますね。");
//	}
//}
//
////乱数を発生させる
//public class Operator{
//	public static void main(String[] args) {
//		int r = new java.util.Random().nextInt(100);
//		System.out.println("あなたは多分" + r + "歳ですね");
//	}
//}

//キーボードから１行の入力を受け取る命令
//public class Operator{
//	public static void main(String[] args) {
//		System.out.println("あなたの名前を入力してください");
//		String name = new java.util.Scanner(System.in).nextLine();
//		System.out.println("あなたの年齢を入力してください");
//		int age = new java.util.Scanner(System.in).nextInt();
//		System.out.println(name + "さんの年齢は" + age + "歳です");
//	}
//}

//public class Operator{
//	public static void main(String[] args) {
//		int x = 5;
//		int y = 10;
//		String ans = "x+yは" + (x+y);
//		System.out.println(ans);
//	}
//}

public class Operator{
	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました");
		System.out.println(age +"歳の" + name + "さん、あなたの運気番号は" + (fortune++) + "です。");
		System.out.println("1:大吉　2:中吉　3:吉　4:凶");
	}
}


