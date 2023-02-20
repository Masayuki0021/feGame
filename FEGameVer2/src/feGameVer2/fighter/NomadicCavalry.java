package feGameVer2.fighter;

import java.util.Random;

import feGameVer2.weapon.Axe;
import feGameVer2.weapon.Bow;
import feGameVer2.weapon.Sword;
import feGameVer2.weapon.Weapon;

public class NomadicCavalry extends Fighter {
	Sword sword;
	Bow bow;
	String cName="遊牧騎兵";

	//剣武器生成メソッド
		public void equipNewSword() {
			double rand = Math.random();
			if(rand<0.3) {
				this.sword=new Sword("鉄の剣",5,5,85,0,1);
			}
			else if(rand<0.4) {
				this.sword =new Sword("細身の剣",3,2,95,5,1);
			}
			else if(rand<0.5) {
				this.sword =new Sword("鋼の剣",8,10,70,0,1);
			}
			else if(rand<0.6) {
				this.sword =new Sword("キルソード",9,7,80,30,1);
			}
			else if(rand<0.8) {
				this.sword =new Sword("銀の剣",13,8,75,0,1);
			}
			else if(rand<=1) {
				this.sword =new Sword("倭刀",8,5,75,40,1);
			}
		}
		//弓武器生成メソッド
		public void equipNewBow() {
			double rand = Math.random();
			if(rand<0.35) {
				this.bow=new Bow("鉄の弓",6,5,80,10,2);
			}
			else if(rand<0.45) {
				this.bow =new Bow("鋼の弓",9,9,65,10,2);
			}
			else if(rand<0.60) {
				this.bow =new Bow("短弓",5,3,80,20,2);
			}
			else if(rand<0.75) {
				this.bow =new Bow("キラーボウ",9,7,80,40,2);
			}
			else if(rand<0.9) {
				this.bow =new Bow("銀の弓",13,6,70,10,2);
			}
			else if(rand<0.95) {
				this.bow=new Bow("リヤンフルチェ",9,7,70,20,3);
			}
			else if(rand<=1) {
				this.bow  =new Bow("ミュルグレ",16,9,80,10,2);
			}
		}

