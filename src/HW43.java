import java.util.Scanner;

public class HW43 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Введите предложение");
		 String arr ;
		 arr = scan.nextLine();
		 System.out.println("Количество строк = " +arr.split(" ").length);
       scan.close();
	}

}
