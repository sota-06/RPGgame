package rpg.heros;

public class Power_Hero extends Hero{
	public Power_Hero() {
		super.speed = 50;
		super.damage1 = 300;
		super.damage2 = 500;
		super.damage3= 1000;
		super.action1 =("<波動拳>");
		super.action2 = ("<昇竜拳>");
		super.action3 = ("<奥義　昇竜烈破>");
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
