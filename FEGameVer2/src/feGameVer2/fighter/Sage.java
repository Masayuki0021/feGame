package feGameVer2.fighter;

import java.util.Random;

import feGameVer2.CheckNumber;
import feGameVer2.weapon.Nature;
import feGameVer2.weapon.Weapon;

public class Sage extends Fighter {
	Nature nature;
	Nature naturesub;
	String cName="賢者";

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
	//理魔法生成メソッド
	public void chooseEquipNewNature(int num) {
		if(num==1) {
			this.nature=new Nature("ファイアー",5,2,90,0,3);
		}
		else if(num==2) {
			this.nature =new Nature("サンダー",8,4,80,5,3);
		}
		else if(num==3) {
			this.nature =new Nature("エルファイアー",10,6,85,0,3);
		}
		else if(num==4) {
			this.nature =new Nature("サンダーストーム",12,10,70,10,3);
		}
		else if(num==5) {
			this.nature =new Nature("フィンブル",13,8,80,5,3);
		}
		else if(num==6) {
			this.nature =new Nature("エイルカリバー",8,8,90,10,3);
		}
		else if(num==7) {
			this.nature =new Nature("フォルブレイズ",14,10,85,5,3);
		}
	}

	//サブ理魔法生成メソッド
	public void equipNewNatureSub() {
		double rand = Math.random();
		if(rand<0.3) {
			this.naturesub=new Nature("ファイアー",5,2,90,0,3);
		}
		else if(rand<0.4) {
			this.naturesub =new Nature("サンダー",8,4,80,5,3);
		}
		else if(rand<0.5) {
			this.naturesub =new Nature("エルファイアー",10,6,85,0,3);
		}
		else if(rand<0.6) {
			this.naturesub =new Nature("サンダーストーム",12,10,70,10,3);
		}
		else if(rand<0.7) {
			this.naturesub =new Nature("フィンブル",13,8,80,5,3);
		}
		else if(rand<0.95) {
			this.naturesub =new Nature("エイルカリバー",8,8,90,10,3);
		}
		else if(rand<1) {
			this.naturesub =new Nature("フォルブレイズ",14,10,85,5,3);
		}
	}
	//選択サブ理魔法生成メソッド
	public void chooseEquipNewNatureSub(int num) {
		if(num==1) {
			this.naturesub=new Nature("ファイアー",5,2,90,0,3);
		}
		else if(num==2) {
			this.naturesub =new Nature("サンダー",8,4,80,5,3);
		}
		else if(num==3) {
			this.naturesub =new Nature("エルファイアー",10,6,85,0,3);
		}
		else if(num==4) {
			this.naturesub =new Nature("サンダーストーム",12,10,70,10,3);
		}
		else if(num==5) {
			this.naturesub =new Nature("フィンブル",13,8,80,5,3);
		}
		else if(num==6) {
			this.naturesub =new Nature("エイルカリバー",8,8,90,10,3);
		}
		else if(num==7) {
			this.naturesub =new Nature("フォルブレイズ",14,10,85,5,3);
		}
	}
	//戦闘前武器装備メソッド
	public void equipWeaponBeforeBattle() {
			this.equip=this.nature;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
	}
	//全武器一括生成メソッド
	public void equipNewWeapon() {
		this.equipNewNature();
		this.equipNewNatureSub();
		this.equipWeaponBeforeBattle();
	}
	//武器選択、生成メソッド
	public void chooseEquipNewWeapon(){
		System.out.println("メイン武器を選択してください");
		System.out.println(" :名前				威力	重さ	命中	必殺	距離");
		System.out.println("1:ファイアー		5,		2,		90,		0,		遠近");
		System.out.println("2:サンダー			8,		4,		80,		5,		遠近");
		System.out.println("3:エルファイアー	10,		6,		85,		0,		遠近");
		System.out.println("4:サンダーストーム	12,		10,		70,		10,		遠近");
		System.out.println("5:フィンブル		13,		8,		80,		5,		遠近");
		System.out.println("6:エイルカリバー	8,		8,		90,		10,		遠近");
		System.out.println("7:フォルブレイズ	14,		10,		85,		5,		遠近");
		System.out.println("↓");
		int num=CheckNumber.checkAndReturnNumber(1,7);
		this.chooseEquipNewNature(num);
		System.out.println("サブ武器を選択してください");
		System.out.println(" :名前				威力	重さ	命中	必殺	距離");
		System.out.println("1:ファイアー		5,		2,		90,		0,		遠近");
		System.out.println("2:サンダー			8,		4,		80,		5,		遠近");
		System.out.println("3:エルファイアー	10,		6,		85,		0,		遠近");
		System.out.println("4:サンダーストーム	12,		10,		70,		10,		遠近");
		System.out.println("5:フィンブル		13,		8,		80,		5,		遠近");
		System.out.println("6:エイルカリバー	8,		8,		90,		10,		遠近");
		System.out.println("7:フォルブレイズ	14,		10,		85,		5,		遠近");
		System.out.println("↓");
		num=CheckNumber.checkAndReturnNumber(1,7);
		this.chooseEquipNewNatureSub(num);
		this.equipWeaponBeforeBattle();
	}

