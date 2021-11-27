
public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50; 
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println(this.name + "は、HP全回復した");
	}
	
	public void pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間祈った");
		this.mp -= 8;
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.println(recoverActual);
		//return.recoverActual;
	}
}
