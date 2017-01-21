import java.util.Scanner;

/**
 * Asks the user for the cost of the cruise and the quality of service level 
 * @author Ian Duron
 */
public class TipCalculator
{
    public static void main(String[] args)
    {
        final double EXCELLENT_TIP = .25;
        final double GOOD_TIP = .20;
        final double FAIR_TIP = .10;
        final double POOR_TIP = .05;
        final int EXCELLENT_SERVICE = 3;
        final int GOOD_SERVICE = 2;
        final int FAIR_SERVICE = 1;
        final int POOR_SERVICE = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("What was the cost of your cruise? ");
        double cost = in.nextDouble();
        System.out.print("What was quality of service? 0 is poor and 3 is excellent: ");
        int quality = in.nextInt();
        String tip = "The tip should be $%.2f";

        if (cost <= 0)
        {
            System.out.println("The cost must be a positive number");
            return;
        }
        if (quality < 0 || quality >3)
        {
            System.out.println("The quality rating must be 0, 1, 2, or 3");
        }
        else if (quality == POOR_SERVICE)
        {
            System.out.printf(tip, cost  * POOR_TIP);
        }
        else if (quality == FAIR_SERVICE)
        {
            System.out.printf(tip, cost  * FAIR_TIP);
        }
        else if (quality == GOOD_SERVICE)
        {
            System.out.printf(tip, cost  * GOOD_TIP);
        }
        else if (quality == EXCELLENT_SERVICE)
        {
            System.out.printf(tip, cost  * EXCELLENT_TIP);
        }
        else
        {
            System.out.print("error");
        }

    }
}

