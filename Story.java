package kadai7;

import java.util.Scanner;

public class Story {
	public static void main(String args[]) {
		 
		Scanner scan = new Scanner(System.in);
		
		Hero h = new Hero();
		System.out.println("勇者の名前を設定してください");
		h.name = scan.nextLine();
		
		System.out.println("勇者の体力を設定してください");
		h.hp = scan.nextInt();
		
		System.out.println("勇者の攻撃力を設定してください");
		h.at = scan.nextInt();
		
		System.out.println("勇者の防御力を設定してください");
		h.df = scan.nextInt();
		
		System.out.println("勇者が誕生した");
		System.out.println("名前:" + h.name);
		System.out.println("体力:" + h.hp);
		System.out.println("攻撃力:" + h.at);
		System.out.println("防御力:" + h.df);
		
		Scanner scan2 = new Scanner(System.in);
		
		Monster m = new Monster();
		System.out.println("モンスターの名前を設定してください");
		m.name = scan2.nextLine();
		
		System.out.println("モンスターの体力を設定してください");
		m.hp = scan2.nextInt();
		
		System.out.println("モンスターの攻撃力を設定してください");
		m.at = scan2.nextInt();
		
		System.out.println("モンスターの防御力を設定してください");
		m.df = scan2.nextInt();
		
		System.out.println("モンスターが誕生した");
		System.out.println("名前:" + m.name);
		System.out.println("体力:" + m.hp);
		System.out.println("攻撃力:" + m.at);
		System.out.println("防御力:" + m.df);
		
		Scanner scan3 = new Scanner(System.in);
		
		Monster m2 = new Monster();
		System.out.println("モンスターの名前を設定してください");
		m2.name = scan3.nextLine();
		
		System.out.println("モンスターの体力を設定してください");
		m2.hp = scan3.nextInt();
		
		System.out.println("モンスターの攻撃力を設定してください");
		m2.at = scan3.nextInt();
		
		System.out.println("モンスターの防御力を設定してください");
		m2.df = scan3.nextInt();
		
		System.out.println("モンスターが誕生した");
		System.out.println("名前:" + m2.name);
		System.out.println("体力:" + m2.hp);
		System.out.println("攻撃力:" + m2.at);
		System.out.println("防御力:" + m2.df);
		
		Scanner scan4 = new Scanner(System.in);
		
		Magician mg = new Magician();
		System.out.println("魔法使いの名前を設定してください");
		mg.name = scan4.nextLine();
		
		System.out.println("魔法使いの体力を設定してください");
		mg.hp = scan4.nextInt();
		
		System.out.println("魔法使いの魔力を設定してください");
		mg.mp = scan4.nextInt();
		
		System.out.println("魔法使いが誕生した");
		System.out.println("名前:" + mg.name);
		System.out.println("体力:" + mg.hp);
		System.out.println("魔力:" + mg.mp);
		
		
		scan.close();
		scan2.close();
		scan3.close();
		scan4.close();
		
		
		mg.magicAttack();
	}
}
