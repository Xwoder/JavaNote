import java.util.Scanner;

public class StringLetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int capitalLetterCount = 0;
        int smallLetterCount = 0;
        int digitLetterCount = 0;

        for (int i = 0; i < str.length(); i++) {
            final char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ++capitalLetterCount;
            } else if (ch >= 'A' && ch <= 'Z') {
                ++smallLetterCount;
            } else if (ch >= '0' && ch <= '9') {
                ++digitLetterCount;
            }
        }

        System.out.println("capitalLetterCount: " + capitalLetterCount);
        System.out.println("smallLetterCount: " + smallLetterCount);
        System.out.println("digitLetterCount: " + digitLetterCount);
    }
}
