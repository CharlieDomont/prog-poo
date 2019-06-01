import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the name of the Runner : ");
        String name = input.next();
        System.out.print("Enter the time of the Runner in minutes on the 1st day : ");
        double Time1 = input.nextInt();
        System.out.print("Enter the time of the Runner in minutes on the 2nd day : ");
        double Time2 = input.nextInt();
        System.out.print("Enter the time of the Runner in minutes on the 3th day : ");
        double Time3 = input.nextInt();
        System.out.print("Enter the time of the Runner in minutes on the 4th day : ");
        double Time4 = input.nextInt();
        System.out.print("Enter the time of the Runner in minutes on the 5th day : ");
        double Time5 = input.nextInt();
        double Avg = ((Time1 + Time2 + Time3 + Time4 + Time5)/5);


        System.out.println();
        System.out.println("The name of the Runner is  \n"+ name );
        System.out.println("He is Averaging  \n"+ Avg + " minutes per kilometer ");
    }
}
