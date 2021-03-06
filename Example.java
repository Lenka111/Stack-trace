//Elena Voinu
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
 try {
            int result = divide();
            System.out.println(result);
         // | inclusive or not the logical || (or)
        } catch(ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }

    private static int divide(){
        int x, y ;
            x = getInt();
            y = getInt();
            System.out.println("x is "+ x + " y is "+ y);
            return x/y;
    }


    private static int getInt(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        //continue to execute until we break it
        while(true){
            try{
                return scanner.nextInt();

            }catch(InputMismatchException e){
                //read the line again
                scanner.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9 ");
            }

        }

    }
}
