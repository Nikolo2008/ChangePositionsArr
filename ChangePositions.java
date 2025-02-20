package Fundamentals;

import java.util.Scanner;

public class ChangePositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");

        for (int i = 0; i < inputArray.length / 2; i++) {
            String oldPosition = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i - 1];
            inputArray[inputArray.length - 1 -i] = oldPosition;
        }
        System.out.println(String.join(" ", inputArray));

    }
}
