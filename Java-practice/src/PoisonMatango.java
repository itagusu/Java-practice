
public class PoisonMatango extends Matango {
	int PoisonCount = 5;
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		super.attack(h);
		if(PoisonCount > 0) {
			System.out.println("さらに毒の胞子をばら撒いた");
			int pa = h.hp / 5;
			h.hp -= pa;
			System.out.println(pa + "のダメージ." + h.name + "のHPは" + h.hp + "になった。");
			PoisonCount--;
		}
	}
}
