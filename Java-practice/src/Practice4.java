
public class Practice4 {
	public static void main(String[] args) {
////		int[] scores;
////		scores =  new int[5];と下記は同じ意味
//		int[] scores = new int[5];
//		scores[0] = 10;
//		scores[1] = 20;
//		scores[2] = 30;
//		scores[3] = 40;
//		scores[4] = 50; //6~11行目は下記と同じ意味(省略形)
		int scores[] = {10, 20, 30, 40, 50};
		int num = scores.length;
		/* 例えばscores[5]と存在しない要素を記載した場合はArrayIndexOutOfBoundsExceptionのエラーが起きる
		 * Array 要素, index 添え字　ここでは[5], OutOfBounds 範囲外　*/
		int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
		int avg = sum / 5;
		System.out.println("教科数は" + num + "教科です");
		System.out.println("合計点は" + sum + "点です");
		System.out.println("平均点は" + avg + "点です");
	}
}
