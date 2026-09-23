public class Pattern {

    public static void main(String[] args) {

        int m = 5;

        for (int i = 1; i <= m; i++) {

            if (i <= 3) {

                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }

            } else {

                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}