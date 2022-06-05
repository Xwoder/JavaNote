import java.util.ArrayList;

public class ArrayList_ {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Swift");
        list.add("Objective-C");
        System.out.println(list);

        boolean result = list.remove("C++");
        System.out.println(result);
        System.out.println(list);

        String obj_removed = list.remove(1);
        System.out.println(obj_removed);
        System.out.println(list);

        String obj_set = list.set(0, "JavaScript");
        System.out.println(obj_set);
        System.out.println(list);


        String obj_get = list.get(0);
        System.out.println(obj_get);
        System.out.println(list);
    }

}
