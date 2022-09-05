package step_1;

import java.util.*;

public class Baekjoon3003 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int king = scan.nextInt();
		int queen = scan.nextInt();
		int look = scan.nextInt();
		int bishop = scan.nextInt();
		int knight = scan.nextInt();
		int pwun = scan.nextInt();
		
		if (king > 1) {
			System.out.println(-(king - 1));
		}
		else if (king < 1) {
			System.out.println(1 - king);
		}
		else System.out.println(0);
		
		if (queen > 1) {
			System.out.println(-(queen - 1));
		}
		else if (queen < 1) {
			System.out.println(1 - queen);
		}
		else System.out.println(0);
		
		if (look > 2) {
			System.out.println(-(look - 2));
		}
		else if (look < 2) {
			System.out.println(2 - look);
		}
		else System.out.println(0);
		
		if (bishop > 2) {
			System.out.println(-(bishop - 2));
		}
		else if (bishop < 2) {
			System.out.println(2 - bishop);
		}
		else System.out.println(0);
		
		if (knight > 2) {
			System.out.println(-(knight - 2));
		}
		else if (knight < 2) {
			System.out.println(2 - knight);
		}
		else System.out.println(0);
		
		if (pwun > 8) {
			System.out.println(-(pwun - 8));
		}
		else if (pwun < 8) {
			System.out.println(8 - pwun);
		}
		else System.out.println(0);
		
		scan.close();
	}

}
