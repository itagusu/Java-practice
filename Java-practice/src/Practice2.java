
public class Practice2 {
	public static void main(String[]args) {
		//add();
		//add2();
		fortune();
	}
	
	public static void add() {
		int a = new java.util.Scanner(System.in).nextInt();
		int b = new java.util.Scanner(System.in).nextInt();
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c + "です");
		// ++a aに1プラスする
		System.out.println(++a);
	}
	public static void add2() {
		//x+yは15ですと表記させる
		int x = 5;
		int y = 10;
		String ans = "x+yは" + (x + y);
		//String ans = "x+yは" + x + y;だと510と表記される
		System.out.println(ans);
	}
	public static void fortune() {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java .util .Scanner (System .in ).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int age = new java.util.Scanner(System.in).nextInt();
		int fortune = new java.util.Random().nextInt(4);
		++fortune;
		System.out.println("占いの結果が出ました");
		if(fortune == 1) {
			System.out.println(age + "歳の" + name + "さんの運気は大吉");
		}else if(fortune == 2) {
			System.out.println(age + "歳の" + name + "さんの運気は小吉");
		}else if(fortune == 3) {
			System.out.println(age + "歳の" + name + "さんの運気は吉");
		}else {
			System.out.println(age + "歳の" + name + "さんの運気は凶");
		}
		System.out.println(age + "才の" + name + "さんの運気番号は" + fortune);
//		System.out.println("1:大吉　2:小吉　3:吉　4:凶");
	}
}
