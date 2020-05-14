/*package com.yedma.classes.inherit;

import java.util.Scanner;

import com.yedma.classes.statics.Account;

public class AddressExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Friend[] frnd = new Friend[100];
		
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("1.주소추가  2.주소록리스트  3.조회  4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택 > ");
			int menu = scn.nextInt(); scn.nextLine();

			if (menu==1) {
				System.out.println("1.친구 2.대학친구 3.회사친구 ");
				int submenu = scn.nextInt();
				System.out.println("이름를 입력하세요.");
				String Name = scn.nextLine();
				System.out.println("전화번호 입력하세요.");
				String Telnum = scn.nextLine();
				Friend friends = new Friend (Name,Telnum);
				for(int i=0; i<frnd.length; i++) {
					if(frnd[i]==null) {
					frnd[i] = friends;
					break;
			
			
			if (submenu == 1) {
				Company cpy = new Company (Name, Telnum, dept);
			}
			
			}else if (submenu == 2) {
				
				
				}
				System.out.println("주소가 추가되었습니다. ");
			}else if (menu==2) {
				System.out.println("주소록 리스트");
				//전체 배열값이 있는 경우에만 출력 ( 단, null은 제외 )
				for(Friend fri : Friend) {
					if(fri !=null) {
				
				}
					System.out.println("이름은 :" + fri.getName() + ", 전화번호는 : "
							+ fri.getTelnum());
					System.out.println("이름은 :" + fri.getName() + ", 전화번호는 : "
							+ fri.getTelnum() + "부서는: ");
					System.out.println("이름은 :" + fri.getName() + ", 전화번호는 : "
							+ fri.getTelnum()+ "전공은: ");
			}
			}else if (menu==3) {
				
					}
				}
				System.out.println("예금처리가 되었습니다.");
				
			}else if (menu==4) {
				System.out.println("종료 ");
				break;
					}
				}

		System.out.println("프로그램 종료");
	}
} */
