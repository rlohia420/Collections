package collections.arrays.sortings;

public class FindElementsInSorted2DArray {

    public static void main(String args[]) {
        int k = 401;
        int[][] arr = {{100,200,300,400},{201,204,244,264},{301,302,332,380},{401,404,440,460}};
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                System.out.print(arr[i][j] + " ");
            }System.out.println(" ");
        }
           for(int i=0,j=3;j>=0 && i<4;) {
               if(k==arr[i][j]) {
                   System.out.println(" index "+i +"-"+j);
                   break;
               }else if(k>arr[i][j]) {
                   i++;
               }else {
                   j--;
               }
       }
    }

}
