
//public class Practice4 {
//	public static void main(String[] args) {
//////		int[] scores;
//////		scores =  new int[5];と下記は同じ意味
////		int[] scores = new int[5];
////		scores[0] = 10;
////		scores[1] = 20;
////		scores[2] = 30;
////		scores[3] = 40;
////		scores[4] = 50; //6~11行目は下記と同じ意味(省略形)
//		int[] scores = {10, 20, 30, 40, 50};
//		int num = scores.length;
//		/* 例えばscores[5]と存在しない要素を記載した場合はArrayIndexOutOfBoundsExceptionのエラーが起きる
//		 * Array 要素, index 添え字　ここでは[5], OutOfBounds 範囲外　*/
//		int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
//		int avg = sum / 5;
//		System.out.println("教科数は" + num + "教科です");
//		System.out.println("合計点は" + sum + "点です");
//		System.out.println("平均点は" + avg + "点です");
//	}
//}

//public class Practice4{
//	public static void main(String[] args) {
//		int[] scores = {10, 20, 30, 40, 50, 60};
//		int num = scores.length;
//		int sum = 0;
//		int count = 0;
//		for (int i = 0; i < num; i++) {
//			if (scores[i] >= 50) {
//				count++;
//			}
//			sum += scores[i];
//		}
//		int avg = sum / num;
//		System.out.println("科目数は" + num + "科目です");
//		System.out.println("合計点は" + sum + "です");
//		System.out.println("平均点は" + avg + "です");
//		System.out.println("50点以上の科目の数は" + count + "科目です");
//	}
//}

//public class Practice4{
//	public static void main(String[] args) {
//		int[] seq = new int[10];
//		for (int i = 0; i < seq.length; i++) {
//			seq[i] = new java.util.Random().nextInt(4);
//		}
//		for (int i = 0; i < seq.length; i++) {
////			switch (seq[i]) {
////			case 0:
////				System.out.println("A");
////				break;
////			case 1:
////				System.out.println("T");
////				break;
////			case 2:
////				System.out.println("G");
////				break;
////			case 3:
////				System.out.println("C");
////				break;
////			}
//			//51~64行目を以下の２行で記載ができる
//			char[] base = {'A', 'T', 'G', 'C'};
//			System.out.print(base[seq[i]] + " ");
//		}
//	}
//}
//

//public class Practice4{
//	public static void main(String[] args) {
//		int[] scores = {20, 40, 60, 80, 100};
////		for (int i = 0; i < scores.length; i++) {
//		//拡張for文
//		for (int value : scores) {
////			System.out.println(scores[i]);
//			System.out.println(value);
//		}
//	}
//}

//public class Practice4{
//	public static void main(String[] args) {
//	int[] array = {1,2,3};
//	array[0] = 10;
//	System.out.println(array[0]);
//	array = null;
//	}
//}

////練習問題4-1
//int[] points = new points[4];
//double[] weights = new weights[5];
//boolean[] answers = new answers[3];
//String[] names = new names[3];

////練習問題4-2
//public class Practice4{
//	public static void main(String[] args) {
//		int[] moneyList = {121902, 8302, 55100};
//		for (int i = 0; i < moneyList.length; i++) {
//			System.out.println(moneyList[i]);
//		}
//	for (int m : moneyList) {
//		System.out.println(m);
//		}
//	}
//}

//練習問題4-4
public class Practice4{
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください！");
		int input = new java.util.Scanner(System.in).nextInt();
//		for (int n = 0; n < 3; n++) {
//			if (input == n);
//			System.out.println(numbers[n]);
//		}
		for (int n = 0; n < numbers.length; n++) {
			if (input == numbers[n]) {
				System.out.println("あたり");
			}
		}
	}
}
