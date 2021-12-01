
public class Matango {
//	String name = "きのこ";
//	int hp;
//	final int LEVEL = 10;
	int hp = 50;
	char suffix;
	public Matango(char suffix){
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println(this.suffix + "きのこの攻撃");
		h.hp -= 10;
		System.out.println(h.name + "のHPは" + h.hp);
	}
	public void run(Hero h) {
		System.out.println(this.suffix + "は逃げ出した");
	}
}
