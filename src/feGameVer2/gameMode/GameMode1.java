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
		PrepareBattle prepareBattle =new PrepareBattle();
		Thread.sleep(1000);
		System.out.println("キャラクター1はこちら！");
		/*キャラクター1インスタンス生成
		クラス（兵種）をランダムで選び、
		キャラステータスはそのクラス（兵種）に応じてをコンストラクタでランダムに取得する。
		 */
		Fighter p1=prepareBattle.chooseCharacterRandom();

		/*変数の型を各クラス（兵種）に更新
		それぞれのクラスのメソッドを使用しそれぞれの武器インスタンスを生成する
		引数は
			キャラクター変数であるFighter
			ランダムで武器を選ぶ→true
			プレイヤーが選ぶ→false
		を取る
		 */
		prepareBattle.equipFighterBack(p1,true);

		Thread.sleep(1000);
		System.out.println("キャラクター2はこちら！");
		//キャラクター2のインスタンスを生成
		//その他はp1と同じ

		Fighter p2=prepareBattle.chooseCharacterRandom();
		prepareBattle.equipFighterBack(p2,true);



		Thread.sleep(5000);
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
			CheckNumber checkNumber=new CheckNumber();
			int num=checkNumber.checkAndReturnNumber(1,2);
			if(num==2) {break;}
			//戦闘を続ける場合、両方のキャラクターを回復させる
			p1.setHp(p1.getMaxHp());
			p2.setHp(p2.getMaxHp());
		}
		//ゲームインスタンスを呼び出して最初の画面に戻る
		System.out.println("メインメニューに戻ります。");
		Thread.sleep(1000);
		StartGame startGame=new StartGame();
		startGame.chooseGameMode();	}
}


