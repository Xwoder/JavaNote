import java.util.Scanner;

public class StringTraverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            final char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
