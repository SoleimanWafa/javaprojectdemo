public class E10ElseIf {
    public static void main(String[] args) {

        String fruit="Banana";


        if(fruit.equals("Mango")) {
            System.out.println("Price is $5");
        }else if (fruit.equals("Oranges")){
            System.out.println("Price is $4");

        } else if (fruit.equals("Apple")) {
            System.out.println(("Price is $1000"));

        }else if (fruit.equals("Kiwi")){
            System.out.println("$6");

        }else {
            System.out.println("This fruit is not available right now");
        }
    }
}
