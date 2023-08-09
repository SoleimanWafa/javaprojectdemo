package Class4;
import java.util.Scanner;
public class Repl {

        public static void main(String[] args) {

            String gender;
            int age;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter your gender: M or F");
            gender = scanner.nextLine();
            System.out.println("Please enter your age");
            age=scanner.nextInt();
            if(gender=="M"){
                if(age>=25){
                    System.out.println("Man");
                }else{
                    System.out.println("Boy");
                }
            }else{
                if (age>=25){
                    System.out.println("Woman");
                }else{
                    System.out.println("Girl");
                }
            }
        }
    }

