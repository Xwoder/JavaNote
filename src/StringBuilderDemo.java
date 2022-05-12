public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 链式调用
        sb.append("abc").append(123);
        sb.append("def").append(456);

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);
    }
}
