package rpg.heros;

public class Balance_Hero extends Hero{
	public Balance_Hero() {
		super.speed = 100;
		super.damage1 = 200;
		super.damage2 = 400;
		super.damage3 = 800;
		super.action1 = ("<花風>");
		super.action2 = ("<桜旋風>");
		super.action3 = ("<奥義　咲桜拳>");
	}
	
	public void attack1() {
		
		super.mp -= 100;
		
	}
	
	public void attack2() {
		
		super.mp -= 300;
		
	}

	public void attack3() {
		
		super.mp -= 500;
		
	}
}
