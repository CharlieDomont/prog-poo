import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.print("Input the year of your birth: ");
        int Year = input.nextInt();

        int age = (2019 - Year);


        System.out.println();
        System.out.println("Hello \n"+fname+" "+lname );
        System.out.println("Your Age is \n"+ age );
    }
}
