public class JavaReference {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("张三");

        Person p2 = p1;
        p2.setName("李四");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
