package Class5;

import java.util.Scanner;

public class T2ANDOperator {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input height in inches");
        int height=scanner.nextInt();

        if(height<60){
            System.out.println("Short");}
        else if (height>=60&&height<=72){
            System.out.println("Medium");}
        else {
            System.out.println("Tall");
        }

    }
}
