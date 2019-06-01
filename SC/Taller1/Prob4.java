import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Input the first name of the costumer : ");
        String fname = input.next();
        System.out.print("Input the last name of the costumer : ");
        String lname = input.next();
        System.out.print("Input the price of the Article : ");
        double Price = input.nextInt();

        double total = (Price + (Price*0.07));


        System.out.println();
        System.out.println("The Costumer \n"+fname+" "+lname );
        System.out.println("Has to pay with taxes included (7%) \n"+ total );
    }
}
