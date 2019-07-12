import java.util.Scanner;

public class TheNameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        int count = 0;
        for (String part : name.split(" ")) {
            bifty(part, count);
        }
    }

    public static void bifty(String name, int count) {
        System.out.println(String.format("%s %s, bo-B%s", name, name, name.substring(1)));
        System.out.println(String.format("Banana-fana fo-F%s", name.substring(1)));
        System.out.println(String.format("Fee-fi-mo-M%s", name.substring(1)));
        System.out.println(name.toUpperCase() + "!");
        if (count == 0) System.out.println();
    }
}
