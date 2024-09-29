import  java.util.Scanner;

public class q3 {

   public static void main(String arg[]){

    Scanner resulte = new Scanner(System.in);
    System.out.println("enter lenght in centimeters");
    int lenght = resulte.nextInt();
    int feet = (int)lenght/2.54;
    int inches = (int)lenght%2.54;
    System.out.println("feet: " + feet + " inches: " + inches);


   }
    
}
