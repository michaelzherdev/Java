package phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(1);
		int curPhase;
		
		System.out.println("Threads running...");
		
		new MoiThread(phaser, "A");
		new MoiThread(phaser, "B");
		new MoiThread(phaser, "C");
		
		curPhase = phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " is finished");
		
		curPhase = phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " is finished");
		
		curPhase = phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " is finished");
		
		phaser.arriveAndDeregister();
		
		if(phaser.isTerminated())
			System.out.println("Phaser is ended");
	}
}
