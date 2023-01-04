package feGameVer2;


import java.util.Scanner;

public class Main2 {
	public static void main(String[]args) throws InterruptedException {
		//ランダムゲーム
		
		PrepareBattle pb =new PrepareBattle();
		Fighter p1=null;
		Fighter p2=null;
		Fighter p3=null;
		Fighter p4=null;


		p1=pb.chooseCharacterRandom(p1);
//		pb.putName(p1);
		p1=pb.equipFighterBack(p1);

		p2=pb.chooseCharacterRandom(p2);
//		pb.putName(p2);
		p2=pb.equipFighterBack(p2);
		
		System.out.println("名前\t\t"+p1.name+"\t\t\t\t\t"+p2.name);
		System.out.println("クラス\t"+p1.getCName()+"\t\t\t\t"+p2.getCName());
		System.out.println("HP\t\t"+p1.hp+"\t\t\t\t\t"+p2.hp);
		System.out.println("力\t\t"+p1.strength+"\t\t\t\t\t"+p2.strength);
		System.out.println("技\t\t"+p1.skill+"\t\t\t\t\t"+p2.skill);
		System.out.println("速さ\t"+p1.speed+"\t\t\t\t\t"+p2.speed);
		System.out.println("守備\t"+p1.defence+"\t\t\t\t\t"+p2.defence);
		System.out.println("魔防\t"+p1.resist+"\t\t\t\t\t"+p2.resist);
		System.out.println("幸運\t"+p1.luck+"\t\t\t\t\t"+p2.luck);
		System.out.println("体格\t"+p1.constitution+"\t\t\t\t\t"+p2.constitution);
		System.out.println("武器\t"+p1.equip.name+"\t\t\t\t\t"+p2.equip.name);
		System.out.println();


		Thread.sleep(5000);

		BattleField b=new BattleField(p1,p2);
		while(p1.hp>0&&p2.hp>0) {
			b.BattleSet(p1, p2,b);
		}
		if(p1.hp<=0) {
			System.out.println(p2.name+"の勝利！！！");
		}
		if(p2.hp<=0) {
			System.out.println(p1.name+"の勝利！！！");
		}
		System.out.println("続ける? 1:yes 2:no  番号を入力して下さい");
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
		while(pb.contiueNum==1) {
			p1.hp=p1.MaxHP;
			p2.hp=p2.MaxHP;
			while(p1.hp>0&&p2.hp>0) {
				b.BattleSet(p1, p2,b);
			}
			if(p1.hp<=0) {
				System.out.println(p2.name+"の勝利！！！");
			}
			if(p2.hp<=0) {
				System.out.println(p1.name+"の勝利！！！");
			}
			System.out.println("続ける? 1:yes 2:no  番号を入力して下さい");
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
		}
	}
}
/*
		System.out.println("では続けて勝った方と新たなキャラでバトル！！");
		p3=pb.chooseCharacter(p3);
		pb.putName(p3);
		pb.upperPara(p3);
		pb.downerPara(p3);
		p3=pb.equipFighterBack(p3);
		if()
		while(p1.hp>0&&p3.hp>0) {
			b.BattleSet(p1, p2,b);
		}
		if(p1.hp<=0) {
			System.out.println(p2.name+"の勝利！！！");
		}
		if(p2.hp<=0) {
			System.out.println(p1.name+"の勝利！！！");
		}
	}*/


