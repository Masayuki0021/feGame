package feGameVer2;

import feGameVer2.gameMode.GameMode1;
import feGameVer2.gameMode.GameMode2;
import feGameVer2.gameMode.GameMode3;

public class StartGame {
	public void chooseGameMode() throws InterruptedException {
		SetGameModeNumber setGameModeNumber=new SetGameModeNumber();
		int gameNum=setGameModeNumber.setGameModeNumbere();
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
