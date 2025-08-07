package Patterns;

public class patternL {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1) {
                    System.out.print("* ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
