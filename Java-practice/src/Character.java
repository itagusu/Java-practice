//11章 高度な継承
//抽象メソッドを含むクラスは必ずabstract月のクラスにしないといけない
//抽象クラスは、newによるインスタンス化が禁止される
//Character c = new Character(); ⇨ エラーになる
public abstract class Character {
	String name;
	int hp;
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	public abstract void attack(Matango m);
}
