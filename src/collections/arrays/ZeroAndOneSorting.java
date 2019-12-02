package collections.arrays;

import java.util.Arrays;

public class ZeroAndOneSorting {

    public static void main(String args[]) {
        int[] a = {0,1,0,0,1,1,0,1,1};
        System.out.println(sort(a));
        Arrays.stream(sort(a)).forEach(System.out::print);
    }
    public static int[] sort(int[] a) {
        int l = 0; int h=a.length-1;
        while(l<h) {
            while(a[l]==0 && l<h) {
                l++;
            }while(a[h]==1 && l<h) {
                h--;
            }
            if(l<h) {
                int temp = a[l];
                a[l] = a[h];
                a[h] =temp;
                l++;h--;
            }
        }
        return a;
    }

}
