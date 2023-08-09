package Class5;

import java.util.Scanner;

public class T5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your country");
        String country = scanner.nextLine();
        country=country.toLowerCase();

        switch (country) {
            case ("usa"):
                System.out.println("English");
                break;
            case ("mexico"):
                System.out.println("Spanish");
                break;
            case ("france"):
                System.out.println("French");
                break;
            case ("afghanistan"):
                System.out.println("Dari");
                break;
            case ("uzbekistan"):
                System.out.println("Uzbek");
                break;
            case ("iran"):
                System.out.println("Farsi");
                break;
            case ("pakistan"):
                System.out.println("Urdu");
                break;
            default:
                System.out.println("Bullshit language");
                break;
        }
    }
}