		//戦闘前武器装備メソッド
		public void equipWeaponBeforeBattle() {
			Weapon[] w={sword,bow};
			Random random=new Random();
			int rand=random.nextInt(2);
			switch(rand) {
			case 0:
				this.equip=this.sword;
				break;
			case 1:
				this.equip=this.bow;
				break;
			}


		}
		//全武器一括生成メソッド
		public void equipNewWeapon() {
			this.equipNewSword();
			this.equipNewBow();
			this.equipWeaponBeforeBattle();
		}
		//戦闘中武器持ち替えメソッド
		public void changeEquip(Weapon o) {
			Random random=new Random();
			int rand=random.nextInt(2);
			if(o instanceof Axe) {
				this.equip=null;
				this.equip=(Sword)this.sword;
			}else {
				if(rand==0) {
					if(o instanceof Weapon) {
						this.equip=null;
						this.equip=(Sword)this.sword;
						System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
					}
				}else if(rand==1){
					if(o instanceof Weapon) {
						this.equip=null;
						this.equip=(Bow)this.bow;
						System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
					}
				}
			}

		}
		public NomadicCavalry() {
			//名前
			Random random=new Random();
			int rand=random.nextInt(5);
			switch(rand) {
			case 0:
				this.name="ダヤン";
				break;
			case 1:
				this.name="スー";
				break;
			case 2:
				this.name="シン";
				break;
			case 3:
				this.name="ラス";
				break;
			case 4:
				this.name="ウハイ";
			}
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
			this.MaxHP=this.hp;

			//力
			if(rand2<=0.1) {
				this.setStrength(15);
			}
			else if(rand2<=0.2) {
				this.setStrength(16);
			}
			else if(rand2<=0.3) {
				this.setStrength(17);
			}
			else if(rand2<=0.4) {
				this.setStrength(18);
			}
			else if(rand2<=0.6) {
				this.setStrength(19);
			}
			else if(rand2<=0.7) {
				this.setStrength(20);
			}
			else if(rand2<=0.8) {
				this.setStrength(21);
			}
			else if(rand2<=0.9) {
				this.setStrength(22);
			}
			else if(rand2<=1) {
				this.setStrength(23);
			}
			//技
			if(rand3<=0.1) {
				this.setSkill(22);
			}
			else if(rand3<=0.2) {
				this.setSkill(23);
			}
			else if(rand3<=0.3) {
				this.setSkill(24);
			}
			else if(rand3<=0.4) {
				this.setSkill(25);
			}
			else if(rand3<=0.6) {
				this.setSkill(26);
			}
			else if(rand3<=0.7) {
				this.setSkill(27);
			}
			else if(rand3<=0.8) {
				this.setSkill(28);
			}
			else if(rand3<=0.9) {
				this.setSkill(29);
			}
			else if(rand3<=1) {
				this.setSkill(30);
			}
			//速さ
			if(rand4<=0.1) {
				this.setSpeed(22);
			}
			else if(rand4<=0.2) {
				this.setSpeed(23);
			}
			else if(rand4<=0.3) {
				this.setSpeed(24);
			}
			else if(rand4<=0.4) {
				this.setSpeed(25);
			}
			else if(rand4<=0.6) {
				this.setSpeed(26);
			}
			else if(rand4<=0.7) {
				this.setSpeed(27);
			}
			else if(rand4<=0.8) {
				this.setSpeed(28);
			}
			else if(rand4<=0.9) {
				this.setSpeed(29);
			}
			else if(rand4<=1) {
				this.setSpeed(30);
			}
			//守備
			if(rand5<=0.1) {
				this.setDefence(10);
			}
			else if(rand5<=0.2) {
				this.setDefence(11);
			}
			else if(rand5<=0.3) {
				this.setDefence(12);
			}
			else if(rand5<=0.4) {
				this.setDefence(13);
			}
			else if(rand5<=0.6) {
				this.setDefence(14);
			}
			else if(rand5<=0.7) {
				this.setDefence(15);
			}
			else if(rand5<=0.8) {
				this.setDefence(16);
			}
			else if(rand5<=0.9) {
				this.setDefence(17);
			}
			else if(rand5<=1) {
				this.setDefence(18);
			}
			//魔防
			if(rand6<=0.1) {
				this.setResist(6);
			}
			else if(rand6<=0.2) {
				this.setResist(7);
			}
			else if(rand6<=0.3) {
				this.setResist(8);
			}
			else if(rand6<=0.4) {
				this.setResist(9);
			}
			else if(rand6<=0.6) {
				this.setResist(10);
			}
			else if(rand6<=0.7) {
				this.setResist(11);
			}
			else if(rand6<=0.8) {
				this.setResist(12);
			}
			else if(rand6<=0.9) {
				this.setResist(13);
			}
			else if(rand6<=1) {
				this.setResist(14);
			}
			//幸運
			if(rand7<=0.1) {
				this.setLuck(3);
			}
			else if(rand7<=0.2) {
				this.setLuck(6);
			}
			else if(rand7<=0.3) {
				this.setLuck(9);
			}
			else if(rand7<=0.4) {
				this.setLuck(12);
			}
			else if(rand7<=0.6) {
				this.setLuck(15);
			}
			else if(rand7<=0.7) {
				this.setLuck(18);
			}
			else if(rand7<=0.8) {
				this.setLuck(21);
			}
			else if(rand7<=0.9) {
				this.setLuck(24);
			}
			else if(rand7<=1) {
				this.setLuck(27);
			}
			//体格
			if(rand8<=0.1) {
				this.setConstitution(12);
			}
			else if(rand8<=0.2) {
				this.setConstitution(14);
			}
			else if(rand8<=0.3) {
				this.setConstitution(16);
			}
			else if(rand8<=0.4) {
				this.setConstitution(18);
			}
			else if(rand8<=0.6) {
				this.setConstitution(20);
			}
			else if(rand8<=0.7) {
				this.setConstitution(22);
			}
			else if(rand8<=0.8) {
				this.setConstitution(24);
			}
			else if(rand8<=0.9) {
				this.setConstitution(26);
			}
			else if(rand8<=1) {
				this.setConstitution(28);
			}
		}
		public String toString() {
			return "名前    "+this.name+"\n"+"クラス  "+this.getCName()+"\n"+"HP      "+this.hp+"\n"+"力      "+this.getStrength()+"\n"
					+"技      "+this.getSkill()+"\n"+"速さ    "+this.getSpeed()+"\n"+"守備    "+this.getDefence()+"\n"+
								"魔防    "+this.getResist()+"\n"+"幸運    "+this.getLuck()+"\n"+"体格    "+this.getConstitution();

		}
		public void showSt() {
			System.out.println(this.toString());
		}
		public String getCName() {
			return this.cName;
		}
}
