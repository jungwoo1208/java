import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

class Division {
    public void divide() throws DivisionByZeroException {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (b == 0) {
            throw new DivisionByZeroException("두 번째 정수가 0입니다.");
        }
        System.out.println("결과: " + (double)a / b);
    }
}
public class Main {
    public static void main(String[] args) {
        Division division = new Division();
        try {
            division.divide();
        } catch (DivisionByZeroException e) {
            System.out.println("예외 메시지: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
