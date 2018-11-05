package com.gold.mine.Hut;

import java.util.ArrayList;

public class Mine extends Thread {

	private int working;
	private int i;
	HutGold hutGold;
	private  ArrayList<HutGold> workingList = new ArrayList<HutGold>();

	public Mine() {
		for (int i = 0; i < 5; i++) {
			workingList.add(new HutGold("working" + i));
		}
		new Thread(this).start();
	}

	@Override
	public void run() {
			while (hutGold.getGoldMine() > 0) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				String workingName = "working#" + ++working;
				workingList.add(new HutGold(workingName));
				System.out.println(workingName + " new worker");
			}
	}
}
