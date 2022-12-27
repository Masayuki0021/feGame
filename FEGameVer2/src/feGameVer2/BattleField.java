package feGameVer2;

public  class BattleField {

	Fighter p1;
	Fighter p2;

	int p1attackSpeed;
	int p1ActHitRate;
	int p1ActPowerPhy;
	int p1ActPowerMagic;
	int p1ActCritical;
	int p1attacktimes;

	int p2attackSpeed;
	int p2ActHitRate;
	int p2ActPowerPhy;
	int p2ActPowerMagic;
	int p2ActCritical;
	int p2attacktimes;


	public BattleField(Fighter p1,Fighter p2) {
		this.p1=p1;
		this.p2=p2;
		//プレイヤー1	計算前要素計算
		int p1weaponLoad=p1.equip.weight-p1.constitution;
		if(p1weaponLoad<=0) {
			p1weaponLoad=0;
		}
		this.p1attackSpeed=p1.speed-p1weaponLoad;
		int p1avoidRate=this.p1attackSpeed*2+p1.luck;
		int p1hitRate=p1.equip.accuracy+p1.skill*2+p1.luck/2;
		int p1power=p1.strength+p1.equip.power;
		int p1critical=p1.equip.critical+p1.skill/2;
		//プレイヤー2	計算前要素計算
		int p2weaponLoad=p2.equip.weight-p2.constitution;
		if(p2weaponLoad<=0) {
			p2weaponLoad=0;
		}
		this.p2attackSpeed=p2.speed-p2weaponLoad;
		int p2avoidRate=this.p2attackSpeed*2+p2.luck;
		int p2hitRate=p2.equip.accuracy+p2.skill*2+p2.luck/2;
		int p2power=p2.strength+p2.equip.power;
		int p2critical=p2.equip.critical+p2.skill/2;


		//p1 戦闘数値	計算
		this.p1ActHitRate=p1hitRate-p2avoidRate;
		if(this.p1ActHitRate<=20) {
			this.p1ActHitRate=20;
		}
		this.p1ActPowerPhy=p1power-p2.defence;
		if(this.p1ActPowerPhy<=2) {
			this.p1ActPowerPhy=2;
		}
		this.p1ActPowerMagic=p1power-p2.resist;
		if(this.p1ActPowerMagic<=2) {
			this.p1ActPowerMagic=2;
		}


		this.p1ActCritical=p1critical+p2.luck;

		//p2 戦闘数値	計算
		this.p2ActHitRate=p2hitRate-p1avoidRate;
		if(this.p2ActHitRate<=20) {
				this.p2ActHitRate=20;
		}
		this.p2ActPowerPhy=p2power-p1.defence;
		if(this.p2ActPowerPhy<=2) {
			this.p2ActPowerPhy=2;
		}
		this.p2ActPowerMagic=p2power-p1.resist;
		if(this.p2ActPowerMagic<=2) {
			this.p2ActPowerMagic=2;
		}
		this.p2ActCritical=p2critical+p1.luck;


		//攻撃回数attacktimes 計算
		if(this.p1attackSpeed>(this.p2attackSpeed+4)) {
			this.p1attacktimes=2;
		}else {
			this.p1attacktimes=1;
		}
		if(this.p2attackSpeed>(this.p1attackSpeed+4)) {
			this.p2attacktimes=2;
		}else {
			this.p2attacktimes=1;
		}
	}



