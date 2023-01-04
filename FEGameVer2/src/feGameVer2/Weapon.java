package feGameVer2;

public abstract class Weapon {
	String name;
	int power;
	int weight;
	int accuracy;
	int critical;
	//renge 距離	1：近距離、2：遠距離、3：近遠両方
	int range;

	public Weapon(String name, int power,int weight,int accuracy, int critical,int range) {
		this.name=name;
		this.power=power;
		this.weight=weight;
		this.accuracy=accuracy;
		this.critical=critical;
		this.range=range;
	}

	public abstract void three_way_relation(Weapon o);

	public abstract void three_way_relation_back(Weapon o);
}
