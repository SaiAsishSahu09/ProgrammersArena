import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("#### Email Validator ####");
        System.out.println("Enter the email ID to check if its valid");
        String email = sc.nextLine();

        //creating a boolean container to store and check its validity
        boolean isValid = isValidEmail(email);
        //checking if the boolean value is true or not then creating output for it
        if (isValid) {
            System.out.println("The email is valid");
        } else {
            System.out.println("The email is not valid");
        }

    }

    //method for isValidEmail
    public static boolean isValidEmail(String email) {
        //to check if string email is null or empty
        if (email == null || email.isEmpty()) {
            return false;
        }
        //to check for the presence of @ and . and their positions
        int atPosition = email.indexOf('@');
        int dotPosition = email.lastIndexOf('.');

        if (atPosition > 0 && dotPosition > atPosition+1 && dotPosition < email.length()-1){
            return true;
        }
        else {
            return false;
        }
    }

}
