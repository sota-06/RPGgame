# RPGgame
/*
 * 
 */




package rpg;

import java.util.Random;
import java.util.Scanner;

import rpg.heros.Hero;
import rpg.monsters.Monsters;

public class Task8_RPG {

	public static void main(String[] args) {
		int hp;
		int mp;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("~~~~~RPGゲーム~~~~~");
		System.out.println("おじいさん：君の名前を教えてくれ");
		String name = scanner.next();
		System.out.printf("あなた：%sです!\n", name);
		System.out.printf("おじいさん：そうか。%sか。いい名前だ\n\n", name);
		System.out.printf("おじいさん：今この街は、モンスターたちが暴れていて、大変なことになっているんだ。%s！この街を救ってくれないか。\n", name);
		System.out.println("あなた：僕がこの街を救います!");
		System.out.println("おじいさん：本当か！ありがとう！この街には、代々伝わるHeroの装備が3種類受け継がれているんだ。私は、もう年だからHeroができなくてね。どのHeroタイプがいいか選んでくれ\n1:マッスルヒーロー(パワー型)\n2:スピードヒーロー(スピード型)\n3:バランスヒーロー(パワーとスピードのバランス型)");
		int number = scanner.nextInt();
		rpg.heros.Hero[] h = new rpg.heros.Hero[1];
		rpg.monsters.Monsters[] m =  new rpg.monsters.Monsters[5];
		switch(number) {
		case 1:
			h[0] = new rpg.heros.Power_Hero();
			System.out.printf("おじいさん：マッスルヒーロー%sよろしくな！\n", name);
			break;
		case 2:
			h[0] = new rpg.heros.Speed_Hero();
			System.out.printf("おじいさん：スピードヒーロー%sよろしくな！\n", name);
			break;
		case 3:
			h[0] = new rpg.heros.Balance_Hero();
			System.out.printf("おじいさん：バランスヒーロー%sよろしくな！\n", name);
			break;
		}
		h[0].name = name;
		System.out.println("おじいさん：この街は、ちょっと前までは平和な街だったんだ。\nだけど悪の皇帝「デスバット」がモンスターをいっぱい引き連れてやってきたんだ。\nあいつは私の娘をさらっていき、デビル城に人質として捕らえているんだ。\n頼む。私の娘を助け出してくれ");
		System.out.println("あなた：任せてください");
		System.out.println("おじいさん：ありがとう!デビル城はこっちだ\n");
		System.out.println("おじいさん：ここがデビル城だ。デビル城は、4階建てで最上階にキングデビルがいる。各階にいるあいつの手下を倒していかなければならない。");
		
		System.out.println("~~デビル城1階~~");
		
		System.out.println("~バトルの説明~\n・Heroには、それぞれタイプによって違う技があり、mp消費量も変わってくる。＊mpとは技を出すためのエネルギーのこと\n・自分と相手のスピードが早い方が先に攻撃できる(スピードが一緒の場合はランダムで決まる\n・Heelingでhp回復、Chargingでmp回復\n");
		System.out.println("~ゴブリンが現れた~");
		
		m[0] = new rpg.monsters.Goblin();
		hp = h[0].hp;
		mp = h[0].mp;
		battele(h[0], m[0], hp, mp);
		if(h[0].hp == 0) {
			GameOver();
		}
		System.out.printf("%sを倒した\n", m[0].name);
		System.out.println("!!!レベルアップ!!!");
		
		h[0].hp += 300;
		h[0].mp += 200;
		hp += 300;
		mp += 200;
		System.out.printf("今の状態　　hp:%d   mp:%d", h[0].hp, h[0].mp);
		
		System.out.printf("おじいさん：やるな〜！さすが俺が見込んだ男だ\n次の階に行こう\n\n");
		
		System.out.println("~~デビル城2階~~");
		
		System.out.println("~ウォーウルフが現れた~");
		m[1] = new rpg.monsters.Werewolf();
		
		battele(h[0], m[1], hp, mp);
		
		if(h[0].hp <= 0) {
			GameOver();
		}
		System.out.printf("%sを倒した", m[1].name);
		System.out.println("!!!レベルアップ!!!");
		h[0].hp += 300;
		h[0].mp += 200;
		hp += 300;
		mp += 200;
		System.out.printf("今の状態　　hp:%d   mp:%d", h[0].hp, h[0].mp);
		
		System.out.printf("おじいさん：やるな〜！さすが俺が見込んだ男だ\n最上階に行こう\n\n");
		
		System.out.println("~~デビル城最上階~~");
		
		System.out.println("~ラスボスデスバットが現れた~");
		m[2] = new rpg.monsters.DeathBat();
		
		battele(h[0], m[2], hp, mp);
		
		if(h[0].hp <= 0) {
			GameOver();
		}
		System.out.printf("%sを倒した\n\n", m[2].name);
		
		System.out.printf("おじいさん：%sよくやってくれた!お前はこの国の英雄だ！\n", name);
		System.out.println("~~~ゲームクリア~~~");
		
		
	}
	public static void battele(Hero h , Monsters m, int hp, int mp) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int number;
		
		
		
