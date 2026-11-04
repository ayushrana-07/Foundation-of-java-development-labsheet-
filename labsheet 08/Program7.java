import java.util.Scanner;
import java.util.ArrayList;

public class Program7 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numberList.add(i);
        }

        System.out.println("Number : " + numberList);
    }
}
