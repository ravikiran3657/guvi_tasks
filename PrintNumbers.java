import java.util.Scanner;

//WAP to print the numbers from 10 to 50 using for /while loop?
public class PrintNumbers {
    public static void main(String[] args) {
        int num=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");

       int i=sc.nextInt();
       /* for(i=10;i<=50;i++){
            System.out.println(i);*/
       /* int userInput = 10;
        while(userInput<=50){
            System.out.println(userInput);
            userInput++;
        }
        //System.out.println(num);*/

        for(int userInput=10; userInput<=50; userInput++){
            System.out.println(userInput);

        }
    }

}
