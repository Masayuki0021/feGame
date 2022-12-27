package feGameVer2;

import java.util.Random;

public class DragonMaster extends Fighter{
	Lance lance;
	Axe axe;
	String cName="ドラゴンマスター";

	//槍武器生成メソッド
	public void equipNewLance() {
		double rand = Math.random();
		if(rand<0.25) {
			this.lance=new Lance("鉄の槍",7,8,70,0,1);
		}
		else if(rand<0.35) {
			this.lance =new Lance("てやり",6,11,55,0,3);
		}
		else if(rand<0.6) {
			this.lance =new Lance("細身の槍",4,4,80,5,1);
		}
		else if(rand<0.75) {
			this.lance =new Lance("鋼の槍",10,13,55,0,1);
		}
		else if(rand<0.8) {
			this.lance =new Lance("キラーランス",10,9,75,30,1);
		}
		else if(rand<0.9) {
			this.lance =new Lance("銀の槍",14,10,65,0,1);
		}
		else if(rand<1) {
			this.lance =new Lance("スレンドスピア",10,10,65,5,3);
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
		Weapon[] w={lance,axe};
		Random random=new Random();
		int rand=random.nextInt(2);
		switch(rand) {
		case 0:
			this.equip=this.lance;
			break;
		case 1:
			this.equip=this.axe;
			break;
		}


	}
	//全武器一括生成メソッド
	public void equipNewWeapon() {
		this.equipNewLance();
		this.equipNewAxe();
		this.equipWeaponBeforeBattle();
	}


	//戦闘中武器持ち替えメソッド
	public void changeEquip(Weapon o) {
		if(o instanceof Sword) {
			this.equip=null;
			this.equip=(Lance)this.lance;
			System.out.println(this.name+"は"+this.equip.name+"を装備！");
		}
		else if(o instanceof Lance) {
			this.equip=null;
			this.equip=(Axe)this.axe;
			System.out.println(this.name+"は"+this.equip.name+"を装備！");

		}

	}

	public DragonMaster() {
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
			this.hp=41;
		}
		else if(rand1<=0.2) {
			this.hp=43;
		}
		else if(rand1<=0.3) {
			this.hp=45;
		}
		else if(rand1<=0.4) {
			this.hp=47;
		}
		else if(rand1<=0.6) {
			this.hp=49;
		}
		else if(rand1<=0.7) {
			this.hp=51;
		}
		else if(rand1<=0.8) {
			this.hp=53;
		}
		else if(rand1<=0.9) {
			this.hp=55;
		}
		else if(rand1<=1) {
			this.hp=57;
		}
		//力
		if(rand2<=0.1) {
			this.strength=21;
		}
		else if(rand2<=0.2) {
			this.strength=22;
		}
		else if(rand2<=0.3) {
			this.strength=23;
		}
		else if(rand2<=0.4) {
			this.strength=24;
		}
		else if(rand2<=0.6) {
			this.strength=25;
		}
		else if(rand2<=0.7) {
			this.strength=26;
		}
		else if(rand2<=0.8) {
			this.strength=27;
		}
		else if(rand2<=0.9) {
			this.strength=28;
		}
		else if(rand2<=1) {
			this.strength=29;
		}
		//技
		if(rand3<=0.1) {
			this.skill=15;
		}
		else if(rand3<=0.2) {
			this.skill=16;
		}
		else if(rand3<=0.3) {
			this.skill=17;
		}
		else if(rand3<=0.4) {
			this.skill=18;
		}
		else if(rand3<=0.6) {
			this.skill=19;
		}
		else if(rand3<=0.7) {
			this.skill=20;
		}
		else if(rand3<=0.8) {
			this.skill=21;
		}
		else if(rand3<=0.9) {
			this.skill=22;
		}
		else if(rand3<=1) {
			this.skill=23;
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
			this.defence=21;
		}
		else if(rand5<=0.2) {
			this.defence=22;
		}
		else if(rand5<=0.3) {
			this.defence=23;
		}
		else if(rand5<=0.4) {
			this.defence=24;
		}
		else if(rand5<=0.6) {
			this.defence=25;
		}
		else if(rand5<=0.7) {
			this.defence=26;
		}
		else if(rand5<=0.8) {
			this.defence=27;
		}
		else if(rand5<=0.9) {
			this.defence=28;
		}
		else if(rand5<=1) {
			this.defence=29;
		}
		//魔防
		if(rand6<=0.1) {
			this.resist=2;
		}
		else if(rand6<=0.2) {
			this.resist=3;
		}
		else if(rand6<=0.3) {
			this.resist=4;
		}
		else if(rand6<=0.4) {
			this.resist=5;
		}
		else if(rand6<=0.6) {
			this.resist=6;
		}
		else if(rand6<=0.7) {
			this.resist=7;
		}
		else if(rand6<=0.8) {
			this.resist=8;
		}
		else if(rand6<=0.9) {
			this.resist=9;
		}
		else if(rand6<=1) {
			this.resist=10;
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
