package feGameVer2;

import feGameVer2.gameMode.GameMode1;
import feGameVer2.gameMode.GameMode2;
import feGameVer2.gameMode.GameMode3;

public class Main {


	public static void main(String[] args) throws InterruptedException {
		System.out.println("feGameへようこそ！\n"
				+ "これのゲームは任天堂のファイアーエムブレムシリーズの\n"
				+ "戦闘システムを参考に作った同人ゲームです。");
		System.out.println("お楽しみ下さい！！");
		System.out.println("\n\n\n");
		int gameNum=ChooseGameMode.ChooseGameMmode();

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

	}





}
