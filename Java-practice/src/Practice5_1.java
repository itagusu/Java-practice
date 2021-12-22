
public class Practice5_1 {
	public static void main(String[]args) {
		System.out.println("helloメソッドを呼び出します");
		// helloメソッドを呼び出す
		hello("熊本市北区","はる",0);
		hello("山鹿市","みゆ",27);
		int ans = add(100, 200, 0);
		add(300, 400, 5);
		add(5, 10, 1);
		System.out.println(ans);
		System.out.println("メソッド呼び出しを終了します");
	}
	// helloメソッドを作成
	public static void hello(String address,String name,int age) {
		System.out.println(address+"にお住みの"+name +"さん、こんにちは"+"("+age+"歳)");
	}
	public static int add(int x, int y, int z) {
		int ans = x + y + z;
		return ans;
	}
}
