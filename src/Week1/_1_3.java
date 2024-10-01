package Week1;

public class _1_3 {
    public static void main(String[] args) {
        double[] arr2 = new double[4];
        float[] arr1 = {1.1f, 2.3f, 4.7f, 7.5f};
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
