import java.util.Scanner;

class InputString {
    public static String input (){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
}