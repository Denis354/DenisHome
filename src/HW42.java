import java.util.Scanner;

//написать метод, который рисует прямоугольник из плюсиков. Входными параметрами будут два числа - ширина и высота
public class HW42 {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите ширину = ");
		  int m =scan.nextInt();
		System.out.println("Введите высоту = ");
	        int n = scan.nextInt();
	        scan.close();
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                if (i == 0 || i == n - 1) {
	                    System.out.print('*');
	                } else {
	                    if (j == 0 || j == m - 1) {
	                        System.out.print('*');
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	            }
	System.out.print("\n\r");
	        }
	}
}
