import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            System.out.println(calc(input));
        } catch (Exception e) {
            System.out.println("throws Exception");
        }

        scanner.close();
    }

    public static String calc(String input) throws Exception{
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new Exception();
        }

        int a, b;
        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new Exception();
        }

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception();
        }

        int result;
        switch (parts[1]) {
            case ("+"):
                result = a + b;
                break;
            case("-"):
                result = a - b;
                break;
            case("*"):
                result = a * b;
                break;
            case("/"):
                result = a / b;
                break;
            default:
                throw new Exception();
        }

        return "" + result;
    }
}