package Class5;

public class E10Switch {

    public static void main(String[] args) {

        int day=6;

        switch (day) {
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");

                System.out.println("Wrong day");
                break;
            default:
                System.out.println("Wrong day");
                break;
        }
    }
}
