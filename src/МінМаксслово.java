import java.util.Scanner;

public class МінМаксслово {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");

        String min = words[0];
        String max = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < min.length()) {
                min = words[i];
            }
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }

        System.out.println("Найкоротше слово: " + min + " (" + min.length() + ")");
        System.out.println("Найдовше слово: " + max + " (" + max.length() + ")");
    }
}