	//戦闘中武器持ち替えメソッド
	public void changeEquip(Weapon o) {
		Random random=new Random();
		int rand=random.nextInt(2);
		if(rand==0) {
			this.equip=null;
			this.equip=(Nature)this.nature;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}else if(rand==1){
			this.equip=null;
			this.equip=(Nature)this.naturesub;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}
	}
	public Sage() {
		//名前
		Random random=new Random();
		int rand=random.nextInt(7);
		switch(rand) {
		case 0:
			this.name="ルゥ";
			break;
		case 1:
			this.name="リリーナ";
			break;
		case 2:
			this.name="パント";
			break;
		case 3:
			this.name="エルク";
			break;
		case 4:
			this.name="ニノ";
			break;
		case 5:
			this.name="ルーテ";
				break;
		case 6:
			this.name="サレフ";
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
			this.hp=28;
		}
		else if(rand1<=0.2) {
			this.hp=30;
		}
		else if(rand1<=0.3) {
			this.hp=32;
		}
		else if(rand1<=0.4) {
			this.hp=34;
		}
		else if(rand1<=0.6) {
			this.hp=36;
		}
		else if(rand1<=0.7) {
			this.hp=38;
		}
		else if(rand1<=0.8) {
			this.hp=40;
		}
		else if(rand1<=0.9) {
			this.hp=42;
		}
		else if(rand1<=1) {
			this.hp=46;
		}
		this.MaxHP=this.hp;

		//力
		if(rand2<=0.1) {
			this.setStrength(20);
		}
		else if(rand2<=0.2) {
			this.setStrength(21);
		}
		else if(rand2<=0.3) {
			this.setStrength(22);
		}
		else if(rand2<=0.4) {
			this.setStrength(23);
		}
		else if(rand2<=0.6) {
			this.setStrength(24);
		}
		else if(rand2<=0.7) {
			this.setStrength(25);
		}
		else if(rand2<=0.8) {
			this.setStrength(26);
		}
		else if(rand2<=0.9) {
			this.setStrength(27);
		}
		else if(rand2<=1) {
			this.setStrength(28);
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
			this.setSpeed(21);
		}
		else if(rand4<=0.2) {
			this.setSpeed(22);
		}
		else if(rand4<=0.3) {
			this.setSpeed(23);
		}
		else if(rand4<=0.4) {
			this.setSpeed(24);
		}
		else if(rand4<=0.6) {
			this.setSpeed(25);
		}
		else if(rand4<=0.7) {
			this.setSpeed(26);
		}
		else if(rand4<=0.8) {
			this.setSpeed(27);
		}
		else if(rand4<=0.9) {
			this.setSpeed(28);
		}
		else if(rand4<=1) {
			this.setSpeed(29);
		}
		//守備
		if(rand5<=0.1) {
			this.setDefence(3);
		}
		else if(rand5<=0.2) {
			this.setDefence(4);
		}
		else if(rand5<=0.3) {
			this.setDefence(5);
		}
		else if(rand5<=0.4) {
			this.setDefence(6);
		}
		else if(rand5<=0.6) {
			this.setDefence(7);
		}
		else if(rand5<=0.7) {
			this.setDefence(8);
		}
		else if(rand5<=0.8) {
			this.setDefence(9);
		}
		else if(rand5<=0.9) {
			this.setDefence(10);
		}
		else if(rand5<=1) {
			this.setDefence(11);
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
			this.setLuck(3);
		}
		else if(rand7<=0.2) {
			this.setLuck(5);
		}
		else if(rand7<=0.3) {
			this.setLuck(7);
		}
		else if(rand7<=0.4) {
			this.setLuck(9);
		}
		else if(rand7<=0.6) {
			this.setLuck(11);
		}
		else if(rand7<=0.7) {
			this.setLuck(13);
		}
		else if(rand7<=0.8) {
			this.setLuck(15);
		}
		else if(rand7<=0.9) {
			this.setLuck(17);
		}
		else if(rand7<=1) {
			this.setLuck(18);
		}
		//体格
		if(rand8<=0.1) {
			this.setConstitution(4);
		}
		else if(rand8<=0.2) {
			this.setConstitution(5);
		}
		else if(rand8<=0.3) {
			this.setConstitution(6);
		}
		else if(rand8<=0.4) {
			this.setConstitution(7);
		}
		else if(rand8<=0.6) {
			this.setConstitution(8);
		}
		else if(rand8<=0.7) {
			this.setConstitution(9);
		}
		else if(rand8<=0.8) {
			this.setConstitution(10);
		}
		else if(rand8<=0.9) {
			this.setConstitution(11);
		}
		else if(rand8<=1) {
			this.setConstitution(12);
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

