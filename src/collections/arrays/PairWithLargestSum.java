package collections.arrays;

import java.util.Arrays;

public class PairWithLargestSum {
    // Input : arr = {5, 20, 110, 100, 10}, K = 85
    // Output : 20, 10

    public static void main(String[] args) {
        int[] arr = {5, 20, 110, 100, 10};
        int k = 25;
        Arrays.sort(arr);
        // {5,10,20,100,110}
        int max = 0;
        int sum = 0;
        int one = 0, two = 0;
        for (int i = 0; i < arr.length-1; i++) {
            sum = arr[i] + arr[i + 1];
            if (max < sum && sum < k) {
                max = sum;
                one = i;
                two = i + 1;
            }else {
                break;
            }
        }
        System.out.println(one + " - " + two);
    }


}
