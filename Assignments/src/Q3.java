import java.util.Locale;
import java.util.Scanner;
public class Q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the sentence to check if palindrome");
        String line = sc.nextLine();
        String lowerCaseLine= line.toLowerCase();

        String reversedString = new StringBuilder(lowerCaseLine).reverse().toString();
        if (lowerCaseLine.equals(reversedString)){
            System.out.println("The String is palindrome");
        }
        else {
            System.out.println("The String is not palindrome");
        }

    }
}
