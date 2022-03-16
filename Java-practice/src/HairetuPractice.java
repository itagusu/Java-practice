
public class HairetuPractice {
	public static void main(String[]args) {		
		//4_1
//		int[] points = new int[4];
//		double[] weights = new double[5];
		
		//4_2
//		int[] moneyList = {121902,8302,55100};
//		int i;
//		int num1=moneyList.length;
//		for (i=0;i<num1;i++) {
//			System.out.println(moneyList[i]);
//		}
//		for (int value : moneyList) {
//			System.out.println(value);
//		}
		
		//4_4
		int[] numbers = {3,4,9};
		System.out.println("一桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i = 0;i<numbers.length;i++) {
			if (numbers[i] == input) {
				System.out.println("あたり");
				break;
			} else {
				System.out.println("はずれ");
			}
		}
	}
}
