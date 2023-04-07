package feGameVer2.gameMode;

import feGameVer2.CheckNumber;
import feGameVer2.StartGame;
import feGameVer2.battle.BattleField;
import feGameVer2.battle.PrepareBattle;
import feGameVer2.fighter.Fighter;

public class GameMode3 {

	public void playGameMode3() throws InterruptedException {
		// １体パラメータからキャラメイク
		// そのキャラでランダムキャラと連戦
		PrepareBattle prepareBattle =new PrepareBattle();
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
		//プレイヤーに番号を選ばせ（戻り値）エラー処理も同時に行う
		CheckNumber checkNumber=new CheckNumber();

		int hpRecoverNum=checkNumber.checkAndReturnNumber(1, 2);
		System.out.println("");
		System.out.println("プレイヤー1のキャラメイクです。");
		System.out.println();
		Fighter p=prepareBattle.chooseCharacter();
		prepareBattle.putName(p);
		prepareBattle.upperPara(p);
		prepareBattle.downerPara(p);
		System.out.println("このモードでは、さらにキャラクターを強化することができます");
		prepareBattle.levelUp(p);
		System.out.println("武器を選択しますか？1:yes 2:no↓");
		int num=checkNumber.checkAndReturnNumber(1,2);
		if(num==1) {prepareBattle.equipFighterBack(p,false);}
		else {prepareBattle.equipFighterBack(p,true);}
		num=0;
		System.out.println();

		for(int i=1;i<=5;i++) {
			//対戦相手
			Fighter o=prepareBattle.chooseCharacterRandom();prepareBattle.equipFighterBack(o,true);
			BattleField b=new BattleField(p,o);
			System.out.println("第"+i+"戦目始めます！");
			//対戦
			while(p.getHp()>0&&o.getHp()>0) {
				b.BattleSet(p,o,b);
			}
			if(o.getHp()<=0) {
				System.out.println(p.getName()+"の勝利！！！"+i+"連勝中!!");
				if(hpRecoverNum==1) {p.setHp(p.getMaxHp());}
			}else {
				System.out.println("ゲームオーバー....");
				System.out.println("メインメニューに戻ります。");
				Thread.sleep(1000);
				startGame.chooseGameMode();

			}
		}
		System.out.println("ゲームクリア！！おめでとう！！");
		Thread.sleep(1000);
		System.out.println("メインメニューに戻ります。");
		Thread.sleep(1000);
		startGame.chooseGameMode();
	}
}
