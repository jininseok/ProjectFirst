package com.yedma.dev;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null; //배열
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택>");

			int selectNO = scanner.nextInt(); scanner.nextLine();

			if (selectNO == 1) {
				System.out.print("학생수를 입력하세요.");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				System.out.println("배열이 생성되었습니다.");
			} else if (selectNO == 2) {
				int i = 0;
				for (int score : scores) {
					System.out.print("점수를 입력하세요.");
					score = scanner.nextInt();
					scores[i++] = score;
				}
			} else if (selectNO == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("score[" + i + "]" + scores[i]);
				}
			} else if (selectNO == 4) {
				// 합계,평균
				int sum = 0;
				int cnt = 0;
				for (int score : scores) {
					sum += score;
					cnt++;
				}
				double avg = (double) sum / cnt; // cnt
				int maxValue = Integer.MIN_VALUE;
				for (int i=0; i < scores.length; i++) {
					if (scores[i] >= maxValue)
						maxValue = scores[i];
				}
				System.out.println("합계는:" + sum);
				System.out.printf ("평균:" + "%.1f", avg); //소수점 버리기, %f =실수 (포맷문자)
				System.out.println(); //printf를 적어줘서 줄바꿈을 위해 ln한번더
				System.out.println("최고점수는:" + maxValue);
					
			} else if (selectNO == 5) {
				run = false;
			} // int

		} // while

		System.out.println("end of program.");
	} // main
}
// class
