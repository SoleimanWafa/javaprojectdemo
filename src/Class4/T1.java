package Class4;

public class T1 {

    public static void main(String[] args) {

        boolean degree=true;
        double gpaScore=3.6;


        if (degree==true) {
            System.out.println("You should say congratulations");
            if (gpaScore>=3.5) {
                System.out.println("You are eligible for scholarship");
            }else
                System.out.println("You should have studied harder");

        } else
            System.out.println("Get a degree");
        }
    }

