package feGameVer2.gameMode;


import feGameVer2.CheckNumber;
import feGameVer2.StartGame;
import feGameVer2.battle.BattleField;
import feGameVer2.battle.PrepareBattle;
import feGameVer2.fighter.Fighter;

public class GameMode1 {

	public void playGameMode1() throws InterruptedException {
		//ランダムゲームモード
		System.out.println("このゲームモードではランダムに2体のキャラクターを生成し,戦わせます");
		//バトル前のキャラステータスを計算する戦場準備インスタンスpb生成
		PrepareBattle pb =new PrepareBattle();
		//キャラクター変数宣言
		Fighter p1=null;
		Fighter p2=null;

		Thread.sleep(1000);
		System.out.println("キャラクター1はこちら！");
		//キャラクター1インスタンス生成
		//クラス（兵種）をランダムで選び、
		//キャラステータスはそのクラス（兵種）に応じてをコンストラクタでランダムに取得する。
		p1=pb.chooseCharacterRandom(p1);
		//変数の型を各クラス（兵種）に更新
		//それぞれのクラスのメソッドを使用しそれぞれの武器インスタンスを生成する
		p1=pb.equipFighterBack(p1,true);

		Thread.sleep(1000);
		System.out.println("キャラクター2はこちら！");
		//キャラクター2のインスタンスを生成
		p2=pb.chooseCharacterRandom(p2);
		p2=pb.equipFighterBack(p2,true);



		Thread.sleep(5000);
		//戦闘ルールが記載されている戦場インスタンス b を生成
		BattleField b=new BattleField(p1,p2);
		//どちらかのhpが0になるまで戦闘メソッドを回す
		while(p1.getHp()>0&&p2.getHp()>0) {
			b.BattleSet(p1, p2,b);
		}
		if(p1.getHp()<=0) {
			System.out.println(p2.getName()+"の勝利！！！");
		}
		if(p2.getHp()<=0) {
			System.out.println(p1.getName()+"の勝利！！！");
		}
		//続けるかどうかの選択
		System.out.println("続ける? 1:yes 2:no  番号を入力して下さい");
		CheckNumber checkNumber=new CheckNumber();
		int num=checkNumber.checkAndReturnNumber(1,2);
		//戦闘を続ける場合、両方のキャラクターを回復させる
		while(num==1) {
			p1.setHp(p1.getMaxHp());
			p2.setHp(p2.getMaxHp());
			while(p1.getHp()>0&&p2.getHp()>0) {
				b.BattleSet(p1, p2,b);
			}
			if(p1.getHp()<=0) {
				System.out.println(p2.getName()+"の勝利！！！");
			}
			if(p2.getHp()<=0) {
				System.out.println(p1.getName()+"の勝利！！！");
			}
			System.out.println("続ける? 1:yes 2:no  番号を入力して下さい");
			num=checkNumber.checkAndReturnNumber(1,2);
		}
		System.out.println("メインメニューに戻ります。");
		Thread.sleep(1000);
		StartGame startGame=new StartGame();
		startGame.chooseGameMode();	}
}


