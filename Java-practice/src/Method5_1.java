
public class Method5_1 {
	public static void main(String[]args) {
		System.out.println("メソッド呼び出し");
		int month = new java.util.Scanner(System.in).nextInt();
		hello("板楠亮",month,6);
		hello("板楠優李",5,31);
		System.out.println("メソッド呼び出し完了");
	}
	
	public static void hello(String name,int month,int day) {
		System.out.println(name+"は"+month+"月"+day+"日生まれです");
		//hello2();
	}
	
	public static void hello2() {
		System.out.println("板楠悠");
	}
}
