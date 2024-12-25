import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    int count = calculator.calculate("dJkLZNФдИR");
    System.out.println(count);
    int[] array= {2000000000, 2000000000};
    long sum = calculator.calculate(array);
    System.out.println(sum);
    int inputArray[][] = {{0,0,1},{1,1,2},{2,2,3}};
    char [][] outputArray = calculator.calculate(inputArray, "Hello world");
    for (int i = 0; i < outputArray.length; i++) {
        for (int j = 0; j < outputArray[i].length; j++) {
            System.out.print(outputArray[i][j]);
        }
    }
}
}