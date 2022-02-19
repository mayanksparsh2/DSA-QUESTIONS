package  Feb7HandsOn.Ques6;

import java.util.Scanner;

public class Main {
    static int code = 1111;
    public static void main(String args[]) {
        int pin;

        System.out.println("Welcome to ICICI bank");
        System.out.println("Please Enter your ATM card");
        System.out.println("Please enter your ATM pin");
        Scanner sc = new Scanner(System.in);
        pin = sc.nextInt();


        do {
            if (pin == code) {
                System.out.println("correct pin \n1. balance check \n2. change pin\n3. cash withdraw\n 4.Exit \nPlease enter your choice");
                int opt = sc.nextInt();
                if (opt == 1)
                    checkBal();
                else if (opt == 2)
                    changePin();
                else if (opt == 3)
                    withdraw();
                else System.out.println("Incorrect Option Selected");
            } else {
                System.out.println("Logged Out");
                break;
            }
        } while (true);
    }

    private static void withdraw() {
        System.out.println("2000 withdrawn");
    }

    private static void changePin() {
        System.out.println("Pin changed to 5555");
        code=5555;
    }

    private static void checkBal() {
        System.out.println("Balance 5000");
    }
}