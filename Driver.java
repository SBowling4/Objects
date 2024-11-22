import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ingredient flour = new Ingredient("flour", 4, "cups");



        System.out.println("Would you like to convert?");
        String answer = scanner.next();
        if (answer.equals("y")) {
            //TODO: add this bit
            flour.convert("ml");
        }

        System.out.println("Would you like to scale?");
        answer = scanner.next();

        if (answer.equals("y")) {
            System.out.println("By how much?");
            double factor = scanner.nextDouble();
            flour = flour.scale(factor);
        }

        System.out.println(flour.toString());
       
        scanner.close();
    }
}
