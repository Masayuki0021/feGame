package feGameVer2.fighter;

import java.util.Random;

import feGameVer2.CheckNumber;
import feGameVer2.weapon.Axe;
import feGameVer2.weapon.Weapon;

public class Berserker extends Fighter{
	Axe axe;
	Axe axesub;
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

	//サブ斧武器生成メソッド
	public void equipNewAxeSub() {
		double rand = Math.random();
		if(rand<0.35) {
			this.axesub=new Axe("鉄の斧",8,10,65,0,1);
		}
		else if(rand<0.5) {
			this.axesub =new Axe("ておの",7,15,50,0,3);
		}
		else if(rand<0.6) {
			this.axesub =new Axe("デビルアクス",24,18,20,0,1);
		}
		else if(rand<0.7) {
			this.axesub =new Axe("鋼の斧",11,15,50,0,1);
		}
		else if(rand<0.8) {
			this.axesub =new Axe("キラーアクス",11,11,65,30,1);
		}
		else if(rand<0.9) {
			this.axesub  =new Axe("銀の斧",15,12,55,0,1);
		}
		else if(rand<0.95) {
			this.axesub =new Axe("トマホーク",13,14,55,5,3);
		}
		else if(rand<=1) {
			this.axesub=new Axe("アルマーズ",18,18,85,0,1);
		}
	}
	//選択斧武器生成メソッド
	public void chooseEquipNewAxeSub(int num) {
		if(num==1) {
			this.axesub=new Axe("鉄の斧",8,10,65,0,1);
		}
		else if(num==2) {
			this.axesub =new Axe("ておの",7,15,50,0,3);
		}
		else if(num==3) {
			this.axesub =new Axe("デビルアクス",24,18,20,0,1);
		}
		else if(num==4) {
			this.axesub =new Axe("鋼の斧",11,15,50,0,1);
		}
		else if(num==5) {
			this.axesub =new Axe("キラーアクス",11,11,65,30,1);
		}
		else if(num==6) {
			this.axesub  =new Axe("銀の斧",15,12,55,0,1);
		}
		else if(num==7) {
			this.axesub =new Axe("トマホーク",13,14,55,5,3);
		}
		else if(num==8) {
			this.axesub=new Axe("アルマーズ",18,18,85,0,1);
		}
	}

	//戦闘前武器装備メソッド
	public void equipWeaponBeforeBattle() {
			this.equip=this.axe;
	}
	//全武器一括生成メソッド
	public void equipNewWeapon() {
		this.equipNewAxe();
		this.equipNewAxeSub();
		this.equipWeaponBeforeBattle();
		this.criticalUpper();
	}
//武器選択、生成メソッド
	public void chooseEquipNewWeapon(){
		System.out.println("メイン武器を選択してください");
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
		int num=CheckNumber.checkAndReturnNumber(1,8);
		this.chooseEquipNewAxe(num);
		System.out.println("サブ武器を選択してください");
		System.out.println(" :名前			威力	重さ	命中	必殺	距離");
		System.out.println("1:鉄の斧		8,		10,		65,		0,		近");
		System.out.println("2:ておの		7,		15,		50,		0,		遠近");
		System.out.println("3;デビルアクス	24,		18,		20,		0,		近");
		System.out.println("4:鋼の斧		11,		15,		50,		0,		近");
		System.out.println("5:キラーアクス	11,		11,		65,		30,		近");
		System.out.println("6:銀の斧		15,		12,		55,		0,		近");
		System.out.println("7:トマホーク	13,		14,		55,		5,		遠近");
		System.out.println("8:アルマーズ	18,		18,		85,		0,		近");
		System.out.println("↓");;
		num=CheckNumber.checkAndReturnNumber(1,8);
		this.chooseEquipNewAxeSub(num);
		this.equipWeaponBeforeBattle();
			this.criticalUpper();
	}


