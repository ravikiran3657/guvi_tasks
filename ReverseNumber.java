import java.util.Scanner;

//WAP to print the given number 876
public class ReverseNumber {
    public static void main(String[] args) {
        int number=0;
        int reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        number =sc.nextInt();

        while (number!=0){
            reverse=reverse*10;
            reverse=reverse+number%10;
            number=number/10;
        }
        System.out.println(reverse);
    }
        //ip-876
        //0p-678
        /*int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        *//*for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");*//*
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];

            }

            System.out.println(sum);*/

        }
    //}
//}
