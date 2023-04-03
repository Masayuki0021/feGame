package feGameVer2.fighter;

import java.util.Random;

import feGameVer2.CheckNumber;
import feGameVer2.weapon.Axe;
import feGameVer2.weapon.Lance;
import feGameVer2.weapon.Sword;
import feGameVer2.weapon.Weapon;

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
	//選択槍武器生成メソッド
	public void chooseEquipNewLance(int num) {
		if(num==1) {
			this.lance=new Lance("鉄の槍",7,8,70,0,1);
		}
		else if(num==2) {
			this.lance =new Lance("てやり",6,11,55,0,3);
		}
		else if(num==3) {
			this.lance =new Lance("細身の槍",4,4,80,5,1);
		}
		else if(num==4) {
			this.lance =new Lance("鋼の槍",10,13,55,0,1);
		}
		else if(num==5) {
			this.lance =new Lance("キラーランス",10,9,75,30,1);
		}
		else if(num==6) {
			this.lance =new Lance("銀の槍",14,10,65,0,1);
		}
		else if(num==7) {
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
			this.axe =new Axe("デビルアクス",24,18,20,0,1);
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
		else if(rand<0.95) {
			this.axe =new Axe("トマホーク",13,14,55,5,3);
		}
		else if(rand<=1) {
			this.axe=new Axe("アルマーズ",18,18,85,0,1);
		}
	}
	//選択斧武器生成メソッド
	public void chooseEquipNewAxe(int num) {
		if(num==1) {
			this.axe=new Axe("鉄の斧",8,10,65,0,1);
		}
		else if(num==2) {
			this.axe =new Axe("ておの",7,15,50,0,3);
		}
		else if(num==3) {
			this.axe =new Axe("デビルアクス",24,18,20,0,1);
		}
		else if(num==4) {
			this.axe =new Axe("鋼の斧",11,15,50,0,1);
		}
		else if(num==5) {
			this.axe =new Axe("キラーアクス",11,11,65,30,1);
		}
		else if(num==6) {
			this.axe  =new Axe("銀の斧",15,12,55,0,1);
		}
		else if(num==7) {
			this.axe =new Axe("トマホーク",13,14,55,5,3);
		}
		else if(num==8) {
			this.axe=new Axe("アルマーズ",18,18,85,0,1);
		}
	}


	//戦闘前武器装備メソッド
	public void equipWeaponBeforeBattle() {
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
	//武器選択、生成メソッド
	public void chooseEquipNewWeapon(){
		System.out.println("槍武器を選択してください");
		System.out.println(" :名前			威力	重さ	命中	必殺	距離");
		System.out.println("1:鉄の槍		7,		8,		70,		0,		近");
		System.out.println("2:てやり		6,		11,		55,		0,		遠近");
		System.out.println("3:細身の槍		4,		4,		80,		5,		近");
		System.out.println("4:鋼の槍		10,		13,		55,		0,		近");
		System.out.println("5:キラーランス	10,		9,		75,		30,		近");
		System.out.println("6:銀の槍		14,		10,		65,		0		近");
		System.out.println("7:スレンドスピア10,		10,		65,		5		遠近");
		System.out.println("↓");
		CheckNumber checkNumber=new CheckNumber();
		int num=checkNumber.checkAndReturnNumber(1,7);
		this.chooseEquipNewLance(num);
		System.out.println("斧武器を選択してください");
		System.out.println(" :名前			威力	重さ	命中	必殺	距離");
		System.out.println("1:鉄の斧		8,		10,		65,		0,		近");
		System.out.println("2:ておの		7,		15,		50,		0,		遠近");
		System.out.println("3;デビルアクス	24,		18,		20,		0,		近");
		System.out.println("4:鋼の斧		11,		15,		50,		0,		近");
		System.out.println("5:キラーアクス	11,		11,		65,		30,		近");
		System.out.println("6:銀の斧		15,		12,		55,		0,		近");
		System.out.println("7:トマホーク	13,		14,		55,		5,		遠近");
		System.out.println("8:アルマーズ	18,		18,		85,		0,		近");
		System.out.println("↓");
				num=checkNumber.checkAndReturnNumber(1,7);
		this.chooseEquipNewAxe(num);
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
			this.equip=(Axe)this.axe;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}
		else {
			Random random=new Random();
			int rand=random.nextInt(2);
			if(rand==0) {
				this.equip=null;
				this.equip=(Lance)this.lance;
				System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
			}else if(rand==1) {
				this.equip=null;
				this.equip=(Axe)this.axe;
				System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
			}
		}

	}

	public DragonMaster() {

		//名前
		Random random=new Random();
		int rand=random.nextInt(10);
		switch(rand) {
		case 0:
			this.name="ミレディ";
			break;
		case 1:
			this.name="ツァイス";
			break;
		case 2:
			this.name="ヒース";
			break;
		case 3:
			this.name="ヴァイダ";
			break;
		case 4:
			this.name="ナーシェン";
			break;
		case 5:
			this.name="ゲイル";
				break;
		case 6:
			this.name="ハール";
			break;
		case 7:
			this.name="ジル";
			break;
		case 8:
			this.name="グレン";
			break;
		case 9:
			this.name="クーガー";
			break;
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
		this.MaxHP=this.hp;

		//力
		if(rand2<=0.1) {
			this.setStrength(21);
		}
		else if(rand2<=0.2) {
			this.setStrength(22);
		}
		else if(rand2<=0.3) {
			this.setStrength(23);
		}
		else if(rand2<=0.4) {
			this.setStrength(24);
		}
		else if(rand2<=0.6) {
			this.setStrength(25);
		}
		else if(rand2<=0.7) {
			this.setStrength(26);
		}
		else if(rand2<=0.8) {
			this.setStrength(27);
		}
		else if(rand2<=0.9) {
			this.setStrength(28);
		}
		else if(rand2<=1) {
			this.setStrength(29);
		}
		//技
		if(rand3<=0.1) {
			this.setSkill(15);
		}
		else if(rand3<=0.2) {
			this.setSkill(16);
		}
		else if(rand3<=0.3) {
			this.setSkill(17);
		}
		else if(rand3<=0.4) {
			this.setSkill(18);
		}
		else if(rand3<=0.6) {
			this.setSkill(19);
		}
		else if(rand3<=0.7) {
			this.setSkill(20);
		}
		else if(rand3<=0.8) {
			this.setSkill(21);
		}
		else if(rand3<=0.9) {
			this.setSkill(22);
		}
		else if(rand3<=1) {
			this.setSkill(23);
		}
		//速さ
		if(rand4<=0.1) {
			this.setSpeed(18);
		}
		else if(rand4<=0.2) {
			this.setSpeed(19);
		}
		else if(rand4<=0.3) {
			this.setSpeed(20);
		}
		else if(rand4<=0.4) {
			this.setSpeed(21);
		}
		else if(rand4<=0.6) {
			this.setSpeed(22);
		}
		else if(rand4<=0.7) {
			this.setSpeed(23);
		}
		else if(rand4<=0.8) {
			this.setSpeed(24);
		}
		else if(rand4<=0.9) {
			this.setSpeed(25);
		}
		else if(rand4<=1) {
			this.setSpeed(26);
		}
		//守備
		if(rand5<=0.1) {
			this.setDefence(21);
		}
		else if(rand5<=0.2) {
			this.setDefence(22);
		}
		else if(rand5<=0.3) {
			this.setDefence(23);
		}
		else if(rand5<=0.4) {
			this.setDefence(24);
		}
		else if(rand5<=0.6) {
			this.setDefence(25);
		}
		else if(rand5<=0.7) {
			this.setDefence(26);
		}
		else if(rand5<=0.8) {
			this.setDefence(27);
		}
		else if(rand5<=0.9) {
			this.setDefence(28);
		}
		else if(rand5<=1) {
			this.setDefence(29);
		}
		//魔防
		if(rand6<=0.1) {
			this.setResist(2);
		}
		else if(rand6<=0.2) {
			this.setResist(3);
		}
		else if(rand6<=0.3) {
			this.setResist(4);
		}
		else if(rand6<=0.4) {
			this.setResist(5);
		}
		else if(rand6<=0.6) {
			this.setResist(6);
		}
		else if(rand6<=0.7) {
			this.setResist(7);
		}
		else if(rand6<=0.8) {
			this.setResist(8);
		}
		else if(rand6<=0.9) {
			this.setResist(9);
		}
		else if(rand6<=1) {
			this.setResist(10);
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
			this.setConstitution(10);
		}
		else if(rand8<=0.2) {
			this.setConstitution(11);
		}
		else if(rand8<=0.3) {
			this.setConstitution(12);
		}
		else if(rand8<=0.4) {
			this.setConstitution(13);
		}
		else if(rand8<=0.6) {
			this.setConstitution(14);
		}
		else if(rand8<=0.7) {
			this.setConstitution(15);
		}
		else if(rand8<=0.8) {
			this.setConstitution(16);
		}
		else if(rand8<=0.9) {
			this.setConstitution(17);
		}
		else if(rand8<=1) {
			this.setConstitution(18);
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
