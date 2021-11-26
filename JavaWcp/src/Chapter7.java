public class Chapter7 {
	public static void main(String[]args) {
	//問題１
//		System.out.println("距離を入力");
//		int distance = new java.util.Scanner(System.in).nextInt();
//		if (distance <= 5){
//			System.out.println("とても近いです");
//		} else if(distance <= 10){
//			System.out.println("近いです");
//		} else if(distance <= 15) {
//			System.out.println("遠いです");
//		} else {
//			System.out.println("かなり遠いです");
//		}
	//問題２
		System.out.println("好きな色を入力");
		String color = new java.util.Scanner(System.in).nextLine();
		switch(color) {
		case "赤" :
			System.out.println("赤");
			break;
		case "青" :
			System.out.println("青");
			break;
		default:
			System.out.println("色");
			break;
		}
	}
}
