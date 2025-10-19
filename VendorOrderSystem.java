import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VendorOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ArrayLists to store order information (parallel arrays)
        ArrayList<String> customerNames = new ArrayList<>();
        ArrayList<Integer> phones = new ArrayList<>();
        ArrayList<Integer> chargers = new ArrayList<>();
        ArrayList<Integer> headsets = new ArrayList<>();
        ArrayList<Double> amountsPaid = new ArrayList<>();
        
        // HashMap to store total debt per customer
        HashMap<String, Double> customerDebts = new HashMap<>();
        
        // Price constants
        final int PHONE_PRICE = 800000;
        final int CHARGER_PRICE = 40000;
        final int HEADSET_PRICE = 20000;
        
        System.out.println("=== VENDOR ORDER SYSTEM ===\n");
        
        // Add sample orders (or get from user)
        addSampleOrders(customerNames, phones, chargers, headsets, amountsPaid);
        
        // Or uncomment to get user input instead:
        // getUserOrders(scanner, customerNames, phones, chargers, headsets, amountsPaid);
        
        // Display all orders
        System.out.println("\n=== ALL ORDERS ===");
        displayOrders(customerNames, phones, chargers, headsets, amountsPaid, 
                     PHONE_PRICE, CHARGER_PRICE, HEADSET_PRICE);
        
        // Calculate debts for each customer
        calculateDebts(customerNames, phones, chargers, headsets, amountsPaid,
                      customerDebts, PHONE_PRICE, CHARGER_PRICE, HEADSET_PRICE);
        
        // Display who owes money
        displayDebtors(customerDebts);
        
        scanner.close();
    }
    
    // Method to add sample orders
    static void addSampleOrders(ArrayList<String> names, ArrayList<Integer> phones,
                                ArrayList<Integer> chargers, ArrayList<Integer> headsets,
                                ArrayList<Double> paid) {
        // Order 1: John
        names.add("John");
        phones.add(2);
        chargers.add(1);
        headsets.add(2);
        paid.add(1500000.0);
        
        // Order 2: Mary
        names.add("Mary");
        phones.add(1);
        chargers.add(0);
        headsets.add(1);
        paid.add(820000.0);
        
        // Order 3: Peter
        names.add("Peter");
        phones.add(1);
        chargers.add(2);
        headsets.add(0);
        paid.add(500000.0);
        
        // Order 4: John (second order)
        names.add("John");
        phones.add(0);
        chargers.add(1);
        headsets.add(1);
        paid.add(30000.0);
        
        // Order 5: Sarah
        names.add("Sarah");
        phones.add(3);
        chargers.add(3);
        headsets.add(3);
        paid.add(2000000.0);
        
        System.out.println("Sample orders loaded.");
    }
    
    // Method to get orders from user
    static void getUserOrders(Scanner scanner, ArrayList<String> names,
                             ArrayList<Integer> phones, ArrayList<Integer> chargers,
                             ArrayList<Integer> headsets, ArrayList<Double> paid) {
        System.out.print("How many orders to enter? ");
        int numOrders = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < numOrders; i++) {
            System.out.println("\n--- Order " + (i + 1) + " ---");
            
            System.out.print("Customer name: ");
            names.add(scanner.nextLine());
            
            System.out.print("Number of phones: ");
            phones.add(scanner.nextInt());
            
            System.out.print("Number of chargers: ");
            chargers.add(scanner.nextInt());
            
            System.out.print("Number of headsets: ");
            headsets.add(scanner.nextInt());
            
            System.out.print("Amount paid: ");
            paid.add(scanner.nextDouble());
            scanner.nextLine();
        }
    }
    
    // Display all orders
    static void displayOrders(ArrayList<String> names, ArrayList<Integer> phones,
                            ArrayList<Integer> chargers, ArrayList<Integer> headsets,
                            ArrayList<Double> paid, int phonePrice, int chargerPrice,
                            int headsetPrice) {
        for (int i = 0; i < names.size(); i++) {
            double total = (phones.get(i) * phonePrice) + 
                          (chargers.get(i) * chargerPrice) + 
                          (headsets.get(i) * headsetPrice);
            
            System.out.printf("Order %d: %s - Phones=%d, Chargers=%d, Headsets=%d, " +
                            "Total=%.0f, Paid=%.0f\n",
                            (i + 1), names.get(i), phones.get(i), chargers.get(i),
                            headsets.get(i), total, paid.get(i));
        }
    }
    
    // Calculate total debt for each customer using HashMap
    static void calculateDebts(ArrayList<String> names, ArrayList<Integer> phones,
                              ArrayList<Integer> chargers, ArrayList<Integer> headsets,
                              ArrayList<Double> paid, HashMap<String, Double> debts,
                              int phonePrice, int chargerPrice, int headsetPrice) {
        // Clear any previous data
        debts.clear();
        
        // Loop through all orders
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            
            // Calculate total cost of this order
            double total = (phones.get(i) * phonePrice) + 
                          (chargers.get(i) * chargerPrice) + 
                          (headsets.get(i) * headsetPrice);
            
            // Calculate debt for this order
            double debt = total - paid.get(i);
            
            // Add to customer's total debt in HashMap
            if (debts.containsKey(name)) {
                // Customer already exists, add to their debt
                double currentDebt = debts.get(name);
                debts.put(name, currentDebt + debt);
            } else {
                // New customer, create new entry
                debts.put(name, debt);
            }
        }
    }
    
    // Display customers who owe money
    static void displayDebtors(HashMap<String, Double> debts) {
        System.out.println("\n=== CUSTOMERS WHO OWE MONEY ===");
        
        boolean hasDebtors = false;
        double totalDebt = 0;
        
        // Loop through HashMap
        for (String name : debts.keySet()) {
            double debt = debts.get(name);
            
            // Only show if customer owes money (debt > 0)
            if (debt > 0) {
                System.out.printf("%s owes: %.0f UGX\n", name, debt);
                totalDebt += debt;
                hasDebtors = true;
            }
        }
        
        if (!hasDebtors) {
            System.out.println("No customers owe money!");
        } else {
            System.out.printf("\nTotal outstanding debt: %.0f UGX\n", totalDebt);
        }
    }
}