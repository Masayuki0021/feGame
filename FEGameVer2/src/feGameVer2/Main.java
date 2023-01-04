package feGameVer2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Fighter p1 =null;


		System.out.println("プレイヤー1：クラスの選択");
		System.out.println("番号を入力してください");
		System.out.println("1:パラディン、2：ジェネラル、3：ウォーリアー");
		System.out.println("4:ファルコンナイト、5：バーサーカー、6：ソードマスター");
		System.out.println("7:スナイパー、8:ドラゴンマスター、9：ドルイド");
		System.out.println("10:勇者、11:遊牧騎兵、12：賢者、13：司祭、14：ヴァルキュリア");
		System.out.println("↓");
		int c_Num=new Scanner(System.in).nextInt();
		if(c_Num==1) {
			p1= new Paladin();
		}
		if(c_Num==2) {
			p1=new General();
		}
		if(c_Num==3) {
			p1=new Warrior();
		}
		if(c_Num==4) {
			p1=new FalconKnight();
		}
		if(c_Num==5) {
			p1=new Berserker();
		}
		if(c_Num==6) {
			p1=new SwordMaster();
		}
		if(c_Num==7) {
			p1=new Sniper();
		}
		if(c_Num==8) {
			p1=new DragonMaster();
		}
		if(c_Num==9) {
			p1=new Druid();
		}
		if(c_Num==10) {
			p1=new Hero();
		}
		if(c_Num==11) {
			p1=new NomadicCavalry();
		}
		if(c_Num==12) {
			p1=new Sage();
		}
		if(c_Num==13) {
			p1=new Bishop();
		}
		if(c_Num==14) {
			p1=new Valkyria();
		}
		System.out.print("名前を入力してください→");
		String p1Name=new Scanner(System.in).nextLine();
		p1.name=p1Name;


		System.out.println("好きなパラメーターを二つ選んでください");
		System.out.println("1:HP、2:力、3：技、4：速さ、5：守備、６：魔防、7：幸運、8：体格");
		//一つ目のパラメーター
		int statusP1_Num1=new Scanner(System.in).nextInt();
		if(statusP1_Num1==1) {
			p1.hp*=1.2;
		}
		if(statusP1_Num1==2) {
			p1.strength*=1.2;
		}
		if(statusP1_Num1==3) {
			p1.skill*=1.2;
		}
		if(statusP1_Num1==4) {
			p1.speed*=1.2;
		}
		if(statusP1_Num1==5) {
			p1.defence*=1.2;
		}
		if(statusP1_Num1==6) {
			p1.resist*=1.2;
		}
		if(statusP1_Num1==7) {
			p1.luck*=1.2;
		}
		if(statusP1_Num1==8) {
			p1.constitution*=1.2;
		}
		//二つ目のパラメーター
		int statusP1_Num2=new Scanner(System.in).nextInt();
		if(statusP1_Num2==1) {
			p1.hp*=1.2;
		}
		if(statusP1_Num2==2) {
			p1.strength*=1.2;
		}
		if(statusP1_Num2==3) {
			p1.skill*=1.2;
		}
		if(statusP1_Num2==4) {
			p1.speed*=1.2;
		}
		if(statusP1_Num2==5) {
			p1.defence*=1.2;
		}
		if(statusP1_Num2==6) {
			p1.resist*=1.2;
		}
		if(statusP1_Num2==7) {
			p1.luck*=1.2;
		}
		if(statusP1_Num2==8) {
			p1.constitution*=1.2;
		}

		p1.showSt();

		System.out.println("嫌いなパラメーターを二つ選んでください");
		System.out.println("1:HP、2:力、3：技、4：速さ、5：守備、６：魔防、7：幸運、8：体格");
		int statusP1_Num3=new Scanner(System.in).nextInt();
		if(statusP1_Num3==1) {
			p1.hp*=0.8;
		}
		if(statusP1_Num3==2) {
			p1.strength*=0.8;
		}
		if(statusP1_Num3==3) {
			p1.skill*=0.8;
		}
		if(statusP1_Num3==4) {
			p1.speed*=0.8;
		}
		if(statusP1_Num3==5) {
			p1.defence*=0.8;
		}
		if(statusP1_Num3==6) {
			p1.resist*=0.8;
		}
		if(statusP1_Num3==7) {
			p1.luck*=0.8;
		}
		if(statusP1_Num3==8) {
			p1.constitution*=0.8;
		}
		int statusP1_Num4=new Scanner(System.in).nextInt();
		if(statusP1_Num4==1) {
			p1.hp*=0.8;
		}
		if(statusP1_Num4==2) {
			p1.strength*=0.8;
		}
		if(statusP1_Num4==3) {
			p1.skill*=0.8;
		}
		if(statusP1_Num4==4) {
			p1.speed*=0.8;
		}
		if(statusP1_Num4==5) {
			p1.defence*=0.8;
		}
		if(statusP1_Num4==6) {
			p1.resist*=0.8;
		}
		if(statusP1_Num4==7) {
			p1.luck*=0.8;
		}
		if(statusP1_Num4==8) {
			p1.constitution*=0.8;
		}
		if(p1 instanceof Paladin) {
			Paladin p1Pala=(Paladin)p1;
			p1Pala.equipNewWeapon();

		}
		if(p1 instanceof Warrior) {
			Warrior p1Warr=(Warrior) p1;
			p1Warr.equipNewWeapon();
		}










		Fighter p2=null;
		//		Fighter p2;
		System.out.println("プレイヤー2：クラスの選択");
		System.out.println("番号を入力してください");
		System.out.println("1:パラディン、2：ジェネラル、3：ウォーリアー");
		System.out.println("4:ファルコンナイト、5：バーサーカー、6：ソードマスター");
		System.out.println("7:スナイパー、8:ドラゴンマスター、9：ドルイド");
		System.out.println("10:勇者、11:遊牧騎兵、12：賢者、13：司祭、14：ヴァルキュリア");
		System.out.println("↓");
		int c_NumP2=new Scanner(System.in).nextInt();


		if(c_NumP2==1) {
			p2= new Paladin();
		}
		if(c_NumP2==3) {
			p2=new Warrior();
		}
		System.out.print("名前を入力してください→");
		String p2Name=new Scanner(System.in).nextLine();
		p2.name=p2Name;


		p2.showSt();

		System.out.println("好きなパラメーターを二つ選んでください");
		System.out.println("1:HP、2:力、3：技、4：速さ、5：守備、６：魔防、7：幸運、8：体格");
		int statusP2_Num1=new Scanner(System.in).nextInt();
		if(statusP2_Num1==1) {
			p2.hp*=1.2;
		}
		if(statusP2_Num1==2) {
			p2.strength*=1.2;
		}
		if(statusP2_Num1==3) {
			p2.skill*=1.2;
		}
		if(statusP2_Num1==4) {
			p2.speed*=1.2;
		}
		if(statusP2_Num1==5) {
			p2.defence*=1.2;
		}
		if(statusP2_Num1==6) {
			p2.resist*=1.2;
		}
		if(statusP2_Num1==7) {
			p2.luck*=1.2;
		}
		if(statusP2_Num1==8) {
			p2.constitution*=1.2;
		}
		int statusP2_Num2=new Scanner(System.in).nextInt();
		if(statusP2_Num2==1) {
			p2.hp*=1.2;
		}
		if(statusP2_Num2==2) {
			p2.strength*=1.2;
		}
		if(statusP2_Num2==3) {
			p2.skill*=1.2;
		}
		if(statusP2_Num2==4) {
			p2.speed*=1.2;
		}
		if(statusP2_Num2==5) {
			p2.defence*=1.2;
		}
		if(statusP2_Num2==6) {
			p2.resist*=1.2;
		}
		if(statusP2_Num2==7) {
			p2.luck*=1.2;
		}
		if(statusP2_Num2==8) {
			p2.constitution*=1.2;
		}

		p2.showSt();

		System.out.println("嫌いなパラメーターを二つ選んでください");
		System.out.println("1:HP、2:力、3：技、4：速さ、5：守備、６：魔防、7：幸運、8：体格");
		int statusP2_Num3=new Scanner(System.in).nextInt();
		if(statusP2_Num3==1) {
			p1.hp*=0.8;
		}
		if(statusP2_Num3==2) {
			p2.strength*=0.8;
		}
		if(statusP2_Num3==3) {
			p2.skill*=0.8;
		}
		if(statusP2_Num3==4) {
			p2.speed*=0.8;
		}
		if(statusP2_Num3==5) {
			p2.defence*=0.8;
		}
		if(statusP2_Num3==6) {
			p2.resist*=0.8;
		}
		if(statusP2_Num3==7) {
			p2.luck*=0.8;
		}
		if(statusP2_Num3==8) {
			p2.constitution*=0.8;
		}
		int statusP2_Num4=new Scanner(System.in).nextInt();
		if(statusP2_Num4==1) {
			p2.hp*=0.8;
		}
		if(statusP2_Num4==2) {
			p2.strength*=0.8;
		}
		if(statusP2_Num4==3) {
			p2.skill*=0.8;
		}
		if(statusP2_Num4==4) {
			p2.speed*=0.8;
		}
		if(statusP2_Num4==5) {
			p2.defence*=0.8;
		}
		if(statusP2_Num4==6) {
			p2.resist*=0.8;
		}
		if(statusP2_Num4==7) {
			p2.luck*=0.8;
		}
		if(statusP2_Num4==8) {
			p2.constitution*=0.8;
		}

		if(p2 instanceof Paladin) {
			Paladin p2Pala=(Paladin)p2;
			p2Pala.equipNewWeapon();
		}
		if(p2 instanceof Warrior) {
			Warrior p2Warr=(Warrior) p2;
			p2Warr.equipNewWeapon();
		}






		BattleField b=new BattleField(p1,p2);

		while(p1.hp>0&&p2.hp>0) {
			b.BattleSet(p1, p2,b);
		}
	}


}

