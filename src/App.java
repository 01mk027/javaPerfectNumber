import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Defining variables and creating instance of Scanner class
        int enteredNumber = 0, totalOfDivisors = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is perfect number or not: ");
        //Getting value from user
        enteredNumber = input.nextInt();
        //Checking numbers to find entered number is perfect or not
        for(int i=1; i<=(enteredNumber - 1); i++)
        {
            if(enteredNumber % i == 0)
            {
                totalOfDivisors += i;
            }
        }
        //Printing some messages about entered number's being perfect or not
        if(enteredNumber == totalOfDivisors)
        {
            System.out.println(enteredNumber + " is a perfect number.");
        }
        else
        {
            System.out.println(enteredNumber + " is not a perfect number.");
        }
    }
}
