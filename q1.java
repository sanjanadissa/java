import java.util.Scanner;

class Tute{

    public static void main(String arg[])
    {

        String name;
        int nlength;
        do{
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a odd lenght word");
        name = scan.next();
        nlength = name.length();

        if(nlength %2== 1)
        System.out.println(" middle letter is " + name.charAt(nlength/2));
        else{
            System.out.println("you enter a even lenght word");
        }
        }while( nlength %2 == 0);
    }
}
