import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String id;
    String name;
    int quantity;

    Item(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Quantity: " + quantity);
    }
}

public class InventorySystem {
    static ArrayList<Item> inventory = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Search Item by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1: addItem(); break;
                case 2: displayAll(); break;
                case 3: searchById(); break;
                case 4: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }

    static void addItem() {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        inventory.add(new Item(id, name, quantity));
        System.out.println("Item added.");
    }

    static void displayAll() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory List:");
            for (Item item : inventory) {
                item.display();
            }
        }
    }

    static void searchById() {
        System.out.print("Enter ID to search: ");
        String id = scanner.nextLine();
        boolean found = false;

        for (Item item : inventory) {
            if (item.id.equals(id)) {
                item.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }
}
