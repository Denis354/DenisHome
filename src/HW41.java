//написать метод, который принимает массив целых чисел и возвращает максимальное
public class HW41 {

	public static void main(String[] args) {
		
		int[] arr = {5,6,100,89,34,1656,127,283892};
		 int max = 0;
	        
	        for (int i = 0; i < arr.length; i++) {
	            int arr1 = arr[i];
	            if (max < arr1) {
	                max = arr1;
	                
	            }
	        }
	 
	        System.out.println(max);
		
		}
}
