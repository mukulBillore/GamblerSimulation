package com.bridgelabs;

import java.util.Random;

public class GamblerSimulator {

	public static void main(String[] args) {

		// uc1
		int everyDayStake = 100;
		int everyGameBet = 1;

		//uc2 
		Random rand = new Random();
		int winOrLoose=rand.nextInt(2);
		
		if(winOrLoose==0) {
			//win
			everyDayStake=everyDayStake+1;
		}
		else {
			everyDayStake=everyDayStake-1;
		}
		
		
	}

}
