package com.CollectionFramework.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailFetchingTask2 {
    public static void main(String[] args) {
        String str = "yuvi@yahoo.com, david@yahoo.com, ravi@gmail.com, ram@yahoo.com, kapil@tech.in, john@tech.in, brandon@outlook.com";


        String[] emails = str.split(",");
        Map<String, List<String>> map = new HashMap<>();

        for(String email: emails) {
            email = email.strip();
            String domain = email.substring(email.indexOf('@')+1);
            List<String> set = map.getOrDefault(domain, new ArrayList<>());
            set.add(email);
            map.put(domain, set);
        }

        for(String domain: map.keySet())
        {
            System.out.printf("%-30s",domain);
        }
        System.out.println();
        System.out.println("-".repeat(100));

        List<List<String>> emailsList = new ArrayList<>(map.values());

        int maxEmails = 0;
        for (List<String> emailList : emailsList) {
            maxEmails = Math.max(maxEmails, emailList.size());
        }
        for(int i=0; i<maxEmails; i++){
            for (List<String> strings : emailsList) {
                String email = i < strings.size() ? strings.get(i) : "";
                System.out.printf("%-30s", email);
            }
            System.out.println();

        }

    }
}
