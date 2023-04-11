package feGameVer2.weapon;

public class Bow extends PhysicsWeap{
	//武器相性調整メソッド
	//弓には相性はないので何もしない
	public void three_way_relation(Weapon o) {
	}
	public void three_way_relation_back(Weapon o) {
	}
	public Bow(String name,int power,int weight, int accurecy, int critical,int range) {
		super(name,power,weight,accurecy,critical,range);
	}
}
