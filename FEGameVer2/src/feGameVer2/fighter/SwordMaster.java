package feGameVer2.fighter;

import java.util.Random;

import feGameVer2.CheckNumber;
import feGameVer2.weapon.Sword;
import feGameVer2.weapon.Weapon;

public class SwordMaster extends Fighter{
	Sword sword;
	Sword swordsub;
	String cName="ソードマスター";

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
		else if(rand<0.75) {
			this.sword =new Sword("キルソード",9,7,80,30,1);
		}
		else if(rand<0.85) {
			this.sword =new Sword("銀の剣",13,8,75,0,1);
		}
		else if(rand<=1) {
			this.sword =new Sword("倭刀",8,5,75,40,1);
		}
	}
	//選択剣武器生成メソッド
	public void chooseEquipNewSword(int num) {
		if(num==1) {
			this.sword=new Sword("鉄の剣",5,5,85,0,1);
		}
		else if(num==2) {
			this.sword =new Sword("細身の剣",3,2,95,5,1);
		}
		else if(num==3) {
			this.sword =new Sword("鋼の剣",8,10,70,0,1);
		}
		else if(num==4) {
			this.sword =new Sword("キルソード",9,7,80,30,1);
		}
		else if(num==5) {
			this.sword =new Sword("銀の剣",13,8,75,0,1);
		}
		else if(num==6) {
			this.sword =new Sword("倭刀",8,5,75,40,1);
		}
	}
//サブ剣武器生成メソッド
	public void equipNewSwordsub() {
		double rand = Math.random();
		if(rand<0.3) {
			this.swordsub=new Sword("鉄の剣",5,5,85,0,1);
		}
		else if(rand<0.4) {
			this.swordsub =new Sword("細身の剣",3,2,95,5,1);
		}
		else if(rand<0.5) {
			this.swordsub =new Sword("鋼の剣",8,10,70,0,1);
		}
		else if(rand<0.75) {
			this.swordsub =new Sword("キルソード",9,7,80,30,1);
		}
		else if(rand<0.85) {
			this.swordsub =new Sword("銀の剣",13,8,75,0,1);
		}
		else if(rand<=1) {
			this.swordsub =new Sword("倭刀",8,5,75,40,1);
		}
	}
	//選択剣武器生成メソッド
	public void chooseEquipNewSwordSub(int num) {
		if(num==1) {
			this.swordsub=new Sword("鉄の剣",5,5,85,0,1);
		}
		else if(num==2) {
			this.swordsub =new Sword("細身の剣",3,2,95,5,1);
		}
		else if(num==3) {
			this.swordsub =new Sword("鋼の剣",8,10,70,0,1);
		}
		else if(num==4) {
			this.swordsub =new Sword("キルソード",9,7,80,30,1);
		}
		else if(num==5) {
			this.swordsub =new Sword("銀の剣",13,8,75,0,1);
		}
		else if(num==6) {
			this.swordsub =new Sword("倭刀",8,5,75,40,1);
		}
	}
	//戦闘前武器装備メソッド
	public void equipWeaponBeforeBattle() {
			this.equip=this.sword;
	}
	//全武器一括生成メソッド
	public void equipNewWeapon() {
		this.equipNewSword();
		this.equipNewSwordsub();
		this.equipWeaponBeforeBattle();
		this.criticalUpper();
	}
