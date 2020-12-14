package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int[] numbers = new int[lines];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(Arrays.stream(numbers).sum());

    }
}