
public class Practice5_1 {
	public static void main(String[]args) {
		System.out.println("helloメソッドを呼び出します");
		// helloメソッドを呼び出す
		hello("熊本市北区","はる",0);
		hello("山鹿市","みゆ",27);
	}
	// helloメソッドを作成
	public static void hello(String address,String name,int age) {
		System.out.println(address+"にお住みの"+name +"さん、こんにちは"+"("+age+"歳)");
	}
}
