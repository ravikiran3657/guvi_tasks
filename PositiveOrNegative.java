import java.util.Scanner;

//WAP to find the given number is negative or positive?
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  given number is positive or negative check::");

        int i= scan.nextInt();
        if(i>0){
            System.out.println("Positive No:");
        }else if (i<0){
            System.out.println("Negative No:");
        }


    }
}
