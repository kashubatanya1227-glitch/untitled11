import java.util.Scanner;

public class Паліндром  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String text = sc.nextLine();

        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }

        if (text.equals(rev)) {
            System.out.println("Рядок є паліндромом");
        } else {
            System.out.println("Рядок не є паліндромом");
        }
    }
}