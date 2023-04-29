package demo02;

import java.awt.*;
import java.util.Scanner;

// 最大连续子数组和
public class MyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int sum = a[0], max = a[0];
        for (int i = 1; i < n; i++) {
            sum += a[i];
            if (sum < a[i]) {
                sum = a[i];
            }
            max = Math.max(sum, max);
        }
        if (max < 0) max = 0;
        System.out.println(max);
    }
}
