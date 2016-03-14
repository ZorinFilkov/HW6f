import java.util.Arrays;
import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(sum);

		
		int size = in.nextInt();
		int b[] = new int[size];
		b[0] = 1;
		b[1] = 1;
		for (int i = 2; i < b.length; i++) {
			b[i] = b[i - 1] + b[i - 2];
		}
		System.out.println(Arrays.toString(b));
		
		
		int c[] = new int[10];
		for (int i = 0; i < c.length; i++) {
			c[i] = i * 10;
		}
		System.out.println(Arrays.toString(c));
		
		
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}

}
