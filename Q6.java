import java.util.HashSet;

public class Q6 {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);

        System.out.println("Numbers between 1 to 10 in the set: ");
        for (int i = 1; i<=10; i++){
            if (numbers.contains(i)) {
                System.out.println(i+ " is in the set!");
            } else {
                System.out.println(i+ " is not in the set!");
            }
        }
    }
}
