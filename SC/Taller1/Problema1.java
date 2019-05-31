import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Coloca tu nombre");
        String name = input.next();
        System.out.println();
        System.out.println("Hola \n" + name );

    }


}