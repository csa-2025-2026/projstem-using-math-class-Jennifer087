import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        int N;
        System.out.println("How many random numbers do you want to see (must be at least 1)?");
        N = scan.nextInt();
        printRandom3(N);

        double m = calcSlope (0.0, 1.0, 2.0, 3.0);
    }
    
    public static void printRandom3(int num)
    {
        // Random whole numbers between a and b 
        // (int) (Math.random () * (b-a+1) + a)
        int lowerBound = 2;
        int upperBound = num + 2;
        System.out.print ( (int) (Math.random () * (upperBound - lowerBound + 1) + lowerBound ));
        System.out.print ( (int) (Math.random () * (upperBound - lowerBound + 1) + lowerBound ));
     System.out.print ( (int) (Math.random () * (upperBound - lowerBound + 1) + lowerBound ));
    } 


    
    public static double calcSlope(double x1, double x2, double y1, double y2)
    {
        double Slope = (y2 - y1) / (x2 - x1);
        System.out.println (x1);
        System.out.println (x2);
        System.out.println (y1);
        System.out.println (y2);
        System.out.println("The slope is" + Slope);
        return 0.0;
    }
    
    {
        // Do problem 3 here; replace code below
        Scanner myObj = new Scanner(System.in);
        System.out.println ("Enter two doubles: ");
        double x = myObj.nextLine();
        double y = myObj.nextLine();
        System.out.println (x);
        System.out.println (y);
        System.out.println ("Distance: " roundDist(x,y));
        )

        return 0;
    }
}
