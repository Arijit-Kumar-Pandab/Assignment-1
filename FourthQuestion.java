public class FourthQuestion {
    public static void main(String[] args) {
        print(14);
    }

    private static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - 1 || (j == 0 && i >= n / 2 - 1) || (j == n - 1 && i >= n / 2 - 1)
                        || (j <= i - n / 2 + 1) || (j >= (n - i + 5))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
