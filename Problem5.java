
public class Problem5 {
    public static void main(String[] args) {
        int n = 14;
        for (int i = 0; i < n; i++) {

            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }
            if (i > 0 && i < n / 2) {

                for (int j = 0; j < (n / 2) - i; j++) {
                    System.out.print("*");
                }
            }

            if(i>=n/2 && i<n-1){
                for (int j = 0; j < (i-(n/2)+2); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();

        }

    }
}
