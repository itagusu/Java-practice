
public class Practice9 {
	public static void main(String[]args) {
		Hero h = new Hero();
		h.name = "はる";
		h.hp = 100;
		Sword s = new Sword();
		s.name = "秋水";
		s.damage = 10;
		h.sw = s;
		System.out.println("現在の武器は" + h.sw.name);
		
		h.attack();
	}
}
