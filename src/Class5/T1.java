package Class5;

import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input current time");
        int hour=scanner.nextInt();
        if(hour<=11){
            System.out.println("Morning");}
            else if((hour>11)||(hour<=15)){
                System.out.println("Afternoon");}
            else if((hour>15)||(hour<=20)){
            System.out.println("Evening");}
            else if ((hour>20)||(hour<=24)){
            System.out.println("Night");}
        }


    }

