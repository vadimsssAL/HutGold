package com.gold.mine.Hut;

import java.util.concurrent.TimeUnit;

public class MainHut {

	public static void main( String[] args ){
    	HutGold hutGold = new HutGold("Gold Mine");
    	Mine mine = new Mine();
    	while (hutGold.getGoldMine() > 0) {
    		hutGold.getInfoGolg();
    		try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    	System.out.println("Gold mine is empty!");
       
    }

	
}
