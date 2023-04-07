package feGameVer2.gameMode;

import feGameVer2.CheckNumber;
import feGameVer2.StartGame;
import feGameVer2.battle.BattleField;
import feGameVer2.battle.PrepareBattle;
import feGameVer2.fighter.Fighter;

public class GameMode2 {
	public void playGameMode2() throws InterruptedException {
		//2体キャラ作って対戦
		System.out.println("このゲームモードではプレイヤーは\n"
				+ "プレイヤー1とプレイヤー2に分かれて\n"
				+ "それぞれキャラメイクを行い戦わせます");
		System.out.println("");
		//バトル前のキャラステータスを計算する戦場準備インスタンスpb生成
		PrepareBattle prepareBattle =new PrepareBattle();
		//キャラクター変数宣言

		System.out.println("プレイヤー1のキャラメイクです。");
		System.out.println();
		//キャラクター1インスタンス生成
		//クラス（兵種）を選び、インスタンスを生成する
		//キャラステータスはそのクラス（兵種）に応じてをコンストラクタでランダムに取得する。
		Fighter p1=prepareBattle.chooseCharacter();
		//名前付けメソッド　つけないを選択するとすでに選ばれている名前になる
		prepareBattle.putName(p1);
		//重要だと思うステータスを二回上昇させる
		prepareBattle.upperPara(p1);
		//重要でないと思うステータスを二回下げる
		prepareBattle.downerPara(p1);
		//キャラクター変数をそれぞれの兵種（クラス）の型に合わせ,
		//それぞれのクラスに応じた武器を生成する
		System.out.println("武器を選択しますか？1:yes 2:no↓");
		//プレイヤーに番号を選ばせ（戻り値）エラー処理も同時に行う
		CheckNumber checkNumber=new CheckNumber();
		//引数は選択肢の幅
		//ここでは1-2まで
		int num=checkNumber.checkAndReturnNumber(1,2);
		//戻り値が１の場合は選択して武器を生成
		//メソッドの第二引数falseのはランダムではないと判定
		if(num==1) {prepareBattle.equipFighterBack(p1,false);}
		//戻り値が２の場合はランダムで武器生成
		//メソッドの第二引数trueのはランダムと判定
		else {prepareBattle.equipFighterBack(p1,true);}
		num=0;
		System.out.println();
		//プレイヤー1と同様
		System.out.println("プレイヤー2のキャラメイクです。");
		System.out.println();
		Fighter p2=prepareBattle.chooseCharacter();
		prepareBattle.putName(p2);
		prepareBattle.upperPara(p2);
		prepareBattle.downerPara(p2);
		System.out.println("武器を選択しますか？1:yes 2:no↓");
		num=checkNumber.checkAndReturnNumber(1,2);
		if(num==1) {prepareBattle.equipFighterBack(p2,false);}
		else {prepareBattle.equipFighterBack(p2,true);}
		num=0;
		System.out.println();

		//戦闘ルールが記載されている戦場インスタンス b を生成
		BattleField battleField=new BattleField(p1,p2);
		//プレイヤーが2(終了)を選ぶまで繰り返す
		while(true){
			//どちらかのhpが0になるまで戦闘メソッドを回す
			while(p1.getHp()>0&&p2.getHp()>0) {
				battleField.BattleSet(p1, p2,battleField);
			}
			if(p1.getHp()<=0) {
				System.out.println(p2.getName()+"の勝利！！！");
			}
			if(p2.getHp()<=0) {
				System.out.println(p1.getName()+"の勝利！！！");
			}
			//続けるかどうかの選択
			System.out.println("続ける? 1:yes 2:no  番号を入力して下さい");
			checkNumber=new CheckNumber();
			num=checkNumber.checkAndReturnNumber(1,2);
			if(num==2) {break;}
			//戦闘を続ける場合、両方のキャラクターを回復させる
			p1.setHp(p1.getMaxHp());
			p2.setHp(p2.getMaxHp());
		}
		num=0;
		System.out.println("メインメニューに戻ります。");
		Thread.sleep(1000);
		StartGame startGame=new StartGame();
		startGame.chooseGameMode();

	}
}




