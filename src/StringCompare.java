public class StringCompare {
    public static void main(String[] args) {
        final String s1 = new String("abc");
        final String s2 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
