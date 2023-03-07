package feGameVer2;

import feGameVer2.gameMode.GameMode1;
import feGameVer2.gameMode.GameMode2;
import feGameVer2.gameMode.GameMode3;

public class ChooseGameMode {
	public static void chooseGameMode()  {
		int gameNum=SetGameModeNumber.setGameModeNumbere();
		//各ゲームモードインスタンス取得、メソッド呼び出し
		try{
			if(gameNum==1) {
				GameMode1 G1=new GameMode1();
				G1.playGameMode1();
			}else if(gameNum==2) {
				GameMode2 G2=new GameMode2();
				G2.playGameMode2();
			}else if(gameNum==3) {
				GameMode3 G3=new GameMode3();
				G3.playGameMode3();
			}
		}catch(InterruptedException e){
			System.out.println("起こりえないエラーが発生しています。\n"
					+ "スレッドで問題が起きているかもしれません");
			//本日聞いた例外処理の部分です
		}
	}
}
