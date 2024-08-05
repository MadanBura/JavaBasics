package Control_Statement;

public class Continue_Statement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skip the rest of the loop for even numbers
            }
            System.out.println("i: " + i);
        }
    }
}
