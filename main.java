import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // input card number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number");

        // read card number
        String cardNumberInput = input.nextLine();

        // varification
        CardVarification cardNumber = new CardVarification(cardNumberInput);
        cardNumber.varification();

        // show result
        cardNumber.printValidation();
    }
}