
import java.util.*;
public class Q4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  String");
        String line = sc.nextLine();
        System.out.println("Enter the index you want to replace");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the new Character");
        char newChar = sc.nextLine().charAt(0);

        if(index<0 || index>=line.length()){
            System.out.println("Index out of bounds");
        }
        else{
            StringBuilder s = new StringBuilder(line);
            s.setCharAt(index , newChar);
            String modified = s.toString();
            System.out.println("The modified String is : "+modified);
        }
    }
}
