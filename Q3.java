import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>();

        names.add("Blue");
        names.add("Black");
        names.add("Pink");
        names.add("Purple");
        names.add("Yellow");
        names.add("Green");

        System.out.println("Colors in the list: ");

        for (String name :names) {
            System.out.println(name);
        }
    }
}
