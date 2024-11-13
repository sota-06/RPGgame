package rpg.monsters;

public abstract class FlyingMonsters extends Monsters{
	public FlyingMonsters() {
		super();
		
	}
	@Override
	public void run() {
		System.out.println(super.toString() + "はバサバサ飛んで逃げた!");
	}
}
