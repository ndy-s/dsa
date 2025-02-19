package hendys.algorithms;

public class App {

    public static void main(String[] args) {

        String text = "A";

        for (char c : text.toCharArray()) {
            System.out.println(c - 'a' + 3);
        }

    }
}
