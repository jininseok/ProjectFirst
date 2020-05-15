package com.yedma.classes.morning;

public class cod2 {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
		intAry[0] = new int[] { 1, 2, 3, 4, 5 };
		intAry[1] = new int[] { 6, 7, 8, 9, 10 };
		intAry[2] = new int[] { 11, 12, 13, 14, 15 };
		intAry[3] = new int[] { 16, 17, 18, 19, 20 };
		intAry[4] = new int[] { 21, 22, 23, 24, 25 };

		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				System.out.print(intAry[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("==================================");
		System.out.println();

		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				System.out.print(intAry[j][i] + " ");
			}
			System.out.println();
		}
	}

}
