package com.masai.strategy;

public class Main {

	public static void main(String[] args) {
		JumpBehaviour shortJump = new ShortJump();
		JumpBehaviour LongJump = new LongJump();
		KickBehaviour tornadoKick = new TornadoKick();
		// Make a fighter with desired behaviors
		Fighter player1 = new Player1(tornadoKick,shortJump);
		player1.play();
		// Test behaviors
		player1.punch();
		player1.kick();
		player1.jump();
	}

}
