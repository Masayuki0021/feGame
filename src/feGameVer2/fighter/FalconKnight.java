package feGameVer2.fighter;

import java.util.Random;

import feGameVer2.CheckNumber;
import feGameVer2.weapon.Axe;
import feGameVer2.weapon.Lance;
import feGameVer2.weapon.Sword;
import feGameVer2.weapon.Weapon;

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
		else if(rand<0.4) {
			this.sword =new Sword("ひかりの剣",9,9,70,0,3);
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
			this.sword =new Sword("ひかりの剣",9,9,70,0,3);
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
		else if(num==8) {
			this.lance =new Lance("マルテ",16,11,80,0,3);
		}
	}

	//戦闘前武器装備メソッド
	public void equipWeaponBeforeBattle() {
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
//武器選択、生成メソッド
	public void chooseEquipNewWeapon(){
		System.out.println("剣武器を選択してください");
		System.out.println(" :名前			威力	重さ	命中	必殺	距離");
		System.out.println("1:鉄の剣		5,		5,		85,		0,		近");
		System.out.println("2:細身の剣		3,		2,		95,		5,		近");
		System.out.println("3:鋼の剣		8,		10,		70,		0,		近");
		System.out.println("4:キルソード	9,		7,		80,		30,		近");
		System.out.println("5:銀の剣		13,		8,		75,		0,		近");
		System.out.println("6:ひかりの剣	9,		9,		70,		0,		遠近");
		System.out.println("↓");
		CheckNumber checkNumber=new CheckNumber();
		int num=checkNumber.checkAndReturnNumber(1,6);
		this.chooseEquipNewSword(num);
		System.out.println("槍武器を選択してください");
		System.out.println(" :名前			威力	重さ	命中	必殺	距離");
		System.out.println("1:鉄の槍		7,		8,		70,		0,		近");
		System.out.println("2:てやり		6,		11,		55,		0,		遠近");
		System.out.println("3:細身の槍		4,		4,		80,		5,		近");
		System.out.println("4:鋼の槍		10,		13,		55,		0,		近");
		System.out.println("5:キラーランス	10,		9,		75,		30,		近");
		System.out.println("6:銀の槍		14,		10,		65,		0,		近");
		System.out.println("7:スレンドスピア10,		10,		65,		5,		遠近");
		System.out.println("8:マルテ		16,		11,		80,		0,		遠近");
		System.out.println("↓");
		num=checkNumber.checkAndReturnNumber(1,8);
		this.chooseEquipNewLance(num);
		this.equipWeaponBeforeBattle();
	}

	//戦闘中武器持ち替えメソッド
	public void changeEquip(Weapon o) {
		if(o instanceof Sword) {
			this.equip=null;
			this.equip=(Lance)this.lance;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}
		else if(o instanceof Axe) {
			this.equip=null;
			this.equip=(Sword)this.sword;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}
		else if(o instanceof Lance) {
			this.equip=null;
			this.equip=(Lance)this.lance;
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
				this.equip=(Sword)this.sword;
				System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
			}
		}


	}
	public FalconKnight() {
		//名前
		Random random=new Random();
		int rand=random.nextInt(10);
		switch(rand) {

		case 0:
			this.name="シャニー";
			break;
		case 1:
			this.name="ティト";
			break;
		case 2:
			this.name="ユーノ";
			break;
		case 3:
			this.name="フロリーナ";
			break;
		case 4:
			this.name="フィオーラ";
			break;
		case 5:
			this.name="ファリナ";
				break;
		case 6:
			this.name="ヴァネッサ";
			break;
		case 7:
			this.name="ターナ";
			break;
		case 8:
			this.name="タニス";
			break;
		case 9:
			this.name="エリンシア";
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
			this.setSpeed(26);
		}
		else if(rand4<=0.2) {
			this.setSpeed(27);
		}
		else if(rand4<=0.3) {
			this.setSpeed(28);
		}
		else if(rand4<=0.4) {
			this.setSpeed(29);
		}
		else if(rand4<=0.6) {
			this.setSpeed(30);
		}
		else if(rand4<=0.7) {
			this.setSpeed(31);
		}
		else if(rand4<=0.8) {
			this.setSpeed(32);
		}
		else if(rand4<=0.9) {
			this.setSpeed(33);
		}
		else if(rand4<=1) {
			this.setSpeed(34);
		}
		//守備
		if(rand5<=0.1) {
			this.setDefence(12);
		}
		else if(rand5<=0.2) {
			this.setDefence(13);
		}
		else if(rand5<=0.3) {
			this.setDefence(14);
		}
		else if(rand5<=0.4) {
			this.setDefence(15);
		}
		else if(rand5<=0.6) {
			this.setDefence(16);
		}
		else if(rand5<=0.7) {
			this.setDefence(17);
		}
		else if(rand5<=0.8) {
			this.setDefence(18);
		}
		else if(rand5<=0.9) {
			this.setDefence(19);
		}
		else if(rand5<=1) {
			this.setDefence(20);
		}
		//魔防
		if(rand6<=0.1) {
			this.setResist(18);
		}
		else if(rand6<=0.2) {
			this.setResist(19);
		}
		else if(rand6<=0.3) {
			this.setResist(20);
		}
		else if(rand6<=0.4) {
			this.setResist(21);
		}
		else if(rand6<=0.6) {
			this.setResist(22);
		}
		else if(rand6<=0.7) {
			this.setResist(23);
		}
		else if(rand6<=0.8) {
			this.setResist(24);
		}
		else if(rand6<=0.9) {
			this.setResist(25);
		}
		else if(rand6<=1) {
			this.setResist(26);
		}
		//幸運
		if(rand7<=0.1) {
			this.setLuck(23);
		}
		else if(rand7<=0.2) {
			this.setLuck(24);
		}
		else if(rand7<=0.3) {
			this.setLuck(25);
		}
		else if(rand7<=0.4) {
			this.setLuck(26);
		}
		else if(rand7<=0.6) {
			this.setLuck(27);
		}
		else if(rand7<=0.7) {
			this.setLuck(28);
		}
		else if(rand7<=0.8) {
			this.setLuck(29);
		}
		else if(rand7<=0.9) {
			this.setLuck(30);
		}
		else if(rand7<=1) {
			this.setLuck(31);
		}
		//体格
		if(rand8<=0.1) {
			this.setConstitution(6);
		}
		else if(rand8<=0.2) {
			this.setConstitution(7);
		}
		else if(rand8<=0.3) {
			this.setConstitution(8);
		}
		else if(rand8<=0.4) {
			this.setConstitution(9);
		}
		else if(rand8<=0.6) {
			this.setConstitution(10);
		}
		else if(rand8<=0.7) {
			this.setConstitution(11);
		}
		else if(rand8<=0.8) {
			this.setConstitution(12);
		}
		else if(rand8<=0.9) {
			this.setConstitution(13);
		}
		else if(rand8<=1) {
			this.setConstitution(14);
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
