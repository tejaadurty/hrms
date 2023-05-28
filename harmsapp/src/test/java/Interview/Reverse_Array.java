package Interview;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// converting array to List
		List<Integer> list = Arrays.asList(arr);		
		ArrayList<Integer> al = new ArrayList<>();
		// adding List to ArrayList
		al.addAll(list);
		System.out.println(al);
		// Method 1
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);

		// Method 2 simple loop
		String k = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			k += arr[i] + " ";
		}

		System.out.println(k);

	}

}
