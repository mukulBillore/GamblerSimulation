package com.bridgelabs;

import java.util.Random;

public class GamblerSimulator {

	public static void main(String[] args) {

		int everyDayStake = 100;
		int everyGameBet = 1;
//uc3
		while (everyDayStake != 50 || everyDayStake != 150) {
			Random rand = new Random();
			int winOrLoose = rand.nextInt(2);

			if (winOrLoose == 0) {
				// win
				everyDayStake = everyDayStake + 1;
			} else {// loose
				everyDayStake = everyDayStake - 1;
			}
		}

	}

}
