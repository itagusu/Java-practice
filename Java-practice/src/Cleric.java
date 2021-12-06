
//public class Cleric {
//	String name;
//	int hp = 50;
//	final int MAX_HP = 50; 
//	int mp = 10;
//	final int MAX_MP = 10;
//	
//	public void selfAid() {
//		System.out.println(this.name + "はセルフエイドを唱えた");
//		this.hp = this.MAX_HP;
//		this.mp -= 5;
//		System.out.println(this.name + "は、HP全回復した");
//	}
//	
//	public void pray(int sec) {
//		System.out.println(this.name + "は" + sec + "秒間祈った");
//		int recover = new java.util.Random().nextInt(3) + sec;
//		/*Math,min（a,b) aとbのどちらか小さい方
//		 * this.mp が8だとしたら2が最大の回復量、recoverは3~5回復するため
//		 * 小さい方を選択する*/
//		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
//		//this.mp(現在のhpにracoverActualを足す)
//		this.mp += recoverActual;
//		System.out.println(recoverActual);
//		//return.recoverActual;
//	}
//}

public class Cleric {
	String name;
	int hp = 50;
	int maxHp = 50;
	int mp = 10;
	int maxMp = 10;
	public void selfAid() {
		System.out.println("聖職者" + this.name + "はセルフエイドを使った");
		this.mp -= 5;
		this.hp = this.maxHp;
		System.out.println(this.name + "のHPは" + this.hp + "に回復した");
	}
	
	public void pray() {
		System.out.println("何秒祈りますか");
		int sec = new java.util.Scanner(System.in).nextInt();
		System.out.println(sec + "秒祈った");
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.maxMp - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("MPは" + this.mp + "になった");
		
	}
}
