import java.util.Scanner;

//write a java program to print the pattern given number pattern
public class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = num; j >= 1; j--) {
                if (j >= i) {
                    System.out.print(j);
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
