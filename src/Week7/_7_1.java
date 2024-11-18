package Week7;

public class _7_1 {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] ints : arr) {
            for (int j : ints) {
                System.out.print((j > 50 ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}
