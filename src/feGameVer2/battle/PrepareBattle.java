package feGameVer2.battle;

import java.util.HashMap;
import java.util.InputMismatchException;
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
	//兵種に合わせたキャラクターを選んで生成するメソッド
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
		//プレイヤーから数字を受け取りその数字に応じた兵種を生成
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

	//兵種に合わせたキャラクターをランダムに生成するメソッド
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
		//プレイヤーに番号を選ばせ（戻り値）エラー処理も同時に行う
		int num=checkNumber.checkAndReturnNumber(1,2);
		if(num==1) {
			//try文を抜けるまで処理を繰り返す
			//try文が最後まで到達した場合はbreak文で抜ける
			while(true) {
				try {
					System.out.print("名前を入力してください→");
					String pName=new Scanner(System.in).nextLine();
					f.setName(pName);
					break;
				}//想定した数字以外の場合のエラー
				catch(IllegalArgumentException e) {
					System.out.println("名前が入っていません\n"
							+ "名前を入力してください");
				}//数字以外の場合のエラー
				catch(InputMismatchException e){
					System.out.println("正しい入力されていません\n"
							+ "もう一度入力してください");
				}//その他のエラー
				catch(Exception e){
					System.out.println("正しい入力されていません\n"
							+ "もう一度入力してください");
				}

			}
			//名前を含むキャラクターステータスを表示
			f.showSt();
			System.out.println("");
		}//2を選ばれた場合は何もせずにキャラクターステータスを表示して終わる
		else {
			//名前を含むキャラクターステータスを表示
			f.showSt();
			System.out.println("");
		}

	}
	//キャラステータス微調整メソッド
	public void upperPara(Fighter f) {
		System.out.println("上げるパラメーターを二つ選んでください");
		//プレイヤーが選んだステータスを4あげる処理、　２回繰り返す
		for(int i=0;i<2;i++) {
			System.out.println("1:HP、2:力、3：技、4：速さ、\n5：守備、６：魔防、7：幸運、8：体格");
			//プレイヤーに番号を選ばせ（戻り値）エラー処理も同時に行う
			CheckNumber checkNumber=new CheckNumber();
			//引数は選択肢の幅
			//ここでは1-8まで
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
			//ステータス表示
			f.showSt();
		}
	}
	//キャラステータス微調整メソッド
	public void downerPara(Fighter f) {
		//プレイヤーが選んだステータスを4下げる処理、　２回繰り返す
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
	//変数の型を各兵種に更新し、それぞれのメソッドを使い、それぞれの武器インスタンスを生成する
	//仮引数のbooleanはランダムで武器を生成するか、選んで生成するかを判定する
	public void equipFighterBack(Fighter f,boolean isRandom) {
		//isRandomがtrueの場合ランダムで武器を生成する
		if(isRandom==true) {
			if(f instanceof Paladin) {
				Paladin fP=(Paladin)f;
				//各クラス（兵種）に応じた武器インスタンスをランダムに生成
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

			//isRandomがfalseの場合プレイヤーが選んで武器インスタンスを生成する
		}else {
			if(f instanceof Paladin) {
				Paladin fP=(Paladin)f;
				//各クラス（兵種）に応じた武器インスタンスを選んで生成
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
	//ゲームモード3の時、プレイヤーのキャラクターをパワーアップさせるメソッド
	public void levelUp(Fighter f) throws InterruptedException  {
		int levelUpNum=0;
		System.out.println("キャラクターの能力値をランダムに10回上げます（レベルアップ）");
		System.out.println("どの能力値を優先的に上げるのか選択することが出来ます");
		System.out.println("優先的に上げたい能力値を順に選択してください");
		//どのステータスをあげるか選択させる
		//ステータスをMapリストに入れる（番号(数字)をキーに）
		Map<Integer,String>statusPriority=new HashMap<>();
		statusPriority.put(1,"1:HP");statusPriority.put(2,"2:力");statusPriority.put(3,"3:技");statusPriority.put(4,"4:速さ");
		statusPriority.put(5,"5:守備");statusPriority.put(6,"6:魔防");statusPriority.put(7,"7:幸運");
		//プレイヤーが選んだ順番に一つずつ取り出しステータスをあげる
		//
		for(int i=0;i<7;i++) {
			//mapリストの中身を表示　
			for (int j=1;j<=7;j++) {
				//選ばれた選択肢には表示されなくなる
				if(statusPriority.get(j)==null) {continue;}
				System.out.println(statusPriority.get(j));
			}
			System.out.println();
			System.out.println((i+1)+"番目に強化したい能力値を入力してください↓");
			CheckNumber checkNumber =new CheckNumber();
			//プレイヤーに選択する数字を入力させ　同時にエラー処理を行う
			//消された選択肢を入力した場合エラーを出せるように引数にMapリストを取る
			levelUpNum=checkNumber.checkAndReturnNumberForGameMode3(1, 7, statusPriority);
			//実際にステータスをあげるメソッドを呼び出す
			/*引数に
				プレイヤーキャラクター
				繰り返し回数 i
				選択されたステータスを示す番号levelUpNum
			を取る
			 */
			levelUpPriority(f,i,levelUpNum);
			//選ばれた選択肢を消去する
			statusPriority.remove(levelUpNum);
		}
	}
	//上記のメソッド中に呼び出される　実際にステータスをあげるメソッド
	//優先的に選ばれたステータスから（60％,50％,40％,30％,20％,10％,5％）の確率で能力値を1つあげる
	//優先的に選ばれた選択肢は最初に選ばれるためi=0,次の選択肢はi=1となる
	//これを10回繰り返している
	//switch文でiを見てパーセントを決め　文には変数を置いとく
	public void levelUpPriority(Fighter f,int i,int levelUpNum) throws InterruptedException {
		//キャラクターのステータスを上げる確率をいれるための変数
		double levelupProbability=0;
		//優先的に選ばれた選択肢から順に高い確率を割り当てていく
		switch (i) {
		case 0:
			levelupProbability=0.6;
			break;
		case 1:
			levelupProbability=0.5;
			break;
		case 2:
			levelupProbability=0.4;
			break;
		case 3:
			levelupProbability=0.3;
			break;
		case 4:
			levelupProbability=0.2;
			break;
		case 5:
			levelupProbability=0.1;
			break;
		case 6:
			levelupProbability=0.05;
			break;
		}
		//pプレイヤーに選ばれた選択肢を判定する
		if(levelUpNum==1) {
			//処理を10回繰り返す
			for(int j=0;j<10;j++) {
				//乱数を発生させ60％の確率でHPを1上げる
				double rand=Math.random();
				if(rand<=levelupProbability) {
					f.setHp(f.getHp()+1);
					System.out.println("hpが1上がった！");
					Thread.sleep(500);
				}
			}
			System.out.println();
		}
		if(levelUpNum==2) {
			for(int j=0;j<10;j++) {
				double rand=Math.random();
				if(rand<=levelupProbability) {
					f.setStrength(f.getStrength()+1);
					System.out.println("力が1上がった！");
					Thread.sleep(500);
				}
			}
			System.out.println();
		}
		if(levelUpNum==3) {
			for(int j=0;j<10;j++) {
				double rand=Math.random();
				if(rand<=levelupProbability) {
					f.setSkill(f.getSkill()+1);
					System.out.println("技が1上がった！");
					Thread.sleep(500);
				}
			}
			System.out.println();
		}
		if(levelUpNum==4) {
			for(int j=0;j<10;j++) {
				double rand=Math.random();
				if(rand<=levelupProbability) {
					f.setSpeed(f.getSpeed()+1);
					System.out.println("速さが1上がった！");
					Thread.sleep(500);
				}
			}
			System.out.println();
		}
		if(levelUpNum==5) {
			for(int j=0;j<10;j++) {
				double rand=Math.random();
				if(rand<=levelupProbability) {
					f.setDefence(f.getDefence()+1);
					System.out.println("守備が1上がった！");
					Thread.sleep(500);
				}
			}
			System.out.println();
		}
		if(levelUpNum==6) {
			for(int j=0;j<10;j++) {
				double rand=Math.random();
				if(rand<=levelupProbability) {
					f.setResist(f.getResist()+1);
					System.out.println("魔防が1上がった！");
					Thread.sleep(500);
				}
			}
			System.out.println();
		}
		if(levelUpNum==7) {
			for(int j=0;j<10;j++) {
				double rand=Math.random();
				if(rand<=levelupProbability) {
					f.setLuck(f.getLuck()+1);
					System.out.println("幸運が1上がった！");
					Thread.sleep(500);
				}
			}
			System.out.println();
		}
	}
}



