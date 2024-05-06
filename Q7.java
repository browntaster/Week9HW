import java.util.HashMap;

public class Q7 {
    public static void main(String[] args) {

        HashMap<Integer, String>people = new HashMap<>();

        people.put(23, "Smeet");
        people.put(26, "Nirav");
        people.put(25, "Miraj");
        people.put(24, "Vishwa");

        System.out.println("Value from the map: ");
        for (String name:people.values()) {
            System.out.println(name);
        }
    }
}
