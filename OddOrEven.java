import java.util.*;

public class OddOrEven
{
    public static void main(String[] args)
    {
        int number = 0;
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);

        // Make sure we catch the case where the user doesn't enter a integer
        try
        {
          number = sc.nextInt();
          // If number % 2 equals 0 it's even otherwhise it's odd
          final String msg = (number % 2 == 0) ? "Input number is even!"
          : "Input number is odd!";

          System.out.println(msg);
        } catch (Exception e)
        {
          System.out.println(
            "Did your really enter a integer?\nIf you did the number might be "
             + "to big.\nPlease try again...");
        }
    }
}
