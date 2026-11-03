// Question 27. Input the cost price and selling price of an item. Determine profit or loss, and by how much.

import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {

            double profit = sellingPrice - costPrice;
            System.out.println("Profit = " + profit);

        } else if (costPrice > sellingPrice) {

            double loss = costPrice - sellingPrice;
            System.out.println("Loss = " + loss);

        } else {

            System.out.println("No profit and no loss.");
        }
    }
}
