package feGameVer2;

public class Berserker extends Fighter{
	Axe axe;
	String cName="バーサーカー";
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
			this.equip=this.axe;
	}
	//全武器一括生成メソッド
	public void equipNewWeapon() {
		this.equipNewAxe();
		this.equipWeaponBeforeBattle();
		this.criticalUpper();
	}


	//戦闘中武器持ち替えメソッド
	public void changeEquip(Weapon o) {
		if(o instanceof Lance) {
			this.equip=null;
			this.equip=(Axe)this.axe;
			System.out.println(this.name+"は"+this.equip.name+"を装備！");
	}
	}
	//必殺補正メソッド
	public void criticalUpper() {
		this.equip.critical+=30;
	}

	public Berserker() {
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
			this.strength=25;
		}
		else if(rand2<=0.2) {
			this.strength=26;
		}
		else if(rand2<=0.3) {
			this.strength=27;
		}
		else if(rand2<=0.4) {
			this.strength=28;
		}
		else if(rand2<=0.6) {
			this.strength=29;
		}
		else if(rand2<=0.7) {
			this.strength=30;
		}
		else if(rand2<=0.8) {
			this.strength=31;
		}
		else if(rand2<=0.9) {
			this.strength=32;
		}
		else if(rand2<=1) {
			this.strength=33;
		}
		//技
		if(rand3<=0.1) {
			this.skill=8;
		}
		else if(rand3<=0.2) {
			this.skill=9;
		}
		else if(rand3<=0.3) {
			this.skill=10;
		}
		else if(rand3<=0.4) {
			this.skill=11;
		}
		else if(rand3<=0.6) {
			this.skill=12;
		}
		else if(rand3<=0.7) {
			this.skill=13;
		}
		else if(rand3<=0.8) {
			this.skill=14;
		}
		else if(rand3<=0.9) {
			this.skill=15;
		}
		else if(rand3<=1) {
			this.skill=16;
		}
		//速さ
		if(rand4<=0.1) {
			this.speed=22;
		}
		else if(rand4<=0.2) {
			this.speed=23;
		}
		else if(rand4<=0.3) {
			this.speed=24;
		}
		else if(rand4<=0.4) {
			this.speed=25;
		}
		else if(rand4<=0.6) {
			this.speed=26;
		}
		else if(rand4<=0.7) {
			this.speed=27;
		}
		else if(rand4<=0.8) {
			this.speed=28;
		}
		else if(rand4<=0.9) {
			this.speed=29;
		}
		else if(rand4<=1) {
			this.speed=30;
		}
		//守備
		if(rand5<=0.1) {
			this.defence=5;
		}
		else if(rand5<=0.2) {
			this.defence=6;
		}
		else if(rand5<=0.3) {
			this.defence=7;
		}
		else if(rand5<=0.4) {
			this.defence=8;
		}
		else if(rand5<=0.6) {
			this.defence=9;
		}
		else if(rand5<=0.7) {
			this.defence=10;
		}
		else if(rand5<=0.8) {
			this.defence=11;
		}
		else if(rand5<=0.9) {
			this.defence=12;
		}
		else if(rand5<=1) {
			this.defence=13;
		}
		//魔防
		if(rand6<=0.1) {
			this.resist=0;
		}
		else if(rand6<=0.2) {
			this.resist=1;
		}
		else if(rand6<=0.3) {
			this.resist=2;
		}
		else if(rand6<=0.4) {
			this.resist=3;
		}
		else if(rand6<=0.6) {
			this.resist=4;
		}
		else if(rand6<=0.7) {
			this.resist=5;
		}
		else if(rand6<=0.8) {
			this.resist=6;
		}
		else if(rand6<=0.9) {
			this.resist=7;
		}
		else if(rand6<=1) {
			this.resist=8;
		}
		//幸運
		if(rand7<=0.1) {
			this.luck=3;
		}
		else if(rand7<=0.2) {
			this.luck=5;
		}
		else if(rand7<=0.3) {
			this.luck=7;
		}
		else if(rand7<=0.4) {
			this.luck=9;
		}
		else if(rand7<=0.6) {
			this.luck=11;
		}
		else if(rand7<=0.7) {
			this.luck=13;
		}
		else if(rand7<=0.8) {
			this.luck=15;
		}
		else if(rand7<=0.9) {
			this.luck=17;
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
			this.constitution=24;
		}
		else if(rand8<=0.6) {
			this.constitution=26;
		}
		else if(rand8<=0.7) {
			this.constitution=28;
		}
		else if(rand8<=0.8) {
			this.constitution=30;
		}
		else if(rand8<=0.9) {
			this.constitution=32;
		}
		else if(rand8<=1) {
			this.constitution=34;
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
