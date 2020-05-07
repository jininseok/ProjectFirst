package com.yedma.dev;

public class ArrayExample2 {

	public static void main(String[] args) {
//		int[] intAry = { 1,2,3,4 };
//		int[] intAry2 = new int[5];
//		intAry2 = new int[] { 1,2,3,4 };
		
		int[][] intAry3 = new int [3][3];
		intAry3[0] = new int [] { 1,2,3 };
		intAry3[1] = new int [] { 4,5,6,6,6 };
		intAry3[2] = new int [] { 7,8,9,3,3,3 };
		System.out.println("intAry3크기: " + intAry3.length);
		System.out.println("intAry3[0]크기: " + intAry3[0].length);
		System.out.println("intAry3[1]크기: " + intAry3[1].length);
		System.out.println("intAry3[2]크기: " + intAry3[2].length);

		
		intAry3[0][0] = 1;
		intAry3[0][1] = 2;
		intAry3[0][2] = 3;

		intAry3[1][0] = 4;
		intAry3[1][1] = 5;
		intAry3[1][2] = 6;
		
		intAry3[2][0] = 7;
		intAry3[2][1] = 8;
		intAry3[2][2] = 9;
		
		for (int i=0; i< intAry3.length; i++) {
			for (int j=0; j<intAry3[i].length; j++) {
				System.out.println(intAry3[i][j] + " ");
			}
			System.out.println();
		}

		/*String result = getString("Hello", "World");
		System.out.println(result);
		
		[] = 배열기호

		String[] ary = { "Lee", "Kim", "Park", "Choi"," Han" };
		System.out.println(getString(ary));
		
		//System.out.println(getLargeValue(10, 20,15));
		
		//getLargeValue (new int[] {3,6,2,9,10});

	}
	public static String getString(String str1, String str2 ) {
		return str1 + " - " + str2;
	}
	
	public static String getString(String[] strary) {
		String result = "";
		for (int i=0; i< strary.length; i++) {
			result += strary[i] + " - ";
		}
		return result;
	}

	public static int getLargeValue(int[] ary) {
		int maxValue = Integer.MIN_VALUE;
		for (int i=0; i < ary.length; i++) {
			if (ary[i] >= maxValue)
				maxValue = ary[i];
		}
		
		return maxValue;
	}

	public static int getLargeValue(int a, int b, int c) {
		int maxValue = Integer.MIN_VALUE;
		if (a >= maxValue)
			maxValue= a;
		if (b >= maxValue)
			maxValue= b;
		if (c >= maxValue)
			maxValue= c;
		return maxValue;*/
	
	}

}
