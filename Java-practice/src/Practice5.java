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
//		add(100, 200, 0);
//		add(300, 400, 5);
//		add(5, 10, 1);
//		System.out.println("メソッド呼び出しを終了します");
//	}
//	public static void hello(String name) {
//		System.out.println(name + "さんこんにちは");
//	}
//	public static void add(int x, int y, int z) {
//		int ans = x + y + z;
//		System.out.println(x + "+" + y + "+" + z + "=" + ans);
//	}
//}

//戻り値
public class Practice5 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		int ans = add(300, 400, 5);
		System.out.println(ans);
		System.out.println("メソッド呼び出しを終了します");
	}
	public static int add(int x, int y, int z) {
		int ans = x + y + z;
		return ans;
	}
}
