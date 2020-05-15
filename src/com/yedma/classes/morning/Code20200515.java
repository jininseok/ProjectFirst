package com.yedma.classes.morning;

public class Code20200515 {

	public static void main(String[] args) {
		int[][]ary = new int[5][5];
		int cnt = 1;
		for (int i=1; i<=ary.length; i++) {
			for(int j=1; j<=ary[i].length; j++) {
				System.out.printf("%3d", ary[i][j]);
				ary[i][j] = cnt++;
			}
		}
	}
}
