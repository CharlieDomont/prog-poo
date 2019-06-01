import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Input the code of the Product : ");
        String code = input.next();
        System.out.print("Input the description of the product : ");
        String desc = input.next();
        System.out.print("Input the price of the cost of the product : ");
        double Price = input.nextInt();

        double total = (Price + (Price*0.30));


        System.out.println();
        System.out.println("The Product \n"+code+" With the description "+desc );
        System.out.println("To earn 30% up sale on the product the sale price is  \n"+ total );
    }
}
