
public class Practice3_8 {
	public static void main(String[]args) {
		//practice3_3();
		practice3_6();
	}
	public static void practice3_1() {
		int weight = 60;
//		(age1 + age2) * 2 > 60;
//		age % 2 == 1;
//		name.equals("湊");
	}
	
	public static void practice3_3() {
		int isHungry = new java.util.Random().nextInt(2);;
		String food = "すき焼き";
		System.out.println("こんにちは");	
		if (isHungry == 0) {
			System.out.println("お腹いっぱいです");
		}else {
			System.out.println("腹ペコです");
			System.out.println(food + "をいただきます");
		}
		System.out.println("ご馳走様でした");
	}
	public static void practice3_5() {
		System.out.print("「」[メニュー]1:検索 2:登録 3:削除 4:変更");
		int selected = new java.util.Scanner(System.in).nextInt();
		//selected++;
		switch(selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
		}
	}
	public static void practice3_6() {
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
