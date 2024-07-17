package ru.geekbrains.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaCore_1_8_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String letter = null;
        boolean isProcess = false;
        while (isProcess == false) {
            System.out.print("Input number from 2 to 100: ");
            int number = Integer.parseInt(reader.readLine());
            if (number >= 2 && number <= 100) {
                System.out.println("You input number " + number);
                boolean isOK = false;
                while (isOK == false) {
                    System.out.print("would you like to input number again? (y/n): ");
                    letter = reader.readLine();
                    char element = letter.charAt(0);
                    if (element == 'y') {
                        System.out.println("Let's try again!");
                        isOK = true;
                    } else if (element == 'n') {
                        System.out.println("Goodbye!");
                        isProcess = true;
                        break;
                    } else if (element != 'y' || element != 'n') {
                        System.out.println("Input correct letter!");
                    }
                }
            } else {
                System.out.println("You input incorrect number!");
            }
        }
    }
}
