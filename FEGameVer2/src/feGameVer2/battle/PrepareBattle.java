package feGameVer2.battle;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

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
	private int c_Num;
	private int status_Num;
	private int yesNoNum;
	private int levelUpNum;

	public void setCharacterNum(int num) {
		if(num>15||num<1) {
			throw new IllegalArgumentException("1～14の中から選択してください");
		}
		this.c_Num=num;
	}
	public void setStatusNum(int num) {
		if(num<1||num>8) {
			throw new IllegalArgumentException("1～8の中から選択してください");
		}
		this.status_Num=num;
	}
	public void setYesNoNum(int num) {
		if(num<1||num>2) {
			throw new IllegalArgumentException("1か2の中から選択してください");
		}
		this.yesNoNum=num;
	}
	public int getYesNoNum() {
		return yesNoNum;
	}
	public void setLevelUpNum(int num,int[] statusList,int i) {
		if(num<1||num>7||num==statusList[0]||num==statusList[1]||num==statusList[2]||
				num==statusList[3]||num==statusList[4]||num==statusList[5]||num==statusList[6]||) {
			throw new IllegalArgumentException("1～7の中から選択してください");
		}
		this.levelUpNum=num;
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
		try {
			int c_Number=new Scanner(System.in).nextInt();
			setCharacterNum(c_Number);
		}catch(IllegalArgumentException e){
			System.out.println("1～15までの数字が入力されていません\n"
					+ "正しい数字を入力してください");
			int	c_Number=new Scanner(System.in).nextInt();

			while((c_Number>15||c_Number<1)) {
				System.out.println("1～15までの数字が入力されていません\n"
						+ "正しい数字を入力してください");
				c_Number=new Scanner(System.in).nextInt();
			}
			setCharacterNum(c_Number);
		}
		if(c_Num==1) {
			f= new Paladin();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==2) {
			f=new General();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==3) {
			f=new Warrior();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==4) {
			f=new FalconKnight();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==5) {
			f=new Berserker();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==6) {
			f=new SwordMaster();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==7) {
			f=new Sniper();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==8) {
			f=new DragonMaster();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==9) {
			f=new Druid();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==10) {
			f=new Hero();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==11) {
			f=new NomadicCavalry();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==12) {
			f=new Sage();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==13) {
			f=new Bishop();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==14) {
			f=new Valkyria();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==15) {
			f=new Assassin();
			f.showSt();
			System.out.println();
			return f;
		}
		return f;

	}

	public Fighter chooseCharacterRandom(Fighter f) {
		Random random=new Random();
		int rand=random.nextInt(15);
		this.c_Num=rand+1;
		if(c_Num==1) {
			f= new Paladin();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==2) {
			f=new General();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==3) {
			f=new Warrior();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==4) {
			f=new FalconKnight();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==5) {
			f=new Berserker();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==6) {
			f=new SwordMaster();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==7) {
			f=new Sniper();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==8) {
			f=new DragonMaster();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==9) {
			f=new Druid();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==10) {
			f=new Hero();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==11) {
			f=new NomadicCavalry();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==12) {
			f=new Sage();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==13) {
			f=new Bishop();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==14) {
			f=new Valkyria();
			f.showSt();
			System.out.println();
			return f;
		}
		if(c_Num==15) {
			f=new Assassin();
			f.showSt();
			System.out.println();
			return f;
		}
		return f;

	}

