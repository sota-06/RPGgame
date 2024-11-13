package rpg.monsters;

public class Werewolf extends WalkingMonsters{
	static int i = 0;
	
	public Werewolf() {
		super();
		super.hp = 550;
		super.mp = 80;
		super.speed = 100;
		super.name = "ウォーウルフ";
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
		super.damage = 150;
		super.action = ("はかみついた!");
	}
}
