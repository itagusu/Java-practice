
public class SuperHero extends Hero{
	public SuperHero(String name){
		this.name = name;
	}
	boolean flying;
	public void fly(){
		flying = true;
		System.out.println("飛び上がった");
	}
	public void land() {
	flying = false;
	System.out.println("着地した");
	}
}
