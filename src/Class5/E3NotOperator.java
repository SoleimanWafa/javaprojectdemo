package Class5;

import java.util.Scanner;

public class E3NotOperator {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the name of the country");
        String country=scanner.nextLine();

        if(!country.equals("Iran")){

            System.out.println("Welcome you are allowed");
        }


    }
}
