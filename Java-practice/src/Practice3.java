
//public class Practice3 {
//	public static void main(String[] args) {
//		boolean tenki = false;
//		if (tenki == true) {
//			System.out.println("洗濯をして散歩にいきます");
//		} else {
//			System.out.println("家でDVDを見ます");
//		}
//	}
//}
//
//public class Practice3{
//	public static void main(String[] args) {
//		boolean door = false;
//		while (door == true) {
//			System.out.println("ドアをノックします");
//			System.out.println("１分待ちます");
//		}
//	}
//}

//public class Practice3{
//	public static void main(String[] args) {
//		System.out.println("あなたの運勢を占います");
//		int fortune = new java.util.Random().nextInt(4);
////		//switch文に書き換えることができる
////		if (fortune == 0) {
////			System.out.println("大吉");
////		}else if (fortune == 1) {
////			System.out.println("中吉");
////		}else if (fortune == 2) {
////			System.out.println("吉");
////		}else {
////			System.out.println("凶");
////		}
//		switch(fortune) {
//			case 0:
//				System.out.println("大吉");
//				break;
//			case 1:
//				System.out.println("中吉");
//				break;
//			case 2:
//				System.out.println("吉");
//				break;
//			default:
//				System.out.println("凶");
//		}
//	}
//}

//public class Practice3{
//	public static void main(String[] args) {
//		System.out.println("あなたの運勢を占います");
//		int fortune = new java.util.Random().nextInt(5) + 1;
//		switch(fortune) {
//			case 1:
//			case 2:
//				System.out.println("いいね");
//				break;
//			case 3:
//				System.out.println("普通");
//				break;
//			case 4:
//			case 5:
//				System.out.println("うーん・・・");
//		}
//	}
//}

//public class Practice3{
//	public static void main(String[] args) {
//		for (int i = 0; i < 20; i++) {
//			System.out.println(i);
//		}
//	}
//}

//public class Practice3{
//	public static void main(String[] args) {
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.print(i * j);
//				System.out.print(" "); //空白
//			}
//		System.out.println(" "); //改行
//		}
//	}
//}

//3.8 練習問題
//①変数weightの値が60に等しい
	//weight == 60
//②変数age1とage2を合計して2倍したものが60を超えている
	//(age1 + age2) * 2 > 60
//③変数ageが奇数である
	//age = age + 1
	//age % 2 == 1 が正解
//④変数 nameの中身の文字列が「湊」と等しい
	//name.equals("湊");

//public class Practice3{
//	public static void main(String[] args) {
//		int isHungry = 1;
//		String food = "チャーハン";
//		System.out.println("こんにちは");
//		if (isHungry == 0) {
//			System.out.println("お腹がいっぱいです");
//		} else {
//			System.out.println("腹ペコです");
//			System.out.println(food + "をいただきます");
//		}
//		
//		System.out.println("ご馳走様でした");
//	}
//}
//
//public class Practice3{
//	public static void main(String[] args) {
//		System.out.print("「[メニュー] 1:検索 2:登録 3:削除 4:変更");
//		int selected = new java.util.Scanner(System.in).nextInt();
//		switch (selected) {
//			case 1 :
//				System.out.println("検索します");
//				break;
//			case 2 :
//				System.out.println("登録します");
//				break;
//			case 3 :
//				System.out.println("削除します");
//				break;
//			case 4 :
//				System.out.println("変更します");
//				break;
//			default :
//				System.out.println("何もしない");
//		}
//	}
//}

public class Practice3{
	public static void main(String[] args) {
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を選択してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲーム終了");
	}
}