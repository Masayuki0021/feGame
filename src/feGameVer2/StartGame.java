package feGameVer2;

import feGameVer2.gameMode.GameMode1;
import feGameVer2.gameMode.GameMode2;
import feGameVer2.gameMode.GameMode3;

public class StartGame {
	public void chooseGameMode() throws InterruptedException {
		System.out.println("ゲームモードを選んでください↓");
		System.out.println("1: ランダムゲームモード");
		System.out.println("2: P1vsP2モード");
		System.out.println("3: 勝ち抜けモード");
		CheckNumber checkNumber =new CheckNumber();
		int gameNum=checkNumber.checkAndReturnNumber(1, 3);
		//各ゲームモードインスタンス取得、メソッド呼び出し
		if(gameNum==1) {
			GameMode1 game1=new GameMode1();
			game1.playGameMode1();
		}else if(gameNum==2) {
			GameMode2 game2=new GameMode2();
			game2.playGameMode2();
		}else if(gameNum==3) {
			GameMode3 game3=new GameMode3();
			game3.playGameMode3();
		}
	}
}
