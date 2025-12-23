import java.util.Scanner;

public class Замінаслів {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String text = sc.nextLine();

        String[] badWords = {"bad", "ugly", "stupid"};

        for (int i = 0; i < badWords.length; i++) {
            text = text.replace(badWords[i], "***");
        }

        System.out.println("Результат: " + text);
    }
}
