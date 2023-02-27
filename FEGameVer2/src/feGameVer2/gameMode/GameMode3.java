package feGameVer2.gameMode;

import java.util.Scanner;

import feGameVer2.battle.BattleField;
import feGameVer2.battle.PrepareBattle;
import feGameVer2.fighter.Fighter;
import feGameVer2.fighter.NewFighterClass;

public class GameMode3 {

	public static void main(String[] args) throws InterruptedException {
		// １体パラメータからキャラメイク
		// そのキャラでランダムキャラと連戦
		PrepareBattle pb =new PrepareBattle();
		Fighter p=null;
		Fighter o1=null;
		Fighter o2=null;
		Fighter o3=null;
		Fighter o4=null;
		Fighter o5=null;
		System.out.println("このゲームモードではプレイヤーは\n"
				+ "キャラクターを一体作り、そのキャラクターと\n"
				+ "ランダムに生成されたキャラクターとで連戦を行います。\n"
				+ "相手キャラは合計5体...全員を倒せればゲームクリアとなります\n"
				+ "一試合ごとに回復ありのモードと回復無しのモードがあります。");
		System.out.println();
		System.out.println("モード選択です。\n"
				+ "回復ありの場合は1を、なしの場合は2を入力してください。↓");
		try {
			int num=new Scanner(System.in).nextInt();

			pb.setYesNoNum(num);
		}catch(IllegalArgumentException e){
			System.out.println("1か2を入力してください");
			int	num=new Scanner(System.in).nextInt();

			while((num>2||num<1)) {
				System.out.println("1か2を入力してください");
				num=new Scanner(System.in).nextInt();
			}
			pb.setYesNoNum(num);
		}
		if(pb.getYesNoNum()==1) {
			System.out.println("");

			System.out.println("プレイヤー1のキャラメイクです。");
			System.out.println();
			p=pb.chooseCharacter(p);
			pb.putName(p);
			pb.upperPara(p);
			pb.downerPara(p);
			System.out.println("このモードでは、さらにキャラクターを強化することができます");
			p=pb.equipFighterBack(p);
			System.out.println();

		}
	
		
		//クラス変更
		p= new NewFighterClass();
		p.showSt();
		System.out.println();
		p.setName("プレイヤー");
		p.setHp(40);
		p.setStrength(25);
		p.setSkill(25);
		p.setSpeed(25);
		p.setDefence(20);
		p.setResist(20);
		p.setLuck(20);
		p.setConstitution(10);
		//クラス変更
		NewFighterClass cp=(NewFighterClass)p;
		cp.equipNewWeapon();
		
		
		//対戦相手
		o1=pb.chooseCharacterRandom(o1);o1=pb.equipFighterBack(o1);
		o2=pb.chooseCharacterRandom(o2);o2=pb.equipFighterBack(o2);
		o3=pb.chooseCharacterRandom(o3);o3=pb.equipFighterBack(o3);
		o4=pb.chooseCharacterRandom(o4);o4=pb.equipFighterBack(o4);
		o5=pb.chooseCharacterRandom(o5);o5=pb.equipFighterBack(o5);
		//対戦
		BattleField b=new BattleField(p,o1);
		while(p.hp>0&&o1.hp>0) {
			b.BattleSet(p,o1,b);
		}
		if(o1.hp<=0) {
			System.out.println(p.name+"の勝利！！！");
			System.out.println("回復する?1:yes 2:no  番号を入力して下さい");
			try {
				int contiNum=new Scanner(System.in).nextInt();

				pb.setContinueNum(contiNum);
			}catch(IllegalArgumentException e){
				System.out.println("1か2を入力してください");
				int	contiNum=new Scanner(System.in).nextInt();

				while((contiNum>2||contiNum<1)) {
					System.out.println("1か2を入力してください");
					contiNum=new Scanner(System.in).nextInt();
				}
				pb.setContinueNum(contiNum);
			}
			if(pb.getContiueNum()==1) {
				p.hp=p.MaxHP;
			}
			while(p.hp>0&&o2.hp>0) {
				b.BattleSet(p, o2,b);
			}if(o1.hp<=0) {
				System.out.println(p.name+"の勝利！！！2連勝");
				System.out.println("回復する?1:yes 2:no  番号を入力して下さい");
				try {
					int contiNum=new Scanner(System.in).nextInt();

					pb.setContinueNum(contiNum);
				}catch(IllegalArgumentException e){
					System.out.println("1か2を入力してください");
					int	contiNum=new Scanner(System.in).nextInt();

					while((contiNum>2||contiNum<1)) {
						System.out.println("1か2を入力してください");
						contiNum=new Scanner(System.in).nextInt();
					}
					pb.setContinueNum(contiNum);
				}
				if(pb.getContiueNum()==1) {
					p.hp=p.MaxHP;
				}
				while(p.hp>0&&o3.hp>0) {
					b.BattleSet(p, o3,b);
				}
				if(o1.hp<=0) {
					System.out.println(p.name+"の勝利！！！3連勝");
					System.out.println("回復する?1:yes 2:no  番号を入力して下さい");
					try {
						int contiNum=new Scanner(System.in).nextInt();

						pb.setContinueNum(contiNum);
					}catch(IllegalArgumentException e){
						System.out.println("1か2を入力してください");
						int	contiNum=new Scanner(System.in).nextInt();

						while((contiNum>2||contiNum<1)) {
							System.out.println("1か2を入力してください");
							contiNum=new Scanner(System.in).nextInt();
						}
						pb.setContinueNum(contiNum);
					}
					if(pb.getContiueNum()==1) {
						p.hp=p.MaxHP;
					}
					while(p.hp>0&&o4.hp>0) {
						b.BattleSet(p, o4,b);
					}
					if(o1.hp<=0) {
						System.out.println(p.name+"の勝利！！！4連勝");
						System.out.println("回復する?1:yes 2:no  番号を入力して下さい");
						try {
							int contiNum=new Scanner(System.in).nextInt();

							pb.setContinueNum(contiNum);
						}catch(IllegalArgumentException e){
							System.out.println("1か2を入力してください");
							int	contiNum=new Scanner(System.in).nextInt();

							while((contiNum>2||contiNum<1)) {
								System.out.println("1か2を入力してください");
								contiNum=new Scanner(System.in).nextInt();
							}
							pb.setContinueNum(contiNum);
						}
						if(pb.getContiueNum()==1) {
							p.hp=p.MaxHP;
						}
						while(p.hp>0&&o5.hp>0) {
							b.BattleSet(p, o5,b);
						}
						if(o1.hp<=0) {
							System.out.println(p.name+"の勝利！！！5連勝");
						}else {
							System.out.println("ゲームオーバー...");
						}
					}else {
						System.out.println("ゲームオーバー...");
					}

				}else {
					System.out.println("ゲームオーバー...");
				}

			}else {
				System.out.println("ゲームオーバー...");
			}

		}else {
			System.out.println("ゲームオーバー...");
		}
	}
}
