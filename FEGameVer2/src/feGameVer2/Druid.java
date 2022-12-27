package feGameVer2;

public class Druid extends Fighter{
	Dark dark;
	String cName="ドルイド";

	//闇魔法生成メソッド
		public void equipNewDark() {
			double rand = Math.random();
			if(rand<0.3) {
				this.dark=new Dark("ミィル",8,5,70,0,3);
			}
			else if(rand<0.4) {
				this.dark =new Dark("リザイア",12,6,70,10,3);
			}
			else if(rand<0.5) {
				this.dark =new Dark("イクリプス",20,13,50,20,3);
			}
			else if(rand<0.6) {
				this.dark =new Dark("ノスフェラート",15,11,65,10,3);
			}
			else if(rand<0.7) {
				this.dark =new Dark("グレイプニル",23,13,80,0,3);
			}
			else if(rand<0.95) {
				this.dark =new Dark("ルナ",10,8,65,20,3);
			}
			else if(rand<1) {
				this.dark =new Dark("アポカリプス",18,12,80,5,3);
			}
		}
		//戦闘前武器装備メソッド
		public void equipWeaponBeforeBattle() {
				this.equip=this.dark;
		}
		//全武器一括生成メソッド
		public void equipNewWeapon() {
			this.equipNewDark();
			this.equipWeaponBeforeBattle();
		}
		//戦闘中武器持ち替えメソッド
		public void changeEquip(Weapon o) {
			if(o instanceof Weapon) {
				this.equip=null;
				this.equip=(Dark)this.dark;
				System.out.println(this.name+"は"+this.equip.name+"を装備！");

			}
		}
		public Druid() {
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
				this.resist=20;
			}
			else if(rand6<=0.2) {
				this.resist=21;
			}
			else if(rand6<=0.3) {
				this.resist=22;
			}
			else if(rand6<=0.4) {
				this.resist=23;
			}
			else if(rand6<=0.6) {
				this.resist=24;
			}
			else if(rand6<=0.7) {
				this.resist=25;
			}
			else if(rand6<=0.8) {
				this.resist=26;
			}
			else if(rand6<=0.9) {
				this.resist=27;
			}
			else if(rand6<=1) {
				this.resist=28;
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
				this.luck=18;
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
