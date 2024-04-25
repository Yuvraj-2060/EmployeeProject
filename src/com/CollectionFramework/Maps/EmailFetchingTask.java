package com.CollectionFramework.Maps;
import java.util.*;

public class EmailFetchingTask {
    private static String getEmailType(String email) {
        String[] parts = email.split("@");
        if (parts.length == 2) {
            return parts[1].replaceAll("\\.com$", "");
        }
        return null;
    }

    public static void main(String[] args) {
        String emails = "yuvi@gmail.com, ravi@outlook.com, sam@gmail.com, kapil@outlook.com, david@hotmail.com";

        String[] emailArray = emails.split(",\\s*");

        Map<String, List<String>> EmailMap = new HashMap<>();
        EmailMap.put("gmail", new ArrayList<>());
        EmailMap.put("outlook", new ArrayList<>());
        EmailMap.put("hotmail", new ArrayList<>());

        for (String email : emailArray) {
            String emailType = getEmailType(email);
            if (emailType != null && EmailMap.containsKey(emailType)) {
                EmailMap.get(emailType).add(email);
            } else {
                System.err.println("Invalid email: " + email);
            }
        }

        System.out.println("Gmail Accounts -------------->"+ EmailMap.get("gmail"));

        System.out.println("\nOutlook Accounts ----------->"+ EmailMap.get("outlook"));

        System.out.println("\nHotmail Accounts ------------>"+ EmailMap.get("hotmail"));
    }
}
