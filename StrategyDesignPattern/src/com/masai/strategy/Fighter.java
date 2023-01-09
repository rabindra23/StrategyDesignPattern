package com.masai.strategy;

public abstract class Fighter {

	private KickBehaviour kickBehaviour;
	private JumpBehaviour jumpBehaviour;
	
	public Fighter(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
		super();
		this.kickBehaviour = kickBehaviour;
		this.jumpBehaviour = jumpBehaviour;
	}
	
	public void punch(){
		System.out.println("Default punch");
	}
	
	public void roll(){
		System.out.println("Default roll...");
	}
	
	public void jump(){
		jumpBehaviour.jump();
	}
	
	public void kick(){
		kickBehaviour.kick();
	}
	
	public abstract void play();

	

	
}
