package kadai7;

import java.util.Scanner;

public class Story {
	public static void main(String args[]) {
		 
		Scanner scan = new Scanner(System.in);
		
		Hero h = new Hero();
		
		System.out.println("勇者の名前を設定してください");
		h.setName(scan.nextLine());
		
		System.out.println("勇者の体力を設定してください");
		h.setHp(scan.nextInt());
		
		System.out.println("勇者の攻撃力を設定してください");
		h.setAt(scan.nextInt());
		
		System.out.println("勇者の防御力を設定してください");
		h.setDf(scan.nextInt());
		
		System.out.println("勇者が誕生した");
		System.out.println("名前:" + h.getName());
		System.out.println("体力:" + h.getHp());
		System.out.println("攻撃力:" + h.getAt());
		System.out.println("防御力:" + h.getDf());
		
	
		Scanner scan2 = new Scanner(System.in);
		
		Monster m = new Monster("b");
		System.out.println("モンスターの名前を設定してください");
		m.setName(scan2.nextLine());
		
		System.out.println("モンスターの体力を設定してください");
		m.setHp(scan2.nextInt());
		
		System.out.println("モンスターの攻撃力を設定してください");
		m.setAt(scan2.nextInt());
		
		System.out.println("モンスターの防御力を設定してください");
		m.setDf(scan2.nextInt());
		
		System.out.println("モンスターが誕生した");
		System.out.println("名前:" + m.getName());
		System.out.println("体力:" + m.getHp());
		System.out.println("攻撃力:" + m.getAt());
		System.out.println("防御力:" + m.getDf());
		
		
		Scanner scan3 = new Scanner(System.in);
		
		Magician mg = new Magician("n");
		System.out.println("魔法使いの名前を設定してください");
		mg.setName(scan3.nextLine());
		
		System.out.println("魔法使いの体力を設定してください");
		mg.setHp(scan3.nextInt());
		
		System.out.println("魔法使いの魔力を設定してください");
		mg.setMp(scan3.nextInt());
		
		System.out.println("魔法使いが誕生した");
		System.out.println("名前:" + mg.getName());
		System.out.println("体力:" + mg.getHp());
		System.out.println("魔力:" + mg.getMp());
		
		
		scan.close();
		scan2.close();
		scan3.close();

		mg.magicAttack();
	}
}
