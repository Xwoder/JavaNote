import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        sj.add("abc").add("def").
                add("ghi").add("jkl")
                .add("mno").add("pqr")
                .add("stu").add("vwx")
                .add("yz");

        System.out.println(sj);
    }

}
