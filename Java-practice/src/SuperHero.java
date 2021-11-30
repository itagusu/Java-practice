
public class SuperHero extends Hero{
	public SuperHero(String name){
		this.name = name;
		this.hp = 500;
	}
	boolean flying;
	public void fly(){
		flying = true;
		System.out.println(this.name + "は飛び上がった");
	}
	public void land() {
	flying = false;
	System.out.println(this.name + "は着地した");
	}
	public void run() {
		System.out.println(this.name + "は撤退した");
		System.out.println("最終HPは" + this.hp +"でした");
	}
//	//Heroクラス(親クラス)でfinalで宣言しているためオーバーライド出来ない
//	public void slip() {
//		this.hp -= 1;
//		System.out.println(this.name + "は転んだ");
//		System.out.println("1のダメージ");
//	}
}
