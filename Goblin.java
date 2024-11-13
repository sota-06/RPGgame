package rpg.monsters;


public class Goblin extends WalkingMonsters{
	static int i = 0;
	
	public Goblin() {
		super();
		super.hp = 600;
		super.mp = 50;
		super.speed = 50;
		
		super.name = "ゴブリン";
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
		super.damage = 200;
		super.action = ("ゴブリンはナイフで斬りつけた!");
	}
}
