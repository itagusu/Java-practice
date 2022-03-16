/*
 public static void main(String[]args) {
		
	}
 */


public class Hairetu {
	public static void main(String[]args) {
		
		int[] scores;
		scores = new int[5];
		int num = scores.length;
		System.out.println(num);
		
		int[] scores2 = {10,20,30,40,50};
		int sum = 0;
		int count = 0;
		for (int i = 0;i<scores2.length;i++) {
			System.out.println(scores2[i]);
			sum += scores2[i];
			if (scores2[i] >= 40) {
				count++;
			}
		}
		System.out.println("合計"+sum);
		System.out.println("平均"+sum/scores2.length);
		System.out.println("40点以上の教科は"+count+"教科あります");
		
//		for (int i = 0;i<scores2.length;i++) {
//			System.out.println(scores2[i]);
//		{
		
		//↑の繰り返しをこのように記述することができる
//		for (int value : scores2) {
//			System.out.println(value);
//		}
	}
}



