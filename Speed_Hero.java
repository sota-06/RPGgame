package rpg.heros;

public class Speed_Hero extends Hero{
	public Speed_Hero() {
		super.speed = 150;
		super.damage1= 100;
		super.damage2 = 300;
		super.damage3 = 600;
		super.action1 = ("<ジャイロニッパー>");
		super.action2 = ("<デルタドライブ>");
		super.action3 = ("<奥義　スパイラルアロー>");
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
