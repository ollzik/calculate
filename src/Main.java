import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    calculator.calculate("dJkLZNФдИR");
    int array [] = {2000000000, 2000000000};
    calculator.calculate(array);
    int inputArray[][] = {{0,0,1},{1,1,2},{2,2,3}};
    calculator.calculate(inputArray, "Hello world");
}
}