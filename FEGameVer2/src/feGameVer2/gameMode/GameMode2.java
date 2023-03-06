package feGameVer2.gameMode;

import feGameVer2.CheckNumber;
import feGameVer2.ChooseGameMode;
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
		PrepareBattle pb =new PrepareBattle();
		//キャラクター変数宣言
		Fighter p1=null;
		Fighter p2=null;

		System.out.println("プレイヤー1のキャラメイクです。");
		System.out.println();
		//キャラクター1インスタンス生成
		//クラス（兵種）を選び、インスタンスを生成する
		//キャラステータスはそのクラス（兵種）に応じてをコンストラクタでランダムに取得する。
		p1=pb.chooseCharacter(p1);
		//名前付けメソッド　つけないを選択するとすでに選ばれている名前になる
		pb.putName(p1);
		//重要だと思うステータスを二回上昇させる
		pb.upperPara(p1);
		//重要でないと思うステータスを二回下げる
		pb.downerPara(p1);
		//キャラクター変数をそれぞれの兵種（クラス）の型に合わせ,
		//それぞれのクラスに応じた武器を生成する
		System.out.println("武器を選択しますか？1:yes 2:no↓");
		int num=CheckNumber.checkAndReturnNumber(1,2);
		if(num==1) {p1=pb.equipFighterBack(p1,false);}
		else {p1=pb.equipFighterBack(p1,true);}
		num=0;
		System.out.println();

		System.out.println("プレイヤー2のキャラメイクです。");
		System.out.println();
		p2=pb.chooseCharacter(p2);
		pb.putName(p2);
		pb.upperPara(p2);
		pb.downerPara(p2);
		System.out.println("武器を選択しますか？1:yes 2:no↓");
		num=CheckNumber.checkAndReturnNumber(1,2);
		if(num==1) {p2=pb.equipFighterBack(p2,false);}
		else {p2=pb.equipFighterBack(p2,true);}
		num=0;
		System.out.println();

		BattleField b=new BattleField(p1,p2);
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
		num=CheckNumber.checkAndReturnNumber(1,2);
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
			num=CheckNumber.checkAndReturnNumber(1,2);
		}
		num=0;
		System.out.println("メインメニューに戻ります。");
		Thread.sleep(1000);
		ChooseGameMode.chooseGameMode();


	}
}




