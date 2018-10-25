import java.util.Arrays;

import java.util.stream.Stream;

public class HW44 {

	public static void main(String[] args) {
		String[] arr = {"hello", "fasd", "sd","s","aa","adsad"}; 
		
			
		String[] arr1 = Stream.of(arr)
			.filter(str -> str.length() > 3)
			.toArray(String[]::new);
				
			 
		System.out.println(Arrays.toString(arr1));

	}

}
