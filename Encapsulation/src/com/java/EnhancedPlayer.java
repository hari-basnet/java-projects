package com.java;

public class EnhancedPlayer {
	private String name;
	private int health;
	private String weapon;
	
	public EnhancedPlayer(final String name, int health, String weapon) {
		this.name = name;
		
		if(health >0 && health <=100){
			this.health = health;
		}
		
		this.weapon = weapon;
	}
	
	public void looseHealth(int damage){
		this.health = this.health - damage;
		if(this.health <= 0){
			System.out.println("player knocked out");
		}
	}
	
	public int getHealth(){
		return health;
	}
}
