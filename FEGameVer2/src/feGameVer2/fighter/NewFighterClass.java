package feGameVer2.fighter;

import java.util.Random;

import feGameVer2.weapon.Axe;
import feGameVer2.weapon.Bow;
import feGameVer2.weapon.Dark;
import feGameVer2.weapon.Lance;
import feGameVer2.weapon.Light;
import feGameVer2.weapon.Nature;
import feGameVer2.weapon.Sword;
import feGameVer2.weapon.Weapon;

public class NewFighterClass extends Fighter{
	//武器を選んで
	Sword sword;
	Lance lance;
	Axe axe;
	Bow bow;
	Nature nature;
	Dark dark;
	Light light;
	//クラス名
	String cName="";


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
		else if(rand<0.7) {
			this.sword =new Sword("銀の剣",13,8,75,0,1);
		}
		else if(rand<0.8) {
			this.sword =new Sword("鉄の大剣",9,12,65,0,1);
		}
		else if(rand<0.88) {
			this.sword =new Sword("鋼の大剣",11,14,60,0,1);
		}
		else if(rand<0.95) {
			this.sword =new Sword("銀の大剣",17,13,55,0,1);
		}
		else if(rand<=1) {
			this.sword =new Sword("倭刀",8,5,75,40,1);
		}
	}


	//槍武器生成メソッド
	public void equipNewLance() {
		double rand = Math.random();
		if(rand<0.35) {
			this.lance=new Lance("鉄の槍",7,8,70,0,1);
		}
		else if(rand<0.5) {
			this.lance =new Lance("てやり",6,11,55,0,3);
		}
		else if(rand<0.6) {
			this.lance =new Lance("細身の槍",4,4,80,5,1);
		}
		else if(rand<0.7) {
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
			this.axe =new Axe("鋼の斧",11,15,50,0,1);
		}
		else if(rand<0.7) {
			this.axe =new Axe("キラーアクス",11,11,65,30,1);
		}
		else if(rand<0.9) {
			this.axe  =new Axe("銀の斧",15,12,55,0,1);
		}
		else if(rand<=1) {
			this.axe =new Axe("トマホーク",13,14,55,5,3);
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
		//理魔法生成メソッド
		public void equipNewNature() {
			double rand = Math.random();
			if(rand<0.3) {
				this.nature=new Nature("ファイアー",5,2,90,0,3);
			}
			else if(rand<0.4) {
				this.nature =new Nature("サンダー",8,4,80,5,3);
			}
			else if(rand<0.5) {
				this.nature =new Nature("エルファイアー",10,6,85,0,3);
			}
			else if(rand<0.6) {
				this.nature =new Nature("サンダーストーム",12,10,70,10,3);
			}
			else if(rand<0.7) {
				this.nature =new Nature("フィンブル",13,8,80,5,3);
			}
			else if(rand<0.95) {
				this.nature =new Nature("エイルカリバー",8,8,90,10,3);
			}
			else if(rand<1) {
				this.nature =new Nature("フォルブレイズ",14,10,85,5,3);
			}
		}
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
				this.dark =new Dark("イクリプス",20,18,50,20,3);
			}
			else if(rand<0.6) {
				this.dark =new Dark("ノスフェラート",15,11,65,10,3);
			}
			else if(rand<0.7) {
				this.dark =new Dark("グレイプニル",23,18,80,0,3);
			}
			else if(rand<0.95) {
				this.dark =new Dark("ルナ",10,8,65,20,3);
			}
			else if(rand<1) {
				this.dark =new Dark("アポカリプス",18,17,80,5,3);
			}
		}
		//光魔法生成メソッド
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
				this.light =new Light("パージ",10,15,70,5,3);
			}
			else if(rand<0.7) {
				this.light =new Light("アルジローレ",12,19,85,0,3);
			}
			else if(rand<1) {
				this.light =new Light("アーリアル",15,16,90,5,3);
			}
		}

		//戦闘前武器装備メソッド
		public void equipWeaponBeforeBattle() {
			Weapon[] w={sword,lance,axe,bow,nature,dark,light};
			Random random=new Random();
			int rand=random.nextInt(7);
		switch(rand) {
		case 0:
			this.equip=this.sword;
			break;
		case 1:
			this.equip=this.lance;
			break;
		case 2:
			this.equip=this.axe;
			break;
		case 3:
			this.equip=this.bow;
			break;
		case 4:
			this.equip=this.nature;
			break;
		case 5:
			this.equip=this.dark;
			break;
		case 6:
			this.equip=this.light;
			break;
		}


	}
	//全武器一括生成メソッド
	public void equipNewWeapon() {
		//全武器生成中 使う時に選別して
		this.equipNewSword();
		this.equipNewLance();
		this.equipNewAxe();
		this.equipNewBow();
		this.equipNewNature();
		this.equipNewDark();
		this.equipNewLight();
		this.equipWeaponBeforeBattle();
	}


	//戦闘中武器持ち替えメソッド
	public void changeEquip(Weapon o) {
		if(o instanceof Sword) {
			this.equip=null;
			this.equip=(Lance)this.lance;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}
		else if(o instanceof Lance) {
			this.equip=null;
			this.equip=(Axe)this.axe;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}
		else if(o instanceof Axe) {
			this.equip=null;
			this.equip=(Sword)this.sword;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}

	}
	//弓を使うときはこっち
/*
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

*/

	public NewFighterClass() {
		//名前
			this.name="マーカス";
		//hp
			this.hp=32;
			this.MaxHP=this.hp;
			//力
			this.setStrength(22);
			//技
			this.setSkill(15);
			//速さ
			this.setSpeed(18);
			//守備
			this.setDefence(18);
			//魔防
			this.setResist(10);
			//幸運
			this.setLuck(15);
			//体格
			this.setConstitution(12);
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

