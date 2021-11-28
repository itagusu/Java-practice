
public class Practice9 {
	public static void main(String[]args) {
		Hero h1 = new Hero();
		h1.name = "はる";
		h1.hp = 100;
		
		Hero h2 = new Hero();
		h2.name = "ゆうり";
		h2.hp = 120;
		
		Sword s1 = new Sword();
		s1.name = "秋水";
		s1.damage = 10;
		h1.sw = s1;
		System.out.println(h1.name + "の現在の武器は" + h1.sw.name);
		
		Sword s2 = new Sword();
		s2.name = "閻魔";
		s2.damage = 15;
		h2.sw = s2;
		System.out.println(h2.name + "の現在の武器は" + h2.sw.name);
		
		Wizard w = new Wizard();
		w.name = "りょう";
		w.hp = 50;
		System.out.println(w.name + "のHPは" + w.hp);
		
		h1.attack();
		h2.attack();
		w.heal(h1);
		w.heal(h2);
	}
}
