import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, e, encryptedMessage;

        // Gets Public Key
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Public Key Pair (Separated by a space): ");
        n = in.nextInt();
        e = in.nextInt();
        System.out.println();

        // Gets Encrypted Message
        System.out.print("Enter Encrypted Message: ");
        encryptedMessage = in.nextInt();



        System.out.println(n + " " + e);
    }
}
