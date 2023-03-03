package kadai7;

public class Magician {
	// フィールド
	 private String name;
	 private int hp;
	 private int mp;
	 
	// コンストラクタ
	 Magician(String name) {
		 this.hp = 100;
		 this.name = name;
	 }
	 
	 // getter ・ setterメソッド
	 public String getName() {
		 return this.name;
	 }
	 
	 public void setName(String name) {
		 if(!(3 <= name.length() && name.length() <= 10)) {
			 throw new IllegalArgumentException("名前は3文字以上10文字以下で入力してください。");
		 }
		 this.name = name;
	 }
	 
	 public int getHp() {
		 return this.hp;
	 }
	 
	 public void setHp(int hp) {
		 if(hp < 0) {
			 this.hp = 0;
		 } else {
			 this.hp = hp;
		 }
	 }
	 
	 public int getMp() {
		 return this.hp;
	 }
	 
	 public void setMp(int mp) {
		 if(mp < 0) {
			 this.mp = 0;
		 } else {
			 this.mp = mp;
		 }
	 }

	 // メソッド
	 public void strikeAttack() {
		 System.out.println(this.name + "の打撃攻撃!");
		 System.out.println("敵に5ダメージを与えた");
	 }
	 
	 public void magicAttack() {
		 System.out.println(this.name + "の魔法攻撃!");
		 this.mp = this.mp - 5;
		 if(this.mp < 0) {
			 System.out.println("MPが足りない!");
		 } else {
			 System.out.println("5mpを消費して敵に15ダメージを与えた");
		 }
		 
	 }
	 
	 public void recovery() {
		 System.out.println(this.name + "が回復魔法を使用した");
		 this.hp = this.hp + 20;
		 System.out.println("hpが20回復し" + this.hp + "になった");
	 }
	 
	 public void heal() {
		 System.out.println("魔法使いが休憩した");
		 this.hp = this.hp + 10;
		 System.out.println("hpが10回復し" + this.hp + "になった");
	}
	 
	
}
