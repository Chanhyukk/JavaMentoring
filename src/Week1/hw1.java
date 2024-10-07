package Week1;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        double v, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("전압을 입력하세요: ");
        v = sc.nextDouble();
        System.out.print("저항을 입력하세요: ");
        r = sc.nextDouble();
        double w = Math.pow(v,2) / r;
        double dbm = 10 * Math.log10(w) + 30;
        System.out.printf("데시벨 밀리와트: %.1f\n", dbm);
    }
}