	//戦闘数値再計算メソッド（武器変更後使ってください
	public void reCalBattleStatus(Fighter p1,Fighter p2) {
		//プレイヤー1	計算前要素計算
		int p1weaponLoad=p1.equip.weight-p1.constitution;
		if(p1weaponLoad<=0) {
			p1weaponLoad=0;
		}
		this.p1attackSpeed=p1.speed-p1weaponLoad;
		int p1avoidRate=this.p1attackSpeed*2+p1.luck;
		int p1hitRate=p1.equip.accuracy+p1.skill*2+p1.luck/2;
		int p1power=p1.strength+p1.equip.power;
		int p1critical=p1.equip.critical+p1.skill/2;
		//プレイヤー2	計算前要素計算
		int p2weaponLoad=p2.equip.weight-p2.constitution;
		if(p2weaponLoad<=0) {
			p2weaponLoad=0;
		}
		this.p2attackSpeed=p2.speed-p2weaponLoad;
		int p2avoidRate=this.p2attackSpeed*2+p2.luck;
		int p2hitRate=p2.equip.accuracy+p2.skill*2+p2.luck/2;
		int p2power=p2.strength+p2.equip.power;
		int p2critical=p2.equip.critical+p2.skill/2;


		//p1 戦闘数値	計算
		this.p1ActHitRate=p1hitRate-p2avoidRate;
		if(this.p1ActHitRate<=20) {
			this.p1ActHitRate=20;
		}
		if(this.p1ActHitRate>=90)
			this.p1ActHitRate=90;
		this.p1ActPowerPhy=p1power-p2.defence;
		if(this.p1ActPowerPhy<=2) {
			this.p1ActPowerPhy=2;
		}
		this.p1ActPowerMagic=p1power-p2.resist;
		if(this.p1ActPowerMagic<=2) {
			this.p1ActPowerMagic=2;
		}

		this.p1ActCritical=p1critical+p2.luck;

		//p2 戦闘数値	計算
		this.p2ActHitRate=p2hitRate-p1avoidRate;
		if(this.p2ActHitRate<=20) {
				this.p2ActHitRate=20;
		}
		if(this.p2ActHitRate>90) {
			this.p1ActHitRate=90;
		}
		this.p2ActPowerPhy=p2power-p1.defence;
		if(this.p2ActPowerPhy<=2) {
			this.p2ActPowerPhy=2;
		}
		this.p2ActPowerMagic=p2power-p1.resist;
		if(this.p2ActPowerMagic<=2) {
			this.p2ActPowerMagic=2;
		}
		this.p2ActCritical=p2critical+p1.luck;

	}


