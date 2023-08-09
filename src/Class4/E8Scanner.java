package Class4;

import java.util.Scanner;

public class E8Scanner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.next();
        if(name.equals("Soleiman")) {
            System.out.println("Senior SDET in 2 years");
        } else if (name.equals("Gul")) {
            System.out.println("The most beautiful woman in the world");
        } else if (name.equals("Sam")) {
            System.out.println("Likes to smoke weed");
        } else if (name.equals("Abe")) {
            System.out.println("Crazy guy");
        } else if (name.equals("Nilly")) {
            System.out.println("She knows a lot");

        }
    }
    }

