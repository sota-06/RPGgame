package rpg.heros;

public abstract class Hero {
	public int hp = 1000;
	public int mp = 500;
	public String name;
	public int speed;
	public int damage1;
	public int damage2;
	public int damage3;
	public String action1;
	public String action2;
	public String action3;
	
	public abstract void attack1();
	
	public abstract void attack2();
	
	public abstract void attack3();
	
	public void charging() {
		this.mp += 200;
	}
	public void heeling() {
		this.hp += 300;
	}
}
