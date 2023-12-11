import java.util.Scanner;

class dowhile1 {
    public static void main(String[] args) {
        double balance = 0;
        double minbal = 500;
        double depositAmt = 0;
        System.out.println("Enter amount to be deposited: ");
        Scanner sc = new Scanner(System.in);
        do {
            depositAmt = sc.nextInt();
            System.out.println(depositAmt + " have been added to the account");
        } while (depositAmt < minbal);
        balance = depositAmt;
        System.out.println("Transaction Complete");
    }
}