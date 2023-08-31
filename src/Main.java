import java.util.Scanner;
public class Main {

    static double taxRate;
    static double taxAmount;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input value for income: ");

        double income = sc.nextInt();

        if (income <= 10000) {
            taxRate = 2.5;
            taxAmount = (income*taxRate)/100;
            System.out.println("Income = " + income + ", tax rate = " + taxRate + "%" + ", amount of tax = " + taxAmount);
        } else if (income <= 25001) {
            taxRate = 4.3;
            taxAmount = (income*taxRate)/100;
            System.out.println("Income = " + income + ", tax rate = " + taxRate + "%" + ", amount of tax = " + taxAmount);
        } else {
            taxRate = 6.7;
            taxAmount = (income*taxRate)/100;
            System.out.println("Income = " + income + ", tax rate = " + taxRate + "%" + ", amount of tax = " + taxAmount);
        }
    }
}