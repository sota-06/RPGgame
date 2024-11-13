package rpg.monsters;

public class DeathBat extends FlyingMonsters{
	static int i = 0;
	
	public DeathBat() {
		super();
		super.hp = 500;
		super.mp = 80;
		super.speed = 150;
		super.name = "デスバット";
		switch(i) {
		case 0:
			super.number = 'A';
			i++;
			break;
		case 1:
			super.number = 'B';
			i++;
			break;
		case 2:
			super.number = 'C';
			i++;
			break;
		case 3:
			super.number = 'D';
			i++;
			break;
		case 4:
			super.number = 'E';
			i++;
			break;
		}
	}
	@Override
	public void attack() {
		super.damage = 100;
		super.action = ("は突っついた!");
	}
}
