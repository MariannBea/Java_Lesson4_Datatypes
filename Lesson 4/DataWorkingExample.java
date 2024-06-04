import java.util.Scanner;

public class DataWorkingExample {

    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);  //     Create a Scanner object
        System.out.println("What is your name?");
        // add the dataType below
        String name = keyboard.nextLine();  // Read user input
        System.out.println("How old are you?");
        // add the dataType below
        int age = keyboard.nextInt();
        System.out.println("What is the value of PI?");
        // add the dataType below
        double PI = keyboard.nextDouble();
        int myAge = 100; // ;-)

        System.out.println("Hi, "  + name + ". "  + "You are " + age);
        System.out.println("You are " + age + " years old.");
        System.out.println("That is " + (myAge - age) + " years younger than me.");

        // checks to see if the value entered by the user and saved in PI is equal to 3.14
        if(PI == 3.14){

            // If the value saved in PI equals 3.14, the statement below will print.
            System.out.println("But you are very good at math. You knew that PI = " + PI);
        } else {

            // If the value saved in PI does not equal 3.14, the statement in the else block will print.
            System.out.println("You should practice math a bit more. I'll teach you. PI is approximately equal to 3.14");
        }

    }
}

