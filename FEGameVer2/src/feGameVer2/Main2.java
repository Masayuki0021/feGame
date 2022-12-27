package feGameVer2;

public class Main2 {
	public static void main(String[]args) throws InterruptedException {
	Sage p1=new Sage();
	Hero p2 =new Hero();
	p1.name="プレイヤー1";
	p2.name="プレイヤー2";

	p1.equipNewWeapon();
	p2.equipNewWeapon();





	BattleField b=new BattleField(p1,p2);

	b.BattleTurnOneside(p1, p2);


	while(p1.hp>0&&p2.hp>0) {
		b.BattleSet(p1, p2,b);
	}
	}
}