
public class Hero {
	String name;
	int hp;
	Sword sw;
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	public Hero() {
//		this.hp = 100;
//		this.name = "テスト";
		this("テスト");
	}
	public void attack() {
		System.out.println(this.name + "は、" + this.sw.name + "で攻撃した");
	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒座った");
		System.out.println(this.name + "は" + sec + "ポイント回復した");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ");
		System.out.println("5のダメージ");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GameOver");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
