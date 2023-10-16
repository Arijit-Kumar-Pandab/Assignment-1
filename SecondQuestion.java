public class SecondQuestion {
    public static void main(String[] args) {
        print(4);
    }

    private static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
