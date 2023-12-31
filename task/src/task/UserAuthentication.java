package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserAuthentication {
    public static void main(String[] args) {
        Map<String, Integer> userMap = new HashMap<>();
        userMap.put("ashwini", 1234);
        userMap.put("gaurang", 3456);
        userMap.put("jyotsana", 4353);
        userMap.put("punit", 6141);
        userMap.put("piyush", 8448);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.next();

        if (userMap.containsKey(username)) {
            System.out.print("Enter password: ");
            int enteredPassword = input.nextInt();
            int storedPassword = userMap.get(username);

            if (enteredPassword == storedPassword) {
                System.out.println("Welcome, " + username);
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("User does not exist.");

            System.out.print("Do you want to add this user? (Y/N): ");
            String addChoice = input.next().toUpperCase();

            if (addChoice.equals("Y")) {
                System.out.print("Enter a password for " + username + ": ");
                int newPassword = input.nextInt();
                userMap.put(username, newPassword);
                System.out.println("User " + username + " added with password " + newPassword);
            }
        }

        input.close();
    }
}

