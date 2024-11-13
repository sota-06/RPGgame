package rpg.monsters;

public abstract class Monsters {
	
	public int hp;
	public int mp;
	public String name;
	public char number;
	public int speed;
	public String action;
	public int damage;
	
	Monsters() {
		this.hp = 0;
		this.mp = 0;
		this.name = "";
		this.number = ' ';
		this.speed = 0;
		
	}
	
	public abstract void attack();
	
	public abstract void run();
	
	public String toString() {
		return (this.name + this.number);
	}
	
}
