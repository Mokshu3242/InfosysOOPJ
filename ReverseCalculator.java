import java.util.Scanner;

public class ReverseCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        String no = sc.nextLine();
        String temp="";
        int l = no.length();
        // do{
        //     temp += no.charAt(l-1);
        //     l--;
        // }while ( temp.length() != no.length());

        // while ( temp.length() != no.length()){
        //     temp += no.charAt(l-1);
        //     l--;
        // }

        for (int i = l-1; i >= 0; i--){
            temp += no.charAt(i);
        }
        System.out.println(temp);

    }
}
