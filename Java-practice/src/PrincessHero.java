// インターフェイスによる多重継承
// Hero2, Princess, Creatureは全てインターフェイス
public class PrincessHero implements Hero2, Princess, Creature {
	String name;
	
	public PrincessHero(String name) {
		this.name = name;
	}
	public void run() {
		System.out.println(this.name + "は去った");
	}
	
}
