
public class Practice9 {
	public static void main(String[]args) {
		Hero h1 = new Hero("はる");
		/*Heroクラスで
		 * public Hero(String name) {
		this.hp = 100;を初期値で設定しているため*/
		System.out.println(h1.hp); // 100が設定される
//		h1.name = "はる";
//		h1.hp = 100;
		
		Hero h2 = new Hero("ゆうり");
//		h2.name = "ゆうり";
//		h2.hp = 120;
		Hero h3 = new Hero();
		System.out.println(h3.name);
		
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
		
		Matango m = new Matango('Z');
		m.hp = 50;
		
		SuperHero sh = new SuperHero("みゆ");
		PoisonMatango pm = new PoisonMatango('X');
		
		Dancer d = new Dancer();
		d.name = "いた";
		
		
		h1.attack(m);
		h2.attack(m);
		w.heal(h1);
		w.heal(h2);
		w.heal(h1);
		w.heal(h2);
		w.heal(sh);
		h1.run();
		sh.run();
		sh.fly();
		sh.land();
		m.attack(h1);
		pm.attack(h1);
		d.dance();
		
//		//練習問題9.1
//		Thief t1 = new Thief("アサカ",40,5);
//		System.out.println(t1.name + t1.hp + " " +t1.mp);
//		Thief t2 = new Thief("アカサ",35);
//		System.out.println(t2.name + t2.hp + " " + t1.mp);
//		Thief t3 = new Thief("アカサ");
//		System.out.println(t3.name + t3.hp + " " + t3.mp);
//		Thief t4 = new Thief();
//		System.out.println(t4.name + t4.hp + " " + t4.mp);
	}
}
