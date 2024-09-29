import java.util.Scanner;

public class q2 {

 public static void main(String arg[])
 
{

    Scanner input = new Scanner(System.in);
    System.out.println("enter full name ");
    String name = input.nextLine();
    int firtsSpace = name.indexOf(" ");
    String firstName = name.substring(0, firtsSpace);
    int lastSpace = name.lastIndexOf(" ");
    String middlename = name.substring(firtsSpace, lastSpace);
    String lastname = name.substring(lastSpace+1);
    System.out.println(lastname + "," + firstName +" "+ middlename.charAt(1) + ".");



 }   
    
}
