import java.util.Scanner;

//write a java program to find the smallest number among 3 numbers
public class Smallest
{
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three numbers:");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<b&&a<c)
            System.out.println("Smallest number is:"+a);
        else if (b<a&&b<c)
                System.out.println("Smallest number is:"+b);
        else if(c<a && c<b)
            System.out.println("Smallest number is:"+c);
        else
            System.out.println("number is same::");

    }
}