	public void BattleTurnOneside(Fighter p1,Fighter p2) throws InterruptedException {
		System.out.println(p1.name+"\t\t\t\t"+p2.name);
		System.out.println("クラス\t"+p1.getCName()+"\t\t\t\t"+p2.getCName());
		System.out.println("HP\t\t"+p1.hp+"\t\t\t\t\t"+p2.hp);
		System.out.println("命中率\t"+this.p1ActHitRate+"\t\t\t\t\t"+this.p2ActHitRate);
		if(p1.equip instanceof PhysicsWeap&&p2.equip instanceof PhysicsWeap) {
			System.out.println("攻撃力\t"+this.p1ActPowerPhy+"\t\t\t\t\t"+this.p2ActPowerPhy);
	}else if(p1.equip instanceof MagicWeap&&p2.equip instanceof PhysicsWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerMagic+"\t\t\t\t\t"+this.p2ActPowerPhy);
	}else if(p1.equip instanceof PhysicsWeap&&p2.equip instanceof MagicWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerPhy+"\t\t\t\t\t"+this.p2ActPowerMagic);
	}else if(p1.equip instanceof MagicWeap&&p2.equip instanceof MagicWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerMagic+"\t\t\t\t\t"+this.p2ActPowerMagic);
	}
		System.out.println("必殺\t"+this.p1ActCritical+"\t\t\t\t\t"+this.p2ActCritical);
		System.out.println("\n武器\t"+p1.equip.name+"\t\t"+p2.equip.name);
		System.out.println("攻撃回数\t"+this.p1attacktimes+"\t\t\t\t"+this.p2attacktimes);
		System.out.println();
		Thread.sleep(5000);





		if(this.p1attackSpeed>this.p2attackSpeed) {
			System.out.println(p1.name+"("+p1.getCName()+")"+"が先に動いた！");
			Thread.sleep(1000);
			double rand=Math.random()*100;
			if(rand<=65) {
				System.out.println(p1.name+"("+p1.getCName()+")"+"は間合いを掴んだ！");
				Thread.sleep(1000);
				if(p1.hp>0) {
					System.out.println("\n"+p1.name+"("+p1.getCName()+")"+"の攻撃！");
					Thread.sleep(1000);
					double rand1=Math.random()*100;
					double rand2=Math.random()*100;

					if(this.p1ActHitRate>=rand1) {
						System.out.println("!!!!!hit!!!!!");
						if(this.p1ActCritical>rand2) {
							System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
							Thread.sleep(1000);
							if(p1.equip instanceof PhysicsWeap) {
							System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
							p2.hp-=this.p1ActPowerPhy*3;
							}else if(p1.equip instanceof MagicWeap) {
								System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
								p2.hp-=this.p1ActPowerMagic*3;
							}
							Thread.sleep(1000);
							System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
							Thread.sleep(1000);
						}else {
							if(p1.equip instanceof PhysicsWeap) {
							System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
							p2.hp-=this.p1ActPowerPhy;
							}else if(p1.equip instanceof MagicWeap) {
								System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
								p2.hp-=this.p1ActPowerMagic;
							}
							Thread.sleep(1000);
							System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
							Thread.sleep(1000);
						}
					}else {
						System.out.println("miss!");
						Thread.sleep(1000);
						System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
						Thread.sleep(1000);
					}
				}
				if(p2.equip.range==3) {
					Thread.sleep(1000);
					if(p2.hp>0) {
						System.out.println("\n"+p2.name+"("+p2.getCName()+")"+"の反撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p1ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p1ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p2.equip instanceof PhysicsWeap) {
								System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
								p1.hp-=this.p2ActPowerPhy*3;
								}else if(p2.equip instanceof MagicWeap) {
									System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
									p1.hp-=this.p2ActPowerMagic*3;
								}
								Thread.sleep(1000);
								System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
								Thread.sleep(1000);
							}else {
								if(p2.equip instanceof PhysicsWeap) {
								System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
								p1.hp-=this.p2ActPowerPhy;
								}else if(p2.equip instanceof MagicWeap) {
									System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
									p1.hp-=this.p2ActPowerMagic;
								}
								Thread.sleep(1000);
								System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							Thread.sleep(1000);
							System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
							Thread.sleep(1000);
						}
					}
				}
				
				if(this.p1attackSpeed>(this.p2attackSpeed+4)){
					if(p1.hp>0&&p1.hp>0) {
						System.out.println("\n"+p1.name+"("+p1.getCName()+")"+"の追撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p1ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p1ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p1.equip instanceof PhysicsWeap) {
								System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
								p2.hp-=this.p1ActPowerPhy*3;
								}else if(p1.equip instanceof MagicWeap) {
									System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
									p2.hp-=this.p1ActPowerMagic*3;
								}
								Thread.sleep(1000);
								System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
								Thread.sleep(1000);
							}else {
								if(p1.equip instanceof PhysicsWeap) {
								System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
								p2.hp-=this.p1ActPowerPhy;
								}else if(p1.equip instanceof MagicWeap) {
									System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
									p2.hp-=this.p1ActPowerMagic;
								}
								Thread.sleep(1000);
								System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
							Thread.sleep(1000);
						}
					}
				}
			}else {
				System.out.println(p2.name+"("+p2.getCName()+")"+"は間合いを掴んだ！");
				Thread.sleep(1000);
				if(p2.hp>0) {
					System.out.println("\n"+p2.name+"("+p2.getCName()+")"+"の攻撃！");
					Thread.sleep(1000);
					double rand1=Math.random()*100;
					double rand2=Math.random()*100;

					if(this.p2ActHitRate>=rand1) {
						System.out.println("!!!!!hit!!!!!");
						if(this.p2ActCritical>rand2) {
							System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
							Thread.sleep(1000);
							if(p2.equip instanceof PhysicsWeap) {
							System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
							p1.hp-=this.p2ActPowerPhy*3;
							}else if(p2.equip instanceof MagicWeap) {
								System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
								p1.hp-=this.p2ActPowerMagic*3;
							}
							Thread.sleep(1000);
							System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
							Thread.sleep(1000);
						}else {
							if(p2.equip instanceof PhysicsWeap) {
							System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
							p1.hp-=this.p2ActPowerPhy;
							}else if(p2.equip instanceof MagicWeap) {
								System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
								p1.hp-=this.p2ActPowerMagic;
							}
							Thread.sleep(1000);
							System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
							Thread.sleep(1000);
						}
					}else {
						System.out.println("miss!");
						Thread.sleep(1000);
						System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
						Thread.sleep(1000);
					}
				}
				if(p1.equip.range==3) {
					Thread.sleep(1000);
					if(p1.hp>0) {
						System.out.println("\n"+p1.name+"("+p1.getCName()+")"+"の反撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p1ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p1ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p1.equip instanceof PhysicsWeap) {
								System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
								p2.hp-=this.p1ActPowerPhy*3;
								}else if(p1.equip instanceof MagicWeap) {
									System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
									p2.hp-=this.p1ActPowerMagic*3;
								}
								Thread.sleep(1000);
								System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
								Thread.sleep(1000);
							}else {
								if(p1.equip instanceof PhysicsWeap) {
								System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
								p2.hp-=this.p1ActPowerPhy;
								}else if(p1.equip instanceof MagicWeap) {
									System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
									p2.hp-=this.p1ActPowerMagic;
								}
								Thread.sleep(1000);
								System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							Thread.sleep(1000);
							System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
							Thread.sleep(1000);
						}
					}
				}
			}
		}else {
			System.out.println(p2.name+"("+p2.getCName()+")"+"が先に動いた！");
			Thread.sleep(1000);
			double rand=Math.random()*100;
			if(rand<=65) {
				System.out.println(p2.name+"("+p2.getCName()+")"+"は間合いを掴んだ！");
				Thread.sleep(1000);
				if(p2.hp>0) {
					System.out.println("\n"+p2.name+"("+p2.getCName()+")"+"の攻撃！");
					Thread.sleep(1000);
					double rand1=Math.random()*100;
					double rand2=Math.random()*100;

					if(this.p2ActHitRate>=rand1) {
						System.out.println("!!!!!hit!!!!!");
						if(this.p2ActCritical>rand2) {
							System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
							Thread.sleep(1000);
							if(p2.equip instanceof PhysicsWeap) {
							System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
							p1.hp-=this.p2ActPowerPhy*3;
							}else if(p2.equip instanceof MagicWeap) {
								System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
								p1.hp-=this.p2ActPowerMagic*3;
							}
							Thread.sleep(1000);
							System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
							Thread.sleep(1000);
						}else {
							if(p2.equip instanceof PhysicsWeap) {
							System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
							p1.hp-=this.p2ActPowerPhy;
							}else if(p2.equip instanceof MagicWeap) {
								System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
								p1.hp-=this.p2ActPowerMagic;
							}
							Thread.sleep(1000);
							System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
							Thread.sleep(1000);
						}
					}else {
						System.out.println("miss!");
						Thread.sleep(1000);
						System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
						Thread.sleep(1000);
					}
				}
				if(p1.equip.range==3) {
					Thread.sleep(1000);
					if(p1.hp>0) {
						System.out.println("\n"+p1.name+"("+p1.getCName()+")"+"の反撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p1ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p1ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p1.equip instanceof PhysicsWeap) {
								System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
								p2.hp-=this.p1ActPowerPhy*3;
								}else if(p1.equip instanceof MagicWeap) {
									System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
									p2.hp-=this.p1ActPowerMagic*3;
								}
								Thread.sleep(1000);
								System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
								Thread.sleep(1000);
							}else {
								if(p1.equip instanceof PhysicsWeap) {
								System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
								p2.hp-=this.p1ActPowerPhy;
								}else if(p1.equip instanceof MagicWeap) {
									System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
									p2.hp-=this.p1ActPowerMagic;
								}
								Thread.sleep(1000);
								System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							Thread.sleep(1000);
							System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
							Thread.sleep(1000);
						}
					}
				}
				if(this.p2attackSpeed>(this.p1attackSpeed+4)) {
					if(p2.hp>0&&p1.hp>0) {
						System.out.println("\n"+p2.name+"("+p2.getCName()+")"+"の追撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p2ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p2ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p2.equip instanceof PhysicsWeap) {
								System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
								p1.hp-=this.p2ActPowerPhy*3;
								}else if(p2.equip instanceof MagicWeap) {
									System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
									p1.hp-=this.p2ActPowerMagic*3;
								}
								Thread.sleep(1000);
								System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
								Thread.sleep(1000);
							}else {
								if(p2.equip instanceof PhysicsWeap) {
								System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
								p1.hp-=this.p2ActPowerPhy;
								}else if(p2.equip instanceof MagicWeap) {
									System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
									p1.hp-=this.p2ActPowerMagic;
								}
								Thread.sleep(1000);
								System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							Thread.sleep(1000);
							System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
							Thread.sleep(1000);
						}
					}

				}
			}else {
				System.out.println(p1.name+"("+p1.getCName()+")"+"は間合いを掴んだ！");
				Thread.sleep(1000);
				if(p1.hp>0) {
					System.out.println("\n"+p1.name+"("+p1.getCName()+")"+"の攻撃！");
					Thread.sleep(1000);
					double rand1=Math.random()*100;
					double rand2=Math.random()*100;

					if(this.p1ActHitRate>=rand1) {
						System.out.println("!!!!!hit!!!!!");
						if(this.p1ActCritical>rand2) {
							System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
							Thread.sleep(1000);
							if(p1.equip instanceof PhysicsWeap) {
							System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
							p2.hp-=this.p1ActPowerPhy*3;
							}else if(p1.equip instanceof MagicWeap) {
								System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
								p2.hp-=this.p1ActPowerMagic*3;
							}
							Thread.sleep(1000);
							System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
							Thread.sleep(1000);
						}else {
							Thread.sleep(1000);
							if(p1.equip instanceof PhysicsWeap) {
							System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
							p2.hp-=this.p1ActPowerPhy;
							}else if(p1.equip instanceof MagicWeap) {
								System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
								p2.hp-=this.p1ActPowerMagic;
							}
							Thread.sleep(1000);
							System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
							Thread.sleep(1000);
						}
					}else {
						System.out.println("miss!");
						Thread.sleep(1000);
						System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
						Thread.sleep(1000);
					}
				}
				if(p2.equip.range==3) {
					Thread.sleep(1000);
					if(p2.hp>0) {
						System.out.println("\n"+p2.name+"("+p2.getCName()+")"+"の反撃！");
						Thread.sleep(1000);
						double rand1=Math.random()*100;
						double rand2=Math.random()*100;

						if(this.p2ActHitRate>=rand1) {
							System.out.println("!!!!!hit!!!!!");
							if(this.p2ActCritical>rand2) {
								System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
								Thread.sleep(1000);
								if(p2.equip instanceof PhysicsWeap) {
								System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
								p1.hp-=this.p2ActPowerPhy*3;
								}else if(p2.equip instanceof MagicWeap) {
									System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
									p1.hp-=this.p2ActPowerMagic*3;
								}
								Thread.sleep(1000);
								System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
								Thread.sleep(1000);
							}else {
								if(p2.equip instanceof PhysicsWeap) {
								System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
								p1.hp-=this.p2ActPowerPhy;
								}else if(p2.equip instanceof MagicWeap) {
									System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
									p1.hp-=this.p2ActPowerMagic;
								}
								Thread.sleep(1000);
								System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
								Thread.sleep(1000);
							}
						}else {
							System.out.println("miss!");
							Thread.sleep(1000);
							System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
							Thread.sleep(1000);
						}
					}
				}
			}



		}
	}

	public void BattleTurnCounter(Fighter p1,Fighter p2) throws InterruptedException {
		System.out.println(p1.name+"\t\t\t\t"+p2.name);
		System.out.println("クラス\t"+p1.getCName()+"\t\t\t\t"+p2.getCName());
		System.out.println("HP\t\t"+p1.hp+"\t\t\t\t\t"+p2.hp);
		System.out.println("命中率\t"+this.p1ActHitRate+"\t\t\t\t\t"+this.p2ActHitRate);
		if(p1.equip instanceof PhysicsWeap&&p2.equip instanceof PhysicsWeap) {
			System.out.println("攻撃力\t"+this.p1ActPowerPhy+"\t\t\t\t\t"+this.p2ActPowerPhy);
	}else if(p1.equip instanceof MagicWeap&&p2.equip instanceof PhysicsWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerMagic+"\t\t\t\t\t"+this.p2ActPowerPhy);
	}else if(p1.equip instanceof PhysicsWeap&&p2.equip instanceof MagicWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerPhy+"\t\t\t\t\t"+this.p2ActPowerMagic);
	}else if(p1.equip instanceof MagicWeap&&p2.equip instanceof MagicWeap) {
		System.out.println("攻撃力\t"+this.p1ActPowerMagic+"\t\t\t\t\t"+this.p2ActPowerMagic);
	}
		System.out.println("必殺\t"+this.p1ActCritical+"\t\t\t\t\t"+this.p2ActCritical);
		System.out.println("\t\t"+p1.equip.name+"\t\t\t\t"+p2.equip.name);
		System.out.println("攻撃回数\t"+this.p1attacktimes+"\t\t\t\t\t"+this.p2attacktimes);

		System.out.println();
		Thread.sleep(5000);




		if(this.p1attackSpeed>this.p2attackSpeed) {
			System.out.println(p1.name+"("+p1.getCName()+")"+"が先に動いた！");
			Thread.sleep(1000);
			if(p1.hp>0) {
				System.out.println(p1.name+"("+p1.getCName()+")"+"は正々堂々戦いを挑む！");
				System.out.println("\n"+p1.name+"("+p1.getCName()+")"+"の攻撃！");
				Thread.sleep(1000);
				double rand1=Math.random()*100;
				double rand2=Math.random()*100;

				if(this.p1ActHitRate>=rand1) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p1ActCritical>rand2) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p1.equip instanceof PhysicsWeap) {
						System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
						p2.hp-=this.p1ActPowerPhy*3;
						}else if(p1.equip instanceof MagicWeap) {
							System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
							p2.hp-=this.p1ActPowerMagic*3;
						}
						Thread.sleep(1000);
						System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p1.equip instanceof PhysicsWeap) {
						System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
						p2.hp-=this.p1ActPowerPhy;
						}else if(p1.equip instanceof MagicWeap) {
							System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
							p2.hp-=this.p1ActPowerMagic;
						}
						Thread.sleep(1000);
						System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
					Thread.sleep(1000);
				}
			}
			if(p2.hp>0) {
				Thread.sleep(1000);
				System.out.println("\n"+p2.name+"("+p2.getCName()+")"+"の反撃！");
				Thread.sleep(1000);
				double rand3=Math.random()*100;
				double rand4=Math.random()*100;

				if(this.p2ActHitRate>=rand3) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p2ActCritical>rand4) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p2.equip instanceof PhysicsWeap) {
						System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
						p1.hp-=this.p2ActPowerPhy*3;
						}else if(p2.equip instanceof MagicWeap) {
							System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
							p1.hp-=this.p2ActPowerMagic*3;
						}
						Thread.sleep(1000);
						System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p2.equip instanceof PhysicsWeap) {
						System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
						p1.hp-=this.p2ActPowerPhy;
						}else if(p2.equip instanceof MagicWeap) {
							System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
							p1.hp-=this.p2ActPowerMagic;
						}
						Thread.sleep(1000);
						System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
					Thread.sleep(1000);
				}
			}
		}else {
			System.out.println(p2.name+"("+p2.getCName()+")"+"が先に動いた！");
			System.out.println(p2.name+"("+p2.getCName()+")"+"は正々堂々戦いを挑む！");
			if(p2.hp>0) {
				Thread.sleep(1000);
				System.out.println("\n"+p2.name+"("+p2.getCName()+")"+"の攻撃！");
				Thread.sleep(1000);
				double rand1=Math.random()*100;
				double rand2=Math.random()*100;

				if(this.p2ActHitRate>=rand1) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p2ActCritical>rand2) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p2.equip instanceof PhysicsWeap) {
						System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
						p1.hp-=this.p2ActPowerPhy*3;
						}else if(p2.equip instanceof MagicWeap) {
							System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
							p1.hp-=this.p2ActPowerMagic*3;
						}
						Thread.sleep(1000);
						System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p2.equip instanceof PhysicsWeap) {
						System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
						p1.hp-=this.p2ActPowerPhy;
						}else if(p2.equip instanceof MagicWeap) {
							System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
							p1.hp-=this.p2ActPowerMagic;
						}
						Thread.sleep(1000);
						System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
					Thread.sleep(1000);
				}
			}
			if(p1.hp>0) {
				System.out.println("\n"+p1.name+"("+p1.getCName()+")"+"の反撃！");
				Thread.sleep(1000);
				double rand3=Math.random()*100;
				double rand4=Math.random()*100;

				if(this.p1ActHitRate>=rand3) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p1ActCritical>rand4) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p1.equip instanceof PhysicsWeap) {
						System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
						p2.hp-=this.p1ActPowerPhy*3;
						}else if(p1.equip instanceof MagicWeap) {
							System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
							p2.hp-=this.p1ActPowerMagic*3;
						}
						Thread.sleep(1000);
						System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p1.equip instanceof PhysicsWeap) {
						System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
						p2.hp-=this.p1ActPowerPhy;
						}else if(p1.equip instanceof MagicWeap) {
							System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
							p2.hp-=this.p1ActPowerMagic;
						}
						Thread.sleep(1000);
						System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
					Thread.sleep(1000);
				}
			}
		}
		if(this.p1attackSpeed>(this.p2attackSpeed+4)){
			if(p1.hp>0&&p2.hp>0) {
				System.out.println("\n"+p1.name+"("+p1.getCName()+")"+"の追撃！");
				Thread.sleep(1000);
				double rand1=Math.random()*100;
				double rand2=Math.random()*100;

				if(this.p1ActHitRate>=rand1) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p1ActCritical>rand2) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p1.equip instanceof PhysicsWeap) {
						System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy*3+"のダメージ！");
						p2.hp-=this.p1ActPowerPhy*3;
						}else if(p1.equip instanceof MagicWeap) {
							System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic*3+"のダメージ！");
							p2.hp-=this.p1ActPowerMagic*3;
						}
						Thread.sleep(1000);
						System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p1.equip instanceof PhysicsWeap) {
						System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerPhy+"のダメージ！");
						p2.hp-=this.p1ActPowerPhy;
						}else if(p1.equip instanceof MagicWeap) {
							System.out.println(p2.name+"("+p2.getCName()+")"+"に"+this.p1ActPowerMagic+"のダメージ！");
							p2.hp-=this.p1ActPowerMagic;
						}
						Thread.sleep(1000);
						System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p2.name+"("+p2.getCName()+")"+"のHPは"+p2.hp+"!\n");
					Thread.sleep(1000);
				}
			}
		}
		if(this.p2attackSpeed>(this.p1attackSpeed+4)) {
			if(p2.hp>0&&p1.hp>0) {
				System.out.println("\n"+p2.name+"("+p2.getCName()+")"+"の追撃！");
				Thread.sleep(1000);
				double rand1=Math.random()*100;
				double rand2=Math.random()*100;

				if(this.p2ActHitRate>=rand1) {
					System.out.println("!!!!!hit!!!!!");
					if(this.p2ActCritical>rand2) {
						System.out.println("!!!!!!!!!!critical!!!!!!!!!!");
						Thread.sleep(1000);
						if(p2.equip instanceof PhysicsWeap) {
						System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy*3+"のダメージ！");
						p1.hp-=this.p2ActPowerPhy*3;
						}else if(p2.equip instanceof MagicWeap) {
							System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic*3+"のダメージ！");
							p1.hp-=this.p2ActPowerMagic*3;
						}
						Thread.sleep(1000);
						System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
						Thread.sleep(1000);
					}else {
						Thread.sleep(1000);
						if(p2.equip instanceof PhysicsWeap) {
						System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerPhy+"のダメージ！");
						p1.hp-=this.p2ActPowerPhy;
						}else if(p2.equip instanceof MagicWeap) {
							System.out.println(p1.name+"("+p1.getCName()+")"+"に"+this.p2ActPowerMagic+"のダメージ！");
							p1.hp-=this.p2ActPowerMagic;
						}
						Thread.sleep(1000);
						System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
						Thread.sleep(1000);
					}
				}else {
					System.out.println("miss!");
					Thread.sleep(1000);
					System.out.println(p1.name+"("+p1.getCName()+")"+"のHPは"+p1.hp+"!\n");
					Thread.sleep(1000);
				}
			}

		}

	}


	public void BattleSet(Fighter p1,Fighter p2,BattleField b) throws InterruptedException {

		if(this.p1attackSpeed>this.p2attackSpeed) {
			double rand=Math.random();
			if(rand<0.65) {
				Thread.sleep(1000);
				p1.changeEquip(p2.equip);
				Thread.sleep(1000);
			}else {
				Thread.sleep(1000);
				p2.changeEquip(p1.equip);
				Thread.sleep(1000);
			}
			p1.equip.three_way_relation(p2.equip);
			p2.equip.three_way_relation(p1.equip);
			b.reCalBattleStatus(p1, p2);
			if(p1.equip.range==1){
				if(p2.equip.range==2) {
					b.BattleTurnOneside(p1, p2);
				}else {
					b.BattleTurnCounter(p1, p2);
				}
			}
			if(p1.equip.range==2) {
				if(p2.equip.range==1) {
					b.BattleTurnOneside(p1, p2);
				}else {
					b.BattleTurnCounter(p1, p2);
				}
			}
			if(p1.equip.range==3) {
				if(p2.equip.range==3) {
					b.BattleTurnCounter(p1, p2);
				}else
					b.BattleTurnOneside(p1, p2);
			}
			p1.equip.three_way_relation_back(p2.equip);
			p2.equip.three_way_relation_back(p1.equip);
			b.reCalBattleStatus(p1, p2);


		}else {
			double rand=Math.random();
			if(rand<0.65) {
				Thread.sleep(1000);
				p2.changeEquip(p1.equip);
				Thread.sleep(1000);
			}else {
				Thread.sleep(1000);
				p1.changeEquip(p2.equip);

				Thread.sleep(1000);
			}
				p1.equip.three_way_relation(p2.equip);
				p2.equip.three_way_relation(p1.equip);
				b.reCalBattleStatus(p1, p2);
				if(p2.equip.range==1){
					if(p1.equip.range==2) {
						b.BattleTurnOneside(p1, p2);
					}else {
						b.BattleTurnCounter(p1, p2);
					}
				}
				if(p2.equip.range==2) {
					if(p1.equip.range==1) {
						b.BattleTurnOneside(p1, p2);
					}else {
						b.BattleTurnCounter(p1, p2);
					}
				}
				if(p2.equip.range==3) {
					if(p1.equip.range==3) {
						b.BattleTurnCounter(p1, p2);
					}else
						b.BattleTurnOneside(p1, p2);
				}
				p1.equip.three_way_relation_back(p2.equip);
				p2.equip.three_way_relation_back(p1.equip);
				b.reCalBattleStatus(p1, p2);


		}
	}
}

