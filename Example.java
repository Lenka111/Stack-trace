//Elena Voinu
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        int result = divide();
        System.out.println(result);
    }

    private static int divide(){
        int x, y ;
        try{
            x = getInt();
            y = getInt();
        }
        catch(NoSuchElementException e){
            throw new ArithmeticException("no suitable input");
        }
        System.out.println("x is "+ x + " y is "+ y);

        try{
            return x/y;
        }
        catch (ArithmeticException e){
            throw new ArithmeticException("attempt to divide by zero");
        }
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
