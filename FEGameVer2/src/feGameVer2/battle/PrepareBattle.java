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
	//ゲームモード3，使用時、連戦後キャラクターを回復するかどうか選択させる時に使用する番号
	private int gameMode3_ModeNum;	//


	public void setLevelUpNum(int num,Map<Integer,String> statusMap) {
		if(num<1||num>7||statusMap.get(num)==null) {
			throw new IllegalArgumentException("1～7の中から選択してください");
		}
		this.levelUpNum=num;
	}
	public void setGameMode3_ModeNum(int num) {
		if(num<1||num>2) {
			throw new IllegalArgumentException("1か2の中から選択してください");
		}
		this.gameMode3_ModeNum=num;
	}
	public int getGameMode3_modeNum() {
		return this.gameMode3_ModeNum;
	}
	public Fighter chooseCharacter(Fighter f) {
		System.out.println("クラス(兵種)の選択");
		System.out.println("番号を入力してください");
		System.out.println("1:パラディン、2：ジェネラル、3：ウォーリアー");
		System.out.println("4:ファルコンナイト、5：バーサーカー、6：ソードマスター");
		System.out.println("7:スナイパー、8:ドラゴンマスター、9：ドルイド");
		System.out.println("10:勇者、11:遊牧騎兵、12：賢者、13：司祭、14：ヴァルキュリア\n"
				+ "15：アサシン");
		System.out.println("↓");
		int num=CheckNumber.checkAndReturnNumber(1,15);
		//キャラクターインスタンスを生成
		if(num==1) {
			f= new Paladin();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==2) {
			f=new General();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==3) {
			f=new Warrior();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==4) {
			f=new FalconKnight();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==5) {
			f=new Berserker();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==6) {
			f=new SwordMaster();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==7) {
			f=new Sniper();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==8) {
			f=new DragonMaster();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==9) {
			f=new Druid();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==10) {
			f=new Hero();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==11) {
			f=new NomadicCavalry();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==12) {
			f=new Sage();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==13) {
			f=new Bishop();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==14) {
			f=new Valkyria();
			f.showSt();
			System.out.println();
			return f;
		}
		if(num==15) {
			f=new Assassin();
			f.showSt();
			System.out.println();
			return f;
		}
		return f;

	}

	//ランダムにキャラクターインスタンスを生成
	public Fighter chooseCharacterRandom(Fighter f) {
		//乱数でクラス（兵種）ランダムに指定
		Random random=new Random();
		int rand=random.nextInt(15);
		if(rand==0) {
			f= new Paladin();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==1) {
			f=new General();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==2) {
			f=new Warrior();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==3) {
			f=new FalconKnight();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==4) {
			f=new Berserker();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==5) {
			f=new SwordMaster();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==6) {
			f=new Sniper();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==7) {
			f=new DragonMaster();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==8) {
			f=new Druid();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==9) {
			f=new Hero();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==10) {
			f=new NomadicCavalry();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==11) {
			f=new Sage();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==12) {
			f=new Bishop();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==13) {
			f=new Valkyria();
			f.showSt();
			System.out.println();
			return f;
		}
		if(rand==14) {
			f=new Assassin();
			f.showSt();
			System.out.println();
			return f;
		}
		return f;

	}
	//キャラクター名変更メソッド
	public void putName(Fighter f) {
			System.out.println("名前を入力しなおしますか？↓（しない場合はこのまま決定されます。）"
					+ "\nする場合は1を、しない場合は2を入力して下さい");
			int num=CheckNumber.checkAndReturnNumber(1,2);
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
			int num=CheckNumber.checkAndReturnNumber(1,8);


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
			int num=CheckNumber.checkAndReturnNumber(1,8);
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
	public Fighter equipFighterBack(Fighter f,boolean isRandom) {
		if(isRandom==true) {
			if(f instanceof Paladin) {
				Paladin fP=(Paladin)f;
				//各クラス（兵種）に応じた武器インスタンスを生成
				fP.equipNewWeapon();
				return fP;
			}
			else if(f instanceof Warrior) {
				Warrior fW=(Warrior) f;
				fW.equipNewWeapon();
				return fW;
			}
			else if(f instanceof General) {
				General fG=(General) f;
				fG.equipNewWeapon();
				return fG;
			}else if(f instanceof FalconKnight) {
				FalconKnight fF=(FalconKnight) f;
				fF.equipNewWeapon();
				return fF;
			}else if(f instanceof Berserker) {
				Berserker fB=(Berserker) f;
				fB.equipNewWeapon();
				return fB;
			}else if(f instanceof SwordMaster) {
				SwordMaster fS=(SwordMaster) f;
				fS.equipNewWeapon();
				return fS;
			}else if(f instanceof Sniper) {
				Sniper fS=(Sniper) f;
				fS.equipNewWeapon();
				return fS;
			}else if(f instanceof DragonMaster) {
				DragonMaster fD=(DragonMaster) f;
				fD.equipNewWeapon();
				return fD;
			}else if(f instanceof Druid) {
				Druid fD=(Druid) f;
				fD.equipNewWeapon();
				return fD;
			}else if(f instanceof Hero) {
				Hero fH=(Hero) f;
				fH.equipNewWeapon();
				return fH;
			}else if(f instanceof NomadicCavalry) {
				NomadicCavalry fN=(NomadicCavalry) f;
				fN.equipNewWeapon();
				return fN;
			}else if(f instanceof Sage) {
				Sage fS=(Sage) f;
				fS.equipNewWeapon();
				return fS;
			}else if(f instanceof Bishop) {
				Bishop fB=(Bishop) f;
				fB.equipNewWeapon();
				return fB;
			}else if(f instanceof Valkyria) {
				Valkyria fV=(Valkyria) f;
				fV.equipNewWeapon();
				return fV;
			}else if(f instanceof Assassin) {
				Assassin fA=(Assassin) f;
				fA.equipNewWeapon();
				return fA;
			}
			else {
				return f;
			}
		}else {
			if(f instanceof Paladin) {
				Paladin fP=(Paladin)f;
				//各クラス（兵種）に応じた武器インスタンスを生成
				fP.chooseEquipNewWeapon();
				return fP;
			}
			else if(f instanceof Warrior) {
				Warrior fW=(Warrior) f;
				fW.chooseEquipNewWeapon();
				return fW;
			}
			else if(f instanceof General) {
				General fG=(General) f;
				fG.chooseEquipNewWeapon();
				return fG;
			}else if(f instanceof FalconKnight) {
				FalconKnight fF=(FalconKnight) f;
				fF.chooseEquipNewWeapon();
				return fF;
			}else if(f instanceof Berserker) {
				Berserker fB=(Berserker) f;
				fB.chooseEquipNewWeapon();
				return fB;
			}else if(f instanceof SwordMaster) {
				SwordMaster fS=(SwordMaster) f;
				fS.chooseEquipNewWeapon();
				return fS;
			}else if(f instanceof Sniper) {
				Sniper fS=(Sniper) f;
				fS.chooseEquipNewWeapon();
				return fS;
			}else if(f instanceof DragonMaster) {
				DragonMaster fD=(DragonMaster) f;
				fD.chooseEquipNewWeapon();
				return fD;
			}else if(f instanceof Druid) {
				Druid fD=(Druid) f;
				fD.chooseEquipNewWeapon();
				return fD;
			}else if(f instanceof Hero) {
				Hero fH=(Hero) f;
				fH.chooseEquipNewWeapon();
				return fH;
			}else if(f instanceof NomadicCavalry) {
				NomadicCavalry fN=(NomadicCavalry) f;
				fN.chooseEquipNewWeapon();
				return fN;
			}else if(f instanceof Sage) {
				Sage fS=(Sage) f;
				fS.chooseEquipNewWeapon();
				return fS;
			}else if(f instanceof Bishop) {
				Bishop fB=(Bishop) f;
				fB.chooseEquipNewWeapon();
				return fB;
			}else if(f instanceof Valkyria) {
				Valkyria fV=(Valkyria) f;
				fV.chooseEquipNewWeapon();
				return fV;
			}else if(f instanceof Assassin) {
				Assassin fA=(Assassin) f;
				fA.chooseEquipNewWeapon();
				return fA;
			}
			else {
				return f;
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



