import java.util.Scanner;
public class Q5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String ");
        String s= sc.nextLine();
        System.out.println("The original String is "+ s);

        //all the string methods
        //length of the string
        System.out.println("The length of the string is "+s.length());
        //uppercase method
        System.out.println("Uppercase: "+s.toUpperCase());
        //lowercase method
        System.out.println("Lowercase: "+s.toLowerCase());
        //trim method
        System.out.println("Trimmed String: "+s.trim());
        //Specific Index
        if (s.length()>0){
            System.out.println("The Char at index 5 is: "+s.charAt(5));
        }
        //substring
        if (s.length()>0 || s.length()<100){
            System.out.println("The substring (2,5) is: "+s.substring(2,5));
        }
        //replacing character
        System.out.println("Replacing the char 'a' with 'o':"+s.replace('a','o'));
        //to check if a string contains a desired word
        System.out.println("Contains title 'Sahu' :"+ s.contains("Sahu"));
        //startsWith and endsWith methods
        System.out.println("Starts with \"Sai\": " +s.startsWith("Sai"));
        System.out.println("Ends with \"Sahu\": " +s.endsWith("Sahu"));
        //check if string is empty
        System.out.println("Is Empty: "+s.isEmpty());
        // concatenate words
        System.out.println("Concatenate with name: "+ s.concat(" student"));

    }
}
