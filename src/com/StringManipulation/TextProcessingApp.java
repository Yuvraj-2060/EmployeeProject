package com.StringManipulation;

public class TextProcessingApp {
    public static void main(String[] args) {
        String text = """
                Hey, My Name Barry Allan Alive
                &
                I'm the fasted Man Alive .
                """;

        // Count words
        int wordCount = countWords(text);
        System.out.println("Word count: " + wordCount+"\n");

        // Count lines
        int lineCount = countLines(text);
        System.out.println("Line count: " + lineCount+"\n");

        // Reverse text
        String reversedText = reverseText(text);
        System.out.println("Reversed text: \n" + reversedText+"\n");

        // Remove duplicates
        String textWithoutDuplicates = removeDuplicates(text);
        System.out.println("Text without duplicates: \n" + textWithoutDuplicates+"\n");

    }
    // Method to count words in the text
    private static int countWords(String text) {
        return text.split("[\\s,]+").length;
    }

    // Method to count lines in the text
    private static int countLines(String text) {
        return (int)text.lines().count();
    }

    // Method to reverse the text
    private static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // Method to remove duplicate words from the text
    private static String removeDuplicates(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        StringBuilder result = new StringBuilder();
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (!result.toString().toLowerCase().contains(word.toLowerCase())) {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}