	//戦闘中武器持ち替えメソッド
	public void changeEquip(Weapon o) {
		Random random=new Random();
		int rand=random.nextInt(2);
		if(rand==0) {
			this.equip=null;
			this.equip=(Axe)this.axe;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}else if(rand==1){
			this.equip=null;
			this.equip=(Axe)this.axesub;
			System.out.println(this.name+"は"+this.equip.getName()+"を装備！");
		}
	}
	//必殺補正メソッド
	public void criticalUpper() {
		this.equip.setCritical(this.equip.getCritical() + 30);
	}

	public Berserker() {
		Random random=new Random();
		int rand=random.nextInt(5);
		switch(rand) {
		case 0:
			this.name="ホークアイ";
			break;
		case 1:
			this.name="ファーガス";
			break;
		case 2:
			this.name="ガレット";
			break;
		case 3:
			this.name="ゴンザレス";
			break;
		case 4:
			this.name="ギース";
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
			this.setStrength(25);
		}
		else if(rand2<=0.2) {
			this.setStrength(26);
		}
		else if(rand2<=0.3) {
			this.setStrength(27);
		}
		else if(rand2<=0.4) {
			this.setStrength(28);
		}
		else if(rand2<=0.6) {
			this.setStrength(29);
		}
		else if(rand2<=0.7) {
			this.setStrength(30);
		}
		else if(rand2<=0.8) {
			this.setStrength(31);
		}
		else if(rand2<=0.9) {
			this.setStrength(32);
		}
		else if(rand2<=1) {
			this.setStrength(33);
		}
		//技
		if(rand3<=0.1) {
			this.setSkill(8);
		}
		else if(rand3<=0.2) {
			this.setSkill(9);
		}
		else if(rand3<=0.3) {
			this.setSkill(10);
		}
		else if(rand3<=0.4) {
			this.setSkill(11);
		}
		else if(rand3<=0.6) {
			this.setSkill(12);
		}
		else if(rand3<=0.7) {
			this.setSkill(13);
		}
		else if(rand3<=0.8) {
			this.setSkill(14);
		}
		else if(rand3<=0.9) {
			this.setSkill(15);
		}
		else if(rand3<=1) {
			this.setSkill(16);
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
			this.setResist(0);
		}
		else if(rand6<=0.2) {
			this.setResist(1);
		}
		else if(rand6<=0.3) {
			this.setResist(2);
		}
		else if(rand6<=0.4) {
			this.setResist(3);
		}
		else if(rand6<=0.6) {
			this.setResist(4);
		}
		else if(rand6<=0.7) {
			this.setResist(5);
		}
		else if(rand6<=0.8) {
			this.setResist(6);
		}
		else if(rand6<=0.9) {
			this.setResist(7);
		}
		else if(rand6<=1) {
			this.setResist(8);
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
			this.setLuck(27);
		}
		//体格
		if(rand8<=0.1) {
			this.setConstitution(12);
		}
		else if(rand8<=0.2) {
			this.setConstitution(13);
		}
		else if(rand8<=0.3) {
			this.setConstitution(14);
		}
		else if(rand8<=0.4) {
			this.setConstitution(15);
		}
		else if(rand8<=0.6) {
			this.setConstitution(16);
		}
		else if(rand8<=0.7) {
			this.setConstitution(17);
		}
		else if(rand8<=0.8) {
			this.setConstitution(18);
		}
		else if(rand8<=0.9) {
			this.setConstitution(19);
		}
		else if(rand8<=1) {
			this.setConstitution(20);
		}
	}
	public String toString() {
		return "名前 "+this.name+"\n"+"HP   "+this.hp+"\n"+"力   "+this.getStrength()+"\n"
	+"技   "+this.getSkill()+"\n"+"速さ "+this.getSpeed()+"\n"+"守備 "+this.getDefence()+"\n"+
				"魔防 "+this.getResist()+"\n"+"幸運 "+this.getLuck()+"\n"+"体格 "+this.getConstitution();

	}
	public void showSt() {
		System.out.println(this.toString());
	}
	public String getCName() {
		return this.cName;
	}

}
