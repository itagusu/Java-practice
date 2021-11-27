
//public class Chapter9 {
//	public static void main(String[]args) {
//		int num = number(1);
//		while(num <= 5) {
//			System.out.println(num * num);
//			num++;
//		}
//	}
//	public static int number(int x) {
//		int num = x;
//		return num;
//	}
//}

public class Chapter9 {
	public static void main(String[]args) {
		//hairetu();
		kakutyo();
		
	}
	public static void hairetu() {
		int array[] = {1,2,3,8};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static void kakutyo() {
		int array[] = {1,2,3,4,5};
		for (int n : array) {
			if (n % 2 == 0) {
				continue;
			}
			System.out.println(n);
		}
	}
}