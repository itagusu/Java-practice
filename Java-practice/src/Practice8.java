
public class Practice8 {
	public static void main(String[]args) {
		//1.勇者を生成
		Hero h = new Hero();
		h.name = "ハル";
		h.hp = 100;
		System.out.println("勇者" + h.name + "が誕生しました");
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		m1.run();
		m2.run();
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}
}
