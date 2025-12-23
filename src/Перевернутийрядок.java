import java.util.Scanner;

public class Перевернутийрядок {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String text = sc.nextLine();

        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }

        System.out.println("Перевернутий рядок: " + result);
    }
}
