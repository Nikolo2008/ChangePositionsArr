package Fundamentals;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] wagon = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            wagon[i] = people;
            sum += people;

        }
        for (int e : wagon) {
            System.out.printf("%d ",e);
        }
        System.out.println();
        System.out.print(sum);

    }
}
