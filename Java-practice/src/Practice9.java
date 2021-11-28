
public class Practice9 {
	public static void main(String[]args) {
		Hero h1 = new Hero();
		h1.name = "はる";
		h1.hp = 100;
		
		Hero h2 = new Hero();
		h2.name = "ゆうり";
		h2.hp = 120;
		
		Sword s = new Sword();
		s.name = "秋水";
		s.damage = 10;
		h1.sw = s;
		System.out.println("現在の武器は" + h1.sw.name);
		
		Wizard w = new Wizard();
		w.name = "りょう";
		w.hp = 50;
		System.out.println(w.name + "のHPは" + w.hp);
		
		h1.attack();
		w.heal(h1);
		w.heal(h2);
	}
}
