package kadai7;

import java.util.Scanner;

public class Magician {
	// フィールド
	 String name;
	 int hp;
	 int mp;

	 // メソッド
	 void strikeAttack() {
		 System.out.println(this.name + "の打撃攻撃!");
		 System.out.println("敵に5ダメージを与えた");
	 }
	 
	 void magicAttack() {
		 System.out.println(this.name + "の魔法攻撃!");
		 this.mp = this.mp - 5;
		 if(this.mp < 0) {
			 System.out.println("MPが足りない!");
		 } else {
			 System.out.println("5mpを消費して敵に15ダメージを与えた");
		 }
		 
	 }
	 
	 void recovery() {
		 System.out.println(this.name + "が回復魔法を使用した");
		 this.hp = this.hp + 20;
		 System.out.println("hpが20回復し" + this.hp + "になった");
	 }
	 
	 void heal() {
		 System.out.println("魔法使いが休憩した");
		 this.hp = this.hp + 10;
		 System.out.println("hpが10回復し" + this.hp + "になった");
	}
	 
	
}
