package Task2;

import java.util.Scanner;

public class PurchaseAmount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the purchase amount::");
        double purchaseAmount=sc.nextDouble();
        double discount = 0.0;
        if(purchaseAmount<500){
            System.out.println("No discount::"+ purchaseAmount);
        }else if(purchaseAmount>=500 && purchaseAmount<=1000){
            discount=(purchaseAmount*10)/100;
            System.out.println("discount applied 10%::" + discount);

        }else {
            discount=(purchaseAmount*20)/100;
            System.out.println("discount applied 20%::" + discount);
        }
        double payableAmount = purchaseAmount - (purchaseAmount * discount);
        System.out.println("payable amount::"+payableAmount);

    }
}
