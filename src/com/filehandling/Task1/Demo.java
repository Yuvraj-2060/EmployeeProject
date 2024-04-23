package com.filehandling.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
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

        String filePath = "D:\\Wiley_Edge\\wiley-c392\\src\\com\\filehandling\\Example1\\user_input.txt";

        // Saving User Input Into A File
        try (FileWriter writer = new FileWriter( filePath))
        {
            writer.write(userInput.toString());
            System.out.println("User Input Is Saved Into File Successfully..!");
        } catch (IOException e) {
            System.out.println("Error : occurred while saving to file: " + e.getMessage());
        }

        // Reading and Displaying content from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Content of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error : occurred while reading file: " + e.getMessage());
        }
    }
}
