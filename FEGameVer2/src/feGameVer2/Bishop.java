package feGameVer2;

public class Bishop extends Fighter{
	Light light;
	String cName="司祭";

	//闇魔法生成メソッド
	public void equipNewLight() {
		double rand = Math.random();
		if(rand<0.3) {
			this.light=new Light("ライトニング",5,1,75,0,3);
		}
		else if(rand<0.4) {
			this.light =new Light("ディヴァイン",8,3,75,0,3);
		}
		else if(rand<0.5) {
			this.light =new Light("シャイン",6,3,85,0,3);
		}
		else if(rand<0.6) {
			this.light =new Light("パージ",10,8,70,5,3);
		}
		else if(rand<0.7) {
			this.light =new Light("アルジローレ",12,19,85,0,3);
		}
		else if(rand<1) {
			this.light =new Light("アーリアル",15,10,90,5,3);
		}
	}
	//戦闘前武器装備メソッド
	public void equipWeaponBeforeBattle() {
			this.equip=this.light;
	}
	//全武器一括生成メソッド
	public void equipNewWeapon() {
		this.equipNewLight();
		this.equipWeaponBeforeBattle();
	}
	//戦闘中武器持ち替えメソッド
	public void changeEquip(Weapon o) {
		if(o instanceof Weapon) {
			this.equip=null;
			this.equip=(Light)this.light;
			System.out.println(this.name+"は"+this.equip.name+"を装備！");
		}
	}
	public Bishop() {
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
			this.hp=26;
		}
		else if(rand1<=0.2) {
			this.hp=28;
		}
		else if(rand1<=0.3) {
			this.hp=30;
		}
		else if(rand1<=0.4) {
			this.hp=32;
		}
		else if(rand1<=0.6) {
			this.hp=34;
		}
		else if(rand1<=0.7) {
			this.hp=36;
		}
		else if(rand1<=0.8) {
			this.hp=38;
		}
		else if(rand1<=0.9) {
			this.hp=40;
		}
		else if(rand1<=1) {
			this.hp=42;
		}
		//力
		if(rand2<=0.1) {
			this.strength=15;
		}
		else if(rand2<=0.2) {
			this.strength=16;
		}
		else if(rand2<=0.3) {
			this.strength=17;
		}
		else if(rand2<=0.4) {
			this.strength=18;
		}
		else if(rand2<=0.6) {
			this.strength=19;
		}
		else if(rand2<=0.7) {
			this.strength=20;
		}
		else if(rand2<=0.8) {
			this.strength=21;
		}
		else if(rand2<=0.9) {
			this.strength=22;
		}
		else if(rand2<=1) {
			this.strength=23;
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
			this.defence=3;
		}
		else if(rand5<=0.2) {
			this.defence=4;
		}
		else if(rand5<=0.3) {
			this.defence=5;
		}
		else if(rand5<=0.4) {
			this.defence=6;
		}
		else if(rand5<=0.6) {
			this.defence=7;
		}
		else if(rand5<=0.7) {
			this.defence=8;
		}
		else if(rand5<=0.8) {
			this.defence=9;
		}
		else if(rand5<=0.9) {
			this.defence=10;
		}
		else if(rand5<=1) {
			this.defence=11;
		}
		//魔防
		if(rand6<=0.1) {
			this.resist=25;
		}
		else if(rand6<=0.2) {
			this.resist=26;
		}
		else if(rand6<=0.3) {
			this.resist=27;
		}
		else if(rand6<=0.4) {
			this.resist=28;
		}
		else if(rand6<=0.6) {
			this.resist=29;
		}
		else if(rand6<=0.7) {
			this.resist=30;
		}
		else if(rand6<=0.8) {
			this.resist=31;
		}
		else if(rand6<=0.9) {
			this.resist=32;
		}
		else if(rand6<=1) {
			this.resist=33;
		}
		//幸運
		if(rand7<=0.1) {
			this.luck=20;
		}
		else if(rand7<=0.2) {
			this.luck=21;
		}
		else if(rand7<=0.3) {
			this.luck=22;
		}
		else if(rand7<=0.4) {
			this.luck=23;
		}
		else if(rand7<=0.6) {
			this.luck=24;
		}
		else if(rand7<=0.7) {
			this.luck=25;
		}
		else if(rand7<=0.8) {
			this.luck=26;
		}
		else if(rand7<=0.9) {
			this.luck=27;
		}
		else if(rand7<=1) {
			this.luck=28;
		}
		//体格
		if(rand8<=0.1) {
			this.constitution=8;
		}
		else if(rand8<=0.2) {
			this.constitution=10;
		}
		else if(rand8<=0.3) {
			this.constitution=11;
		}
		else if(rand8<=0.4) {
			this.constitution=12;
		}
		else if(rand8<=0.6) {
			this.constitution=13;
		}
		else if(rand8<=0.7) {
			this.constitution=14;
		}
		else if(rand8<=0.8) {
			this.constitution=15;
		}
		else if(rand8<=0.9) {
			this.constitution=16;
		}
		else if(rand8<=1) {
			this.constitution=17;
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
