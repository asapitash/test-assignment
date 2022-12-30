import java.util.Arrays;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        calc();
    }

    static Scanner scanner = new Scanner(System.in);

    public static int calc() {
            while (true) {
                String op1 = "+";
                String op2 = "-";
                String op3 = "*";
                String op4 = "/";
                String[] Roma = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                String[] Arab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

                Scanner s1 = new Scanner(System.in);
                System.out.println("Введите выражение: ");
                String summ = s1.nextLine();
                String[] myArray = summ.split(" ");
                String num1 = myArray[0];
                String num2 = myArray[2];
                String op = myArray[1];
                if (myArray.length != 3) {
                    throw new ArithmeticException();
                }

                String [] numbers = {num1, num2};
                if (Arrays.asList(Roma).containsAll(Arrays.asList(numbers))) {
                    int num1r = Roman.valueOf(num1).ordinal();
                    int num2r = Roman.valueOf(num2).ordinal();

                    if (num1r > 10) {
                        throw new ArithmeticException();
                    } else if (num2r > 10) {
                        throw new ArithmeticException();
                    } else if (op.equals(op1)) {
                        int result1 = num1r + num2r;
                        Roman result = Roman.values()[result1];
                        System.out.println(result);
                        return result.ordinal();
                    } else if (op.equals(op2)) {
                        int result1 = num1r - num2r;
                        if (result1 <= 0) {
                            throw new ArithmeticException();
                        } else {
                            Roman result = Roman.values()[result1];
                            System.out.println(result);
                            return result.ordinal();
                        }
                    } else if (op.equals(op3)) {
                        int result1 = num1r * num2r;
                        Roman result = Roman.values()[result1];
                        System.out.println(result);
                        return result.ordinal();
                    } else if (op.equals(op4)) {
                        int result1 = num1r / num2r;
                        Roman result = Roman.values()[result1];
                        System.out.println(result);
                        return result.ordinal();
                    }
                } else if (Arrays.asList(Arab).containsAll(Arrays.asList(numbers))) {
                    int num1a = Integer.parseInt(num1.trim());
                    int num2a = Integer.parseInt(num2.trim());

                    if (num1a > 10) {
                        throw new ArithmeticException();
                    } else if (num2a > 10) {
                        throw new ArithmeticException();
                    } else if (op.equals(op1)) {
                        int result = num1a + num2a;
                        System.out.println(result);
                        return result;

                    } else if (op.equals(op2)) {
                        int result = num1a - num2a;
                        System.out.println(result);
                        return result;

                    } else if (op.equals(op3)) {
                        int result = num1a * num2a;
                        System.out.println(result);
                        return result;

                    } else if (op.equals(op4)) {
                        int result = num1a / num2a;
                        System.out.println(result);
                        return result;
                    }
                }
                    else {
                        throw new ArithmeticException();
                    }
                }
            }}

