package week05dt;

import java.util.ArrayList;
import java.util.List;

public class Q02_List02 {
    public static void main(String[] args) {
        /*
        Create an integer array with 5 elements
		 * Convert to a list
		 * Add 11, and 13 into the list, 11 will be at the beginning, 13 will be at index 3
		 * Increase the value of every element by 3
		 * Print the multiplication of the elements from index 2 to index 5
         */
        int arr[] = {5, 2, 3, 1, 5};
        List<Integer> lists1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            lists1.add(arr[i]);
        }
        System.out.println(lists1);
        lists1.add(0, 11);
        lists1.add(3, 13);
        for (int i = 0; i < lists1.size(); i++) {
            lists1.set(i, lists1.get(i) + 3);
        }
        System.out.println(lists1);
        int product = 1;
        for (int i = 2; i <= 5; i++) {
            product *= lists1.get(i);

        }
        System.out.println(product);
    }


}

