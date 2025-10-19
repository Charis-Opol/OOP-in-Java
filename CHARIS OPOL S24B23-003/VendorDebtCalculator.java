import java.util.ArrayList;
import java.util.HashMap;

public class VendorDebtCalculator {
    public static void main(String[] args) {
        // Price Constants (The vendor's charges)
        final int PHONE_PRICE = 800000;
        final int CHARGER_PRICE = 40000;
        final int HEADSET_PRICE = 20000;

        // These lists store the order details from the "Orders" table.
        ArrayList<String> customerNames = new ArrayList<>();
        ArrayList<Integer> phones = new ArrayList<>();
        ArrayList<Integer> chargers = new ArrayList<>();
        ArrayList<Integer> headsets = new ArrayList<>();

        // These lists store the payment details from the "Payments" table.
        ArrayList<Double> amountsPaid = new ArrayList<>();
        // Input Orders
        // Orders: Peter (2 Phones, 0 Chargers, 1 Headset)
        customerNames.add("Peter");
        phones.add(2);
        chargers.add(0);
        headsets.add(1);

        // Orders: Ruth (1 Phone, 1 Charger, 1 Headset)
        customerNames.add("Ruth");
        phones.add(1);
        chargers.add(1);
        headsets.add(1);

        // Orders: Rosco (0 Phones, 0 Chargers, 2 Headsets)
        customerNames.add("Rosco");
        phones.add(0);
        chargers.add(0);
        headsets.add(2);

        // Payments (Matching the order above):
        // Note: The payments in the table are "1,620,000", "60,000", "20,000"
        amountsPaid.add(1620000.0); // Peter paid 1,620,000
        amountsPaid.add(60000.0);   // Ruth paid 60,000
        amountsPaid.add(20000.0);    // Rosco paid 20,000

        // HashMap to store the total debt for each customer
        HashMap<String, Double> customerDebts = new HashMap<>();

        System.out.println("Vendor Order System");

        // 4. Calculate Total Debt
        double totalOutstandingDebt = 0.0;
        
        // Loop through each order to calculate debts
        for (int i = 0; i < customerNames.size(); i++) {
            String name = customerNames.get(i);

            // Calculate the total cost of the order
            double totalCost = (phones.get(i) * PHONE_PRICE) + (chargers.get(i) * CHARGER_PRICE) + (headsets.get(i) * HEADSET_PRICE);

            double paid = amountsPaid.get(i);
            
            double debt = totalCost - paid;
            
            // Display the details for this specific order and customer
            System.out.printf("\nOrder for %s:\n", name);
            System.out.printf("  Total Cost: %.0f UGX\n", totalCost);
            System.out.printf("  Amount Paid: %.0f UGX\n", paid);
            System.out.printf("  Remaining Debt (for this order): %.0f UGX\n", debt);

            // Puting the debt into the HashMap
            customerDebts.put(name, debt);
        }

        // Display Customers Who Owe Money
        System.out.println("\nCustomers Who Owe Money (Total Debt)");
        
        for (String name : customerDebts.keySet()) {
            double totalDebt = customerDebts.get(name);
            
            // Only show if the debt is greater than 0
            if (totalDebt > 0) {
                System.out.printf(" %s owes a total of: %.0f UGX\n", name, totalDebt);
                totalOutstandingDebt += totalDebt;
            } else if (totalDebt < 0) {
                // This means the customer overpaid!
                System.out.printf(" %s has a credit of: %.0f UGX\n", name, Math.abs(totalDebt));
            } else {
                System.out.printf(" %s has paid in full.\n", name);
            }
        }
        
        System.out.printf("\nTOTAL OUTSTANDING DEBT FOR ALL CUSTOMERS: %.0f UGX\n", totalOutstandingDebt);
    }
}