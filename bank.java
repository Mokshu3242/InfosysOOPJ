public class bank{
    public static void main(String[] args){
        double balance = 6000, rateOfInterest = .10, interest = 0;
        double withdrawal = 500, deposit = 600;

        for (int i = 0; i <=12; i++) {
            balance += deposit;
            balance -= withdrawal;
            interest = balance * rateOfInterest;
            balance += interest;
            System.out.println("The interest of month " + i + " is " + interest);
        }
        System.out.println("The balance at the end of the year is " + balance);
    }
}