
public class Dancer extends Character{
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	//attack()をオーバーライドし忘れている　⇨　エラー
	//親クラスから抽象メソッドを継承しているから隠れた抽象メソッドがある
	//解決策① 抽象クラスにする
	//     ② 未完成部分をなくす
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に３ダメージ");
		m.hp -= 3;
	}
}  
