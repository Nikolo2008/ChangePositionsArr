package Fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] condensedArr = new int[numbersArr.length - 1];

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr.length == 1) {
                break;
            }
            if (i == numbersArr.length - 1) {
                int[] newArr = new int[condensedArr.length - 1];
                i = -1;
                numbersArr = condensedArr;
                condensedArr = newArr;
            } else {
                condensedArr[i] = numbersArr[i] + numbersArr[i + 1];
            }

        }
        System.out.println(numbersArr[0]);

    }
}
