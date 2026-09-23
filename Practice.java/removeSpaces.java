public class removeSpaces {

    public static void main(String[] args) {

        String str = "My Name is Shubham";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                System.out.print(ch);
            }
        }
    }
}