//武器選択、生成メソッド
	public void chooseEquipNewWeapon(){
		System.out.println("メイン武器を選択してください");
		System.out.println(" :名前			威力	重さ	命中	必殺	距離");
		System.out.println("1:鉄の剣		5,		5,		85,		0,		近");
		System.out.println("2:細身の剣		3,		2,		95,		5,		近");
		System.out.println("3:鋼の剣		8,		10,		70,		0,		近");
		System.out.println("4:キルソード	9,		7,		80,		30,		近");
		System.out.println("5:銀の剣		13,		8,		75,		0,		近");
		System.out.println("6:倭刀			8,		5,		75,		40,		近");
		System.out.println("↓");
		int num=CheckNumber.checkAndReturnNumber(1,6);
		this.chooseEquipNewSword(num);
		System.out.println("サブ武器を選択してください");
		System.out.println(" :名前			威力	重さ	命中	必殺	距離");
		System.out.println("1:鉄の剣		5,		5,		85,		0,		近");
		System.out.println("2:細身の剣		3,		2,		95,		5,		近");
		System.out.println("3:鋼の剣		8,		10,		70,		0,		近");
		System.out.println("4:キルソード	9,		7,		80,		30,		近");
		System.out.println("5:銀の剣		13,		8,		75,		0,		近");
		System.out.println("6:倭刀			8,		5,		75,		40,		近");
		System.out.println("↓");
		num=CheckNumber.checkAndReturnNumber(1,6);
		this.chooseEquipNewSwordSub(num);
		this.equipWeaponBeforeBattle();
		this.criticalUpper();

	}


	//戦闘中武器持ち替えメソッド
	public void changeEquip(Weapon o) {
		Random random=new Random();
		int rand=random.nextInt(2);
		if(rand==0) {
			this.equip=null;
			this.equip=(Sword)this.sword;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}else if(rand==1){
			this.equip=null;
			this.equip=(Sword)this.swordsub;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}
	}
	//必殺補正メソッド
	public void criticalUpper() {
		this.equip.setCritical(this.equip.getCritical() + 30);
	}
	public SwordMaster() {
		//名前
		Random random=new Random();
		int rand=random.nextInt(10);
		switch(rand) {
		case 0:
			this.name="リン";
			break;
		case 1:
			this.name="ギィ";
			break;
		case 2:
			this.name="カレル";
			break;
		case 3:
			this.name="カアラ";
			break;
		case 4:
			this.name="フィル";
			break;
		case 5:
			this.name="ルトガー";
				break;
		case 6:
			this.name="ロイド";
			break;
		case 7:
			this.name="ヨシュア";
			break;
		case 8:
			this.name="マリカ";
			break;
		case 9:
			this.name="ワユ";
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
		this.MaxHP=this.hp;

		//力
		if(rand2<=0.1) {
			this.setStrength(14);
		}
		else if(rand2<=0.2) {
			this.setStrength(15);
		}
		else if(rand2<=0.3) {
			this.setStrength(16);
		}
		else if(rand2<=0.4) {
			this.setStrength(17);
		}
		else if(rand2<=0.6) {
			this.setStrength(18);
		}
		else if(rand2<=0.7) {
			this.setStrength(19);
		}
		else if(rand2<=0.8) {
			this.setStrength(20);
		}
		else if(rand2<=0.9) {
			this.setStrength(21);
		}
		else if(rand2<=1) {
			this.setStrength(22);
		}
		//技
		if(rand3<=0.1) {
			this.setSkill(24);
		}
		else if(rand3<=0.2) {
			this.setSkill(25);
		}
		else if(rand3<=0.3) {
			this.setSkill(26);
		}
		else if(rand3<=0.4) {
			this.setSkill(27);
		}
		else if(rand3<=0.6) {
			this.setSkill(28);
		}
		else if(rand3<=0.7) {
			this.setSkill(29);
		}
		else if(rand3<=0.8) {
			this.setSkill(30);
		}
		else if(rand3<=0.9) {
			this.setSkill(31);
		}
		else if(rand3<=1) {
			this.setSkill(32);
		}
		//速さ
		if(rand4<=0.1) {
			this.setSpeed(24);
		}
		else if(rand4<=0.2) {
			this.setSpeed(25);
		}
		else if(rand4<=0.3) {
			this.setSpeed(26);
		}
		else if(rand4<=0.4) {
			this.setSpeed(27);
		}
		else if(rand4<=0.6) {
			this.setSpeed(28);
		}
		else if(rand4<=0.7) {
			this.setSpeed(29);
		}
		else if(rand4<=0.8) {
			this.setSpeed(30);
		}
		else if(rand4<=0.9) {
			this.setSpeed(31);
		}
		else if(rand4<=1) {
			this.setSpeed(32);
		}
		//守備
		if(rand5<=0.1) {
			this.setDefence(5);
		}
		else if(rand5<=0.2) {
			this.setDefence(6);
		}
		else if(rand5<=0.3) {
			this.setDefence(7);
		}
		else if(rand5<=0.4) {
			this.setDefence(8);
		}
		else if(rand5<=0.6) {
			this.setDefence(9);
		}
		else if(rand5<=0.7) {
			this.setDefence(10);
		}
		else if(rand5<=0.8) {
			this.setDefence(11);
		}
		else if(rand5<=0.9) {
			this.setDefence(12);
		}
		else if(rand5<=1) {
			this.setDefence(13);
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
			this.setConstitution(5);
		}
		else if(rand8<=0.2) {
			this.setConstitution(6);
		}
		else if(rand8<=0.3) {
			this.setConstitution(7);
		}
		else if(rand8<=0.4) {
			this.setConstitution(8);
		}
		else if(rand8<=0.6) {
			this.setConstitution(9);
		}
		else if(rand8<=0.7) {
			this.setConstitution(10);
		}
		else if(rand8<=0.8) {
			this.setConstitution(11);
		}
		else if(rand8<=0.9) {
			this.setConstitution(12);
		}
		else if(rand8<=1) {
			this.setConstitution(13);
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
