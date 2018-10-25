import java.util.Scanner;

public class HW31 {

	public static void main(String[] args) {
		
		int b = 0;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите высоту = ");
		b = scan.nextInt();
		scan.close();
	
		
		
		
		for (int i = 0; i < b ;i++) {
			for (int a = 0; a<=i; a++) {
			System.out.print("*");
			}
			System.out.println("");
		}
	
		for (int i = b -1; i > 0; i--) {
			for (int a = i; a > 0; a--) {
				System.out.print("*");
		}
			System.out.println("");
		}
			}
		
	}


