package feGameVer2.weapon;

public abstract class MagicWeap extends Weapon {
	public abstract void three_way_relation(Weapon o);

	public abstract void three_way_relation_back(Weapon o);

	public MagicWeap(String name,int power,int weight,int accuracy, int critical,int range) {
		super(name,power,weight,accuracy,critical,range);
	}


}
