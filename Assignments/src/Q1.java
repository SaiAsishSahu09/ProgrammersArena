import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {

        //using string builder class
     /*
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the String to reverse it");
        String input = sc.nextLine();// here the input variable stores the normal string.
        String output = new StringBuilder(input).reverse().toString();// here the output variable stores the reversed string
        System.out.println("The reversed string is "+output);
     */


        //using for loop
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String to reverse it");
        String input = sc.nextLine();
        //for loop
        String output = ""; // here the output variable(string)needs to be initialised first in a separate line instead of directly using it for loop
        for(int i = input.length()-1; i>=0 ; i--){
            output +=input.charAt(i);
        }
        System.out.println("The reversed string is "+output);

    }
}
