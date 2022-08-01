class Problem3 {
    public static void main(String[] args) {
        int n = 13;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            }
            int k=0;
            if (i > 1 && i <= n / 2) {
                for (int j = 1; j <= ((n / 2) - i) + 1; j++) {
                    if (j == 1) {
                        System.out.print("*");
                    }
                    System.out.print("*");
                }
                for (k = 1; k <= (i * 2) - 3; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= ((n/2)-i)+2; j++) {
                    System.out.print("*");
                }

            }
            if (i > n / 2 && i != n) {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}