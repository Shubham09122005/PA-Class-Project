public class toggle{

    public static void main(String[] args) {

        String str = "JaVa";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                System.out.print((char)(ch + 32));
            }
            else if (ch >= 'a' && ch <= 'z') {
                System.out.print((char)(ch - 32));
            }
        }
    }
}