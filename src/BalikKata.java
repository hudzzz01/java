import java.util.Scanner;

public class BalikKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan input anda : ");
        String myInput = scanner.nextLine();
        String result = "";
        for (int i = myInput.length()-1; i >= 0; i--) {
            result += myInput.charAt(i);

        }

        System.out.println(result);
    }
}
