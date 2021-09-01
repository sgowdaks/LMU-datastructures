import java.util.Scanner;

class SayHello {
    public static void main( String args[] ){
        
        System.out.println("Enter your name.");

        Scanner myInput = new Scanner( System.in );
        String inputName = myInput.nextLine();

        System.out.println( "Hello, " + inputName );

    }
}
