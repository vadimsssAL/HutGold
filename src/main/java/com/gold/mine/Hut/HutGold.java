package com.gold.mine.Hut;

public class HutGold extends Thread {
	private volatile int goldMine = 1000;
	private String name = "Gold Mine";

	public HutGold(String name) {
		this.name = name;
		new Thread(this).start();
	}

	synchronized public int getGoldMine() {
		return goldMine;
	}

	public void setGoldMine(int goldMine) {
		this.goldMine = goldMine;
	}

	synchronized public void getInfoGolg() {
		System.out.println("In the mine left - " + goldMine + " Gold");
	}

	@Override
	public void run() {
			while (goldMine > 0) {
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				goldMine -= 3;
			}
			if (goldMine <= 0)
				System.out.println("Gold mine is empty!");
		}
}