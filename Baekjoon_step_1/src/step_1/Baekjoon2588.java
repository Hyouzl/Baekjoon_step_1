package step_1;
import java.util.*;

public class Baekjoon2588 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int num2 = b;
		int k = 1;
		int sum = 0;
		
		while (num2 > 0) {

		int i = num2 % 10;
		int j = a * i;
		
		System.out.println(j);
	
		
		sum += (j * k);
		
		k *= 10;
 		num2 /= 10;
		
		}
		
		System.out.println(sum);
		
	}

}
