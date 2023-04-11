package feGameVer2.fighter;

import feGameVer2.weapon.Weapon;

public abstract class Fighter {
	//Fighterを継承しているクラスの説明コメントはPaladin(パラディン)クラス参照
	String name;
	Weapon equip=null;			//装備武器
	int hp;
	int MaxHP;
	private int strength;		//力
	private int skill;			//技
	private int speed;			//速さ
	private int defence;		//守備
	private int resist;			//魔防
	private int constitution;	//体格
	private int luck;			//幸運
	private int attackSpeed;		//実速
	private int ActHitRate;		//実命中率
	private int ActPowerPhy;		//実物理威力
	private int ActPowerMagic;	//実魔法威力
	private int ActCritical;		//実必殺率
	private int attacktimes;		//攻撃回数（１回or2回）


	public void setName(String name) {
		if(name==null) {
			throw new IllegalArgumentException("名前が入っていません。入力して下さい");
		}
		if(name.length()<1) {
			throw new IllegalArgumentException("名前が入っていません。入力して下さい");
		}
		this.name=name;
	}
	public abstract void changeEquip(Weapon o);
	public abstract void equipWeaponBeforeBattle();
	public String toString() {
		return "名前    "+this.name+"\n"+"クラス  "+this.getCName()+"\n"+"HP   "+this.hp+"\n"+"力      "+this.getStrength()+"\n"
				+"技      "+this.getSkill()+"\n"+"速さ    "+this.getSpeed()+"\n"+"守備    "+this.getDefence()+"\n"+
				"魔防    "+this.getResist()+"\n"+"幸運    "+this.getLuck()+"\n"+"体格    "+this.getConstitution();

	}
	public void showSt() {
		System.out.println(this.toString());
	}
	public abstract String getCName();

	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp=hp;
	}
	public int getStrength() {
		return this.strength;
	}
	public int getSkill() {
		return this.skill;
	}
	public int getSpeed() {
		return this.speed;
	}
	public int getDefence() {
		return this.defence;
	}
	public int getResist() {
		return this.resist;
	}
	public int getLuck() {
		return this.luck;
	}
	public int getConstitution() {
		return this.constitution;
	}
	public int getMaxHp() {
		return this.MaxHP;
	}
	public String getName() {
		return this.name;
	}
	public Weapon getEquip() {
		return this.equip;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setSkill(int skill) {
		this.skill = skill;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public void setResist(int resist) {
		this.resist = resist;
	}
	public void setLuck(int luck) {
		this.luck = luck;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getAttackSpeed() {
		return attackSpeed;
	}
	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	public int getActHitRate() {
		return ActHitRate;
	}
	public void setActHitRate(int actHitRate) {
		ActHitRate = actHitRate;
	}
	public int getActPowerPhy() {
		return ActPowerPhy;
	}
	public void setActPowerPhy(int actPowerPhy) {
		ActPowerPhy = actPowerPhy;
	}
	public int getActPowerMagic() {
		return ActPowerMagic;
	}
	public void setActPowerMagic(int actPowerMagic) {
		ActPowerMagic = actPowerMagic;
	}
	public int getActCritical() {
		return ActCritical;
	}
	public void setActCritical(int actCritical) {
		ActCritical = actCritical;
	}
	public int getAttacktimes() {
		return attacktimes;
	}
	public void setAttacktimes(int attacktimes) {
		this.attacktimes = attacktimes;
	}
}