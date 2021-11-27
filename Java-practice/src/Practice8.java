
public class Practice8 {
	public static void main(String[]args) {
		//1.勇者を生成
		Hero h = new Hero();
		h.name = "ハル";
		h.hp = 100;
		System.out.println("勇者" + h.name + "が誕生しました");
		
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}
}
