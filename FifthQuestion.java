public class FifthQuestion {
    public static void main(String[] args) {
        print(14);
    }

    private static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || (j > 0 && j < i - (n - 1) / 2 + 1)
                        || (j > 0 && j < (n / 2) - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
