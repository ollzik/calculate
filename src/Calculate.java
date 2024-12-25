import java.util.Scanner;
class Calculator {
    public int calculate(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (('а' <= str.charAt(i)) && 'п' >= str.charAt(i) || ('А' <= str.charAt(i)) && 'П' >= str.charAt(i) || ('a' <= str.charAt(i)) && 'm' >= str.charAt(i) || ('A' <= str.charAt(i)) && 'M' >= str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public long calculate(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) { // вот это да нахуй, че за гений сидит за монитором
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public char[][] calculate(int[][] inputArray, String str) {
        char[][] outputArray = new char[inputArray.length][];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = new char[inputArray[i].length];
            for (int j = 0; j < inputArray[i].length; j++) {
                outputArray[i][j] = str.charAt(inputArray[i][j]);
            }
        }
        return outputArray;
    }
}