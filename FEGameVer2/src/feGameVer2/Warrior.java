package feGameVer2;

import java.util.Random;

public class Warrior extends Fighter{
	Axe axe;
	Bow bow;
	String cName="ウォーリアー";


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


	//斧武器生成メソッド
	public void equipNewAxe() {
		double rand = Math.random();
		if(rand<0.35) {
			this.axe=new Axe("鉄の斧",8,10,65,0,1);
		}
		else if(rand<0.5) {
			this.axe =new Axe("ておの",7,15,50,0,3);
		}
		else if(rand<0.6) {
			this.axe =new Axe("デビルアクス",18,18,30,0,1);
		}
		else if(rand<0.7) {
			this.axe =new Axe("鋼の斧",11,15,50,0,1);
		}
		else if(rand<0.8) {
			this.axe =new Axe("キラーアクス",11,11,65,30,1);
		}
		else if(rand<0.9) {
			this.axe  =new Axe("銀の斧",15,12,55,0,1);
		}
		else if(rand<=1) {
			this.axe =new Axe("トマホーク",13,14,55,5,1);
		}
	}

	//戦闘前武器装備メソッド
	public void equipWeaponBeforeBattle() {
		Weapon[] w={axe,bow};
		Random random=new Random();
		int rand=random.nextInt(2);
		switch(rand) {
		case 0:
			this.equip=this.axe;
			break;
		case 1:
			this.equip=this.bow;
			break;
		}
	}
	//全武器一括生成メソッド
	public void equipNewWeapon() {
		this.equipNewAxe();
		this.equipNewBow();
		this.equipWeaponBeforeBattle();
	}

	//戦闘中武器持ち替えメソッド
	public void changeEquip(Weapon o) {
		Random random=new Random();
		int rand=random.nextInt(2);
		if(o instanceof Lance) {
			this.equip=null;
			this.equip=(Axe)this.axe;
		}else {
			if(rand==0) {
				if(o instanceof Weapon) {
					this.equip=null;
					this.equip=(Axe)this.axe;
					System.out.println(this.name+"は"+this.equip.name+"を装備！");
				}
			}else if(rand==1){
				if(o instanceof Weapon) {
					this.equip=null;
					this.equip=(Bow)this.bow;
					System.out.println(this.name+"は"+this.equip.name+"を装備！");
				}
			}
		}

	}
	public Warrior() {
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
			this.hp=52;
		}
		else if(rand1<=0.2) {
			this.hp=54;
		}
		else if(rand1<=0.3) {
			this.hp=56;
		}
		else if(rand1<=0.4) {
			this.hp=58;
		}
		else if(rand1<=0.6) {
			this.hp=60;
		}
		else if(rand1<=0.7) {
			this.hp=62;
		}
		else if(rand1<=0.8) {
			this.hp=64;
		}
		else if(rand1<=0.9) {
			this.hp=66;
		}
		else if(rand1<=1) {
			this.hp=68;
		}
		//力
		if(rand2<=0.1) {
			this.strength=24;
		}
		else if(rand2<=0.2) {
			this.strength=25;
		}
		else if(rand2<=0.3) {
			this.strength=26;
		}
		else if(rand2<=0.4) {
			this.strength=27;
		}
		else if(rand2<=0.6) {
			this.strength=28;
		}
		else if(rand2<=0.7) {
			this.strength=29;
		}
		else if(rand2<=0.8) {
			this.strength=30;
		}
		else if(rand2<=0.9) {
			this.strength=31;
		}
		else if(rand2<=1) {
			this.strength=32;
		}
		//技
		if(rand3<=0.1) {
			this.skill=10;
		}
		else if(rand3<=0.2) {
			this.skill=11;
		}
		else if(rand3<=0.3) {
			this.skill=12;
		}
		else if(rand3<=0.4) {
			this.skill=13;
		}
		else if(rand3<=0.6) {
			this.skill=14;
		}
		else if(rand3<=0.7) {
			this.skill=15;
		}
		else if(rand3<=0.8) {
			this.skill=16;
		}
		else if(rand3<=0.9) {
			this.skill=17;
		}
		else if(rand3<=1) {
			this.skill=18;
		}
		//速さ
		if(rand4<=0.1) {
			this.speed=20;
		}
		else if(rand4<=0.2) {
			this.speed=21;
		}
		else if(rand4<=0.3) {
			this.speed=22;
		}
		else if(rand4<=0.4) {
			this.speed=23;
		}
		else if(rand4<=0.6) {
			this.speed=24;
		}
		else if(rand4<=0.7) {
			this.speed=25;
		}
		else if(rand4<=0.8) {
			this.speed=26;
		}
		else if(rand4<=0.9) {
			this.speed=27;
		}
		else if(rand4<=1) {
			this.speed=28;
		}
		//守備
		if(rand5<=0.1) {
			this.defence=8;
		}
		else if(rand5<=0.2) {
			this.defence=9;
		}
		else if(rand5<=0.3) {
			this.defence=10;
		}
		else if(rand5<=0.4) {
			this.defence=11;
		}
		else if(rand5<=0.6) {
			this.defence=12;
		}
		else if(rand5<=0.7) {
			this.defence=13;
		}
		else if(rand5<=0.8) {
			this.defence=14;
		}
		else if(rand5<=0.9) {
			this.defence=15;
		}
		else if(rand5<=1) {
			this.defence=16;
		}
		//魔防
		if(rand6<=0.1) {
			this.resist=1;
		}
		else if(rand6<=0.2) {
			this.resist=2;
		}
		else if(rand6<=0.3) {
			this.resist=3;
		}
		else if(rand6<=0.4) {
			this.resist=4;
		}
		else if(rand6<=0.6) {
			this.resist=5;
		}
		else if(rand6<=0.7) {
			this.resist=6;
		}
		else if(rand6<=0.8) {
			this.resist=7;
		}
		else if(rand6<=0.9) {
			this.resist=8;
		}
		else if(rand6<=1) {
			this.resist=9;
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
			this.constitution=20;
		}
		else if(rand8<=0.2) {
			this.constitution=22;
		}
		else if(rand8<=0.3) {
			this.constitution=24;
		}
		else if(rand8<=0.4) {
			this.constitution=26;
		}
		else if(rand8<=0.6) {
			this.constitution=28;
		}
		else if(rand8<=0.7) {
			this.constitution=30;
		}
		else if(rand8<=0.8) {
			this.constitution=32;
		}
		else if(rand8<=0.9) {
			this.constitution=34;
		}
		else if(rand8<=1) {
			this.constitution=36;
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
