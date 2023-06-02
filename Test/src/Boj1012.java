import java.util.*;

public class Boj1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int bug = 0;
            int[][] arr = new int[x][y];
            for (int j = 0; j < k; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a][b] = 1;
                if (a == 0) {
                    if (b == 0) {
                        if (arr[a][b + 1] != 1 && arr[a + 1][b] != 1) {
                            bug++;
                        }
                    } else if (b == y - 1) {
                        if (arr[a][b - 1] != 1 && arr[a + 1][b] != 1) {
                            bug++;
                        }
                    } else {
                        if (arr[a][b + 1] != 1 && arr[a + 1][b] != 1 && arr[a][b - 1] != 1) {
                            bug++;
                        }
                    }
                } else if (a == x - 1) {
                    if (b == 0) {
                        if (arr[a][b + 1] != 1 && arr[a - 1][b] != 1) {
                            bug++;
                        }
                    } else if (b == y - 1) {
                        if (arr[a][b - 1] != 1 && arr[a - 1][b] != 1) {
                            bug++;
                        }
                    } else {
                        if (arr[a][b + 1] != 1 && arr[a - 1][b] != 1 && arr[a][b - 1] != 1) {
                            bug++;
                        }
                    }
                } else {
                    if (b == 0) {
                        if (arr[a - 1][b] != 1 && arr[a + 1][b] != 1 && arr[a][b + 1] != 1) {
                            bug++;
                        }
                    } else if (b == y - 1) {
                        if (arr[a - 1][b] != 1 && arr[a + 1][b] != 1 && arr[a][b - 1] != 1) {
                            bug++;
                        }
                    } else if (arr[a][b - 1] != 1 && arr[a][b + 1] != 1 && arr[a + 1][b] != 1 && arr[a - 1][b] != 1) {
                        bug++;
                    }
                }
            }
            System.out.println(bug);
        }
    }
}
