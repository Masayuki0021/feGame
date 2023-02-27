package feGameVer2;

import feGameVer2.battle.PrepareBattle;
import feGameVer2.fighter.Fighter;

public class Test {


	public static void main(String[] args) throws InterruptedException {
		PrepareBattle pb =new PrepareBattle();
		Fighter p1=null;

		System.out.println("プレイヤー1のキャラメイクです。");
		System.out.println();
		p1=pb.chooseCharacter(p1);
		pb.putName(p1);
		pb.upperPara(p1);
		pb.downerPara(p1);
		pb.levelUp(p1);
		p1=pb.equipFighterBack(p1);
		System.out.println();
	}

}
