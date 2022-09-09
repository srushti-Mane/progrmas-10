import java.util.Scanner;
public class DigitInInteger {
        public static void main(String[] args)
        {
            int number = 123456789;
            int digit = 0;
            while(number != 0)
            {
                int pick_last = number % 10;
                digit++;
                number = number / 10;
            }

            System.out.print("Number of Digits = "+digit);

        }
    }

