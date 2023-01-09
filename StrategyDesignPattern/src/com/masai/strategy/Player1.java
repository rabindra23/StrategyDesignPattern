package com.masai.strategy;

public class Player1 extends Fighter{

	public Player1(KickBehaviour kick, JumpBehaviour jump) {
		super(kick, jump);
	}

	@Override
	public void play() {
		System.out.println("Player1");
		
	}

}
