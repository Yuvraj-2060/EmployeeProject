package com.filehandling.Task1;

import java.io.*;
import java.util.Scanner;

public class RandomAccessExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder userInput = new StringBuilder();

        char choice;
        do {
            System.out.println("Enter The Text To Be Written: ");
            String input = scanner.nextLine();
            userInput.append(input).append("\n");

            System.out.println("Wanna add more? (y/n) ");
            choice = scanner.nextLine().charAt(0);
        } while (choice != 'n');

        String filePath = "D:\\Wiley_Edge\\wiley-c392\\src\\com\\filehandling\\Task1\\user_input1.txt";

        try (RandomAccessFile file = new RandomAccessFile(filePath, "rw")) { // Saving User Input Into A File
            file.writeBytes(userInput.toString());
            System.out.println("User Input Is Saved Into File Successfully..!");
        } catch (IOException e) {
            System.out.println("Error: occurred while saving to file: " + e.getMessage());
        }

        try (RandomAccessFile file = new RandomAccessFile(filePath, "r")) { // Reading and Displaying content from the file
            System.out.println("Content of the file:");
            String line;
            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: occurred while reading file: " + e.getMessage());
        }
    }
}

