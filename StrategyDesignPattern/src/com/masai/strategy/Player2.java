package com.masai.strategy;

public class Player2 extends Fighter{

	public Player2(KickBehaviour kick, JumpBehaviour jump) {
		super(kick, jump);
	}

	@Override
	public void play() {
		System.out.println("Player2");
		
	}
}
