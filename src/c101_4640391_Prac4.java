import java.util.ArrayList;
import java.util.Scanner;

public class c101_4640391_Prac4 {

    public static void main(String[] args) {
        String[] initialSuspects = {
                "Professor Plum", "Miss Scarlet", "Colonel Mustard",
                "Mrs. Peacock", "Mr. Green", "Dr. Orchid",
                "Chef White", "Inspector Gadget", "Sherlock Holmes", "Dr. Watson"
        };

        ArrayList<String> suspectList = new ArrayList<>();
        for (String suspect : initialSuspects) {
            suspectList.add(suspect);
        }

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== UWC DIGITAL DETECTIVE MENU ===");
            System.out.println("1. Display Suspects");
            System.out.println("2. Search Suspect");
            System.out.println("3. Add Suspect");
            System.out.println("4. Remove Suspect");
            System.out.println("5. Sort Suspects (Alphabetical)");
            System.out.println("6. Display Record Count");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displaySuspects(suspectList);
                    break;
                case 2:
                    System.out.print("Enter suspect name to search: ");
                    String searchName = scanner.nextLine();
                    searchSuspect(suspectList, searchName);
                    break;
                case 3:
                    System.out.print("Enter new suspect name: ");
                    String newName = scanner.nextLine();
                    addSuspect(suspectList, newName);
                    break;
                case 4:
                    System.out.print("Enter suspect name to remove: ");
                    String removeName = scanner.nextLine();
                    removeSuspect(suspectList, removeName);
                    break;
                case 5:
                    sortSuspects(suspectList);
                    System.out.println("Suspects have been sorted alphabetically.");
                    displaySuspects(suspectList);
                    break;
                case 6:
                    displayCount(suspectList);
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting triage tool. Stay safe, Officer!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 1 and 7.");
            }
        }

        scanner.close();
    }

    public static void displaySuspects(ArrayList<String> list) {
        System.out.println("\n--- Current Suspect List ---");
        if (list.isEmpty()) {
            System.out.println("No suspect records found.");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i  + "] " + list.get(i));
        }
    }

    public static void searchSuspect(ArrayList<String> list, String target) {
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(target)) {
                System.out.println("Suspect '" + list.get(i) + "' found at index position " + i + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Suspect '" + target + "' was not found in memory.");
        }
    }

    public static void addSuspect(ArrayList<String> list, String name) {
        if (name != null && !name.trim().isEmpty()) {
            list.add(name.trim());
            System.out.println("'" + name.trim() + "' successfully added to suspect records.");
        } else {
            System.out.println("Cannot add an empty suspect name.");
        }
    }

    public static void removeSuspect(ArrayList<String> list, String target) {
        boolean removed = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(target)) {
                String removedName = list.remove(i);
                System.out.println("Suspect '" + removedName + "' has been successfully removed.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Suspect '" + target + "' could not be found to remove.");
        }
    }

    public static void sortSuspects(ArrayList<String> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareToIgnoreCase(list.get(j + 1)) > 0) {
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void displayCount(ArrayList<String> list) {
        System.out.println("Total suspect records in memory: " + list.size());
    }
}