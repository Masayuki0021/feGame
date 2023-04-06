package feGameVer2.gameMode;

import java.util.Scanner;

import feGameVer2.CheckNumber;
import feGameVer2.StartGame;
import feGameVer2.battle.BattleField;
import feGameVer2.battle.PrepareBattle;
import feGameVer2.fighter.Fighter;

public class GameMode3 {

	public void playGameMode3() throws InterruptedException {
		// １体パラメータからキャラメイク
		// そのキャラでランダムキャラと連戦
		PrepareBattle pb =new PrepareBattle();
		//キャラクター変数宣言
		StartGame startGame=new StartGame();
		System.out.println("このゲームモードではプレイヤーは\n"
				+ "キャラクターを一体作り、そのキャラクターと\n"
				+ "ランダムに生成されたキャラクターとで連戦を行います。\n"
				+ "相手キャラは合計5体...全員を倒せればゲームクリアとなります\n"
				+ "一試合ごとに回復ありのモードと回復無しのモードがあります。");
		System.out.println();
		System.out.println("モード選択です。\n"
				+ "回復ありの場合は1を、なしの場合は2を入力してください。↓");
		try {
			int num=new Scanner(System.in).nextInt();

			pb.setGameMode3_ModeNum(num);
		}catch(IllegalArgumentException e){
			System.out.println("1か2を入力してください");
			int	num=new Scanner(System.in).nextInt();

			while((num>2||num<1)) {
				System.out.println("1か2を入力してください");
				num=new Scanner(System.in).nextInt();
			}
			//pbインスタンスに選択番号を保存
			pb.setGameMode3_ModeNum(num);
		}

			System.out.println("");

			System.out.println("プレイヤー1のキャラメイクです。");
			System.out.println();
			Fighter p=pb.chooseCharacter();
			pb.putName(p);
			pb.upperPara(p);
			pb.downerPara(p);
			System.out.println("このモードでは、さらにキャラクターを強化することができます");
			pb.levelUp(p);
			System.out.println("武器を選択しますか？1:yes 2:no↓");
			CheckNumber checkNumber=new CheckNumber();
			int num=checkNumber.checkAndReturnNumber(1,2);
			if(num==1) {pb.equipFighterBack(p,false);}
			else {pb.equipFighterBack(p,true);}
			num=0;
			System.out.println();




		//対戦相手
		Fighter o1=pb.chooseCharacterRandom();pb.equipFighterBack(o1,true);
		Fighter o2=pb.chooseCharacterRandom();pb.equipFighterBack(o2,true);
		Fighter o3=pb.chooseCharacterRandom();pb.equipFighterBack(o3,true);
		Fighter o4=pb.chooseCharacterRandom();pb.equipFighterBack(o4,true);
		Fighter o5=pb.chooseCharacterRandom();pb.equipFighterBack(o5,true);
		//対戦
		BattleField b=new BattleField(p,o1);
		System.out.println("第一戦目始めます！");
		while(p.getHp()>0&&o1.getHp()>0) {
			b.BattleSet(p,o1,b);
		}
		if(o1.getHp()<=0) {
			System.out.println(p.getName()+"の勝利！！！");

			if(pb.getGameMode3_modeNum()==1) {	p.setHp(p.getMaxHp());}
		}else {System.out.println("ゲームオーバー....");
			System.out.println("メインメニューに戻ります。");
			Thread.sleep(1000);

			startGame.chooseGameMode();
			}
		System.out.println("第二戦目始めます！");
		while(p.getHp()>0&&o2.getHp()>0) {
				b.BattleSet(p, o2,b);
		}
		if(o2.getHp()<=0) {
			System.out.println(p.getName()+"の勝利！！！2連勝");
			if(pb.getGameMode3_modeNum()==1) {	p.setHp(p.getMaxHp());}
		}else {System.out.println("ゲームオーバー....");
			System.out.println("メインメニューに戻ります。");
			Thread.sleep(1000);
			startGame.chooseGameMode();
		}
		System.out.println("第三戦目始めます！");
		while(p.getHp()>0&&o3.getHp()>0) {
				b.BattleSet(p, o3,b);
		}
		if(o3.getHp()<=0) {
			System.out.println(p.getName()+"の勝利！！！3連勝");
			if(pb.getGameMode3_modeNum()==1) {	p.setHp(p.getMaxHp());}
		}else {System.out.println("ゲームオーバー....");
			System.out.println("メインメニューに戻ります。");
			Thread.sleep(1000);
			startGame.chooseGameMode();
		}
		System.out.println("第四戦目始めます！");
		while(p.getHp()>0&&o4.getHp()>0) {
				b.BattleSet(p, o4,b);
		}
		if(o4.getHp()<=0) {
			System.out.println(p.getName()+"の勝利！！！4連勝");
			if(pb.getGameMode3_modeNum()==1) {	p.setHp(p.getMaxHp());}
		}else {System.out.println("ゲームオーバー....");
			System.out.println("メインメニューに戻ります。");
			Thread.sleep(1000);
			startGame.chooseGameMode();
		}
		System.out.println("第五戦目始めます！");
		while(p.getHp()>0&&o5.getHp()>0) {
			b.BattleSet(p, o5,b);
		}
		if(o5.getHp()<=0) {
			System.out.println(p.getName()+"の勝利！！！5連勝");
			System.out.println("ゲームクリア！！おめでとう！！");
			Thread.sleep(1000);
			System.out.println("メインメニューに戻ります。");
			Thread.sleep(1000);
			startGame.chooseGameMode();
		}else {System.out.println("ゲームオーバー....");
			System.out.println("メインメニューに戻ります。");
			Thread.sleep(1000);
			startGame.chooseGameMode();
		}
	}
}
