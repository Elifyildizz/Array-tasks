import java.util.*;

public class StringComma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sentence will you write: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        String[] words = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }
        System.out.print("Array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(words[i]);
            if (i != count - 1) {
                System.out.print(", ");
            }
        }
    }
}
