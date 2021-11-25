//メソッドの定義
//public class Practice5 {
//	public static void main(String[] args) {
//		System.out.println("メソッドを呼び出します");
//		hello();
//		yea();
//		System.out.println("メソッドの呼び出しが終わりました");
//	}
//	public static void hello() {
//		System.out.println("helloメソッド、こんにちは");
//		System.out.println("helloメソッド、こんばんは");
//	}
//	public static void yea() {
//		System.out.println("yeaメソッド");
//	}
//}

//public class Practice5{
//	public static void main(String[] args) {
//		methodA();
//	}
//	public static void methodA() {
//		System.out.println("methodA");
//		methodB();
//	}
//	public static void methodB() {
//		System.out.println("methodB");
//	}
//}

//public class Practice5 {
//	public static void main(String[] args) {
//		System.out.println("メソッドを呼び出します");
//		hello("板楠");
//		hello("河原");
//		int ans = add(100, 200, 0);
////		add(300, 400, 5);
////		add(5, 10, 1);
//		System.out.println(ans);
//		System.out.println("メソッド呼び出しを終了します");
//	}
//	
//	public static void hello(String name) {
//		System.out.println(name + "さんこんにちは");
//	}
//	public static int add(int x, int y, int z) {
//		int ans = x + y + z;
//		return ans;
//		
//	}
//}

//public class Practice5{
//	public static void incArray(int[] array) {
//		for (int i = 0; i < array.length; i++){
//			array[i]++;
//		}
//	}
//	public static void main(String[]args) {
//		int[] array = {1,2,4};
//		incArray(array);
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//	}
//}

//練習問題
//public class Practice5{
//	public static void introduceOneself() {
//		String name = "板楠亮";
//		int age = 27;
//		double tall = 172.5;
//		char eto = '犬';
//		System.out.println("こんにちは。名前は"+name+"と申します。歳は"+age+"歳です。"+
//				"身長は"+tall+"cmです。"+eto+"年です。");
//	}
//	public static void email(String title,String address,String text) {
//		
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名:" + title);
//		System.out.println("本文:" + text);
//	}
//	public static void email(String address, String text) {
//		System.out.println(address + "に、以下のメールを送信しました");
//		System.out.println("件名:無題");
//		System.out.println("本文:" + text);
//	}
//	public static void main(String[]args) {
////練習問題5-1
////		introduceOneself();
////練習問題5-2
//		String title = "明日の件";
//		String address = "ir060906@gmail.com";
//		String text = "明日は予定通り１０時に自宅に向かいます。";
//		email(title,address,text);
//		email(address,text);
//	}
//}

public class Practice5{
	public static void main(String[] args) {
		double triangle = calcTriangleArea(10,5);
		System.out.println("底辺が10.0cm 高さが5.0cmの場合 面積は" + triangle + "㎠");
		double circle = calcCircleArea(5);
		System.out.println("円の半径が5.0cmの場合 円の面積は" + circle + "㎠");
	}
	public static double calcTriangleArea(double bottom, double height) {
		double triangle = bottom * height / 2;
		return triangle;
	}
	public static double calcCircleArea(double radios) {
		double π = 3.14;
		double circle = radios * radios * π;
		return circle;
	}
}