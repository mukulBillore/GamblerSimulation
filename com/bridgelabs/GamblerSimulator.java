package com.bridgelabs;

import java.util.Random;

public class GamblerSimulator {

	public static void main(String[] args) {

		int everyDayStake = 100;
		int everyGameBet = 1;
		int totelStakeLeft = 0;
		for (int i = 1; i <= 20; i++) {
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
			totelStakeLeft = everyDayStake;
		}System.out.println("The totel stake left after the completion of 20th day is : "+totelStakeLeft);
	}

}
