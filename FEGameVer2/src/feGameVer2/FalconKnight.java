package feGameVer2;

import java.util.Random;

public class FalconKnight extends Fighter{
	Sword sword;
	Lance lance;
	String cName="ファルコンナイト";


	//剣武器生成メソッド
	public void equipNewSword() {
		double rand = Math.random();
		if(rand<0.3) {
			this.sword=new Sword("鉄の剣",5,5,85,0,1);
		}
		else if(rand<0.5) {
			this.sword =new Sword("細身の剣",3,2,95,5,1);
		}
		else if(rand<0.65) {
			this.sword =new Sword("鋼の剣",8,10,70,0,1);
		}
		else if(rand<0.8) {
			this.sword =new Sword("キルソード",9,7,80,30,1);
		}
		else if(rand<1) {
			this.sword =new Sword("銀の剣",13,8,75,0,1);
		}
	}
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
		else if(rand<0.95) {
			this.lance =new Lance("スレンドスピア",10,10,65,5,3);
		}
		else if(rand<=1) {
			this.lance =new Lance("マルテ",16,11,80,0,3);
		}
	}
	//戦闘前武器装備メソッド
	public void equipWeaponBeforeBattle() {
		Weapon[] w={sword,lance};
		Random random=new Random();
		int rand=random.nextInt(2);
		switch(rand) {
		case 0:
			this.equip=this.sword;
			break;
		case 1:
			this.equip=this.lance;
			break;
		}


	}
	//全武器一括生成メソッド
	public void equipNewWeapon() {
		this.equipNewSword();
		this.equipNewLance();
		this.equipWeaponBeforeBattle();
	}


	//戦闘中武器持ち替えメソッド
	public void changeEquip(Weapon o) {
		if(o instanceof Sword) {
			this.equip=null;
			this.equip=(Lance)this.lance;
			System.out.println(this.name+"は"+this.equip.name+"を装備！");
		}
		else if(o instanceof Axe) {
			this.equip=null;
			this.equip=(Sword)this.sword;
			System.out.println(this.name+"は"+this.equip.name+"を装備！");
		}

	}
	public FalconKnight() {
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
			this.hp=24;
		}
		else if(rand1<=0.2) {
			this.hp=26;
		}
		else if(rand1<=0.3) {
			this.hp=28;
		}
		else if(rand1<=0.4) {
			this.hp=30;
		}
		else if(rand1<=0.6) {
			this.hp=32;
		}
		else if(rand1<=0.7) {
			this.hp=34;
		}
		else if(rand1<=0.8) {
			this.hp=36;
		}
		else if(rand1<=0.9) {
			this.hp=38;
		}
		else if(rand1<=1) {
			this.hp=40;
		}
		//力
		if(rand2<=0.1) {
			this.strength=12;
		}
		else if(rand2<=0.2) {
			this.strength=13;
		}
		else if(rand2<=0.3) {
			this.strength=14;
		}
		else if(rand2<=0.4) {
			this.strength=15;
		}
		else if(rand2<=0.6) {
			this.strength=16;
		}
		else if(rand2<=0.7) {
			this.strength=17;
		}
		else if(rand2<=0.8) {
			this.strength=18;
		}
		else if(rand2<=0.9) {
			this.strength=19;
		}
		else if(rand2<=1) {
			this.strength=20;
		}
		//技
		if(rand3<=0.1) {
			this.skill=20;
		}
		else if(rand3<=0.2) {
			this.skill=21;
		}
		else if(rand3<=0.3) {
			this.skill=22;
		}
		else if(rand3<=0.4) {
			this.skill=23;
		}
		else if(rand3<=0.6) {
			this.skill=24;
		}
		else if(rand3<=0.7) {
			this.skill=25;
		}
		else if(rand3<=0.8) {
			this.skill=26;
		}
		else if(rand3<=0.9) {
			this.skill=27;
		}
		else if(rand3<=1) {
			this.skill=28;
		}
		//速さ
		if(rand4<=0.1) {
			this.speed=24;
		}
		else if(rand4<=0.2) {
			this.speed=25;
		}
		else if(rand4<=0.3) {
			this.speed=26;
		}
		else if(rand4<=0.4) {
			this.speed=27;
		}
		else if(rand4<=0.6) {
			this.speed=28;
		}
		else if(rand4<=0.7) {
			this.speed=29;
		}
		else if(rand4<=0.8) {
			this.speed=30;
		}
		else if(rand4<=0.9) {
			this.speed=31;
		}
		else if(rand4<=1) {
			this.speed=32;
		}
		//守備
		if(rand5<=0.1) {
			this.defence=12;
		}
		else if(rand5<=0.2) {
			this.defence=13;
		}
		else if(rand5<=0.3) {
			this.defence=14;
		}
		else if(rand5<=0.4) {
			this.defence=15;
		}
		else if(rand5<=0.6) {
			this.defence=16;
		}
		else if(rand5<=0.7) {
			this.defence=17;
		}
		else if(rand5<=0.8) {
			this.defence=18;
		}
		else if(rand5<=0.9) {
			this.defence=19;
		}
		else if(rand5<=1) {
			this.defence=20;
		}
		//魔防
		if(rand6<=0.1) {
			this.resist=18;
		}
		else if(rand6<=0.2) {
			this.resist=19;
		}
		else if(rand6<=0.3) {
			this.resist=20;
		}
		else if(rand6<=0.4) {
			this.resist=21;
		}
		else if(rand6<=0.6) {
			this.resist=22;
		}
		else if(rand6<=0.7) {
			this.resist=23;
		}
		else if(rand6<=0.8) {
			this.resist=24;
		}
		else if(rand6<=0.9) {
			this.resist=25;
		}
		else if(rand6<=1) {
			this.resist=26;
		}
		//幸運
		if(rand7<=0.1) {
			this.luck=23;
		}
		else if(rand7<=0.2) {
			this.luck=24;
		}
		else if(rand7<=0.3) {
			this.luck=25;
		}
		else if(rand7<=0.4) {
			this.luck=26;
		}
		else if(rand7<=0.6) {
			this.luck=27;
		}
		else if(rand7<=0.7) {
			this.luck=28;
		}
		else if(rand7<=0.8) {
			this.luck=29;
		}
		else if(rand7<=0.9) {
			this.luck=30;
		}
		else if(rand7<=1) {
			this.luck=31;
		}
		//体格
		if(rand8<=0.1) {
			this.constitution=8;
		}
		else if(rand8<=0.2) {
			this.constitution=9;
		}
		else if(rand8<=0.3) {
			this.constitution=10;
		}
		else if(rand8<=0.4) {
			this.constitution=11;
		}
		else if(rand8<=0.6) {
			this.constitution=12;
		}
		else if(rand8<=0.7) {
			this.constitution=13;
		}
		else if(rand8<=0.8) {
			this.constitution=14;
		}
		else if(rand8<=0.9) {
			this.constitution=15;
		}
		else if(rand8<=1) {
			this.constitution=16;
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
