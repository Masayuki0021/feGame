package feGameVer2;

public class Main {
	public static void main(String[] args) {
		System.out.println("feGameへようこそ！\n"
				+ "これのゲームは任天堂のファイアーエムブレムシリーズの\n"
				+ "戦闘システムを参考に作った同人ゲームです。");
		System.out.println("お楽しみ下さい！！");
		System.out.println("\n\n\n");
		//ゲームインスタンスゲームモード選択メソッド呼び出し
		StartGame startGame=new StartGame();
		startGame.chooseGameMode();
	}
}
