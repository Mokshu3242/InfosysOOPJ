import java.util.Scanner;

class FunCalculator {

    public static int calculateArmstrong(int num) {
        int result = 0;
        int n = num;

        while (n != 0) {
            int digit = n % 10;
            result += Math.pow(digit, 3);
            n /= 10;
        }

        return result;
    }

    public static boolean isLuckyNumber(int num) {
        int n = num;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return num % sum == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Calculate Armstrong number");
        System.out.println("2. Check if a number is a Lucky number");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        switch (choice) {
            case 1:
                int armstrong = calculateArmstrong(num);
                System.out.println("The Armstrong number is: " + armstrong);
                break;
            case 2:
                boolean isLucky = isLuckyNumber(num);
                if (isLucky) {
                    System.out.println(num + " is a Lucky number");
                } else {
                    System.out.println(num + " is not a Lucky number");
                }
                break;
            default:
                System.out.println("Invalid Choice!!!");
        }
    }
}
