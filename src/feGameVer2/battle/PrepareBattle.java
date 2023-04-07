package feGameVer2.battle;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import feGameVer2.CheckNumber;
import feGameVer2.fighter.Assassin;
import feGameVer2.fighter.Berserker;
import feGameVer2.fighter.Bishop;
import feGameVer2.fighter.DragonMaster;
import feGameVer2.fighter.Druid;
import feGameVer2.fighter.FalconKnight;
import feGameVer2.fighter.Fighter;
import feGameVer2.fighter.General;
import feGameVer2.fighter.Hero;
import feGameVer2.fighter.NomadicCavalry;
import feGameVer2.fighter.Paladin;
import feGameVer2.fighter.Sage;
import feGameVer2.fighter.Sniper;
import feGameVer2.fighter.SwordMaster;
import feGameVer2.fighter.Valkyria;
import feGameVer2.fighter.Warrior;

public class PrepareBattle {
	//ゲームモード3、使用時、ユーザーの作ったキャラクターをさらにパワーアップさせる時、
	//ユーザーにどのステータスを調整するか選択させる時に使用する番号
	private int levelUpNum;
	public void setLevelUpNum(int num,Map<Integer,String> statusMap) {
		if(num<1||num>7||statusMap.get(num)==null) {
			throw new IllegalArgumentException("1～7の中から選択してください");
		}
		this.levelUpNum=num;
	}
	public Fighter chooseCharacter() {
		System.out.println("クラス(兵種)の選択");
		System.out.println("番号を入力してください");
		System.out.println("1:パラディン、2：ジェネラル、3：ウォーリアー");
		System.out.println("4:ファルコンナイト、5：バーサーカー、6：ソードマスター");
		System.out.println("7:スナイパー、8:ドラゴンマスター、9：ドルイド");
		System.out.println("10:勇者、11:遊牧騎兵、12：賢者、13：司祭、14：ヴァルキュリア\n"
				+ "15：アサシン");
		System.out.println("↓");
		CheckNumber checkNumber=new CheckNumber();
		int num=checkNumber.checkAndReturnNumber(1,15);
		//キャラクターインスタンスを生成
		if(num==1) {
			Fighter fighter= new Paladin();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==2) {
			Fighter fighter=new General();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==3) {
			Fighter fighter=new Warrior();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==4) {
			Fighter fighter=new FalconKnight();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==5) {
			Fighter fighter=new Berserker();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==6) {
			Fighter fighter=new SwordMaster();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==7) {
			Fighter fighter=new Sniper();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==8) {
			Fighter fighter=new DragonMaster();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==9) {
			Fighter fighter=new Druid();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==10) {
			Fighter fighter=new Hero();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==11) {
			Fighter fighter=new NomadicCavalry();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==12) {
			Fighter fighter=new Sage();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==13) {
			Fighter fighter=new Bishop();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==14) {
			Fighter fighter=new Valkyria();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(num==15) {
			Fighter fighter=new Assassin();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		return null;

	}

	//ランダムにキャラクターインスタンスを生成
	public Fighter chooseCharacterRandom() {
		//乱数でクラス（兵種）ランダムに指定
		Random random=new Random();
		int rand=random.nextInt(15);
		if(rand==0) {
			Fighter fighter= new Paladin();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==1) {
			Fighter fighter= new General();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==2) {
			Fighter fighter= new Warrior();
			fighter.showSt();
			System.out.println();
			return fighter;

		}
		if(rand==3) {
			Fighter fighter= new FalconKnight();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==4) {
			Fighter fighter= new Berserker();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==5) {
			Fighter fighter= new SwordMaster();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==6) {
			Fighter fighter= new Sniper();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==7) {
			Fighter fighter= new DragonMaster();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==8) {
			Fighter fighter= new Druid();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==9) {
			Fighter fighter= new Hero();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==10) {
			Fighter fighter= new NomadicCavalry();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==11) {
			Fighter fighter= new Sage();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==12) {
			Fighter fighter= new Bishop();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==13) {
			Fighter fighter= new Valkyria();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		if(rand==14) {
			Fighter fighter= new Assassin();
			fighter.showSt();
			System.out.println();
			return fighter;
		}
		return null;

	}
	//キャラクター名変更メソッド
	public void putName(Fighter f) {
		System.out.println("名前を入力しなおしますか？↓（しない場合はこのまま決定されます。）"
				+ "\nする場合は1を、しない場合は2を入力して下さい");
		CheckNumber checkNumber=new CheckNumber();
		int num=checkNumber.checkAndReturnNumber(1,2);
		if(num==1) {
			try {
				System.out.print("名前を入力してください→");
				String pName=new Scanner(System.in).nextLine();
				f.setName(pName);
			}catch(IllegalArgumentException e) {
				System.out.println("名前が入っていません\n"
						+ "名前を入力してください");
				String pName=new Scanner(System.in).nextLine();
				while(pName==null||pName.length()<1) {
					System.out.println("名前が入っていません\n"
							+ "名前を入力してください");
					pName=new Scanner(System.in).nextLine();
				}
				f.setName(pName);
			}
			f.showSt();
			System.out.println("");
		}else {
			f.showSt();
			System.out.println("");
		}

	}
	//キャラステータス微調整メソッド
	public void upperPara(Fighter f) {
		System.out.println("上げるパラメーターを二つ選んでください");
		for(int i=0;i<2;i++) {
			System.out.println("1:HP、2:力、3：技、4：速さ、\n5：守備、６：魔防、7：幸運、8：体格");
			CheckNumber checkNumber=new CheckNumber();
			int num=checkNumber.checkAndReturnNumber(1,8);


			if(num==1) {
				f.setHp(f.getHp() + 8);
			}
			if(num==2) {
				f.setStrength(f.getStrength() + 4);
			}
			if(num==3) {
				f.setSkill(f.getSkill() + 4);
			}
			if(num==4) {
				f.setSpeed(f.getSpeed() + 4);
			}
			if(num==5) {
				f.setDefence(f.getDefence() + 4);
			}
			if(num==6) {
				f.setResist(f.getResist() + 4);
			}
			if(num==7) {
				f.setLuck(f.getLuck() + 4);
			}
			if(num==8) {
				f.setConstitution(f.getConstitution() + 4);
			}
			f.showSt();

		}
	}
	//キャラステータス微調整メソッド（ランダム）
	public void upperParaRandom(Fighter f) {
		for(int i=0;i<2;i++) {
			Random random=new Random();
			int rand=random.nextInt(8);

			if(rand==0) {
				f.setHp(f.getHp() + 8);
			}
			if(rand==1) {
				f.setStrength(f.getStrength() + 4);
			}
			if(rand==2) {
				f.setSkill(f.getSkill() + 4);
			}
			if(rand==3) {
				f.setSpeed(f.getSpeed() + 4);
			}
			if(rand==4) {
				f.setDefence(f.getDefence() + 4);
			}
			if(rand==5) {
				f.setResist(f.getResist() + 4);
			}
			if(rand==6) {
				f.setLuck(f.getLuck() + 4);
			}
			if(rand==7) {
				f.setConstitution(f.getConstitution() + 4);
			}

		}
	}
	//キャラステータス微調整メソッド
	public void downerPara(Fighter f) {
		System.out.println("下げるパラメーターを二つ選んでください");
		for(int i=0;i<2;i++) {
			System.out.println("1:HP、2:力、3：技、4：速さ、\n5：守備、６：魔防、7：幸運、8：体格");
			CheckNumber checkNumber=new CheckNumber();
			int num=checkNumber.checkAndReturnNumber(1,8);
			if(num==1) {
				f.setHp(f.getHp() - 8);
			}
			if(num==2) {
				f.setStrength(f.getStrength() - 4);
			}
			if(num==3) {
				f.setSkill(f.getSkill() - 4);
			}
			if(num==4) {
				f.setSpeed(f.getSpeed() - 4);
			}
			if(num==5) {
				f.setDefence(f.getDefence() - 4);
			}
			if(num==6) {
				f.setResist(f.getResist() - 4);
			}
			if(num==7) {
				f.setLuck(f.getLuck() - 4);
			}
			if(num==8) {
				f.setConstitution(f.getConstitution() - 4);
			}
			f.showSt();

		}
	}
	//キャラステータス微調整メソッド（ランダム）
	public void downerParaRandom(Fighter f) {
		for(int i=0;i<2;i++) {
			Random random=new Random();
			int rand=random.nextInt(8);
			if(rand==0) {
				f.setHp(f.getHp() - 8);
			}
			if(rand==1) {
				f.setStrength(f.getStrength() - 4);
			}
			if(rand==2) {
				f.setSkill(f.getSkill() - 4);
			}
			if(rand==3) {
				f.setSpeed(f.getSpeed() - 4);
			}
			if(rand==4) {
				f.setDefence(f.getDefence() - 4);
			}
			if(rand==5) {
				f.setResist(f.getResist() - 4);
			}
			if(rand==6) {
				f.setLuck(f.getLuck() - 4);
			}
			if(rand==7) {
				f.setConstitution(f.getConstitution() - 4);
			}

		}
	}
	//変数の型を各兵種に更新
	public void equipFighterBack(Fighter f,boolean isRandom) {
		if(isRandom==true) {
			if(f instanceof Paladin) {
				Paladin fP=(Paladin)f;
				//各クラス（兵種）に応じた武器インスタンスを生成
				fP.equipNewWeapon();
			}
			else if(f instanceof Warrior) {
				Warrior fW=(Warrior) f;
				fW.equipNewWeapon();
			}
			else if(f instanceof General) {
				General fG=(General) f;
				fG.equipNewWeapon();
			}else if(f instanceof FalconKnight) {
				FalconKnight fF=(FalconKnight) f;
				fF.equipNewWeapon();
			}else if(f instanceof Berserker) {
				Berserker fB=(Berserker) f;
				fB.equipNewWeapon();
			}else if(f instanceof SwordMaster) {
				SwordMaster fS=(SwordMaster) f;
				fS.equipNewWeapon();
			}else if(f instanceof Sniper) {
				Sniper fS=(Sniper) f;
				fS.equipNewWeapon();
			}else if(f instanceof DragonMaster) {
				DragonMaster fD=(DragonMaster) f;
				fD.equipNewWeapon();
			}else if(f instanceof Druid) {
				Druid fD=(Druid) f;
				fD.equipNewWeapon();
			}else if(f instanceof Hero) {
				Hero fH=(Hero) f;
				fH.equipNewWeapon();
			}else if(f instanceof NomadicCavalry) {
				NomadicCavalry fN=(NomadicCavalry) f;
				fN.equipNewWeapon();
			}else if(f instanceof Sage) {
				Sage fS=(Sage) f;
				fS.equipNewWeapon();
			}else if(f instanceof Bishop) {
				Bishop fB=(Bishop) f;
				fB.equipNewWeapon();
			}else if(f instanceof Valkyria) {
				Valkyria fV=(Valkyria) f;
				fV.equipNewWeapon();
			}else if(f instanceof Assassin) {
				Assassin fA=(Assassin) f;
				fA.equipNewWeapon();
			}
		}else {
			if(f instanceof Paladin) {
				Paladin fP=(Paladin)f;
				//各クラス（兵種）に応じた武器インスタンスを生成
				fP.chooseEquipNewWeapon();
			}
			else if(f instanceof Warrior) {
				Warrior fW=(Warrior) f;
				fW.chooseEquipNewWeapon();
			}
			else if(f instanceof General) {
				General fG=(General) f;
				fG.chooseEquipNewWeapon();
			}
			else if(f instanceof FalconKnight) {
				FalconKnight fF=(FalconKnight) f;
				fF.chooseEquipNewWeapon();
			}
			else if(f instanceof Berserker) {
				Berserker fB=(Berserker) f;
				fB.chooseEquipNewWeapon();
			}
			else if(f instanceof SwordMaster) {
				SwordMaster fS=(SwordMaster) f;
				fS.chooseEquipNewWeapon();
			}
			else if(f instanceof Sniper) {
				Sniper fS=(Sniper) f;
				fS.chooseEquipNewWeapon();
			}
			else if(f instanceof DragonMaster) {
				DragonMaster fD=(DragonMaster) f;
				fD.chooseEquipNewWeapon();
			}
			else if(f instanceof Druid) {
				Druid fD=(Druid) f;
				fD.chooseEquipNewWeapon();
			}
			else if(f instanceof Hero) {
				Hero fH=(Hero) f;
				fH.chooseEquipNewWeapon();
			}
			else if(f instanceof NomadicCavalry) {
				NomadicCavalry fN=(NomadicCavalry) f;
				fN.chooseEquipNewWeapon();
			}
			else if(f instanceof Sage) {
				Sage fS=(Sage) f;
				fS.chooseEquipNewWeapon();
			}
			else if(f instanceof Bishop) {
				Bishop fB=(Bishop) f;
				fB.chooseEquipNewWeapon();
			}
			else if(f instanceof Valkyria) {
				Valkyria fV=(Valkyria) f;
				fV.chooseEquipNewWeapon();
			}
			else if(f instanceof Assassin) {
				Assassin fA=(Assassin) f;
				fA.chooseEquipNewWeapon();
			}
		}

	}
	//ゲームモード3の時、ユーザーのキャラクターをパワーアップさせるメソッド
	//どのステータスをあげるか選択させる
	public void levelUp(Fighter f) throws InterruptedException  {
		System.out.println("キャラクターの能力値をランダムに10回上げます（レベルアップ）");
		System.out.println("どの能力値を優先的に上げるのか選択することが出来ます");
		System.out.println("優先的に上げたい能力値を順に選択してください");
		Map<Integer,String>statusPriority=new HashMap<>();
		statusPriority.put(1,"1:HP");statusPriority.put(2,"2:力");statusPriority.put(3,"3:技");statusPriority.put(4,"4:速さ");
		statusPriority.put(5,"5:守備");statusPriority.put(6,"6:魔防");statusPriority.put(7,"7:幸運");
		for(int i=0;i<7;i++) {
			for (int j=1;j<=7;j++) {
				System.out.println(statusPriority.get(j));
			}
			System.out.println();
			System.out.println((i+1)+"番目に強化したい能力値を入力してください↓");
			try {
				int num=new Scanner(System.in).nextInt();
				setLevelUpNum(num,statusPriority);
			}catch(IllegalArgumentException e){
				System.out.println("正しい数字を入力してください!");
				int	num=new Scanner(System.in).nextInt();

				while(num<1||num>7||statusPriority.get(num)==null) {
					System.out.println( "正しい数字を入力してください!");

					num=new Scanner(System.in).nextInt();
				}
				setLevelUpNum(num,statusPriority);
			}
			levelUpPriority(f,i);
			statusPriority.remove(this.levelUpNum);
		}
	}
	//上記のメソッド中に呼び出される　実際にステータスをあげるメソッド
	//優先的に選ばれたステータスから（60％,50％,40％,30％,20％,10％,5％）の確率で能力値を1つあげる
	//これを10回繰り返している
	public void levelUpPriority(Fighter f,int i) throws InterruptedException {
		if(i==0) {
			if(this.levelUpNum==1) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.6) {
						f.setHp(f.getHp()+1);
						System.out.println("hpが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==2) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.6) {
						f.setStrength(f.getStrength()+1);
						System.out.println("力が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==3) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.6) {
						f.setSkill(f.getSkill()+1);
						System.out.println("技が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==4) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.6) {
						f.setSpeed(f.getSpeed()+1);
						System.out.println("速さが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==5) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.6) {
						f.setDefence(f.getDefence()+1);
						System.out.println("守備が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==6) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.6) {
						f.setResist(f.getResist()+1);
						System.out.println("魔防が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==7) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.6) {
						f.setLuck(f.getLuck()+1);
						System.out.println("幸運が1上がった！");
						Thread.sleep(500);
					}
				}
			}
		}
		if(i==1) {

			if(this.levelUpNum==1) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.5) {
						f.setHp(f.getHp()+1);
						System.out.println("hpが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==2) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.5) {
						f.setStrength(f.getStrength()+1);
						System.out.println("力が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==3) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.5) {
						f.setSkill(f.getSkill()+1);
						System.out.println("技が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==4) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.5) {
						f.setSpeed(f.getSpeed()+1);
						System.out.println("速さが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==5) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.5) {
						f.setDefence(f.getDefence()+1);
						System.out.println("守備が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==6) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.5) {
						f.setResist(f.getResist()+1);
						System.out.println("魔防が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==7) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.5) {
						f.setLuck(f.getLuck()+1);
						System.out.println("幸運が1上がった！");
						Thread.sleep(500);
					}
				}
			}
		}
		if(i==2) {
			if(this.levelUpNum==1) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.4) {
						f.setHp(f.getHp()+1);
						System.out.println("hpが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==2) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.4) {
						f.setStrength(f.getStrength()+1);
						System.out.println("力が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==3) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.4) {
						f.setSkill(f.getSkill()+1);
						System.out.println("技が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==4) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.4) {
						f.setSpeed(f.getSpeed()+1);
						System.out.println("速さが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==5) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.4) {
						f.setDefence(f.getDefence()+1);
						System.out.println("守備が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==6) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.4) {
						f.setResist(f.getResist()+1);
						System.out.println("魔防が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==7) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.4) {
						f.setLuck(f.getLuck()+1);
						System.out.println("幸運が1上がった！");
						Thread.sleep(500);
					}
				}
			}


		}if(i==3) {
			if(this.levelUpNum==1) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.3) {
						f.setHp(f.getHp()+1);
						System.out.println("hpが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==2) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.3) {
						f.setStrength(f.getStrength()+1);
						System.out.println("力が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==3) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.3) {
						f.setSkill(f.getSkill()+1);
						System.out.println("技が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==4) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.3) {
						f.setSpeed(f.getSpeed()+1);
						System.out.println("速さが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==5) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.3) {
						f.setDefence(f.getDefence()+1);
						System.out.println("守備が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==6) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.3) {
						f.setResist(f.getResist()+1);
						System.out.println("魔防が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==7) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.3) {
						f.setLuck(f.getLuck()+1);
						System.out.println("幸運が1上がった！");
						Thread.sleep(500);
					}
				}
			}


		}
		if(i==4) {
			if(this.levelUpNum==1) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.2) {
						f.setHp(f.getHp()+1);
						System.out.println("hpが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==2) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.2) {
						f.setStrength(f.getStrength()+1);
						System.out.println("力が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==3) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.2) {
						f.setSkill(f.getSkill()+1);
						System.out.println("技が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==4) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.2) {
						f.setSpeed(f.getSpeed()+1);
						System.out.println("速さが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==5) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.2) {
						f.setDefence(f.getDefence()+1);
						System.out.println("守備が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==6) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.2) {
						f.setResist(f.getResist()+1);
						System.out.println("魔防が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==7) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.2) {
						f.setLuck(f.getLuck()+1);
						System.out.println("幸運が1上がった！");
						Thread.sleep(500);
					}
				}
			}


		}if(i==5) {
			if(this.levelUpNum==1) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.1) {
						f.setHp(f.getHp()+1);
						System.out.println("hpが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==2) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.1) {
						f.setStrength(f.getStrength()+1);
						System.out.println("力が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==3) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.1) {
						f.setSkill(f.getSkill()+1);
						System.out.println("技が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==4) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.1) {
						f.setSpeed(f.getSpeed()+1);
						System.out.println("速さが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==5) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.1) {
						f.setDefence(f.getDefence()+1);
						System.out.println("守備が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==6) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.1) {
						f.setResist(f.getResist()+1);
						System.out.println("魔防が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==7) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.1) {
						f.setLuck(f.getLuck()+1);
						System.out.println("幸運が1上がった！");
						Thread.sleep(500);
					}
				}
			}


		}if(i==6) {
			if(this.levelUpNum==1) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.05) {
						f.setHp(f.getHp()+1);
						System.out.println("hpが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==2) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.05) {
						f.setStrength(f.getStrength()+1);
						System.out.println("力が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==3) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.05) {
						f.setSkill(f.getSkill()+1);
						System.out.println("技が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==4) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.05) {
						f.setSpeed(f.getSpeed()+1);
						System.out.println("速さが1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==5) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.05) {
						f.setDefence(f.getDefence()+1);
						System.out.println("守備が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==6) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.05) {
						f.setResist(f.getResist()+1);
						System.out.println("魔防が1上がった！");
						Thread.sleep(500);
					}
				}
			}
			if(this.levelUpNum==7) {
				for(int j=0;j<10;j++) {
					double rand=Math.random();
					if(rand<=0.05) {
						f.setLuck(f.getLuck()+1);
						System.out.println("幸運が1上がった！");
						Thread.sleep(500);
					}
				}
			}
		}
	}
}



