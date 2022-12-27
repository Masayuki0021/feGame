package feGameVer2;

public class Sniper extends Fighter{
	Bow bow;
	String cName="スナイパー";

	//弓武器生成メソッド
	public void equipNewBow() {
		double rand = Math.random();
		if(rand<0.35) {
			this.bow=new Bow("鉄の弓",6,5,80,0,2);
		}
		else if(rand<0.45) {
			this.bow =new Bow("鋼の弓",9,9,65,0,2);
		}
		else if(rand<0.60) {
			this.bow =new Bow("短弓",5,3,80,10,2);
		}
		else if(rand<0.75) {
			this.bow =new Bow("キラーボウ",9,7,80,30,2);
		}
		else if(rand<0.9) {
			this.bow =new Bow("銀の弓",13,6,70,0,2);
		}
		else if(rand<0.95) {
			this.bow=new Bow("リヤンフルチェ",9,7,70,10,3);
		}
		else if(rand<=1) {
			this.bow  =new Bow("ミュルグレ",16,9,80,0,2);
		}
	}
	//戦闘前武器装備メソッド
	public void equipWeaponBeforeBattle() {
			this.equip=this.bow;
	}
	//全武器一括生成メソッド
	public void equipNewWeapon() {
		this.equipNewBow();
		this.equipWeaponBeforeBattle();
		this.criticalUpper();
	}
	//戦闘中武器持ち替えメソッド
	public void changeEquip(Weapon o) {
		if(o instanceof Weapon) {
			this.equip=null;
			this.equip=(Bow)this.bow;
			System.out.println(this.name+"は"+this.equip.name+"を装備！");
		}
	}
	//必殺補正メソッド
		public void criticalUpper() {
			this.equip.critical+=30;
		}
	public Sniper() {
		double rand1=Math.random();
		double rand2=Math.random();
		double rand3=Math.random();
		double rand4=Math.random();
		double rand5=Math.random();
		double rand6=Math.random();
		double rand7=Math.random();
		double rand8=Math.random();
		//hp
		if(rand1<=0.1) {
			this.hp=30;
		}
		else if(rand1<=0.2) {
			this.hp=32;
		}
		else if(rand1<=0.3) {
			this.hp=34;
		}
		else if(rand1<=0.4) {
			this.hp=36;
		}
		else if(rand1<=0.6) {
			this.hp=38;
		}
		else if(rand1<=0.7) {
			this.hp=40;
		}
		else if(rand1<=0.8) {
			this.hp=42;
		}
		else if(rand1<=0.9) {
			this.hp=44;
		}
		else if(rand1<=1) {
			this.hp=46;
		}
		//力
		if(rand2<=0.1) {
			this.strength=19;
		}
		else if(rand2<=0.2) {
			this.strength=20;
		}
		else if(rand2<=0.3) {
			this.strength=21;
		}
		else if(rand2<=0.4) {
			this.strength=22;
		}
		else if(rand2<=0.6) {
			this.strength=23;
		}
		else if(rand2<=0.7) {
			this.strength=24;
		}
		else if(rand2<=0.8) {
			this.strength=25;
		}
		else if(rand2<=0.9) {
			this.strength=26;
		}
		else if(rand2<=1) {
			this.strength=27;
		}
		//技
		if(rand3<=0.1) {
			this.skill=25;
		}
		else if(rand3<=0.2) {
			this.skill=26;
		}
		else if(rand3<=0.3) {
			this.skill=27;
		}
		else if(rand3<=0.4) {
			this.skill=28;
		}
		else if(rand3<=0.6) {
			this.skill=29;
		}
		else if(rand3<=0.7) {
			this.skill=30;
		}
		else if(rand3<=0.8) {
			this.skill=31;
		}
		else if(rand3<=0.9) {
			this.skill=32;
		}
		else if(rand3<=1) {
			this.skill=33;
		}
		//速さ
		if(rand4<=0.1) {
			this.speed=18;
		}
		else if(rand4<=0.2) {
			this.speed=19;
		}
		else if(rand4<=0.3) {
			this.speed=20;
		}
		else if(rand4<=0.4) {
			this.speed=21;
		}
		else if(rand4<=0.6) {
			this.speed=22;
		}
		else if(rand4<=0.7) {
			this.speed=23;
		}
		else if(rand4<=0.8) {
			this.speed=24;
		}
		else if(rand4<=0.9) {
			this.speed=25;
		}
		else if(rand4<=1) {
			this.speed=26;
		}
		//守備
		if(rand5<=0.1) {
			this.defence=10;
		}
		else if(rand5<=0.2) {
			this.defence=11;
		}
		else if(rand5<=0.3) {
			this.defence=12;
		}
		else if(rand5<=0.4) {
			this.defence=13;
		}
		else if(rand5<=0.6) {
			this.defence=14;
		}
		else if(rand5<=0.7) {
			this.defence=15;
		}
		else if(rand5<=0.8) {
			this.defence=16;
		}
		else if(rand5<=0.9) {
			this.defence=17;
		}
		else if(rand5<=1) {
			this.defence=18;
		}
		//魔防
		if(rand6<=0.1) {
			this.resist=10;
		}
		else if(rand6<=0.2) {
			this.resist=11;
		}
		else if(rand6<=0.3) {
			this.resist=12;
		}
		else if(rand6<=0.4) {
			this.resist=13;
		}
		else if(rand6<=0.6) {
			this.resist=14;
		}
		else if(rand6<=0.7) {
			this.resist=15;
		}
		else if(rand6<=0.8) {
			this.resist=16;
		}
		else if(rand6<=0.9) {
			this.resist=17;
		}
		else if(rand6<=1) {
			this.resist=18;
		}
		//幸運
		if(rand7<=0.1) {
			this.luck=3;
		}
		else if(rand7<=0.2) {
			this.luck=6;
		}
		else if(rand7<=0.3) {
			this.luck=9;
		}
		else if(rand7<=0.4) {
			this.luck=12;
		}
		else if(rand7<=0.6) {
			this.luck=15;
		}
		else if(rand7<=0.7) {
			this.luck=18;
		}
		else if(rand7<=0.8) {
			this.luck=21;
		}
		else if(rand7<=0.9) {
			this.luck=24;
		}
		else if(rand7<=1) {
			this.luck=27;
		}
		//体格
		if(rand8<=0.1) {
			this.constitution=12;
		}
		else if(rand8<=0.2) {
			this.constitution=14;
		}
		else if(rand8<=0.3) {
			this.constitution=16;
		}
		else if(rand8<=0.4) {
			this.constitution=18;
		}
		else if(rand8<=0.6) {
			this.constitution=20;
		}
		else if(rand8<=0.7) {
			this.constitution=22;
		}
		else if(rand8<=0.8) {
			this.constitution=24;
		}
		else if(rand8<=0.9) {
			this.constitution=26;
		}
		else if(rand8<=1) {
			this.constitution=28;
		}
	}
	public String toString() {
		return "名前 "+this.name+"\n"+"HP   "+this.hp+"\n"+"力   "+this.strength+"\n"
	+"技   "+this.skill+"\n"+"速さ "+this.speed+"\n"+"守備 "+this.defence+"\n"+
				"魔防 "+this.resist+"\n"+"幸運 "+this.luck+"\n"+"体格 "+this.constitution;

	}
	public void showSt() {
		System.out.println(this.toString());
	}
	public String getCName() {
		return this.cName;
	}
}

