
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

public class Practice3{
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4);
//		//switch文に書き換えることができる
//		if (fortune == 0) {
//			System.out.println("大吉");
//		}else if (fortune == 1) {
//			System.out.println("中吉");
//		}else if (fortune == 2) {
//			System.out.println("吉");
//		}else {
//			System.out.println("凶");
//		}
		switch(fortune) {
			case 0:
				System.out.println("大吉");
				break;
			case 1:
				System.out.println("中吉");
				break;
			case 2:
				System.out.println("吉");
				break;
			default:
				System.out.println("凶");
		}
	}
}