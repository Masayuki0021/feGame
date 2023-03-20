package feGameVer2.weapon;

public abstract class Weapon {
	String name;
	int power;				//名前
	int weight;				//重さ
	int accuracy;			//命中率
	private int critical;	//必殺
	int range;				//renge 距離	1：近距離、2：遠距離、3：近遠両方

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
	public String getName() {
		return this.name;
	}
	public int getPower() {
		return this.power;
	}
	public int getWeight() {
		return this.weight;
	}
	public int getAccuracy() {
		return this.accuracy;
	}
	public int getCritical() {
		return this.critical;
	}
	public int getRange() {
		return this.range;
	}
	public void setCritical(int critical) {
		this.critical = critical;
	}
}
