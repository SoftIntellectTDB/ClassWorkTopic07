import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		/*
		 * Напишете програма, която пълни двумерен масив с размер 4х4, с числата
		 * от n до n-15.
		 */
		int n = 1 + (int) (Math.random() * 10);
		int a[][] = new int[4][4];
		for (int j = 0, k = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++, k++) {
				a[i][j] = n + k;
			}
		}
		System.out.println(n);
		System.out.println();

		/*
		 * Отпечатайте я на екрана в табличен вид.
		 */
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		/*
		 * Напишете програма, която пълни двумерен масив с размер 4х4. Пълненето
		 * става хоризонтално. Обходете повторно матрицата и умножете всички
		 * нечетни числа по 2, така че всички числа да станат четни или 0.
		 */
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				if (a[i][j] % 2 == 1) {
					a[i][j] = a[i][j] * 2;
				}
			}
		}
		
		System.out.println();
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