public void putName(Fighter f) {

	try{
		System.out.println("名前を入力しなおしますか？↓（しない場合はこのまま決定されます。）"
				+ "\nする場合は1を、しない場合は2を入力して下さい");
		int nameNum=new Scanner(System.in).nextInt();
		setYesNoNum(nameNum);
	}catch(IllegalArgumentException e) {
		System.out.println("1か2を入力してください");
		int	nameNum=new Scanner(System.in).nextInt();

		while((nameNum>2||nameNum<1)) {
			System.out.println("1か2を入力してください");
			nameNum=new Scanner(System.in).nextInt();
		}
		setYesNoNum(nameNum);
	}
	if(this.yesNoNum==1) {
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
	public void upperPara(Fighter f) {
		System.out.println("上げるパラメーターを二つ選んでください");
		for(int i=0;i<2;i++) {
			System.out.println("1:HP、2:力、3：技、4：速さ、\n5：守備、６：魔防、7：幸運、8：体格");
			try {
				int statusNum=new Scanner(System.in).nextInt();
				setStatusNum(statusNum);
			}catch(IllegalArgumentException e){
				System.out.println("1～8までの数字が入力されていません\n"
						+ "正しい数字を入力してください");
				int	statusNum=new Scanner(System.in).nextInt();

				while(statusNum>8||statusNum<1) {
					System.out.println("1～8までの数字が入力されていません\n"
							+ "正しい数字を入力してください");

					statusNum=new Scanner(System.in).nextInt();
				}
				setCharacterNum(statusNum);
			}


			if(this.status_Num==1) {
				f.setHp(f.getHp() + 8);
			}
			if(this.status_Num==2) {
				f.setStrength(f.getStrength() + 4);
			}
			if(this.status_Num==3) {
				f.setSkill(f.getSkill() + 4);
			}
			if(this.status_Num==4) {
				f.setSpeed(f.getSpeed() + 4);
			}
			if(this.status_Num==5) {
				f.setDefence(f.getDefence() + 4);
			}
			if(this.status_Num==6) {
				f.setResist(f.getResist() + 4);
			}
			if(this.status_Num==7) {
				f.setLuck(f.getLuck() + 4);
			}
			if(this.status_Num==8) {
				f.setConstitution(f.getConstitution() + 4);
			}
			f.showSt();

		}
	}
	public void upperParaRandom(Fighter f) {
		for(int i=0;i<2;i++) {
				Random random=new Random();
				int rand=random.nextInt(8);
				this.status_Num=rand+1;

			if(this.status_Num==1) {
				f.setHp(f.getHp() + 8);
			}
			if(this.status_Num==2) {
				f.setStrength(f.getStrength() + 4);
			}
			if(this.status_Num==3) {
				f.setSkill(f.getSkill() + 4);
			}
			if(this.status_Num==4) {
				f.setSpeed(f.getSpeed() + 4);
			}
			if(this.status_Num==5) {
				f.setDefence(f.getDefence() + 4);
			}
			if(this.status_Num==6) {
				f.setResist(f.getResist() + 4);
			}
			if(this.status_Num==7) {
				f.setLuck(f.getLuck() + 4);
			}
			if(this.status_Num==8) {
				f.setConstitution(f.getConstitution() + 4);
			}

		}
	}
	public void downerPara(Fighter f) {
		System.out.println("下げるパラメーターを二つ選んでください");
		for(int i=0;i<2;i++) {
			System.out.println("1:HP、2:力、3：技、4：速さ、\n5：守備、６：魔防、7：幸運、8：体格");
			try {
			int statusNum=new Scanner(System.in).nextInt();
			setStatusNum(statusNum);
				}catch(IllegalArgumentException e){
				System.out.println("1～8までの数字が入力されていません\n"
						+ "正しい数字を入力してください");
				int	statusNum=new Scanner(System.in).nextInt();

				while(statusNum>8||statusNum<1) {
					System.out.println("1～8までの数字が入力されていません\n"
							+ "正しい数字を入力してください");

					statusNum=new Scanner(System.in).nextInt();
				}
				setCharacterNum(statusNum);
			}
			if(this.status_Num==1) {
				f.setHp(f.getHp() - 8);
			}
			if(this.status_Num==2) {
				f.setStrength(f.getStrength() - 4);
			}
			if(this.status_Num==3) {
				f.setSkill(f.getSkill() - 4);
			}
			if(this.status_Num==4) {
				f.setSpeed(f.getSpeed() - 4);
			}
			if(this.status_Num==5) {
				f.setDefence(f.getDefence() - 4);
			}
			if(this.status_Num==6) {
				f.setResist(f.getResist() - 4);
			}
			if(this.status_Num==7) {
				f.setLuck(f.getLuck() - 4);
			}
			if(this.status_Num==8) {
				f.setConstitution(f.getConstitution() - 4);
			}
			f.showSt();

		}
	}
	public void downerParaRandom(Fighter f) {
		for(int i=0;i<2;i++) {
			Random random=new Random();
			int rand=random.nextInt(8);
			this.status_Num=rand+1;
			if(this.status_Num==1) {
				f.setHp(f.getHp() - 8);
			}
			if(this.status_Num==2) {
				f.setStrength(f.getStrength() - 4);
			}
			if(this.status_Num==3) {
				f.setSkill(f.getSkill() - 4);
			}
			if(this.status_Num==4) {
				f.setSpeed(f.getSpeed() - 4);
			}
			if(this.status_Num==5) {
				f.setDefence(f.getDefence() - 4);
			}
			if(this.status_Num==6) {
				f.setResist(f.getResist() - 4);
			}
			if(this.status_Num==7) {
				f.setLuck(f.getLuck() - 4);
			}
			if(this.status_Num==8) {
				f.setConstitution(f.getConstitution() - 4);
			}

		}
	}

	public Fighter equipFighterBack(Fighter f) {
		if(f instanceof Paladin) {
			Paladin fP=(Paladin)f;
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

	}
	public void levelUp(Fighter f) throws InterruptedException  {
		System.out.println("キャラクターの能力値をランダムに10回上げます（レベルアップ）");
		System.out.println("どの能力値を優先的に上げるのか選択することが出来ます");
		System.out.println("優先的に上げたい能力値を順に選択してください");
		int[] statusList=new int[6];
		Map<Integer,String>statusPriority=new HashMap<>();
		statusPriority.put(1,"1:HP");statusPriority.put(2,"2:力");statusPriority.put(3,"3:技");statusPriority.put(4,"4:速さ");
		statusPriority.put(5,"5:守備");statusPriority.put(6,"6:魔防");statusPriority.put(7,"7:幸運");
		for(int i=0;i<statusPriority.size();i++) {
			for (int j=1;j<=7;j++) {
				System.out.println(statusPriority.get(j));
			}
			System.out.println();
			System.out.println((i+1)+"番目に強化したい能力値を入力してください↓");
			try {
				int num=new Scanner(System.in).nextInt();
				setLevelUpNum(num,statusList,i);
			}catch(IllegalArgumentException e){
				System.out.println("1～7までの数字が入力されていません\n"
						+ "正しい数字を入力してください");
				int	num=new Scanner(System.in).nextInt();

				while(num<1||num>7||num==statusList[i]) {
					System.out.println("1～7までの数字が入力されていません\n"
							+ "正しい数字を入力してください");

					num=new Scanner(System.in).nextInt();
				}
				setLevelUpNum(num,statusList,i);
			}
			levelUpPriority(f,i);
			statusPriority.remove(this.levelUpNum);
			statusList[i]=this.levelUpNum;
		}
	}
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



