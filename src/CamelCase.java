import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String text = sc.nextLine();

        String[] parts = text.split("[-_]");
        String result = parts[0].toLowerCase();

        for (int i = 1; i < parts.length; i++) {
            result += parts[i].substring(0,1).toUpperCase()
                    + parts[i].substring(1).toLowerCase();
        }

        System.out.println("CamelCase: " + result);
    }
}