		if(h.speed >= m.speed) {
			if(h.speed == m.speed) {
				number = random.nextInt(2);
			}
			else {
				number = 0;
			}
		}
		else {
			number = 1;
		}
		switch(number) {
		case 0:
			
			while(h.hp >= 0 && m.hp >= 0) {
				System.out.printf("自分のhp:%d mp:%d speed:%d   %sのhp:%d mp:%d speed:%d\n\n", h.hp, h.mp,h.speed ,m.name, m.hp, m.mp, m.speed);
				System.out.printf("~~アクションを選択してください~~\n\n1:%s ダメージ量:%d mp消費量:100\n2:%s ダメージ量:%d mp消費量:300\n3:%s ダメージ量:%d mp消費量:500\n4:Heeling:hp回復量:300\n5:Charging:mp回復量:200\n", h.action1, h.damage1, h.action2, h.damage2, h.action3, h.damage3);
				int count = scanner.nextInt();
				switch(count) {
				case 1:
					System.out.println(h.action1 + "\n");
					m.hp -= h.damage1;
					h.mp -= 100;
					break;
				case 2:
					System.out.println(h.action2 + "\n");
					m.hp -= h.damage2;
					h.mp -= 300;
					break;
				case 3:
					System.out.println(h.action3 + "\n");
					m.hp -= h.damage3;
					h.mp -= 500;
					break;
				case 4:
					h.hp += 300;
					if(h.hp > hp) {
						h.hp = hp;
					}
					System.out.printf("hpが回復した　hp:%d\n", h.hp);
					break;
				case 5:
					h.mp += 200;
					if(h.mp > mp) {
						h.mp = mp;
					}
					System.out.printf("mpが回復した　mp:%d\n", h.mp);
					break;
				}
				if(m.hp <= 0) {
					break;
				}
				else {
					m.attack();
					h.hp -= m.damage;
					System.out.printf("%s%s\n", m.name, m.action);
				}
			}
			break;
		case 1:
			while(h.hp >= 0 && m.hp <= 0) {
				System.out.printf("自分のhp:%d mp:%d speed:%d   %sのhp:%d mp:%d speed:%d\n\n", h.hp, h.mp,h.speed ,m.name, m.hp, m.mp, m.speed);
				System.out.printf("~~アクションを選択してください~~\n\n1:%s ダメージ量:%d mp消費量:100\n2:%s ダメージ量:%d mp消費量:300\n3:%s ダメージ量:%d mp消費量:500\n4:Heeling:hp回復量:300\n5:Charging:mp回復量:200\n", h.action1, h.damage1, h.action2, h.damage2, h.action3, h.damage3);
				int count = scanner.nextInt(5);
				m.attack();
				h.hp -= m.damage;
				System.out.printf("%s%s\n", m.name, m.action);
				if(h.hp <= 0) {
					break;
				}
				else {
					switch(count) {
					case 1:
						System.out.println(h.action1 + "\n");
						m.hp -= h.damage1;
						h.mp -= 100;
						break;
					case 2:
						System.out.println(h.action2 + "\n");
						m.hp -= h.damage2;
						h.mp -= 300;
						break;
					case 3:
						System.out.println(h.action3 + "\n");
						m.hp -= h.damage3;
						h.mp -= 500;
						break;
					case 4:
						h.hp += 300;
						if(h.hp > hp) {
							h.hp = hp;
						}
						System.out.printf("hpが回復した　hp:%d\n", h.hp);
						break;
					case 5:
						h.mp += 200;
						if(h.mp > mp) {
							h.mp = mp;
						}
						System.out.printf("mpが回復した　mp:%d\n", h.mp);
						break;
					}
				}
			}
			break;
		}
	}
	
	
	public static void GameOver() {
		System.out.println("~~~GameOver~~~");
		System.exit(0);
	}

}
