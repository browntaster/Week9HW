import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {

        ArrayList<String> tubeNames = new ArrayList<>();

        tubeNames.add("Central Line");
        tubeNames.add("Northern Line");
        tubeNames.add("Piccadilly Line");

        if (tubeNames.isEmpty()) {
            System.out.println("The underground tube names list is empty.");
        } else {
            System.out.println("The underground tube names: ");
            for (String tubeName : tubeNames) {
                System.out.println(tubeName);
            }
        }
    }
}
