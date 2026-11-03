// Question 29. Input the height of a person in cm and classify them as short (<150), average (150–170), or tall (>170).

import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in centimetres: ");
        double height = sc.nextDouble();

        if (height < 150) {
            System.out.println("Classification: Short");
        } else if (height <= 170) {
            System.out.println("Classification: Average");
        } else {
            System.out.println("Classification: Tall");
        }
    }
}
