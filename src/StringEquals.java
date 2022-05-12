public class StringEquals {
    public static void main(String[] args) {
        final String s1 = new String("abc");
        final String s2 = new String("abc");
        System.out.println(s1 == s2); /* false */
        System.out.println(s1.equals(s2)); /* true */

        final String s3 = "abc";
        final String s4 = "abc";
        System.out.println(s3 == s4);/* true */
        System.out.println(s3.equals(s4));/* true */

        final String s5 = new String("abc");
        final String s6 = "abc";
        System.out.println(s5 == s6); /* false */
        System.out.println(s5.equals(s6)); /* true */

    }
}
