import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String m = sc.next();
        int a = Integer.parseInt(m.substring(0, 1));
        int b = Integer.parseInt(m.substring(1, 2));
        int c = Integer.parseInt(m.substring(2, 3));
        int d = Integer.parseInt(m);
        System.out.println(n * c);
        System.out.println(n * b);
        System.out.println(n * a);
        System.out.println(n * d);

    }
}
