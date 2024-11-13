package rpg.monsters;

public abstract class WalkingMonsters extends Monsters{
	
	public WalkingMonsters() {
		super();
	}
	@Override
	public void run() {
		System.out.println(super.toString() + "はトコトコ走って逃げた!");
	}
}
